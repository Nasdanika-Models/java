/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.models.coverage.Coverage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.Parameter#isVarArg <em>Var Arg</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Parameter#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends TypedElement<Coverage> {

	/**
	 * Returns the value of the '<em><b>Var Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Arg</em>' attribute.
	 * @see #setVarArg(boolean)
	 * @see org.nasdanika.models.java.JavaPackage#getParameter_VarArg()
	 * @model
	 * @generated
	 */
	boolean isVarArg();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Parameter#isVarArg <em>Var Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Arg</em>' attribute.
	 * @see #isVarArg()
	 * @generated
	 */
	void setVarArg(boolean value);

	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' attribute list.
	 * @see org.nasdanika.models.java.JavaPackage#getParameter_Modifiers()
	 * @model
	 * @generated
	 */
	EList<String> getModifiers();
} // Parameter
