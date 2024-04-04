/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.models.coverage.MethodCoverage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.Code#getFieldAccesses <em>Field Accesses</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Code#getOutgoingCalls <em>Outgoing Calls</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Code#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getCode()
 * @model
 * @generated
 */
public interface Code extends Member<MethodCoverage> {

	/**
	 * Returns the value of the '<em><b>Field Accesses</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.FieldAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Accesses</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getCode_FieldAccesses()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldAccess> getFieldAccesses();

	/**
	 * Returns the value of the '<em><b>Outgoing Calls</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.Call}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Calls</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getCode_OutgoingCalls()
	 * @model containment="true"
	 * @generated
	 */
	EList<Call> getOutgoingCalls();

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
	Source<?> getBody();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Code#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Source<?> value);
} // Code
