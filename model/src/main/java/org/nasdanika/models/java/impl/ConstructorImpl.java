/**
 */
package org.nasdanika.models.java.impl;

import java.util.List;
import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.java.Constructor;
import org.nasdanika.models.java.GenericType;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.Parameter;
import org.nasdanika.models.source.Source;
import org.nasdanika.models.java.TypeParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConstructorImpl extends OperationImpl implements Constructor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.CONSTRUCTOR;
	}

	
	@Override
	protected List<Source> generateContents(Function<String, String> importManager, int indent) {
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
		
		if (!isMerging()) {
			builder.append(System.lineSeparator());				
		}
		
		contents.add(Source.create(builder));

		return contents;
	}	
	
	
} //ConstructorImpl
