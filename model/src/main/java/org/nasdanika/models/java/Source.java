/**
 */
package org.nasdanika.models.java;

import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.models.coverage.Coverage;

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
 *   <li>{@link org.nasdanika.models.java.Source#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Source#getReferences <em>References</em>}</li>
 *   <li>{@link org.nasdanika.models.java.Source#getGenerationMode <em>Generation Mode</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends Range {
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
	 * Returns the value of the '<em><b>Coverage</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.coverage.Coverage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getSource_Coverage()
	 * @model
	 * @generated
	 */
	EList<Coverage> getCoverage();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getSource_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Generation Mode</b></em>' attribute.
	 * The default value is <code>"CONTENTS_IF_NO_SOURCE"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.java.GenerationMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Mode</em>' attribute.
	 * @see org.nasdanika.models.java.GenerationMode
	 * @see #setGenerationMode(GenerationMode)
	 * @see org.nasdanika.models.java.JavaPackage#getSource_GenerationMode()
	 * @model default="CONTENTS_IF_NO_SOURCE"
	 * @generated
	 */
	GenerationMode getGenerationMode();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.Source#getGenerationMode <em>Generation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Mode</em>' attribute.
	 * @see org.nasdanika.models.java.GenerationMode
	 * @see #getGenerationMode()
	 * @generated
	 */
	void setGenerationMode(GenerationMode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generates source code
	 * <!-- end-model-doc -->
	 * @model importManagerType="org.nasdanika.models.java.ImportManager"
	 * @generated
	 */
	String generate(Function<String, String> importManager, int indent);
	
	static Source create(CharSequence source) {
		Source ret = JavaFactory.eINSTANCE.createSource();
		ret.setSource(source.toString());
		return ret;
	}
	
	static Source create(CharSequence source, Range range) {		
		Source ret = create(source);
		if (range != null) {
			ret.setBegin(EcoreUtil.copy(range.getBegin()));
			ret.setEnd(EcoreUtil.copy(range.getEnd()));
		}
		return ret;
	}

} // Source
