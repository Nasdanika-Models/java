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
import org.nasdanika.models.java.GenerationMode;
import org.nasdanika.models.java.GenericType;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.Method;
import org.nasdanika.models.java.Parameter;
import org.nasdanika.models.java.Source;
import org.nasdanika.models.java.TypeParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.MethodImpl#getOverrides <em>Overrides</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.MethodImpl#getOverriddenBy <em>Overridden By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends OperationImpl implements Method {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method getOverrides() {
		return (Method)eDynamicGet(JavaPackage.METHOD__OVERRIDES, JavaPackage.Literals.METHOD__OVERRIDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetOverrides() {
		return (Method)eDynamicGet(JavaPackage.METHOD__OVERRIDES, JavaPackage.Literals.METHOD__OVERRIDES, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverrides(Method newOverrides, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOverrides, JavaPackage.METHOD__OVERRIDES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrides(Method newOverrides) {
		eDynamicSet(JavaPackage.METHOD__OVERRIDES, JavaPackage.Literals.METHOD__OVERRIDES, newOverrides);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Method> getOverriddenBy() {
		return (EList<Method>)eDynamicGet(JavaPackage.METHOD__OVERRIDDEN_BY, JavaPackage.Literals.METHOD__OVERRIDDEN_BY, true, true);
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
			case JavaPackage.METHOD__OVERRIDES:
				Method overrides = basicGetOverrides();
				if (overrides != null)
					msgs = ((InternalEObject)overrides).eInverseRemove(this, JavaPackage.METHOD__OVERRIDDEN_BY, Method.class, msgs);
				return basicSetOverrides((Method)otherEnd, msgs);
			case JavaPackage.METHOD__OVERRIDDEN_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOverriddenBy()).basicAdd(otherEnd, msgs);
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
			case JavaPackage.METHOD__OVERRIDES:
				return basicSetOverrides(null, msgs);
			case JavaPackage.METHOD__OVERRIDDEN_BY:
				return ((InternalEList<?>)getOverriddenBy()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.METHOD__OVERRIDES:
				if (resolve) return getOverrides();
				return basicGetOverrides();
			case JavaPackage.METHOD__OVERRIDDEN_BY:
				return getOverriddenBy();
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
			case JavaPackage.METHOD__OVERRIDES:
				setOverrides((Method)newValue);
				return;
			case JavaPackage.METHOD__OVERRIDDEN_BY:
				getOverriddenBy().clear();
				getOverriddenBy().addAll((Collection<? extends Method>)newValue);
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
			case JavaPackage.METHOD__OVERRIDES:
				setOverrides((Method)null);
				return;
			case JavaPackage.METHOD__OVERRIDDEN_BY:
				getOverriddenBy().clear();
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
			case JavaPackage.METHOD__OVERRIDES:
				return basicGetOverrides() != null;
			case JavaPackage.METHOD__OVERRIDDEN_BY:
				return !getOverriddenBy().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	protected List<Source> generateContents(Function<String, String> importManager, int indent) {
//		MethodDeclaration:
//			{MethodModifier} MethodHeader MethodBody
//		MethodHeader:
//			Result MethodDeclarator [Throws]
//			TypeParameters {Annotation} Result MethodDeclarator [Throws]
//		MethodDeclarator:
//			Identifier ( [ReceiverParameter ,] [FormalParameterList] ) [Dims]
//		ReceiverParameter:
//			{Annotation} UnannType [Identifier .] this
		
		List<Source> contents = super.generateContents(importManager, indent);
		
		StringBuilder builder = indent(indent);
		for (String modifier: getModifiers()) {
			builder.append(modifier).append(" ");			
		}
		
		EList<TypeParameter> typeParameters = getTypeParameters();
		if (!typeParameters.isEmpty()) {
			builder.append("<");
			boolean first = true;
			for (TypeParameter typeParameter: typeParameters) {
				if (!first) {
					builder.append(", ");					
				}
				builder.append(typeParameter.generate(importManager, 0));
				first = false;
			}
			builder.append(">");
		}
		
		GenericType type = getType();
		builder.append(type == null ? "void" : type.generate(importManager, 0)).append(" ");		
		builder.append(getName());
		builder.append("(");
		int parameterCounter = 0;
		Parameter receiverParameter = getReceiverParameter();
		if (receiverParameter != null) {
			++parameterCounter;
			builder.append(receiverParameter.generate(importManager, 0));
		}
		for (Parameter parameter: getParameters()) {
			if (parameterCounter > 0) {
				builder.append(", ");
			}
			builder.append(parameter.generate(importManager, 0));
			++parameterCounter;
		}
		builder.append(")");
		
		int exceptionCounter = 0;
		for (GenericType exc: getExceptions()) {
			if (exceptionCounter == 0) {
				builder.append(" throws ").append(exc.generate(importManager, 0));
			} else {
				builder.append(", ").append(exc.generate(importManager, 0));								
			}			
			++exceptionCounter;
		}
		
		Source body = getBody();
		if (body == null) {
			builder.append(";");
		} else {
			builder.append(" ").append(body.generate(importManager, indent + 1));
		}
		
		if (getGenerationMode() != GenerationMode.MERGE) {
			builder.append(System.lineSeparator());				
		}
		
		contents.add(Source.create(builder));

		return contents;
	}	
	
} //MethodImpl
