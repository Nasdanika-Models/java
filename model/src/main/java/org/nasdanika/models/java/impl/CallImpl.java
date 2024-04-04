/**
 */
package org.nasdanika.models.java.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.java.Call;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.CallImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.CallImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.CallImpl#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallImpl extends MinimalEObjectImpl.Container implements Call {
	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNTER_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.CALL;
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
	public String getSignature() {
		return (String)eDynamicGet(JavaPackage.CALL__SIGNATURE, JavaPackage.Literals.CALL__SIGNATURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignature(String newSignature) {
		eDynamicSet(JavaPackage.CALL__SIGNATURE, JavaPackage.Literals.CALL__SIGNATURE, newSignature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getOperation() {
		return (Operation)eDynamicGet(JavaPackage.CALL__OPERATION, JavaPackage.Literals.CALL__OPERATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperation() {
		return (Operation)eDynamicGet(JavaPackage.CALL__OPERATION, JavaPackage.Literals.CALL__OPERATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOperation, JavaPackage.CALL__OPERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperation(Operation newOperation) {
		eDynamicSet(JavaPackage.CALL__OPERATION, JavaPackage.Literals.CALL__OPERATION, newOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCounter() {
		return (Integer)eDynamicGet(JavaPackage.CALL__COUNTER, JavaPackage.Literals.CALL__COUNTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounter(int newCounter) {
		eDynamicSet(JavaPackage.CALL__COUNTER, JavaPackage.Literals.CALL__COUNTER, newCounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.CALL__OPERATION:
				Operation operation = basicGetOperation();
				if (operation != null)
					msgs = ((InternalEObject)operation).eInverseRemove(this, JavaPackage.OPERATION__INCOMING_CALLS, Operation.class, msgs);
				return basicSetOperation((Operation)otherEnd, msgs);
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
			case JavaPackage.CALL__OPERATION:
				return basicSetOperation(null, msgs);
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
			case JavaPackage.CALL__SIGNATURE:
				return getSignature();
			case JavaPackage.CALL__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case JavaPackage.CALL__COUNTER:
				return getCounter();
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
			case JavaPackage.CALL__SIGNATURE:
				setSignature((String)newValue);
				return;
			case JavaPackage.CALL__OPERATION:
				setOperation((Operation)newValue);
				return;
			case JavaPackage.CALL__COUNTER:
				setCounter((Integer)newValue);
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
			case JavaPackage.CALL__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case JavaPackage.CALL__OPERATION:
				setOperation((Operation)null);
				return;
			case JavaPackage.CALL__COUNTER:
				setCounter(COUNTER_EDEFAULT);
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
			case JavaPackage.CALL__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? getSignature() != null : !SIGNATURE_EDEFAULT.equals(getSignature());
			case JavaPackage.CALL__OPERATION:
				return basicGetOperation() != null;
			case JavaPackage.CALL__COUNTER:
				return getCounter() != COUNTER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //CallImpl
