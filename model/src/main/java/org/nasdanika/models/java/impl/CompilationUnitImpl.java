/**
 */
package org.nasdanika.models.java.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.merge.java.facade.FacadeHelper;
import org.eclipse.emf.codegen.merge.java.facade.JCompilationUnit;
import org.eclipse.emf.codegen.merge.java.facade.ast.ASTFacadeHelper;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.java.CompilationUnit;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.Source;
import org.nasdanika.models.java.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.CompilationUnitImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnitImpl extends SourceImpl implements CompilationUnit {
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
	 * @generated NOT
	 */
	@Override
	public void merge(String source, String complianceLevel) {
	    JControlModel controlModel = new JControlModel();
		
		// Create model
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();

		// create adapter factory
		GeneratorAdapterFactory adapterFactory = GenModelGeneratorAdapterFactory.DESCRIPTOR.createAdapterFactory();
		adapterFactory.setGenerator(new org.eclipse.emf.codegen.ecore.generator.Generator());
		adapterFactory.initialize(genModel);

		// get merge rules URI
		String mergeRulesURI = adapterFactory.getGenerator().getOptions().mergeRulesURI;
	    
	    FacadeHelper facadeHelper = CodeGenUtil.instantiateFacadeHelper(ASTFacadeHelper.class.getCanonicalName());
	    facadeHelper.setCompilerCompliance(complianceLevel);
		controlModel.initialize(facadeHelper, mergeRulesURI);
	    
		JMerger jMerger = new JMerger(controlModel);												
		
		JCompilationUnit newCompilationUnit = jMerger.createCompilationUnitForContents(source);
		jMerger.setSourceCompilationUnit(newCompilationUnit);
		
		JCompilationUnit oldCompilationUnit = jMerger.createCompilationUnitForContents(getSource());
		jMerger.setTargetCompilationUnit(oldCompilationUnit);
		
		jMerger.merge();
		
		String mergedCompilationUnitContents = jMerger.getTargetCompilationUnitContents();
		setSource(mergedCompilationUnitContents);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void merge(String complianceLevel) {
		StringBuilder sb = new StringBuilder();
		getChildren().stream().map(Source::getSource).forEach(s -> {
			if (!sb.isEmpty()) {
				sb.append(System.lineSeparator());
				sb.append(s);
			}
		});

		merge(sb.toString(), complianceLevel);
	}

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
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JavaPackage.COMPILATION_UNIT___MERGE__STRING_STRING:
				merge((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case JavaPackage.COMPILATION_UNIT___MERGE__STRING:
				merge((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CompilationUnitImpl
