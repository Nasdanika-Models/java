/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.models.coverage.Coverage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.Source#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Source#getReferences <em>References</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Source#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Source#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends org.nasdanika.models.source.Source {
	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.coverage.Coverage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getSource_Coverage()
	 * @model
	 * @generated
	 */
	EList<Coverage> getCoverage();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getSource_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getSource_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(Comment)
	 * @see org.nasdanika.models.java.JavaPackage#getSource_Comment()
	 * @model containment="true"
	 * @generated
	 */
	Comment getComment();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Source#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(Comment value);

} // Source
