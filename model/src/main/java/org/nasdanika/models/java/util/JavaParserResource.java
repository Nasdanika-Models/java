package org.nasdanika.models.java.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.nasdanika.models.java.JavaFactory;
import org.nasdanika.models.java.Source;
import org.nasdanika.models.java.Type;

import com.github.javaparser.ast.body.AnnotationMemberDeclaration;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.CallableDeclaration;
import com.github.javaparser.ast.body.CompactConstructorDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.EnumConstantDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.InitializerDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.expr.SimpleName;

public class JavaParserResource extends ResourceImpl {

	private String complianceLevel;

	protected JavaParserResource(URI uri, String complianceLevel) {
		super(uri);
		this.complianceLevel = complianceLevel;
	}
	
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		// TODO - language level in configuration
		com.github.javaparser.ast.CompilationUnit jpCompilationUnit = com.github.javaparser.StaticJavaParser.parse(inputStream);
		getContents().add(loadCompilationUnit(jpCompilationUnit));
	}
	
	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		try (Writer writer = new OutputStreamWriter(outputStream)) {
			for (EObject root: getContents()) {
				if (root instanceof Source) {
					writer.write(((Source) root).getSource());
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
		
		for (TypeDeclaration<?> td: jpCompilationUnit.getTypes()) {
			Type type = loadTypeDeclaration(td);
			if (type != null) {
				modelCompilationUnit.getTypes().add(type);
			}
		}
		
		return modelCompilationUnit;
	}
	
	protected void configureMember(BodyDeclaration<?> bodyDeclaration, org.nasdanika.models.java.Member member) {
		Optional<Comment> copt = bodyDeclaration.getComment();
		if (copt.isPresent()) {
			org.nasdanika.models.java.Comment comment = getJavaFactory().createComment(); // TODO - comment flavors
			comment.setComment(copt.get().getContent());	
			member.setComment(comment);
		}		
		member.setSource(bodyDeclaration.toString());
	}	
	
	protected void configureOperation(CallableDeclaration<?> callableDeclaration, org.nasdanika.models.java.Operation operation) {
		configureMember(callableDeclaration, operation);		
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
		type.getMembers().addAll(loadMembers(typeDeclaration));			
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
			
	protected org.nasdanika.models.java.Annotation loadAnnotationDeclaration(com.github.javaparser.ast.body.AnnotationDeclaration annotationDeclaration) {
		org.nasdanika.models.java.Annotation annotation = getJavaFactory().createAnnotation();
		configureTypeDeclaration(annotationDeclaration, annotation);
		return annotation;
	}
	
	protected org.nasdanika.models.java.Type loadClassOrInterfaceDeclaration(com.github.javaparser.ast.body.ClassOrInterfaceDeclaration classOrInterfaceDeclaration) {
		if (classOrInterfaceDeclaration.isInterface()) {
			org.nasdanika.models.java.Interface modelInterface = getJavaFactory().createInterface();
			configureTypeDeclaration(classOrInterfaceDeclaration, modelInterface);
			return modelInterface;
		}
		
		org.nasdanika.models.java.Class modelClass = getJavaFactory().createClass();
		configureTypeDeclaration(classOrInterfaceDeclaration, modelClass);		
		return modelClass;
	}
	
	protected org.nasdanika.models.java.Enum loadEnumDeclaration(com.github.javaparser.ast.body.EnumDeclaration enumDeclaration) {
		org.nasdanika.models.java.Enum modelEnum = getJavaFactory().createEnum();
		configureTypeDeclaration(enumDeclaration, modelEnum);
		return modelEnum;
	}
	
	protected org.nasdanika.models.java.Record loadRecordDeclaration(com.github.javaparser.ast.body.RecordDeclaration recordDeclaration) {
		org.nasdanika.models.java.Record modelRecord = getJavaFactory().createRecord();
		configureTypeDeclaration(recordDeclaration, modelRecord);
		return modelRecord;
	}
	
	protected List<org.nasdanika.models.java.Member> loadMembers(com.github.javaparser.ast.body.TypeDeclaration<?> typeDeclaration) {
		List<org.nasdanika.models.java.Member> ret = new ArrayList<>();
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
				ret.add(loadFieldDeclaration((FieldDeclaration) member));				
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
	
	protected org.nasdanika.models.java.AnnotationMember loadAnnotationMemberDeclaration(AnnotationMemberDeclaration annotationMemberDeclaration) {
		org.nasdanika.models.java.AnnotationMember annotationMember = getJavaFactory().createAnnotationMember();
		configureMember(annotationMemberDeclaration, annotationMember);
		return annotationMember;
	}
	
	protected org.nasdanika.models.java.Constructor loadConstructorDeclaration(ConstructorDeclaration constructorDeclaration) {
		org.nasdanika.models.java.Constructor constructor = getJavaFactory().createConstructor();
		configureOperation(constructorDeclaration, constructor);
		return constructor;
	}
	
	protected org.nasdanika.models.java.Method loadMethodDeclaration(MethodDeclaration methodDeclaration) {
		org.nasdanika.models.java.Method method = getJavaFactory().createMethod();
		configureOperation(methodDeclaration, method);
		method.setName(methodDeclaration.getName().toString());
		return method;		
	}
	
	protected org.nasdanika.models.java.Constructor loadCompactConstructorDeclaration(CompactConstructorDeclaration compactConstructorDeclaration) {
		org.nasdanika.models.java.Constructor constructor = getJavaFactory().createConstructor();
		configureMember(compactConstructorDeclaration, constructor);
		return constructor;
	}
	
	protected org.nasdanika.models.java.EnumConstant loadEnumConstantDeclaration(EnumConstantDeclaration enumConstantDeclaration) {
		org.nasdanika.models.java.EnumConstant enumConstant = getJavaFactory().createEnumConstant();
		configureMember(enumConstantDeclaration, enumConstant);
		return enumConstant;
	}
	
	protected org.nasdanika.models.java.Field loadFieldDeclaration(FieldDeclaration fieldDeclaration) {
		org.nasdanika.models.java.Field field = getJavaFactory().createField();
		configureMember(fieldDeclaration, field);
		for (VariableDeclarator vd: fieldDeclaration.getVariables()) {
			SimpleName vName = vd.getName();
			field.setName(vName.toString());
		}
		return field;		
	}
	
	protected org.nasdanika.models.java.Initializer loadInitializerDeclaration(InitializerDeclaration initializerDeclaration) {
		org.nasdanika.models.java.Initializer initializer = getJavaFactory().createInitializer();
		configureMember(initializerDeclaration, initializer);
		return initializer;		
	}
	
	protected org.nasdanika.models.java.ClassInitializer loadStaticInitializerDeclaration(InitializerDeclaration initializerDeclaration) {
		org.nasdanika.models.java.ClassInitializer classInitializer = getJavaFactory().createClassInitializer();
		configureMember(initializerDeclaration, classInitializer);
		return classInitializer;		
	}

}
