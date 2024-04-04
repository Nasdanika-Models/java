/**
 */
package org.nasdanika.models.java.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.models.coverage.Coverage;
import org.nasdanika.models.java.Code;
import org.nasdanika.models.java.Field;
import org.nasdanika.models.java.FieldAccess;
import org.nasdanika.models.java.GenericType;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.FieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.FieldImpl#getAccesses <em>Accesses</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.FieldImpl#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends MemberImpl<Coverage> implements Field {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericType getType() {
		return (GenericType)eDynamicGet(JavaPackage.FIELD__TYPE, JavaPackage.Literals.TYPED_ELEMENT__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(GenericType newType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newType, JavaPackage.FIELD__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(GenericType newType) {
		eDynamicSet(JavaPackage.FIELD__TYPE, JavaPackage.Literals.TYPED_ELEMENT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAccess getAccesses() {
		return (FieldAccess)eDynamicGet(JavaPackage.FIELD__ACCESSES, JavaPackage.Literals.FIELD__ACCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldAccess basicGetAccesses() {
		return (FieldAccess)eDynamicGet(JavaPackage.FIELD__ACCESSES, JavaPackage.Literals.FIELD__ACCESSES, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccesses(FieldAccess newAccesses, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAccesses, JavaPackage.FIELD__ACCESSES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccesses(FieldAccess newAccesses) {
		eDynamicSet(JavaPackage.FIELD__ACCESSES, JavaPackage.Literals.FIELD__ACCESSES, newAccesses);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Code getInitializer() {
		return (Code)eDynamicGet(JavaPackage.FIELD__INITIALIZER, JavaPackage.Literals.FIELD__INITIALIZER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitializer(Code newInitializer, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newInitializer, JavaPackage.FIELD__INITIALIZER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitializer(Code newInitializer) {
		eDynamicSet(JavaPackage.FIELD__INITIALIZER, JavaPackage.Literals.FIELD__INITIALIZER, newInitializer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.FIELD__ACCESSES:
				FieldAccess accesses = basicGetAccesses();
				if (accesses != null)
					msgs = ((InternalEObject)accesses).eInverseRemove(this, JavaPackage.FIELD_ACCESS__FIELD, FieldAccess.class, msgs);
				return basicSetAccesses((FieldAccess)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.FIELD__TYPE:
				return basicSetType(null, msgs);
			case JavaPackage.FIELD__ACCESSES:
				return basicSetAccesses(null, msgs);
			case JavaPackage.FIELD__INITIALIZER:
				return basicSetInitializer(null, msgs);
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
			case JavaPackage.FIELD__TYPE:
				return getType();
			case JavaPackage.FIELD__ACCESSES:
				if (resolve) return getAccesses();
				return basicGetAccesses();
			case JavaPackage.FIELD__INITIALIZER:
				return getInitializer();
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
			case JavaPackage.FIELD__TYPE:
				setType((GenericType)newValue);
				return;
			case JavaPackage.FIELD__ACCESSES:
				setAccesses((FieldAccess)newValue);
				return;
			case JavaPackage.FIELD__INITIALIZER:
				setInitializer((Code)newValue);
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
			case JavaPackage.FIELD__TYPE:
				setType((GenericType)null);
				return;
			case JavaPackage.FIELD__ACCESSES:
				setAccesses((FieldAccess)null);
				return;
			case JavaPackage.FIELD__INITIALIZER:
				setInitializer((Code)null);
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
			case JavaPackage.FIELD__TYPE:
				return getType() != null;
			case JavaPackage.FIELD__ACCESSES:
				return basicGetAccesses() != null;
			case JavaPackage.FIELD__INITIALIZER:
				return getInitializer() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case JavaPackage.FIELD__TYPE: return JavaPackage.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case JavaPackage.TYPED_ELEMENT__TYPE: return JavaPackage.FIELD__TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FieldImpl
