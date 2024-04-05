/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.Range#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Range#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getRange()
 * @model
 * @generated
 */
public interface Range extends EObject {
	/**
	 * Returns the value of the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' containment reference.
	 * @see #setBegin(Position)
	 * @see org.nasdanika.models.java.JavaPackage#getRange_Begin()
	 * @model containment="true"
	 * @generated
	 */
	Position getBegin();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Range#getBegin <em>Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' containment reference.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(Position value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Position)
	 * @see org.nasdanika.models.java.JavaPackage#getRange_End()
	 * @model containment="true"
	 * @generated
	 */
	Position getEnd();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Range#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Position value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	default boolean contains(Range range) {
		if (range == null) {
			return false;
		}
		return contains(range.getBegin()) && contains(range.getEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	default boolean contains(Position position) {
		if (position == null) {
			return false;
		}
		Position begin = getBegin();
		if (begin != null && position.compareTo(begin) < 0) {
			return false;
		}
		Position end = getEnd();
		return end == null || position.compareTo(end) > 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	default boolean overlaps(Range range) {
		return range != null && (contains(range.getBegin()) || contains(range.getEnd()));
	};

} // Range
