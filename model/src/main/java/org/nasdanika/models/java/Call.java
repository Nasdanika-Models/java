/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.Call#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Call#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Call#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends EObject {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see org.nasdanika.models.java.JavaPackage#getCall_Signature()
	 * @model
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Call#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.java.Operation#getIncomingCalls <em>Incoming Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see org.nasdanika.models.java.JavaPackage#getCall_Operation()
	 * @see org.nasdanika.models.java.Operation#getIncomingCalls
	 * @model opposite="incomingCalls"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Call#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' attribute.
	 * @see #setCounter(int)
	 * @see org.nasdanika.models.java.JavaPackage#getCall_Counter()
	 * @model
	 * @generated
	 */
	int getCounter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Call#getCounter <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' attribute.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(int value);

} // Call
