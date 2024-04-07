/**
 */
package org.nasdanika.models.java.impl;

import java.util.List;
import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.common.Util;
import org.nasdanika.models.java.GenerationMode;
import org.nasdanika.models.java.GenericType;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.Member;
import org.nasdanika.models.java.Source;
import org.nasdanika.models.java.TypeParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ClassImpl extends TypeImpl implements org.nasdanika.models.java.Class {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.CLASS;
	}
	
	@Override
	protected List<Source> generateContents(Function<String, String> importManager, int indent) {
		// {ClassModifier} class TypeIdentifier [TypeParameters] [ClassExtends] [ClassImplements] [ClassPermits] ClassBody		
		List<Source> contents = super.generateContents(importManager, indent);
		
		StringBuilder headerBuilder = indent(indent);
		for (String modifier: getModifiers()) {
			headerBuilder.append(modifier).append(" ");			
		}
		headerBuilder.append("class ").append(getName());
		
		EList<TypeParameter> typeParameters = getTypeParameters();
		if (!typeParameters.isEmpty()) {
			headerBuilder.append("<");
			boolean first = true;
			for (TypeParameter typeParameter: typeParameters) {
				if (!first) {
					headerBuilder.append(", ");					
				}
				headerBuilder.append(typeParameter.generate(importManager, 0));
				first = false;
			}
			headerBuilder.append(">");
		}
		
		int superTypeCounter = 0;
		for (GenericType superType: getSuperTypes()) {
			if (superTypeCounter == 0) {
				// Extends
				if (!Util.isBlank(superType.getName()) && !Object.class.getName().equals(superType.getName())) {
					headerBuilder.append(" extends ").append(superType.generate(importManager, 0));
				}
			} else if (superTypeCounter == 1) {
				headerBuilder.append(" implements ").append(superType.generate(importManager, 0));				
			} else {
				headerBuilder.append(", ").append(superType.generate(importManager, 0));								
			}
			
			++superTypeCounter;
		}
		
		int permitCounter = 0;
		for (GenericType permit: getPermits()) {
			if (permitCounter == 0) {
				headerBuilder.append(" permits ").append(permit.generate(importManager, 0));
			} else {
				headerBuilder.append(", ").append(permit.generate(importManager, 0));								
			}			
			++permitCounter;			
		}
						
		headerBuilder.append(" {").append(System.lineSeparator());
		if (getGenerationMode() != GenerationMode.MERGE) {
			headerBuilder.append(System.lineSeparator());				
		}
		
		contents.add(Source.create(headerBuilder));

		for (Member member: getMembers()) {
			String memberSource = member.generate(importManager, indent + 1);
			if (getGenerationMode() != GenerationMode.MERGE) {
				memberSource += System.lineSeparator();				
			}
			contents.add(Source.create(memberSource, member));
		}
		
		contents.add(Source.create(indent(indent).append("}").append(System.lineSeparator())));
		return contents;
	}	

} //ClassImpl
