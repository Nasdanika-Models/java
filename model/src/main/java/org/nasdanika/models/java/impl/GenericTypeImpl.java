/**
 */
package org.nasdanika.models.java.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.java.GenericType;
import org.nasdanika.models.java.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.GenericTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.GenericTypeImpl#getFullyQualifiedName <em>Fully Qualified Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericTypeImpl extends MinimalEObjectImpl.Container implements GenericType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFullyQualifiedName() <em>Fully Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullyQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULLY_QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.GENERIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(JavaPackage.GENERIC_TYPE__NAME, JavaPackage.Literals.GENERIC_TYPE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(JavaPackage.GENERIC_TYPE__NAME, JavaPackage.Literals.GENERIC_TYPE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getFullyQualifiedName() {
		return getName(); // TODO - bounds, arguments, ... - borrow from UML generation.
//		return (String)eDynamicGet(JavaPackage.GENERIC_TYPE__FULLY_QUALIFIED_NAME, JavaPackage.Literals.GENERIC_TYPE__FULLY_QUALIFIED_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.GENERIC_TYPE__NAME:
				return getName();
			case JavaPackage.GENERIC_TYPE__FULLY_QUALIFIED_NAME:
				return getFullyQualifiedName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaPackage.GENERIC_TYPE__NAME:
				setName((String)newValue);
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
			case JavaPackage.GENERIC_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case JavaPackage.GENERIC_TYPE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case JavaPackage.GENERIC_TYPE__FULLY_QUALIFIED_NAME:
				return FULLY_QUALIFIED_NAME_EDEFAULT == null ? getFullyQualifiedName() != null : !FULLY_QUALIFIED_NAME_EDEFAULT.equals(getFullyQualifiedName());
		}
		return super.eIsSet(featureID);
	}

} //GenericTypeImpl
