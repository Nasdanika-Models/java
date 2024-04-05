/**
 */
package org.nasdanika.models.java;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.TypedElement#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getTypedElement()
 * @model
 * @generated
 */
public interface TypedElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(GenericType)
	 * @see org.nasdanika.models.java.JavaPackage#getTypedElement_Type()
	 * @model containment="true"
	 * @generated
	 */
	GenericType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.TypedElement#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(GenericType value);

} // TypedElement
