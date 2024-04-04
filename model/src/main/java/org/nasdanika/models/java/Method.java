/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.Method#getOverrides <em>Overrides</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Method#getOverriddenBy <em>Overridden By</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends Operation {

	/**
	 * Returns the value of the '<em><b>Overrides</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.java.Method#getOverriddenBy <em>Overridden By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overrides</em>' reference.
	 * @see #setOverrides(Method)
	 * @see org.nasdanika.models.java.JavaPackage#getMethod_Overrides()
	 * @see org.nasdanika.models.java.Method#getOverriddenBy
	 * @model opposite="overriddenBy"
	 * @generated
	 */
	Method getOverrides();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Method#getOverrides <em>Overrides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overrides</em>' reference.
	 * @see #getOverrides()
	 * @generated
	 */
	void setOverrides(Method value);

	/**
	 * Returns the value of the '<em><b>Overridden By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.Method}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.java.Method#getOverrides <em>Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overridden By</em>' reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getMethod_OverriddenBy()
	 * @see org.nasdanika.models.java.Method#getOverrides
	 * @model opposite="overrides"
	 * @generated
	 */
	EList<Method> getOverriddenBy();
} // Method
