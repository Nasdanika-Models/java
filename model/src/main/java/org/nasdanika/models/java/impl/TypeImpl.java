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
import org.nasdanika.models.java.Member;
import org.nasdanika.models.java.Type;
import org.nasdanika.models.java.TypeParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.TypeImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.TypeImpl#getSupertypes <em>Supertypes</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.TypeImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.TypeImpl#getPermits <em>Permits</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypeImpl extends MemberImpl implements Type {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Member> getMembers() {
		return (EList<Member>)eDynamicGet(JavaPackage.TYPE__MEMBERS, JavaPackage.Literals.TYPE__MEMBERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<GenericType> getSupertypes() {
		return (EList<GenericType>)eDynamicGet(JavaPackage.TYPE__SUPERTYPES, JavaPackage.Literals.TYPE__SUPERTYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<GenericType> getPermits() {
		return (EList<GenericType>)eDynamicGet(JavaPackage.TYPE__PERMITS, JavaPackage.Literals.TYPE__PERMITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TypeParameter> getTypeParameters() {
		return (EList<TypeParameter>)eDynamicGet(JavaPackage.TYPE__TYPE_PARAMETERS, JavaPackage.Literals.TYPE__TYPE_PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.TYPE__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case JavaPackage.TYPE__SUPERTYPES:
				return ((InternalEList<?>)getSupertypes()).basicRemove(otherEnd, msgs);
			case JavaPackage.TYPE__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case JavaPackage.TYPE__PERMITS:
				return ((InternalEList<?>)getPermits()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.TYPE__MEMBERS:
				return getMembers();
			case JavaPackage.TYPE__SUPERTYPES:
				return getSupertypes();
			case JavaPackage.TYPE__TYPE_PARAMETERS:
				return getTypeParameters();
			case JavaPackage.TYPE__PERMITS:
				return getPermits();
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
			case JavaPackage.TYPE__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Member>)newValue);
				return;
			case JavaPackage.TYPE__SUPERTYPES:
				getSupertypes().clear();
				getSupertypes().addAll((Collection<? extends GenericType>)newValue);
				return;
			case JavaPackage.TYPE__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case JavaPackage.TYPE__PERMITS:
				getPermits().clear();
				getPermits().addAll((Collection<? extends GenericType>)newValue);
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
			case JavaPackage.TYPE__MEMBERS:
				getMembers().clear();
				return;
			case JavaPackage.TYPE__SUPERTYPES:
				getSupertypes().clear();
				return;
			case JavaPackage.TYPE__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case JavaPackage.TYPE__PERMITS:
				getPermits().clear();
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
			case JavaPackage.TYPE__MEMBERS:
				return !getMembers().isEmpty();
			case JavaPackage.TYPE__SUPERTYPES:
				return !getSupertypes().isEmpty();
			case JavaPackage.TYPE__TYPE_PARAMETERS:
				return !getTypeParameters().isEmpty();
			case JavaPackage.TYPE__PERMITS:
				return !getPermits().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeImpl
