/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.java.CompilationUnit#getTypes <em>Types</em>}</li>
 *   <li>{@link org.nasdanika.models.java.CompilationUnit#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.nasdanika.models.java.CompilationUnit#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.java.JavaPackage#getCompilationUnit()
 * @model
 * @generated
 */
public interface CompilationUnit extends NamedElement {
	
	String JAVA_EXTENSION = "java";

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.java.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.nasdanika.models.java.JavaPackage#getCompilationUnit_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see org.nasdanika.models.java.JavaPackage#getCompilationUnit_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.java.CompilationUnit#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' attribute list.
	 * @see org.nasdanika.models.java.JavaPackage#getCompilationUnit_Imports()
	 * @model
	 * @generated
	 */
	EList<String> getImports();
	
	static CompilationUnit create(String name, String packageName, String... imports) {
		CompilationUnit cu = JavaFactory.eINSTANCE.createCompilationUnit();
		cu.setName(name);
		cu.setPackageName(packageName);
		for (String i: imports) {
			cu.getImports().add(i);
		}
		return cu;
	}

	default String generate() {
		return generate(null, 0);
	}
	
} // CompilationUnit
