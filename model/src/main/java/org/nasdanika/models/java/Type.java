/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.Type#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends Member {

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.Member}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getType_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();
} // Type
