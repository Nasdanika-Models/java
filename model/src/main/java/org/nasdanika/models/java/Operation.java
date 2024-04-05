/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.Operation#getReceiverParameter <em>Receiver Parameter</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Operation#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Operation#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Operation#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getOperation()
 * @model abstract="true"
 * @generated
 */
public interface Operation extends Code, TypedElement {

	/**
	 * Returns the value of the '<em><b>Receiver Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver Parameter</em>' containment reference.
	 * @see #setReceiverParameter(Parameter)
	 * @see org.nasdanika.models.java.JavaPackage#getOperation_ReceiverParameter()
	 * @model containment="true"
	 * @generated
	 */
	Parameter getReceiverParameter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Operation#getReceiverParameter <em>Receiver Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Parameter</em>' containment reference.
	 * @see #getReceiverParameter()
	 * @generated
	 */
	void setReceiverParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getOperation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.GenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getOperation_Exceptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericType> getExceptions();

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.TypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getOperation_TypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeParameter> getTypeParameters();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see org.nasdanika.models.java.JavaPackage#getOperation_Signature()
	 * @model
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Operation#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);
} // Operation
