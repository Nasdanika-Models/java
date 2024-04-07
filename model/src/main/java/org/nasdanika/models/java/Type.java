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
 *   <li>{@link org.nasdanika.models.java.Type#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Type#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Type#getPermits <em>Permits</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.GenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For classes the first element is the superclass and the rest are implemented interfaces
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Types</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getType_SuperTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericType> getSuperTypes();

	/**
	 * Returns the value of the '<em><b>Permits</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.GenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For classes the first element is the superclass and the rest are implemented interfaces
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permits</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getType_Permits()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericType> getPermits();

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.TypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getType_TypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeParameter> getTypeParameters();
} // Type
