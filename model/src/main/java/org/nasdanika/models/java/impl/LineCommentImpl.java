/**
 */
package org.nasdanika.models.java.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.LineComment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LineCommentImpl extends CommentImpl implements LineComment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineCommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.LINE_COMMENT;
	}

} //LineCommentImpl
