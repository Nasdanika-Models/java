/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link org.nasdanika.models.java.Member#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Member#getReferencedTypes <em>Referenced Types</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Member#getAnnotations <em>Annotations</em>}</li>
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
	 * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' attribute list.
	 * @see org.nasdanika.models.java.JavaPackage#getMember_Modifiers()
	 * @model
	 * @generated
	 */
	EList<String> getModifiers();

	/**
	 * Returns the value of the '<em><b>Referenced Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.GenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All types referenced by this member including types refernced from code
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Types</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getMember_ReferencedTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericType> getReferencedTypes();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' reference.
	 * @see #setAnnotations(Annotation)
	 * @see org.nasdanika.models.java.JavaPackage#getMember_Annotations()
	 * @model
	 * @generated
	 */
	Annotation getAnnotations();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Member#getAnnotations <em>Annotations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(Annotation value);
} // Member
