/**
 */
package org.nasdanika.models.java.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.java.CompilationUnit;
import org.nasdanika.models.java.JavaFactory;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.Position;
import org.nasdanika.models.java.Source;
import org.nasdanika.models.java.Type;
import org.nasdanika.models.java.util.SimpleImportManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.CompilationUnitImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.CompilationUnitImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.CompilationUnitImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnitImpl extends NamedElementImpl implements CompilationUnit {
	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.COMPILATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Type> getTypes() {
		return (EList<Type>)eDynamicGet(JavaPackage.COMPILATION_UNIT__TYPES, JavaPackage.Literals.COMPILATION_UNIT__TYPES, true, true);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPackageName() {
		return (String)eDynamicGet(JavaPackage.COMPILATION_UNIT__PACKAGE_NAME, JavaPackage.Literals.COMPILATION_UNIT__PACKAGE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageName(String newPackageName) {
		eDynamicSet(JavaPackage.COMPILATION_UNIT__PACKAGE_NAME, JavaPackage.Literals.COMPILATION_UNIT__PACKAGE_NAME, newPackageName);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getImports() {
		return (EList<String>)eDynamicGet(JavaPackage.COMPILATION_UNIT__IMPORTS, JavaPackage.Literals.COMPILATION_UNIT__IMPORTS, true, true);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void merge(String source, BiFunction<String, String, String> merger) {
		setSource(merger.apply(source, getSource()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void merge(BiFunction<String, String, String> merger) {
		StringBuilder sb = new StringBuilder();
		getChildren().stream().map(Source::getSource).forEach(s -> {
			if (!sb.isEmpty()) {
				sb.append(System.lineSeparator());
				sb.append(s);
			}
		});

		merge(sb.toString(), merger);
	}

	//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	@Override
//	public void merge(String source, String complianceLevel) {
//	    JControlModel controlModel = new JControlModel();
//		
//		// Create model
//		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
//
//		// create adapter factory
//		GeneratorAdapterFactory adapterFactory = GenModelGeneratorAdapterFactory.DESCRIPTOR.createAdapterFactory();
//		adapterFactory.setGenerator(new org.eclipse.emf.codegen.ecore.generator.Generator());
//		adapterFactory.initialize(genModel);
//
//		// get merge rules URI
//		String mergeRulesURI = adapterFactory.getGenerator().getOptions().mergeRulesURI;
//	    
//	    FacadeHelper facadeHelper = CodeGenUtil.instantiateFacadeHelper(ASTFacadeHelper.class.getCanonicalName());
//	    facadeHelper.setCompilerCompliance(complianceLevel);
//		controlModel.initialize(facadeHelper, mergeRulesURI);
//	    
//		JMerger jMerger = new JMerger(controlModel);												
//		
//		JCompilationUnit newCompilationUnit = jMerger.createCompilationUnitForContents(source);
//		jMerger.setSourceCompilationUnit(newCompilationUnit);
//		
//		JCompilationUnit oldCompilationUnit = jMerger.createCompilationUnitForContents(getSource());
//		jMerger.setTargetCompilationUnit(oldCompilationUnit);
//		
//		jMerger.merge();
//		
//		String mergedCompilationUnitContents = jMerger.getTargetCompilationUnitContents();
//		setSource(mergedCompilationUnitContents);
//	}
//

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.COMPILATION_UNIT__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.COMPILATION_UNIT__TYPES:
				return getTypes();
			case JavaPackage.COMPILATION_UNIT__PACKAGE_NAME:
				return getPackageName();
			case JavaPackage.COMPILATION_UNIT__IMPORTS:
				return getImports();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaPackage.COMPILATION_UNIT__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case JavaPackage.COMPILATION_UNIT__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case JavaPackage.COMPILATION_UNIT__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JavaPackage.COMPILATION_UNIT__TYPES:
				getTypes().clear();
				return;
			case JavaPackage.COMPILATION_UNIT__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case JavaPackage.COMPILATION_UNIT__IMPORTS:
				getImports().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JavaPackage.COMPILATION_UNIT__TYPES:
				return !getTypes().isEmpty();
			case JavaPackage.COMPILATION_UNIT__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? getPackageName() != null : !PACKAGE_NAME_EDEFAULT.equals(getPackageName());
			case JavaPackage.COMPILATION_UNIT__IMPORTS:
				return !getImports().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JavaPackage.COMPILATION_UNIT___MERGE__STRING_BIFUNCTION:
				merge((String)arguments.get(0), (BiFunction<String, String, String>)arguments.get(1));
				return null;
			case JavaPackage.COMPILATION_UNIT___MERGE__BIFUNCTION:
				merge((BiFunction<String, String, String>)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	protected List<Source> generateContents(Function<String, String> importManager) {
		List<Source> contents = super.generateContents(importManager);
		SimpleImportManager simpleImportManager = new SimpleImportManager(null);
		getImports().forEach(simpleImportManager::addImport);
		
		List<Source> typeSources = new ArrayList<>();
		for (Type type: getTypes()) {
			Source typeSource = JavaFactory.eINSTANCE.createSource();
			typeSource.setSource(type.generate(importManager == null ? simpleImportManager::addImport : importManager));
			typeSource.setBegin(EcoreUtil.copy(type.getBegin()));
			typeSource.setEnd(EcoreUtil.copy(type.getEnd()));
			typeSources.add(typeSource);
		}
		
		if (importManager == null) {
			getImports().clear();
			getImports().addAll(simpleImportManager.getImports());
		}
		
		StringBuilder headerBuilder = new StringBuilder();
		String pName = getPackageName();
		if (pName != null) {
			headerBuilder
				.append("package ")
				.append(pName)
				.append(";")
				.append(System.lineSeparator())
				.append(System.lineSeparator());
		}
		
		getImports().forEach(id -> headerBuilder.append("import ").append(id).append(System.lineSeparator()));
		headerBuilder.append(System.lineSeparator());
		
		Source header = JavaFactory.eINSTANCE.createSource();
		header.setSource(headerBuilder.toString());
		if (!typeSources.isEmpty()) {
			// Making an assumption no the header "original" range
			Position hBegin = JavaFactory.eINSTANCE.createPosition();
			hBegin.setColumn(1);
			hBegin.setLine(1);
			header.setBegin(hBegin);
			
			Position typeBegin = typeSources.get(0).getBegin();
			if (typeBegin != null) {
				Position hEnd = EcoreUtil.copy(typeBegin);
				hEnd.setLine(hEnd.getLine() -1);
				hEnd.setColumn(1);
				header.setEnd(hEnd);
			}
		}
		
		contents.add(header);
		contents.addAll(typeSources);
		
		return contents;
	}
	
//	
//	@Override
//	protected String generateContents(Function<String, String> importManager) {
//	}

} //CompilationUnitImpl
