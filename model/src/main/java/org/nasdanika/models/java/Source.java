/**
 */
package org.nasdanika.models.java;

import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.Marked;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.Source#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Source#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends Marked {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.nasdanika.models.java.JavaPackage#getSource_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Source#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.Source}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getSource_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Source> getChildren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calls update on children and then updates source code using children source code. Returns updated source code. 
	 * <!-- end-model-doc -->
	 * @model importManagerType="org.nasdanika.models.java.ImportManager"
	 * @generated
	 */
	String update(Function<String, String> importManager);

} // Source
