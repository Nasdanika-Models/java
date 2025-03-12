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
import org.nasdanika.models.java.Comment;
import org.nasdanika.models.java.GenericType;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.source.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.GenericTypeImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.GenericTypeImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.GenericTypeImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.GenericTypeImpl#isPrimitive <em>Primitive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericTypeImpl extends ReferenceImpl implements GenericType {
	/**
	 * The default value of the '{@link #isPrimitive() <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMITIVE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.GENERIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<GenericType> getTypeArguments() {
		return (EList<GenericType>)eDynamicGet(JavaPackage.GENERIC_TYPE__TYPE_ARGUMENTS, JavaPackage.Literals.GENERIC_TYPE__TYPE_ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericType getLowerBound() {
		return (GenericType)eDynamicGet(JavaPackage.GENERIC_TYPE__LOWER_BOUND, JavaPackage.Literals.GENERIC_TYPE__LOWER_BOUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerBound(GenericType newLowerBound, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLowerBound, JavaPackage.GENERIC_TYPE__LOWER_BOUND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerBound(GenericType newLowerBound) {
		eDynamicSet(JavaPackage.GENERIC_TYPE__LOWER_BOUND, JavaPackage.Literals.GENERIC_TYPE__LOWER_BOUND, newLowerBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericType getUpperBound() {
		return (GenericType)eDynamicGet(JavaPackage.GENERIC_TYPE__UPPER_BOUND, JavaPackage.Literals.GENERIC_TYPE__UPPER_BOUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBound(GenericType newUpperBound, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newUpperBound, JavaPackage.GENERIC_TYPE__UPPER_BOUND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperBound(GenericType newUpperBound) {
		eDynamicSet(JavaPackage.GENERIC_TYPE__UPPER_BOUND, JavaPackage.Literals.GENERIC_TYPE__UPPER_BOUND, newUpperBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPrimitive() {
		return (Boolean)eDynamicGet(JavaPackage.GENERIC_TYPE__PRIMITIVE, JavaPackage.Literals.GENERIC_TYPE__PRIMITIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimitive(boolean newPrimitive) {
		eDynamicSet(JavaPackage.GENERIC_TYPE__PRIMITIVE, JavaPackage.Literals.GENERIC_TYPE__PRIMITIVE, newPrimitive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.GENERIC_TYPE__TYPE_ARGUMENTS:
				return ((InternalEList<?>)getTypeArguments()).basicRemove(otherEnd, msgs);
			case JavaPackage.GENERIC_TYPE__LOWER_BOUND:
				return basicSetLowerBound(null, msgs);
			case JavaPackage.GENERIC_TYPE__UPPER_BOUND:
				return basicSetUpperBound(null, msgs);
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
			case JavaPackage.GENERIC_TYPE__TYPE_ARGUMENTS:
				return getTypeArguments();
			case JavaPackage.GENERIC_TYPE__LOWER_BOUND:
				return getLowerBound();
			case JavaPackage.GENERIC_TYPE__UPPER_BOUND:
				return getUpperBound();
			case JavaPackage.GENERIC_TYPE__PRIMITIVE:
				return isPrimitive();
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
			case JavaPackage.GENERIC_TYPE__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((Collection<? extends GenericType>)newValue);
				return;
			case JavaPackage.GENERIC_TYPE__LOWER_BOUND:
				setLowerBound((GenericType)newValue);
				return;
			case JavaPackage.GENERIC_TYPE__UPPER_BOUND:
				setUpperBound((GenericType)newValue);
				return;
			case JavaPackage.GENERIC_TYPE__PRIMITIVE:
				setPrimitive((Boolean)newValue);
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
			case JavaPackage.GENERIC_TYPE__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				return;
			case JavaPackage.GENERIC_TYPE__LOWER_BOUND:
				setLowerBound((GenericType)null);
				return;
			case JavaPackage.GENERIC_TYPE__UPPER_BOUND:
				setUpperBound((GenericType)null);
				return;
			case JavaPackage.GENERIC_TYPE__PRIMITIVE:
				setPrimitive(PRIMITIVE_EDEFAULT);
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
			case JavaPackage.GENERIC_TYPE__TYPE_ARGUMENTS:
				return !getTypeArguments().isEmpty();
			case JavaPackage.GENERIC_TYPE__LOWER_BOUND:
				return getLowerBound() != null;
			case JavaPackage.GENERIC_TYPE__UPPER_BOUND:
				return getUpperBound() != null;
			case JavaPackage.GENERIC_TYPE__PRIMITIVE:
				return isPrimitive() != PRIMITIVE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	protected List<Source> generateContents(Function<String, String> importManager, int indent) {
		List<Source> contents = super.generateContents(importManager, indent);
		Comment comment = getComment();
		if (comment != null) {
			String text = comment.getComment();
			if (!Util.isBlank(text)) {
				StringBuilder builder = indent(indent).append(text);
				if (!isMerging()) {
					builder.append(System.lineSeparator());				
				}
				contents.add(Source.create(builder, comment));
			}
		}
		for (Annotation annotation: getAnnotations()) {
			contents.add(Source.create(annotation.generate(importManager, indent), annotation));
		}
		
		StringBuilder builder = new StringBuilder();
		String name = getName();
		builder.append(Util.isBlank(name) ? "?" : Util.interpolate(name, importManager));		
		// Type arguments
		EList<GenericType> typeArguments = getTypeArguments();
		if (!typeArguments.isEmpty()) {
			builder.append("<");
			boolean first = true;
			for (GenericType typeArgument: typeArguments) {
				if (!first) {
					builder.append(",");					
				}
				builder.append(typeArgument.generate(importManager, 0));
				first = false;
			}
			builder.append(">");
		}
		
		// Lower bound
		GenericType lowerBound = getLowerBound();
		if (lowerBound != null) {
			builder.append(" super ").append(lowerBound.generate(importManager, 0));
		}
		// Upper bound
		GenericType upperBound = getUpperBound();
		if (upperBound != null) {
			builder.append(" extends ").append(upperBound.generate(importManager, 0));
		}
		
		contents.add(Source.create(builder));
		return contents;
	}

} //GenericTypeImpl
