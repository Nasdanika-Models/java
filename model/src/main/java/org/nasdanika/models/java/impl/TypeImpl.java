/**
 */
package org.nasdanika.models.java.impl;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.java.CompilationUnit;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.Member;
import org.nasdanika.models.java.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.TypeImpl#getMembers <em>Members</em>}</li>
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.TYPE__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String getFullyQualifiedName() {
		EObject c = eContainer();
		if (c == null || c instanceof CompilationUnit || c instanceof Type) {
			return super.getFullyQualifiedName();
		}
		// Anonymous and nested types - some semblance of a qualified name, not exact.
		for (EObject ancestor = c; ancestor != null; ancestor = ancestor.eContainer()) {
			if (ancestor instanceof Type) {
				AtomicInteger counter = new AtomicInteger();
				TreeIterator<EObject> cit = ancestor.eAllContents();
				while (cit.hasNext()) {
					EObject next = cit.next();
					if (next instanceof Type) {
						if (next == this) {
							return ((Type) ancestor).getFullyQualifiedName() + "$" + counter; 
						}
						if (next.eContainer() != ancestor) {
							counter.incrementAndGet(); // Indirectly contained types, e.g. in methods
						}
						cit.prune();
					}
				}
			}
		}
		
		return getName();
	}

} //TypeImpl
