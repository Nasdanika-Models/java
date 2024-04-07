/**
 */
package org.nasdanika.models.java.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.java.BlockComment;
import org.nasdanika.models.java.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BlockCommentImpl extends CommentImpl implements BlockComment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockCommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.BLOCK_COMMENT;
	}

} //BlockCommentImpl
