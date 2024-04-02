/**
 */
package org.nasdanika.models.java;

import org.nasdanika.models.coverage.Coverage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.Member#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Member#getFullyQualifiedName <em>Fully Qualified Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getMember()
 * @model abstract="true"
 * @generated
 */
public interface Member<C extends Coverage> extends NamedElement<C> {

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(Comment)
	 * @see org.nasdanika.models.java.JavaPackage#getMember_Comment()
	 * @model containment="true"
	 * @generated
	 */
	Comment getComment();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Member#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(Comment value);

	/**
	 * Returns the value of the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fully Qualified Name</em>' attribute.
	 * @see org.nasdanika.models.java.JavaPackage#getMember_FullyQualifiedName()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	String getFullyQualifiedName();
} // Member
