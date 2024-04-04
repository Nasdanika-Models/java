/**
 */
package org.nasdanika.models.java;

import org.nasdanika.models.coverage.Coverage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.Reference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends NamedElement<Coverage> {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.java.NamedElement#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Referenced named element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(NamedElement)
	 * @see org.nasdanika.models.java.JavaPackage#getReference_Target()
	 * @see org.nasdanika.models.java.NamedElement#getReferences
	 * @model opposite="references"
	 * @generated
	 */
	NamedElement<?> getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Reference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NamedElement<?> value);

} // Reference
