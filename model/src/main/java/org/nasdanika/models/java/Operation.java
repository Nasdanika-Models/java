/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.models.coverage.MethodCoverage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Operation#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getOperation()
 * @model abstract="true"
 * @generated
 */
public interface Operation extends Code, TypedElement<MethodCoverage> {

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
} // Operation
