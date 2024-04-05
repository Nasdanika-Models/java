/**
 */
package org.nasdanika.models.java;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.Field#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getField()
 * @model
 * @generated
 */
public interface Field extends Member, TypedElement {

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' containment reference.
	 * @see #setInitializer(Code)
	 * @see org.nasdanika.models.java.JavaPackage#getField_Initializer()
	 * @model containment="true"
	 * @generated
	 */
	Code getInitializer();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Field#getInitializer <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' containment reference.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(Code value);
} // Field
