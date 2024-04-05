/**
 */
package org.nasdanika.models.java;

import java.lang.Comparable;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.Position#getLine <em>Line</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Position#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getPosition()
 * @model superTypes="org.nasdanika.models.java.Comparable&lt;org.nasdanika.models.java.Position&gt;"
 * @generated
 */
public interface Position extends EObject, Comparable<Position> {
	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(int)
	 * @see org.nasdanika.models.java.JavaPackage#getPosition_Line()
	 * @model
	 * @generated
	 */
	int getLine();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Position#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(int value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(int)
	 * @see org.nasdanika.models.java.JavaPackage#getPosition_Column()
	 * @model
	 * @generated
	 */
	int getColumn();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Position#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(int value);
	
	@Override
	default int compareTo(Position o) {
		if (o == null) {
			return -1;
		}
		int lineDiff = getLine() - o.getLine();
		if (lineDiff != 0) {
			return lineDiff;
		}
		return getColumn() - o.getColumn();
	}
	
} // Position
