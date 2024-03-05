/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.CompilationUnit#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getCompilationUnit()
 * @model
 * @generated
 */
public interface CompilationUnit extends Source {

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getCompilationUnit_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Merges new source code with the current code preserving manual changes in the current code
	 * @param source Source code to merge with the current code
	 * @param complianceLevel Language compliance level, e.g. "17"
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void merge(String source, String complianceLevel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Collects  new source code from children and merges with the current code preserving manual changes in the current code
	 * @param complianceLevel Language compliance level, e.g. "17"
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void merge(String complianceLevel);
} // CompilationUnit
