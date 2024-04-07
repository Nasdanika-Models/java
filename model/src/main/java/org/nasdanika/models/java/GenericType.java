/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.GenericType#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link org.nasdanika.models.java.GenericType#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.nasdanika.models.java.GenericType#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.nasdanika.models.java.GenericType#isPrimitive <em>Primitive</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getGenericType()
 * @model
 * @generated
 */
public interface GenericType extends Reference {
	/**
	 * Returns the value of the '<em><b>Type Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.GenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Arguments</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getGenericType_TypeArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericType> getTypeArguments();

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' containment reference.
	 * @see #setLowerBound(GenericType)
	 * @see org.nasdanika.models.java.JavaPackage#getGenericType_LowerBound()
	 * @model containment="true"
	 * @generated
	 */
	GenericType getLowerBound();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.GenericType#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(GenericType value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(GenericType)
	 * @see org.nasdanika.models.java.JavaPackage#getGenericType_UpperBound()
	 * @model containment="true"
	 * @generated
	 */
	GenericType getUpperBound();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.GenericType#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(GenericType value);

	/**
	 * Returns the value of the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive</em>' attribute.
	 * @see #setPrimitive(boolean)
	 * @see org.nasdanika.models.java.JavaPackage#getGenericType_Primitive()
	 * @model
	 * @generated
	 */
	boolean isPrimitive();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.GenericType#isPrimitive <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive</em>' attribute.
	 * @see #isPrimitive()
	 * @generated
	 */
	void setPrimitive(boolean value);
		
	static GenericType create(String name, GenericType... typeArguments) {
		GenericType ret = JavaFactory.eINSTANCE.createGenericType();
		ret.setName(name);
		for (GenericType typeArgument: typeArguments) {
			ret.getTypeArguments().add(typeArgument);
		}
		return ret;
	}
	
	static GenericType createObjectType() {
		return create(Object.class.getName());
	}
		
	static GenericType createUpperBound(GenericType upperBound) {
		GenericType ret = JavaFactory.eINSTANCE.createGenericType();
		ret.setUpperBound(upperBound);
		return ret;
	}
	
	static GenericType createLowerBound(GenericType upperBound) {
		GenericType ret = JavaFactory.eINSTANCE.createGenericType();
		ret.setLowerBound(upperBound);
		return ret;
	}
	
} // GenericType
