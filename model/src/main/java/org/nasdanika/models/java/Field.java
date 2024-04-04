/**
 */
package org.nasdanika.models.java;

import org.nasdanika.models.coverage.Coverage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.Field#getAccesses <em>Accesses</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Field#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getField()
 * @model
 * @generated
 */
public interface Field extends Member<Coverage>, TypedElement<Coverage> {

	/**
	 * Returns the value of the '<em><b>Accesses</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.java.FieldAccess#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesses</em>' reference.
	 * @see #setAccesses(FieldAccess)
	 * @see org.nasdanika.models.java.JavaPackage#getField_Accesses()
	 * @see org.nasdanika.models.java.FieldAccess#getField
	 * @model opposite="field"
	 * @generated
	 */
	FieldAccess getAccesses();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Field#getAccesses <em>Accesses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accesses</em>' reference.
	 * @see #getAccesses()
	 * @generated
	 */
	void setAccesses(FieldAccess value);

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
