/**
 */
package org.nasdanika.models.java.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.NamedElement;
import org.nasdanika.models.java.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.NamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.NamedElementImpl#getFullyQualifiedName <em>Fully Qualified Name</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.NamedElementImpl#getReferrers <em>Referrers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedElementImpl extends SourceImpl implements NamedElement {
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
	protected NamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.NAMED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(JavaPackage.NAMED_ELEMENT__NAME, JavaPackage.Literals.NAMED_ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(JavaPackage.NAMED_ELEMENT__NAME, JavaPackage.Literals.NAMED_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFullyQualifiedName() {
		return (String)eDynamicGet(JavaPackage.NAMED_ELEMENT__FULLY_QUALIFIED_NAME, JavaPackage.Literals.NAMED_ELEMENT__FULLY_QUALIFIED_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFullyQualifiedName(String newFullyQualifiedName) {
		eDynamicSet(JavaPackage.NAMED_ELEMENT__FULLY_QUALIFIED_NAME, JavaPackage.Literals.NAMED_ELEMENT__FULLY_QUALIFIED_NAME, newFullyQualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Reference> getReferrers() {
		return (EList<Reference>)eDynamicGet(JavaPackage.NAMED_ELEMENT__REFERRERS, JavaPackage.Literals.NAMED_ELEMENT__REFERRERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.NAMED_ELEMENT__REFERRERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferrers()).basicAdd(otherEnd, msgs);
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
			case JavaPackage.NAMED_ELEMENT__REFERRERS:
				return ((InternalEList<?>)getReferrers()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.NAMED_ELEMENT__NAME:
				return getName();
			case JavaPackage.NAMED_ELEMENT__FULLY_QUALIFIED_NAME:
				return getFullyQualifiedName();
			case JavaPackage.NAMED_ELEMENT__REFERRERS:
				return getReferrers();
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
			case JavaPackage.NAMED_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case JavaPackage.NAMED_ELEMENT__FULLY_QUALIFIED_NAME:
				setFullyQualifiedName((String)newValue);
				return;
			case JavaPackage.NAMED_ELEMENT__REFERRERS:
				getReferrers().clear();
				getReferrers().addAll((Collection<? extends Reference>)newValue);
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
			case JavaPackage.NAMED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JavaPackage.NAMED_ELEMENT__FULLY_QUALIFIED_NAME:
				setFullyQualifiedName(FULLY_QUALIFIED_NAME_EDEFAULT);
				return;
			case JavaPackage.NAMED_ELEMENT__REFERRERS:
				getReferrers().clear();
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
			case JavaPackage.NAMED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case JavaPackage.NAMED_ELEMENT__FULLY_QUALIFIED_NAME:
				return FULLY_QUALIFIED_NAME_EDEFAULT == null ? getFullyQualifiedName() != null : !FULLY_QUALIFIED_NAME_EDEFAULT.equals(getFullyQualifiedName());
			case JavaPackage.NAMED_ELEMENT__REFERRERS:
				return !getReferrers().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
} //NamedElementImpl
