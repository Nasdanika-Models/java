/**
 */
package org.nasdanika.models.java.impl;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Util;
import org.nasdanika.models.coverage.Coverage;
import org.nasdanika.models.java.Annotation;
import org.nasdanika.models.java.Comment;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.Reference;
import org.nasdanika.models.java.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.impl.SourceImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.SourceImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.SourceImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.nasdanika.models.java.impl.SourceImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceImpl extends org.nasdanika.models.source.impl.SourceImpl implements Source {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.Literals.SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Coverage> getCoverage() {
		return (EList<Coverage>)eDynamicGet(JavaPackage.SOURCE__COVERAGE, JavaPackage.Literals.SOURCE__COVERAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Reference> getReferences() {
		return (EList<Reference>)eDynamicGet(JavaPackage.SOURCE__REFERENCES, JavaPackage.Literals.SOURCE__REFERENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Annotation> getAnnotations() {
		return (EList<Annotation>)eDynamicGet(JavaPackage.SOURCE__ANNOTATIONS, JavaPackage.Literals.SOURCE__ANNOTATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment getComment() {
		return (Comment)eDynamicGet(JavaPackage.SOURCE__COMMENT, JavaPackage.Literals.SOURCE__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(Comment newComment, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newComment, JavaPackage.SOURCE__COMMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(Comment newComment) {
		eDynamicSet(JavaPackage.SOURCE__COMMENT, JavaPackage.Literals.SOURCE__COMMENT, newComment);
	}
	
	/**
	 * Generates a list of sources from contents.
	 * When merging, source ranges are used to replace fragments in the original source.
	 * @param tokenSource
	 * @return
	 */
	@Override
	protected List<org.nasdanika.models.source.Source> generateContents(Function<String, String> tokenSource, int indent) {
		List<org.nasdanika.models.source.Source> contents = super.generateContents(tokenSource, indent);
		Comment comment = getComment();
		if (comment != null) {
			String text = comment.getComment();
			if (!Util.isBlank(text)) {
				StringBuilder builder = indent(indent).append(text);
				if (!isMerging()) {
					builder.append(System.lineSeparator());				
				}
				contents.add(org.nasdanika.models.source.Source.create(builder, comment));
			}
		}
		for (Annotation annotation: getAnnotations()) {
			contents.add(org.nasdanika.models.source.Source.create(annotationPrefix(indent) + annotation.generate(tokenSource, indent) + annotationSuffix(indent), annotation));
		}
		
		return contents;
	}	
	
	protected String annotationSuffix(int indent) {
		return " ";
	}

	protected String annotationPrefix(int indent) {
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.SOURCE__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case JavaPackage.SOURCE__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case JavaPackage.SOURCE__COMMENT:
				return basicSetComment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.SOURCE__COVERAGE:
				return getCoverage();
			case JavaPackage.SOURCE__REFERENCES:
				return getReferences();
			case JavaPackage.SOURCE__ANNOTATIONS:
				return getAnnotations();
			case JavaPackage.SOURCE__COMMENT:
				return getComment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaPackage.SOURCE__COVERAGE:
				getCoverage().clear();
				getCoverage().addAll((Collection<? extends Coverage>)newValue);
				return;
			case JavaPackage.SOURCE__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case JavaPackage.SOURCE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case JavaPackage.SOURCE__COMMENT:
				setComment((Comment)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JavaPackage.SOURCE__COVERAGE:
				getCoverage().clear();
				return;
			case JavaPackage.SOURCE__REFERENCES:
				getReferences().clear();
				return;
			case JavaPackage.SOURCE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case JavaPackage.SOURCE__COMMENT:
				setComment((Comment)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JavaPackage.SOURCE__COVERAGE:
				return !getCoverage().isEmpty();
			case JavaPackage.SOURCE__REFERENCES:
				return !getReferences().isEmpty();
			case JavaPackage.SOURCE__ANNOTATIONS:
				return !getAnnotations().isEmpty();
			case JavaPackage.SOURCE__COMMENT:
				return getComment() != null;
		}
		return super.eIsSet(featureID);
	}

} //SourceImpl
