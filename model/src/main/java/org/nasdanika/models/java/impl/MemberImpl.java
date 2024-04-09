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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.MemberImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.MemberImpl#getReferencedTypes <em>Referenced Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MemberImpl extends NamedElementImpl implements Member {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getModifiers() {
		return (EList<String>)eDynamicGet(JavaPackage.MEMBER__MODIFIERS, JavaPackage.Literals.MEMBER__MODIFIERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<GenericType> getReferencedTypes() {
		return (EList<GenericType>)eDynamicGet(JavaPackage.MEMBER__REFERENCED_TYPES, JavaPackage.Literals.MEMBER__REFERENCED_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.MEMBER__REFERENCED_TYPES:
				return ((InternalEList<?>)getReferencedTypes()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.MEMBER__MODIFIERS:
				return getModifiers();
			case JavaPackage.MEMBER__REFERENCED_TYPES:
				return getReferencedTypes();
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
			case JavaPackage.MEMBER__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends String>)newValue);
				return;
			case JavaPackage.MEMBER__REFERENCED_TYPES:
				getReferencedTypes().clear();
				getReferencedTypes().addAll((Collection<? extends GenericType>)newValue);
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
			case JavaPackage.MEMBER__MODIFIERS:
				getModifiers().clear();
				return;
			case JavaPackage.MEMBER__REFERENCED_TYPES:
				getReferencedTypes().clear();
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
			case JavaPackage.MEMBER__MODIFIERS:
				return !getModifiers().isEmpty();
			case JavaPackage.MEMBER__REFERENCED_TYPES:
				return !getReferencedTypes().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	protected String annotationSuffix(int indent) {
		return isMerging() ? "" : System.lineSeparator();
	}

	protected String annotationPrefix(int indent) {
		return isMerging() ?  "" : indent(indent).toString();
	}

} //MemberImpl
