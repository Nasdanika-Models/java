/**
 */
package org.nasdanika.models.java.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.coverage.Coverage;
import org.nasdanika.models.java.Annotation;
import org.nasdanika.models.java.Comment;
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
 *   <li>{@link org.nasdanika.models.java.impl.MemberImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.MemberImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.MemberImpl#getReferencedTypes <em>Referenced Types</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.MemberImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MemberImpl<C extends Coverage> extends NamedElementImpl<C> implements Member<C> {
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
	public Annotation getAnnotations() {
		return (Annotation)eDynamicGet(JavaPackage.MEMBER__ANNOTATIONS, JavaPackage.Literals.MEMBER__ANNOTATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation basicGetAnnotations() {
		return (Annotation)eDynamicGet(JavaPackage.MEMBER__ANNOTATIONS, JavaPackage.Literals.MEMBER__ANNOTATIONS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotations(Annotation newAnnotations) {
		eDynamicSet(JavaPackage.MEMBER__ANNOTATIONS, JavaPackage.Literals.MEMBER__ANNOTATIONS, newAnnotations);
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
			case JavaPackage.MEMBER__COMMENT:
				return getComment();
			case JavaPackage.MEMBER__MODIFIERS:
				return getModifiers();
			case JavaPackage.MEMBER__REFERENCED_TYPES:
				return getReferencedTypes();
			case JavaPackage.MEMBER__ANNOTATIONS:
				if (resolve) return getAnnotations();
				return basicGetAnnotations();
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
			case JavaPackage.MEMBER__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends String>)newValue);
				return;
			case JavaPackage.MEMBER__REFERENCED_TYPES:
				getReferencedTypes().clear();
				getReferencedTypes().addAll((Collection<? extends GenericType>)newValue);
				return;
			case JavaPackage.MEMBER__ANNOTATIONS:
				setAnnotations((Annotation)newValue);
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
			case JavaPackage.MEMBER__MODIFIERS:
				getModifiers().clear();
				return;
			case JavaPackage.MEMBER__REFERENCED_TYPES:
				getReferencedTypes().clear();
				return;
			case JavaPackage.MEMBER__ANNOTATIONS:
				setAnnotations((Annotation)null);
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
			case JavaPackage.MEMBER__MODIFIERS:
				return !getModifiers().isEmpty();
			case JavaPackage.MEMBER__REFERENCED_TYPES:
				return !getReferencedTypes().isEmpty();
			case JavaPackage.MEMBER__ANNOTATIONS:
				return basicGetAnnotations() != null;
		}
		return super.eIsSet(featureID);
	}

} //MemberImpl
