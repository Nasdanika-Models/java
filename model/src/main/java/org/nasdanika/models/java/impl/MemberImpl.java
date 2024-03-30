/**
 */
package org.nasdanika.models.java.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.models.java.Comment;
import org.nasdanika.models.java.CompilationUnit;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.Member;
import org.nasdanika.models.java.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.MemberImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.MemberImpl#getFullyQualifiedName <em>Fully Qualified Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MemberImpl extends NamedElementImpl implements Member {
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
	@Override
	public Comment getComment() {
		return (Comment)eDynamicGet(JavaPackage.MEMBER__COMMENT, JavaPackage.Literals.MEMBER__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(Comment newComment, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newComment, JavaPackage.MEMBER__COMMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(Comment newComment) {
		eDynamicSet(JavaPackage.MEMBER__COMMENT, JavaPackage.Literals.MEMBER__COMMENT, newComment);
	}

	@Override
	public String getFullyQualifiedName() {
		EObject c = eContainer();
		if (c instanceof CompilationUnit) {
			return ((CompilationUnit) c).getPackageName() + "." + getName();
		}
		if (c instanceof Type) {
			return ((Type) c).getFullyQualifiedName() + "." + getName();
		}
		
		return getName();
		
//		return (String)eDynamicGet(JavaPackage.MEMBER__FULLY_QUALIFIED_NAME, JavaPackage.Literals.MEMBER__FULLY_QUALIFIED_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.MEMBER__COMMENT:
				return basicSetComment(null, msgs);
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
			case JavaPackage.MEMBER__COMMENT:
				return getComment();
			case JavaPackage.MEMBER__FULLY_QUALIFIED_NAME:
				return getFullyQualifiedName();
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
			case JavaPackage.MEMBER__COMMENT:
				setComment((Comment)newValue);
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
			case JavaPackage.MEMBER__COMMENT:
				setComment((Comment)null);
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
			case JavaPackage.MEMBER__COMMENT:
				return getComment() != null;
			case JavaPackage.MEMBER__FULLY_QUALIFIED_NAME:
				return FULLY_QUALIFIED_NAME_EDEFAULT == null ? getFullyQualifiedName() != null : !FULLY_QUALIFIED_NAME_EDEFAULT.equals(getFullyQualifiedName());
		}
		return super.eIsSet(featureID);
	}

} //MemberImpl
