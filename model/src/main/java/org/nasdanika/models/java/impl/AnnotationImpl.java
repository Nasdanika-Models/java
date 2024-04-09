/**
 */
package org.nasdanika.models.java.impl;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Util;
import org.nasdanika.models.java.Annotation;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.AnnotationImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationImpl extends ReferenceImpl implements Annotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<NamedElement> getElements() {
		return (EList<NamedElement>)eDynamicGet(JavaPackage.ANNOTATION__ELEMENTS, JavaPackage.Literals.ANNOTATION__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.ANNOTATION__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.ANNOTATION__ELEMENTS:
				return getElements();
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
			case JavaPackage.ANNOTATION__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends NamedElement>)newValue);
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
			case JavaPackage.ANNOTATION__ELEMENTS:
				getElements().clear();
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
			case JavaPackage.ANNOTATION__ELEMENTS:
				return !getElements().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	protected List<org.nasdanika.models.source.Source> generateContents(Function<String, String> tokenSource, int indent) {
		List<org.nasdanika.models.source.Source> contents = super.generateContents(tokenSource, indent);
		StringBuilder builder = new StringBuilder("@").append(Util.interpolate(getName(), tokenSource));
		EList<NamedElement> elements = getElements();
		if (!elements.isEmpty()) {
			builder.append("(");
			int position = 0;
			for (NamedElement element: elements) {
				if (position > 0) {
					builder.append(", ");
				}
				if (Util.isBlank(element.getName())) {
					builder.append(Util.interpolate(element.getSource(), tokenSource));
				} else {
					builder.append(element.getName()).append(" = ").append(Util.interpolate(element.getSource(), tokenSource));
				}
				++position;
			}
			
			builder.append(")");
		}
		contents.add(org.nasdanika.models.source.Source.create(builder, this));
		return contents;
	}

} //AnnotationImpl
