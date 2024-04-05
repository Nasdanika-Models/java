/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.java.NamedElement#getFullyQualifiedName <em>Fully Qualified Name</em>}</li>
 *   <li>{@link org.nasdanika.models.java.NamedElement#getReferrers <em>Referrers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getNamedElement()
 * @model
 * @generated
 */
public interface NamedElement extends Source {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Simple (short) name. E.g. Map
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.java.JavaPackage#getNamedElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.NamedElement#getName <em>Name</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * Fully qualified name where applicable. E.g. java.util.Map
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fully Qualified Name</em>' attribute.
	 * @see #setFullyQualifiedName(String)
	 * @see org.nasdanika.models.java.JavaPackage#getNamedElement_FullyQualifiedName()
	 * @model
	 * @generated
	 */
	String getFullyQualifiedName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.NamedElement#getFullyQualifiedName <em>Fully Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fully Qualified Name</em>' attribute.
	 * @see #getFullyQualifiedName()
	 * @generated
	 */
	void setFullyQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Referrers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.Reference}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.java.Reference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referrers</em>' reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getNamedElement_Referrers()
	 * @see org.nasdanika.models.java.Reference#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Reference> getReferrers();

} // NamedElement
