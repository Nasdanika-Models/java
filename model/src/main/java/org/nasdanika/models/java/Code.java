/**
 */
package org.nasdanika.models.java;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.Code#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getCode()
 * @model
 * @generated
 */
public interface Code extends Member {

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Source)
	 * @see org.nasdanika.models.java.JavaPackage#getCode_Body()
	 * @model containment="true"
	 * @generated
	 */
	Source getBody();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Code#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Source value);
} // Code
