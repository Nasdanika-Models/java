/**
 */
package org.nasdanika.models.java.impl;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.java.GenericType;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.Source;
import org.nasdanika.models.java.TypeParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.TypeParameterImpl#getBounds <em>Bounds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeParameterImpl extends NamedElementImpl implements TypeParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.TYPE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<GenericType> getBounds() {
		return (EList<GenericType>)eDynamicGet(JavaPackage.TYPE_PARAMETER__BOUNDS, JavaPackage.Literals.TYPE_PARAMETER__BOUNDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.TYPE_PARAMETER__BOUNDS:
				return getBounds();
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
			case JavaPackage.TYPE_PARAMETER__BOUNDS:
				getBounds().clear();
				getBounds().addAll((Collection<? extends GenericType>)newValue);
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
			case JavaPackage.TYPE_PARAMETER__BOUNDS:
				getBounds().clear();
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
			case JavaPackage.TYPE_PARAMETER__BOUNDS:
				return !getBounds().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	protected List<Source> generateContents(Function<String, String> importManager, int indent) {
		List<Source> contents = super.generateContents(importManager, indent);
		StringBuilder builder = new StringBuilder(getName());
		boolean firstBound = true;
		for (GenericType bound: getBounds()) {
			if (firstBound) {
				builder.append(" extends ");
				firstBound = false;
			} else {
				builder.append(" & ");
			}
			builder.append(bound.generate(importManager, 0));
		}
		contents.add(Source.create(builder));
		return contents;
	}

} //TypeParameterImpl
