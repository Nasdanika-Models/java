/**
 */
package org.nasdanika.models.java.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.java.Field;
import org.nasdanika.models.java.FieldAccess;
import org.nasdanika.models.java.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.FieldAccessImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.FieldAccessImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.FieldAccessImpl#getReads <em>Reads</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.FieldAccessImpl#getWrites <em>Writes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldAccessImpl extends MinimalEObjectImpl.Container implements FieldAccess {
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
	 * The default value of the '{@link #getReads() <em>Reads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReads()
	 * @generated
	 * @ordered
	 */
	protected static final int READS_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getWrites() <em>Writes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrites()
	 * @generated
	 * @ordered
	 */
	protected static final int WRITES_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.FIELD_ACCESS;
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
	public Field getField() {
		return (Field)eDynamicGet(JavaPackage.FIELD_ACCESS__FIELD, JavaPackage.Literals.FIELD_ACCESS__FIELD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field basicGetField() {
		return (Field)eDynamicGet(JavaPackage.FIELD_ACCESS__FIELD, JavaPackage.Literals.FIELD_ACCESS__FIELD, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetField(Field newField, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newField, JavaPackage.FIELD_ACCESS__FIELD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setField(Field newField) {
		eDynamicSet(JavaPackage.FIELD_ACCESS__FIELD, JavaPackage.Literals.FIELD_ACCESS__FIELD, newField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(JavaPackage.FIELD_ACCESS__NAME, JavaPackage.Literals.FIELD_ACCESS__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(JavaPackage.FIELD_ACCESS__NAME, JavaPackage.Literals.FIELD_ACCESS__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReads() {
		return (Integer)eDynamicGet(JavaPackage.FIELD_ACCESS__READS, JavaPackage.Literals.FIELD_ACCESS__READS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReads(int newReads) {
		eDynamicSet(JavaPackage.FIELD_ACCESS__READS, JavaPackage.Literals.FIELD_ACCESS__READS, newReads);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWrites() {
		return (Integer)eDynamicGet(JavaPackage.FIELD_ACCESS__WRITES, JavaPackage.Literals.FIELD_ACCESS__WRITES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrites(int newWrites) {
		eDynamicSet(JavaPackage.FIELD_ACCESS__WRITES, JavaPackage.Literals.FIELD_ACCESS__WRITES, newWrites);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.FIELD_ACCESS__FIELD:
				Field field = basicGetField();
				if (field != null)
					msgs = ((InternalEObject)field).eInverseRemove(this, JavaPackage.FIELD__ACCESSES, Field.class, msgs);
				return basicSetField((Field)otherEnd, msgs);
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
			case JavaPackage.FIELD_ACCESS__FIELD:
				return basicSetField(null, msgs);
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
			case JavaPackage.FIELD_ACCESS__FIELD:
				if (resolve) return getField();
				return basicGetField();
			case JavaPackage.FIELD_ACCESS__NAME:
				return getName();
			case JavaPackage.FIELD_ACCESS__READS:
				return getReads();
			case JavaPackage.FIELD_ACCESS__WRITES:
				return getWrites();
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
			case JavaPackage.FIELD_ACCESS__FIELD:
				setField((Field)newValue);
				return;
			case JavaPackage.FIELD_ACCESS__NAME:
				setName((String)newValue);
				return;
			case JavaPackage.FIELD_ACCESS__READS:
				setReads((Integer)newValue);
				return;
			case JavaPackage.FIELD_ACCESS__WRITES:
				setWrites((Integer)newValue);
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
			case JavaPackage.FIELD_ACCESS__FIELD:
				setField((Field)null);
				return;
			case JavaPackage.FIELD_ACCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JavaPackage.FIELD_ACCESS__READS:
				setReads(READS_EDEFAULT);
				return;
			case JavaPackage.FIELD_ACCESS__WRITES:
				setWrites(WRITES_EDEFAULT);
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
			case JavaPackage.FIELD_ACCESS__FIELD:
				return basicGetField() != null;
			case JavaPackage.FIELD_ACCESS__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case JavaPackage.FIELD_ACCESS__READS:
				return getReads() != READS_EDEFAULT;
			case JavaPackage.FIELD_ACCESS__WRITES:
				return getWrites() != WRITES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //FieldAccessImpl
