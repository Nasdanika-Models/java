package org.nasdanika.models.java.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.nasdanika.models.coverage.Coverage;
import org.nasdanika.models.java.AnnotationInterface;
import org.nasdanika.models.java.AnnotationInterfaceMember;
import org.nasdanika.models.java.Class;
import org.nasdanika.models.java.ClassInitializer;
import org.nasdanika.models.java.Code;
import org.nasdanika.models.java.Constructor;
import org.nasdanika.models.java.Enum;
import org.nasdanika.models.java.EnumConstant;
import org.nasdanika.models.java.Field;
import org.nasdanika.models.java.GenericType;
import org.nasdanika.models.java.Initializer;
import org.nasdanika.models.java.Interface;
import org.nasdanika.models.java.JavaFactory;
import org.nasdanika.models.java.Method;
import org.nasdanika.models.java.Parameter;
import org.nasdanika.models.java.Record;
import org.nasdanika.models.java.Source;
import org.nasdanika.models.java.Type;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.Problem;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.body.AnnotationMemberDeclaration;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.CallableDeclaration;
import com.github.javaparser.ast.body.CompactConstructorDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.EnumConstantDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.InitializerDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.ReceiverParameter;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.expr.SimpleName;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.PrimitiveType;
import com.github.javaparser.ast.type.ReferenceType;
import com.github.javaparser.ast.type.TypeParameter;
import com.github.javaparser.ast.type.WildcardType;

public class JavaParserResource extends ResourceImpl {

	private ParserConfiguration parserConfiguration;
	private Function<Source<?>, Coverage> coverageProvider;

	public JavaParserResource(URI uri, ParserConfiguration parserConfiguration, Function<Source<?>,Coverage> coverageProvider) {
		super(uri);
		this.parserConfiguration = parserConfiguration;
		this.coverageProvider = coverageProvider;
	}
	
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		JavaParser parser = new JavaParser(parserConfiguration);
		ParseResult<CompilationUnit> parseResult = parser.parse(inputStream);
		EList<Diagnostic> errs = getErrors();
		for (Problem problem: parseResult.getProblems()) {
			errs.add(new Diagnostic() {
				
				@Override
				public String getMessage() {
					return problem.getVerboseMessage();
				}
				
				@Override
				public String getLocation() {
					return null;
				}
				
				@Override
				public int getLine() {
					return 0;
				}
				
				@Override
				public int getColumn() {
					return 0;
				}
			});
		}
		Optional<CompilationUnit> result = parseResult.getResult();
		if (result.isPresent()) {
			getContents().add(loadCompilationUnit(result.get()));
			if (coverageProvider != null) {
				getAllContents().forEachRemaining(eObj -> {
					if (eObj instanceof Source) {
						@SuppressWarnings("unchecked")
						Source<Coverage> source = (Source<Coverage>) eObj;
						Coverage coverage = (Coverage) coverageProvider.apply(source);
						source.setCoverage(coverage);
					}
				});
			}
		}
	}
	
	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		try (Writer writer = new OutputStreamWriter(outputStream)) {
			for (EObject root: getContents()) {
				if (root instanceof Source) {
					writer.write(((Source<?>) root).getSource());
				}
			}
		}
	}
	
	protected org.nasdanika.models.java.CompilationUnit createCompilationUnit() {
		return getJavaFactory().createCompilationUnit();
	}

	protected JavaFactory getJavaFactory() {
		return JavaFactory.eINSTANCE;
	}
	
	protected org.nasdanika.models.java.CompilationUnit loadCompilationUnit(com.github.javaparser.ast.CompilationUnit jpCompilationUnit) { 
		org.nasdanika.models.java.CompilationUnit modelCompilationUnit = createCompilationUnit();
		
		modelCompilationUnit.setSource(jpCompilationUnit.toString());
		Optional<PackageDeclaration> pd = jpCompilationUnit.getPackageDeclaration();
		if (pd.isPresent()) {
			modelCompilationUnit.setPackageName(pd.get().getNameAsString());
		}
		
		for (ImportDeclaration importDeclaration: jpCompilationUnit.getImports()) {
			modelCompilationUnit.getImports().add(importDeclaration.isStatic() ? "static " + importDeclaration.getNameAsString() : importDeclaration.getNameAsString());			
		}
		
		for (TypeDeclaration<?> td: jpCompilationUnit.getTypes()) {
			Type type = loadTypeDeclaration(td);
			if (type != null) {
				modelCompilationUnit.getTypes().add(type);
			}
		}
		
		return modelCompilationUnit;
	}
	
	protected void configureMember(BodyDeclaration<?> bodyDeclaration, org.nasdanika.models.java.Member<?> member) {
		Optional<Comment> copt = bodyDeclaration.getComment();
		if (copt.isPresent()) {
			org.nasdanika.models.java.Comment comment = createComment(); // TODO - comment flavors
			comment.setComment(copt.get().getContent());	
			member.setComment(comment);
		}		
		member.setSource(bodyDeclaration.toString());
	}

	protected org.nasdanika.models.java.Comment createComment() {
		return getJavaFactory().createComment();
	}	
	
	protected void configureOperation(CallableDeclaration<?> callableDeclaration, org.nasdanika.models.java.Operation operation) {
		configureMember(callableDeclaration, operation);
		for (Modifier modifier: callableDeclaration.getModifiers()) {
			operation.getModifiers().add(modifier.toString().trim());
		}
		callableDeclaration.getReceiverParameter().ifPresent(rp -> operation.setReceiverParameter(loadReceiverParameter(rp)));
		for (com.github.javaparser.ast.body.Parameter p: callableDeclaration.getParameters()) {
			operation.getParameters().add(loadParameter(p));
		}
		for (ReferenceType exc: callableDeclaration.getThrownExceptions()) {
			operation.getExceptions().add(loadGenericType(exc));
		}
		for (TypeParameter tp: callableDeclaration.getTypeParameters()) {
			operation.getTypeParameters().add(loadTypeParameter(tp));
		}
		operation.setSignature(callableDeclaration.getSignature().asString());		
	}	
	
	protected Parameter loadParameter(com.github.javaparser.ast.body.Parameter parameter) {
		Parameter ret = createParameter();
		for (Modifier modifier: parameter.getModifiers()) {
			ret.getModifiers().add(modifier.toString().trim());
		}
		ret.setName(parameter.getNameAsString());
		ret.setType(loadGenericType(parameter.getType()));
		return ret;
	}

	protected Parameter loadReceiverParameter(ReceiverParameter receiverParameter) {
		Parameter ret = createParameter();
		ret.setName(receiverParameter.getNameAsString());
		ret.setType(loadGenericType(receiverParameter.getType()));
		return ret;
	}

	protected Parameter createParameter() {
		return getJavaFactory().createParameter();
	}

	/**
	 * Configuration common for all types
	 * @param typeDeclaration
	 * @param type
	 * @return
	 */
	protected void configureTypeDeclaration(com.github.javaparser.ast.body.TypeDeclaration<?> typeDeclaration, org.nasdanika.models.java.Type type) {
		configureMember(typeDeclaration, type);
		type.setName(typeDeclaration.getNameAsString());
		typeDeclaration.getFullyQualifiedName().ifPresent(type::setFullyQualifiedName);
		type.getMembers().addAll(loadMembers(typeDeclaration));			
		for (Modifier modifier: typeDeclaration.getModifiers()) {
			type.getModifiers().add(modifier.toString().trim());
		}
	}
	
	protected org.nasdanika.models.java.Type loadTypeDeclaration(com.github.javaparser.ast.body.TypeDeclaration<?> typeDeclaration) {
		if (typeDeclaration instanceof com.github.javaparser.ast.body.AnnotationDeclaration) {
			return loadAnnotationDeclaration((com.github.javaparser.ast.body.AnnotationDeclaration) typeDeclaration);
		}
		if (typeDeclaration instanceof com.github.javaparser.ast.body.ClassOrInterfaceDeclaration) {
			return loadClassOrInterfaceDeclaration((com.github.javaparser.ast.body.ClassOrInterfaceDeclaration) typeDeclaration);
		}
		if (typeDeclaration instanceof com.github.javaparser.ast.body.EnumDeclaration) {
			return loadEnumDeclaration((com.github.javaparser.ast.body.EnumDeclaration) typeDeclaration);
		}
		if (typeDeclaration instanceof com.github.javaparser.ast.body.RecordDeclaration) {
			return loadRecordDeclaration((com.github.javaparser.ast.body.RecordDeclaration) typeDeclaration);
		}
		throw new IllegalArgumentException("Unexpected type declaration: " + typeDeclaration);
	}
			
	protected org.nasdanika.models.java.AnnotationInterface loadAnnotationDeclaration(com.github.javaparser.ast.body.AnnotationDeclaration annotationDeclaration) {
		org.nasdanika.models.java.AnnotationInterface annotation = createAnnotationInterface();
		configureTypeDeclaration(annotationDeclaration, annotation);
		return annotation;
	}

	protected AnnotationInterface createAnnotationInterface() {
		return getJavaFactory().createAnnotationInterface();
	}
	
	protected org.nasdanika.models.java.Type loadClassOrInterfaceDeclaration(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration classOrInterfaceDeclaration) {
		if (classOrInterfaceDeclaration.isInterface()) {
			org.nasdanika.models.java.Interface modelInterface = createInterface();
			configureClassOrInterfaceDeclaration(classOrInterfaceDeclaration, modelInterface);
			return modelInterface;
		}
		
		org.nasdanika.models.java.Class modelClass = createClass();
		configureClassOrInterfaceDeclaration(classOrInterfaceDeclaration, modelClass);		
		return modelClass;
	}

	protected void configureClassOrInterfaceDeclaration(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration classOrInterfaceDeclaration, org.nasdanika.models.java.Type type) {
		configureTypeDeclaration(classOrInterfaceDeclaration, type);
		EList<GenericType> supertypes = type.getSupertypes();
		for (ClassOrInterfaceType ext: classOrInterfaceDeclaration.getExtendedTypes()) {
			supertypes.add(loadGenericType(ext));
		}
		
		if (!classOrInterfaceDeclaration.isInterface() && supertypes.isEmpty()) {
			GenericType objectType = createGenericType();
			objectType.setName("Object");
			objectType.setFullyQualifiedName("java.lang.Object");
			supertypes.add(objectType);
		}
		
		for (ClassOrInterfaceType impl: classOrInterfaceDeclaration.getImplementedTypes()) {
			supertypes.add(loadGenericType(impl));
		}
		
		for (ClassOrInterfaceType perm: classOrInterfaceDeclaration.getPermittedTypes()) {
			type.getPermits().add(loadGenericType(perm));
		}
		
		for (TypeParameter typeParameter: classOrInterfaceDeclaration.getTypeParameters()) {
			type.getTypeParameters().add(loadTypeParameter(typeParameter));
		}
		
	}
	
	protected org.nasdanika.models.java.TypeParameter loadTypeParameter(TypeParameter typeParameter) {
		org.nasdanika.models.java.TypeParameter ret = createTypeParameter();
		ret.setName(typeParameter.getNameAsString());
		for (ClassOrInterfaceType bound: typeParameter.getTypeBound()) {
			ret.getBounds().add(loadGenericType(bound));
		}
		ret.setSource(typeParameter.asString());
		return ret;
	}

	protected org.nasdanika.models.java.TypeParameter createTypeParameter() {
		return getJavaFactory().createTypeParameter();
	}

	protected GenericType loadGenericType(com.github.javaparser.ast.type.Type type) {
		if (type == null) {
			return null;
		}
		GenericType ret = createGenericType();
		if (type instanceof ClassOrInterfaceType) {
			ClassOrInterfaceType cType = (ClassOrInterfaceType) type;
			ret.setName(cType.getNameAsString());
			
//			cType.getAnnotations(); TODO			
//			cType.getComment(); TODO
			cType.getTypeArguments().ifPresent(tArgs -> tArgs.forEach(tArg -> ret.getTypeArguments().add(loadGenericType(tArg))));
		} else if (type instanceof WildcardType) {
			WildcardType wt = (WildcardType) type;
			wt.getExtendedType().ifPresent(et -> ret.setUpperBound(loadGenericType(et)));
			wt.getSuperType().ifPresent(st -> ret.setLowerBound(loadGenericType(st)));
		} else if (type instanceof PrimitiveType) {
			ret.setName(type.asString());
			ret.setFullyQualifiedName(type.asString());
			ret.setPrimitive(true);
		} else {
			ret.setName(type.asString());
		}
		ret.setSource(type.asString());
		return ret;
	}

	protected GenericType createGenericType() {
		return getJavaFactory().createGenericType();
	}
	
	protected Class createClass() {
		return getJavaFactory().createClass();
	}

	protected Interface createInterface() {
		return getJavaFactory().createInterface();
	}
	
	protected org.nasdanika.models.java.Enum loadEnumDeclaration(com.github.javaparser.ast.body.EnumDeclaration enumDeclaration) {
		org.nasdanika.models.java.Enum modelEnum = createEnum();
		configureTypeDeclaration(enumDeclaration, modelEnum);
		return modelEnum;
	}

	protected Enum createEnum() {
		return getJavaFactory().createEnum();
	}
	
	protected org.nasdanika.models.java.Record loadRecordDeclaration(com.github.javaparser.ast.body.RecordDeclaration recordDeclaration) {
		org.nasdanika.models.java.Record modelRecord = createRecord();
		configureTypeDeclaration(recordDeclaration, modelRecord);
		return modelRecord;
	}

	protected Record createRecord() {
		return getJavaFactory().createRecord();
	}
	
	protected List<org.nasdanika.models.java.Member<? extends Coverage>> loadMembers(com.github.javaparser.ast.body.TypeDeclaration<?> typeDeclaration) {
		List<org.nasdanika.models.java.Member<? extends Coverage>> ret = new ArrayList<>();
		for (BodyDeclaration<?> member: typeDeclaration.getMembers()) {
			if (member instanceof AnnotationMemberDeclaration) {
				ret.add(loadAnnotationMemberDeclaration((AnnotationMemberDeclaration) member));
			} else if (member instanceof ConstructorDeclaration) {
				ret.add(loadConstructorDeclaration((ConstructorDeclaration) member));				
			} else if (member instanceof MethodDeclaration) {
				ret.add(loadMethodDeclaration((MethodDeclaration) member));				
			} else if (member instanceof CompactConstructorDeclaration) {
				ret.add(loadCompactConstructorDeclaration((CompactConstructorDeclaration) member));				
			} else if (member instanceof EnumConstantDeclaration) {
				ret.add(loadEnumConstantDeclaration((EnumConstantDeclaration) member));				
			} else if (member instanceof FieldDeclaration) {
				ret.addAll(loadFieldDeclaration((FieldDeclaration) member));				
			} else if (member instanceof InitializerDeclaration) {
				InitializerDeclaration initializerDeclaration = (InitializerDeclaration) member;
				if (initializerDeclaration.isStatic()) {
					ret.add(loadStaticInitializerDeclaration(initializerDeclaration));
				} else {
					ret.add(loadInitializerDeclaration(initializerDeclaration));					
				}
			} else {
				ret.add(loadTypeDeclaration((com.github.javaparser.ast.body.TypeDeclaration<?>) member));
			}
		}		
		
		return ret;
	}
	
	protected org.nasdanika.models.java.AnnotationInterfaceMember loadAnnotationMemberDeclaration(AnnotationMemberDeclaration annotationMemberDeclaration) {
		org.nasdanika.models.java.AnnotationInterfaceMember annotationMember = createAnnotationInterfaceMember();
		configureMember(annotationMemberDeclaration, annotationMember);
		return annotationMember;
	}

	protected AnnotationInterfaceMember createAnnotationInterfaceMember() {
		return getJavaFactory().createAnnotationInterfaceMember();
	}
	
	protected org.nasdanika.models.java.Constructor loadConstructorDeclaration(ConstructorDeclaration constructorDeclaration) {
		org.nasdanika.models.java.Constructor constructor = createConstructor();
		configureOperation(constructorDeclaration, constructor);
		return constructor;
	}

	protected Constructor createConstructor() {
		return getJavaFactory().createConstructor();
	}
	
	protected org.nasdanika.models.java.Method loadMethodDeclaration(MethodDeclaration methodDeclaration) {
		org.nasdanika.models.java.Method method = createMethod();
		configureOperation(methodDeclaration, method);
		method.setName(methodDeclaration.getName().toString());
		method.setType(loadGenericType(methodDeclaration.getType()));
		return method;		
	}

	protected Method createMethod() {
		return getJavaFactory().createMethod();
	}
	
	protected org.nasdanika.models.java.Constructor loadCompactConstructorDeclaration(CompactConstructorDeclaration compactConstructorDeclaration) {
		org.nasdanika.models.java.Constructor constructor = createConstructor();
		configureMember(compactConstructorDeclaration, constructor);
		return constructor;
	}
	
	protected org.nasdanika.models.java.EnumConstant loadEnumConstantDeclaration(EnumConstantDeclaration enumConstantDeclaration) {
		org.nasdanika.models.java.EnumConstant enumConstant = createEnumConstant();
		configureMember(enumConstantDeclaration, enumConstant);
		return enumConstant;
	}

	protected EnumConstant createEnumConstant() {
		return getJavaFactory().createEnumConstant();
	}
	
	protected Collection<org.nasdanika.models.java.Field> loadFieldDeclaration(FieldDeclaration fieldDeclaration) {
		Collection<org.nasdanika.models.java.Field> ret = new ArrayList<>();
		for (VariableDeclarator vd: fieldDeclaration.getVariables()) {
			org.nasdanika.models.java.Field field = createField();
			configureMember(fieldDeclaration, field);
			SimpleName vName = vd.getName();
			field.setName(vName.toString());
			field.setType(loadGenericType(vd.getType()));
			vd.getInitializer().ifPresent(initializer -> {
				Code code = createCode();
				code.setSource(initializer.toString());
				field.setInitializer(code);
			});
			ret.add(field);
		}
		return ret;
	}

	protected Code createCode() {
		return getJavaFactory().createCode();
	}

	protected Field createField() {
		return getJavaFactory().createField();
	}
	
	protected org.nasdanika.models.java.Initializer loadInitializerDeclaration(InitializerDeclaration initializerDeclaration) {
		org.nasdanika.models.java.Initializer initializer = createInitializer();
		configureMember(initializerDeclaration, initializer);
		return initializer;		
	}

	protected Initializer createInitializer() {
		return getJavaFactory().createInitializer();
	}
	
	protected org.nasdanika.models.java.ClassInitializer loadStaticInitializerDeclaration(InitializerDeclaration initializerDeclaration) {
		org.nasdanika.models.java.ClassInitializer classInitializer = createClassInitializer();
		configureMember(initializerDeclaration, classInitializer);
		return classInitializer;		
	}

	protected ClassInitializer createClassInitializer() {
		return getJavaFactory().createClassInitializer();
	}

}
