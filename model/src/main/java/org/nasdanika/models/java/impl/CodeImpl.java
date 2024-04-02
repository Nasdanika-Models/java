/**
 */
package org.nasdanika.models.java.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.coverage.MethodCoverage;
import org.nasdanika.models.java.Code;
import org.nasdanika.models.java.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CodeImpl extends MemberImpl<MethodCoverage> implements Code {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.CODE;
	}

} //CodeImpl
