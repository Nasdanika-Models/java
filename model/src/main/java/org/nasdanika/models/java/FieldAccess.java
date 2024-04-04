/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.FieldAccess#getField <em>Field</em>}</li>
 *   <li>{@link org.nasdanika.models.java.FieldAccess#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.java.FieldAccess#getReads <em>Reads</em>}</li>
 *   <li>{@link org.nasdanika.models.java.FieldAccess#getWrites <em>Writes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getFieldAccess()
 * @model
 * @generated
 */
public interface FieldAccess extends EObject {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.java.Field#getAccesses <em>Accesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fully qualified field name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see org.nasdanika.models.java.JavaPackage#getFieldAccess_Field()
	 * @see org.nasdanika.models.java.Field#getAccesses
	 * @model opposite="accesses"
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.FieldAccess#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.java.JavaPackage#getFieldAccess_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.FieldAccess#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reads</em>' attribute.
	 * @see #setReads(int)
	 * @see org.nasdanika.models.java.JavaPackage#getFieldAccess_Reads()
	 * @model
	 * @generated
	 */
	int getReads();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.FieldAccess#getReads <em>Reads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reads</em>' attribute.
	 * @see #getReads()
	 * @generated
	 */
	void setReads(int value);

	/**
	 * Returns the value of the '<em><b>Writes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writes</em>' attribute.
	 * @see #setWrites(int)
	 * @see org.nasdanika.models.java.JavaPackage#getFieldAccess_Writes()
	 * @model
	 * @generated
	 */
	int getWrites();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.FieldAccess#getWrites <em>Writes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writes</em>' attribute.
	 * @see #getWrites()
	 * @generated
	 */
	void setWrites(int value);

} // FieldAccess
