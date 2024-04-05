/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.TypeParameter#getBounds <em>Bounds</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getTypeParameter()
 * @model
 * @generated
 */
public interface TypeParameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.GenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getTypeParameter_Bounds()
	 * @model
	 * @generated
	 */
	EList<GenericType> getBounds();

} // TypeParameter
