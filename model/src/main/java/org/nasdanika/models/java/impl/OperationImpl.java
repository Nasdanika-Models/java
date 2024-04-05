/**
 */
package org.nasdanika.models.java.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.java.GenericType;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.Operation;
import org.nasdanika.models.java.Parameter;
import org.nasdanika.models.java.TypeParameter;
import org.nasdanika.models.java.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.OperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.OperationImpl#getReceiverParameter <em>Receiver Parameter</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.OperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.OperationImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.OperationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.OperationImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperationImpl extends CodeImpl implements Operation {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericType getType() {
		return (GenericType)eDynamicGet(JavaPackage.OPERATION__TYPE, JavaPackage.Literals.TYPED_ELEMENT__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(GenericType newType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newType, JavaPackage.OPERATION__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(GenericType newType) {
		eDynamicSet(JavaPackage.OPERATION__TYPE, JavaPackage.Literals.TYPED_ELEMENT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getReceiverParameter() {
		return (Parameter)eDynamicGet(JavaPackage.OPERATION__RECEIVER_PARAMETER, JavaPackage.Literals.OPERATION__RECEIVER_PARAMETER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiverParameter(Parameter newReceiverParameter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newReceiverParameter, JavaPackage.OPERATION__RECEIVER_PARAMETER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiverParameter(Parameter newReceiverParameter) {
		eDynamicSet(JavaPackage.OPERATION__RECEIVER_PARAMETER, JavaPackage.Literals.OPERATION__RECEIVER_PARAMETER, newReceiverParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Parameter> getParameters() {
		return (EList<Parameter>)eDynamicGet(JavaPackage.OPERATION__PARAMETERS, JavaPackage.Literals.OPERATION__PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<GenericType> getExceptions() {
		return (EList<GenericType>)eDynamicGet(JavaPackage.OPERATION__EXCEPTIONS, JavaPackage.Literals.OPERATION__EXCEPTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TypeParameter> getTypeParameters() {
		return (EList<TypeParameter>)eDynamicGet(JavaPackage.OPERATION__TYPE_PARAMETERS, JavaPackage.Literals.OPERATION__TYPE_PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSignature() {
		return (String)eDynamicGet(JavaPackage.OPERATION__SIGNATURE, JavaPackage.Literals.OPERATION__SIGNATURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignature(String newSignature) {
		eDynamicSet(JavaPackage.OPERATION__SIGNATURE, JavaPackage.Literals.OPERATION__SIGNATURE, newSignature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.OPERATION__TYPE:
				return basicSetType(null, msgs);
			case JavaPackage.OPERATION__RECEIVER_PARAMETER:
				return basicSetReceiverParameter(null, msgs);
			case JavaPackage.OPERATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case JavaPackage.OPERATION__EXCEPTIONS:
				return ((InternalEList<?>)getExceptions()).basicRemove(otherEnd, msgs);
			case JavaPackage.OPERATION__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.OPERATION__TYPE:
				return getType();
			case JavaPackage.OPERATION__RECEIVER_PARAMETER:
				return getReceiverParameter();
			case JavaPackage.OPERATION__PARAMETERS:
				return getParameters();
			case JavaPackage.OPERATION__EXCEPTIONS:
				return getExceptions();
			case JavaPackage.OPERATION__TYPE_PARAMETERS:
				return getTypeParameters();
			case JavaPackage.OPERATION__SIGNATURE:
				return getSignature();
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
			case JavaPackage.OPERATION__TYPE:
				setType((GenericType)newValue);
				return;
			case JavaPackage.OPERATION__RECEIVER_PARAMETER:
				setReceiverParameter((Parameter)newValue);
				return;
			case JavaPackage.OPERATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case JavaPackage.OPERATION__EXCEPTIONS:
				getExceptions().clear();
				getExceptions().addAll((Collection<? extends GenericType>)newValue);
				return;
			case JavaPackage.OPERATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case JavaPackage.OPERATION__SIGNATURE:
				setSignature((String)newValue);
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
			case JavaPackage.OPERATION__TYPE:
				setType((GenericType)null);
				return;
			case JavaPackage.OPERATION__RECEIVER_PARAMETER:
				setReceiverParameter((Parameter)null);
				return;
			case JavaPackage.OPERATION__PARAMETERS:
				getParameters().clear();
				return;
			case JavaPackage.OPERATION__EXCEPTIONS:
				getExceptions().clear();
				return;
			case JavaPackage.OPERATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case JavaPackage.OPERATION__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
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
			case JavaPackage.OPERATION__TYPE:
				return getType() != null;
			case JavaPackage.OPERATION__RECEIVER_PARAMETER:
				return getReceiverParameter() != null;
			case JavaPackage.OPERATION__PARAMETERS:
				return !getParameters().isEmpty();
			case JavaPackage.OPERATION__EXCEPTIONS:
				return !getExceptions().isEmpty();
			case JavaPackage.OPERATION__TYPE_PARAMETERS:
				return !getTypeParameters().isEmpty();
			case JavaPackage.OPERATION__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? getSignature() != null : !SIGNATURE_EDEFAULT.equals(getSignature());
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
				case JavaPackage.OPERATION__TYPE: return JavaPackage.TYPED_ELEMENT__TYPE;
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
				case JavaPackage.TYPED_ELEMENT__TYPE: return JavaPackage.OPERATION__TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OperationImpl
