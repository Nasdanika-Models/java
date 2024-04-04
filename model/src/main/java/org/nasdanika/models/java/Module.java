/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.models.coverage.ModuleCoverage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.Module#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends Source<ModuleCoverage> {

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getModule_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.nasdanika.models.java.Package> getPackages();
} // Module
