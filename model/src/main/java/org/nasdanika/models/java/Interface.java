/**
 */
package org.nasdanika.models.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.models.java.JavaPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Type {
		
	static Interface create(String name, String... modifiers) {
		Interface ret = JavaFactory.eINSTANCE.createInterface();
		ret.setName(name);
		for (String modifier: modifiers) {
			ret.getModifiers().add(modifier);
		}
		return ret;
	}
	
} // Interface
