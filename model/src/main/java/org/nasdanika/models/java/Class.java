/**
 */
package org.nasdanika.models.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.models.java.JavaPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Type {
	
	static Class create(String name, String... modifiers) {
		Class ret = JavaFactory.eINSTANCE.createClass();
		ret.setName(name);
		for (String modifier: modifiers) {
			ret.getModifiers().add(modifier);
		}
		return ret;
	}
	
} // Class
