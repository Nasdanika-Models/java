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
 *   <li>{@link org.nasdanika.models.java.impl.OperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.OperationImpl#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperationImpl extends CodeImpl implements Operation {
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.OPERATION__TYPE:
				return basicSetType(null, msgs);
			case JavaPackage.OPERATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case JavaPackage.OPERATION__EXCEPTIONS:
				return ((InternalEList<?>)getExceptions()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.OPERATION__PARAMETERS:
				return getParameters();
			case JavaPackage.OPERATION__EXCEPTIONS:
				return getExceptions();
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
			case JavaPackage.OPERATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case JavaPackage.OPERATION__EXCEPTIONS:
				getExceptions().clear();
				getExceptions().addAll((Collection<? extends GenericType>)newValue);
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
			case JavaPackage.OPERATION__PARAMETERS:
				getParameters().clear();
				return;
			case JavaPackage.OPERATION__EXCEPTIONS:
				getExceptions().clear();
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
			case JavaPackage.OPERATION__PARAMETERS:
				return !getParameters().isEmpty();
			case JavaPackage.OPERATION__EXCEPTIONS:
				return !getExceptions().isEmpty();
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
	
	@Override
	public String getFullyQualifiedName() {
		// TODO Signature
		return super.getFullyQualifiedName();
	}

} //OperationImpl
