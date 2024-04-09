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
import org.nasdanika.models.java.Parameter;
import org.nasdanika.models.source.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.ParameterImpl#isVarArg <em>Var Arg</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.ParameterImpl#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends TypedElementImpl implements Parameter {
	/**
	 * The default value of the '{@link #isVarArg() <em>Var Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVarArg()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VAR_ARG_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVarArg() {
		return (Boolean)eDynamicGet(JavaPackage.PARAMETER__VAR_ARG, JavaPackage.Literals.PARAMETER__VAR_ARG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarArg(boolean newVarArg) {
		eDynamicSet(JavaPackage.PARAMETER__VAR_ARG, JavaPackage.Literals.PARAMETER__VAR_ARG, newVarArg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getModifiers() {
		return (EList<String>)eDynamicGet(JavaPackage.PARAMETER__MODIFIERS, JavaPackage.Literals.PARAMETER__MODIFIERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.PARAMETER__VAR_ARG:
				return isVarArg();
			case JavaPackage.PARAMETER__MODIFIERS:
				return getModifiers();
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
			case JavaPackage.PARAMETER__VAR_ARG:
				setVarArg((Boolean)newValue);
				return;
			case JavaPackage.PARAMETER__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends String>)newValue);
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
			case JavaPackage.PARAMETER__VAR_ARG:
				setVarArg(VAR_ARG_EDEFAULT);
				return;
			case JavaPackage.PARAMETER__MODIFIERS:
				getModifiers().clear();
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
			case JavaPackage.PARAMETER__VAR_ARG:
				return isVarArg() != VAR_ARG_EDEFAULT;
			case JavaPackage.PARAMETER__MODIFIERS:
				return !getModifiers().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	protected List<Source> generateContents(Function<String, String> importManager, int indent) {
		List<Source> contents = super.generateContents(importManager, indent);
		
		StringBuilder builder = indent(indent);
		for (String modifier: getModifiers()) {
			builder.append(modifier).append(" ");			
		}
		
		GenericType type = getType();
		builder.append(type.generate(importManager, 0));
		if (isVarArg()) {
			builder.append("...");
		}
		builder.append(" ");		
		builder.append(getName());
		
		
		contents.add(Source.create(builder));

		return contents;
	}	

} //ParameterImpl
