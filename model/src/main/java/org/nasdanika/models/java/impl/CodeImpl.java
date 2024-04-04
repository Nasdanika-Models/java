/**
 */
package org.nasdanika.models.java.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.coverage.MethodCoverage;
import org.nasdanika.models.java.Call;
import org.nasdanika.models.java.Code;
import org.nasdanika.models.java.FieldAccess;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.CodeImpl#getFieldAccesses <em>Field Accesses</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.CodeImpl#getOutgoingCalls <em>Outgoing Calls</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.CodeImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeImpl extends MemberImpl<MethodCoverage> implements Code {
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FieldAccess> getFieldAccesses() {
		return (EList<FieldAccess>)eDynamicGet(JavaPackage.CODE__FIELD_ACCESSES, JavaPackage.Literals.CODE__FIELD_ACCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Call> getOutgoingCalls() {
		return (EList<Call>)eDynamicGet(JavaPackage.CODE__OUTGOING_CALLS, JavaPackage.Literals.CODE__OUTGOING_CALLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Source<?> getBody() {
		return (Source<?>)eDynamicGet(JavaPackage.CODE__BODY, JavaPackage.Literals.CODE__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Source<?> newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, JavaPackage.CODE__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(Source<?> newBody) {
		eDynamicSet(JavaPackage.CODE__BODY, JavaPackage.Literals.CODE__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.CODE__FIELD_ACCESSES:
				return ((InternalEList<?>)getFieldAccesses()).basicRemove(otherEnd, msgs);
			case JavaPackage.CODE__OUTGOING_CALLS:
				return ((InternalEList<?>)getOutgoingCalls()).basicRemove(otherEnd, msgs);
			case JavaPackage.CODE__BODY:
				return basicSetBody(null, msgs);
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
			case JavaPackage.CODE__FIELD_ACCESSES:
				return getFieldAccesses();
			case JavaPackage.CODE__OUTGOING_CALLS:
				return getOutgoingCalls();
			case JavaPackage.CODE__BODY:
				return getBody();
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
			case JavaPackage.CODE__FIELD_ACCESSES:
				getFieldAccesses().clear();
				getFieldAccesses().addAll((Collection<? extends FieldAccess>)newValue);
				return;
			case JavaPackage.CODE__OUTGOING_CALLS:
				getOutgoingCalls().clear();
				getOutgoingCalls().addAll((Collection<? extends Call>)newValue);
				return;
			case JavaPackage.CODE__BODY:
				setBody((Source<?>)newValue);
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
			case JavaPackage.CODE__FIELD_ACCESSES:
				getFieldAccesses().clear();
				return;
			case JavaPackage.CODE__OUTGOING_CALLS:
				getOutgoingCalls().clear();
				return;
			case JavaPackage.CODE__BODY:
				setBody((Source<?>)null);
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
			case JavaPackage.CODE__FIELD_ACCESSES:
				return !getFieldAccesses().isEmpty();
			case JavaPackage.CODE__OUTGOING_CALLS:
				return !getOutgoingCalls().isEmpty();
			case JavaPackage.CODE__BODY:
				return getBody() != null;
		}
		return super.eIsSet(featureID);
	}

} //CodeImpl
