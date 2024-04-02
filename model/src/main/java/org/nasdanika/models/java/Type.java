/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.models.coverage.ClassCoverage;
import org.nasdanika.models.coverage.Coverage;

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
public interface Type extends Member<ClassCoverage> {

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.Member}<code>&lt;? extends org.nasdanika.models.coverage.Coverage&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getType_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member<? extends Coverage>> getMembers();
} // Type
