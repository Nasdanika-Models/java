/**
 */
package org.nasdanika.models.java.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.coverage.ModuleCoverage;
import org.nasdanika.models.java.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ModuleImpl extends SourceImpl<ModuleCoverage> implements org.nasdanika.models.java.Module {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setCoverage(ModuleCoverage newCoverage) {
		super.setCoverage(newCoverage);
	}

} //ModuleImpl
