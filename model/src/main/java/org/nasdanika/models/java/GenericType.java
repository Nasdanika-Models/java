/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.GenericType#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.java.GenericType#getFullyQualifiedName <em>Fully Qualified Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getGenericType()
 * @model
 * @generated
 */
public interface GenericType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.java.JavaPackage#getGenericType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.GenericType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fully Qualified Name</em>' attribute.
	 * @see org.nasdanika.models.java.JavaPackage#getGenericType_FullyQualifiedName()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	String getFullyQualifiedName();

} // GenericType
