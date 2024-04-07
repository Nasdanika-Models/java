/**
 */
package org.nasdanika.models.java.util;

import java.util.function.Function;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.nasdanika.models.java.Annotation;
import org.nasdanika.models.java.AnnotationInterface;
import org.nasdanika.models.java.AnnotationInterfaceMember;
import org.nasdanika.models.java.BlockComment;
import org.nasdanika.models.java.ClassInitializer;
import org.nasdanika.models.java.Code;
import org.nasdanika.models.java.Comment;
import org.nasdanika.models.java.CompilationUnit;
import org.nasdanika.models.java.Constructor;
import org.nasdanika.models.java.EnumConstant;
import org.nasdanika.models.java.Field;
import org.nasdanika.models.java.GenericType;
import org.nasdanika.models.java.Initializer;
import org.nasdanika.models.java.Interface;
import org.nasdanika.models.java.JavaPackage;
import org.nasdanika.models.java.JavadocComment;
import org.nasdanika.models.java.LineComment;
import org.nasdanika.models.java.Member;
import org.nasdanika.models.java.Method;
import org.nasdanika.models.java.NamedElement;
import org.nasdanika.models.java.Operation;
import org.nasdanika.models.java.Parameter;
import org.nasdanika.models.java.Position;
import org.nasdanika.models.java.Range;
import org.nasdanika.models.java.Reference;
import org.nasdanika.models.java.Source;
import org.nasdanika.models.java.Type;
import org.nasdanika.models.java.TypeParameter;
import org.nasdanika.models.java.TypedElement;
import org.nasdanika.persistence.Marked;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.java.JavaPackage
 * @generated
 */
public class JavaSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaSwitch() {
		if (modelPackage == null) {
			modelPackage = JavaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JavaPackage.IMPORT_MANAGER: {
				@SuppressWarnings("unchecked") Function<String, String> importManager = (Function<String, String>)theEObject;
				T1 result = caseImportManager(importManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.COMPARABLE: {
				Comparable<?> comparable = (Comparable<?>)theEObject;
				T1 result = caseComparable(comparable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.POSITION: {
				Position position = (Position)theEObject;
				T1 result = casePosition(position);
				if (result == null) result = caseComparable(position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.RANGE: {
				Range range = (Range)theEObject;
				T1 result = caseRange(range);
				if (result == null) result = caseMarked(range);
				if (result == null) result = caseIMarked(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.SOURCE: {
				Source source = (Source)theEObject;
				T1 result = caseSource(source);
				if (result == null) result = caseRange(source);
				if (result == null) result = caseMarked(source);
				if (result == null) result = caseIMarked(source);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T1 result = caseNamedElement(namedElement);
				if (result == null) result = caseSource(namedElement);
				if (result == null) result = caseRange(namedElement);
				if (result == null) result = caseMarked(namedElement);
				if (result == null) result = caseIMarked(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.COMPILATION_UNIT: {
				CompilationUnit compilationUnit = (CompilationUnit)theEObject;
				T1 result = caseCompilationUnit(compilationUnit);
				if (result == null) result = caseNamedElement(compilationUnit);
				if (result == null) result = caseSource(compilationUnit);
				if (result == null) result = caseRange(compilationUnit);
				if (result == null) result = caseMarked(compilationUnit);
				if (result == null) result = caseIMarked(compilationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T1 result = caseComment(comment);
				if (result == null) result = caseRange(comment);
				if (result == null) result = caseMarked(comment);
				if (result == null) result = caseIMarked(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.LINE_COMMENT: {
				LineComment lineComment = (LineComment)theEObject;
				T1 result = caseLineComment(lineComment);
				if (result == null) result = caseComment(lineComment);
				if (result == null) result = caseRange(lineComment);
				if (result == null) result = caseMarked(lineComment);
				if (result == null) result = caseIMarked(lineComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.JAVADOC_COMMENT: {
				JavadocComment javadocComment = (JavadocComment)theEObject;
				T1 result = caseJavadocComment(javadocComment);
				if (result == null) result = caseComment(javadocComment);
				if (result == null) result = caseRange(javadocComment);
				if (result == null) result = caseMarked(javadocComment);
				if (result == null) result = caseIMarked(javadocComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.BLOCK_COMMENT: {
				BlockComment blockComment = (BlockComment)theEObject;
				T1 result = caseBlockComment(blockComment);
				if (result == null) result = caseComment(blockComment);
				if (result == null) result = caseRange(blockComment);
				if (result == null) result = caseMarked(blockComment);
				if (result == null) result = caseIMarked(blockComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.MEMBER: {
				Member member = (Member)theEObject;
				T1 result = caseMember(member);
				if (result == null) result = caseNamedElement(member);
				if (result == null) result = caseSource(member);
				if (result == null) result = caseRange(member);
				if (result == null) result = caseMarked(member);
				if (result == null) result = caseIMarked(member);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T1 result = caseReference(reference);
				if (result == null) result = caseNamedElement(reference);
				if (result == null) result = caseSource(reference);
				if (result == null) result = caseRange(reference);
				if (result == null) result = caseMarked(reference);
				if (result == null) result = caseIMarked(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.GENERIC_TYPE: {
				GenericType genericType = (GenericType)theEObject;
				T1 result = caseGenericType(genericType);
				if (result == null) result = caseReference(genericType);
				if (result == null) result = caseNamedElement(genericType);
				if (result == null) result = caseSource(genericType);
				if (result == null) result = caseRange(genericType);
				if (result == null) result = caseMarked(genericType);
				if (result == null) result = caseIMarked(genericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T1 result = caseAnnotation(annotation);
				if (result == null) result = caseReference(annotation);
				if (result == null) result = caseNamedElement(annotation);
				if (result == null) result = caseSource(annotation);
				if (result == null) result = caseRange(annotation);
				if (result == null) result = caseMarked(annotation);
				if (result == null) result = caseIMarked(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.TYPE_PARAMETER: {
				TypeParameter typeParameter = (TypeParameter)theEObject;
				T1 result = caseTypeParameter(typeParameter);
				if (result == null) result = caseNamedElement(typeParameter);
				if (result == null) result = caseSource(typeParameter);
				if (result == null) result = caseRange(typeParameter);
				if (result == null) result = caseMarked(typeParameter);
				if (result == null) result = caseIMarked(typeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T1 result = caseTypedElement(typedElement);
				if (result == null) result = caseNamedElement(typedElement);
				if (result == null) result = caseSource(typedElement);
				if (result == null) result = caseRange(typedElement);
				if (result == null) result = caseMarked(typedElement);
				if (result == null) result = caseIMarked(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.TYPE: {
				Type type = (Type)theEObject;
				T1 result = caseType(type);
				if (result == null) result = caseMember(type);
				if (result == null) result = caseNamedElement(type);
				if (result == null) result = caseSource(type);
				if (result == null) result = caseRange(type);
				if (result == null) result = caseMarked(type);
				if (result == null) result = caseIMarked(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ANNOTATION_INTERFACE: {
				AnnotationInterface annotationInterface = (AnnotationInterface)theEObject;
				T1 result = caseAnnotationInterface(annotationInterface);
				if (result == null) result = caseType(annotationInterface);
				if (result == null) result = caseMember(annotationInterface);
				if (result == null) result = caseNamedElement(annotationInterface);
				if (result == null) result = caseSource(annotationInterface);
				if (result == null) result = caseRange(annotationInterface);
				if (result == null) result = caseMarked(annotationInterface);
				if (result == null) result = caseIMarked(annotationInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ANNOTATION_INTERFACE_MEMBER: {
				AnnotationInterfaceMember annotationInterfaceMember = (AnnotationInterfaceMember)theEObject;
				T1 result = caseAnnotationInterfaceMember(annotationInterfaceMember);
				if (result == null) result = caseMember(annotationInterfaceMember);
				if (result == null) result = caseNamedElement(annotationInterfaceMember);
				if (result == null) result = caseSource(annotationInterfaceMember);
				if (result == null) result = caseRange(annotationInterfaceMember);
				if (result == null) result = caseMarked(annotationInterfaceMember);
				if (result == null) result = caseIMarked(annotationInterfaceMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CLASS: {
				org.nasdanika.models.java.Class class_ = (org.nasdanika.models.java.Class)theEObject;
				T1 result = caseClass(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = caseMember(class_);
				if (result == null) result = caseNamedElement(class_);
				if (result == null) result = caseSource(class_);
				if (result == null) result = caseRange(class_);
				if (result == null) result = caseMarked(class_);
				if (result == null) result = caseIMarked(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T1 result = caseInterface(interface_);
				if (result == null) result = caseType(interface_);
				if (result == null) result = caseMember(interface_);
				if (result == null) result = caseNamedElement(interface_);
				if (result == null) result = caseSource(interface_);
				if (result == null) result = caseRange(interface_);
				if (result == null) result = caseMarked(interface_);
				if (result == null) result = caseIMarked(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CONSTRUCTOR: {
				Constructor constructor = (Constructor)theEObject;
				T1 result = caseConstructor(constructor);
				if (result == null) result = caseOperation(constructor);
				if (result == null) result = caseCode(constructor);
				if (result == null) result = caseTypedElement(constructor);
				if (result == null) result = caseMember(constructor);
				if (result == null) result = caseNamedElement(constructor);
				if (result == null) result = caseSource(constructor);
				if (result == null) result = caseRange(constructor);
				if (result == null) result = caseMarked(constructor);
				if (result == null) result = caseIMarked(constructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ENUM: {
				org.nasdanika.models.java.Enum enum_ = (org.nasdanika.models.java.Enum)theEObject;
				T1 result = caseEnum(enum_);
				if (result == null) result = caseType(enum_);
				if (result == null) result = caseMember(enum_);
				if (result == null) result = caseNamedElement(enum_);
				if (result == null) result = caseSource(enum_);
				if (result == null) result = caseRange(enum_);
				if (result == null) result = caseMarked(enum_);
				if (result == null) result = caseIMarked(enum_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.ENUM_CONSTANT: {
				EnumConstant enumConstant = (EnumConstant)theEObject;
				T1 result = caseEnumConstant(enumConstant);
				if (result == null) result = caseMember(enumConstant);
				if (result == null) result = caseNamedElement(enumConstant);
				if (result == null) result = caseSource(enumConstant);
				if (result == null) result = caseRange(enumConstant);
				if (result == null) result = caseMarked(enumConstant);
				if (result == null) result = caseIMarked(enumConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.FIELD: {
				Field field = (Field)theEObject;
				T1 result = caseField(field);
				if (result == null) result = caseCode(field);
				if (result == null) result = caseTypedElement(field);
				if (result == null) result = caseMember(field);
				if (result == null) result = caseNamedElement(field);
				if (result == null) result = caseSource(field);
				if (result == null) result = caseRange(field);
				if (result == null) result = caseMarked(field);
				if (result == null) result = caseIMarked(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.MODULE: {
				org.nasdanika.models.java.Module module = (org.nasdanika.models.java.Module)theEObject;
				T1 result = caseModule(module);
				if (result == null) result = caseSource(module);
				if (result == null) result = caseRange(module);
				if (result == null) result = caseMarked(module);
				if (result == null) result = caseIMarked(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.PACKAGE: {
				org.nasdanika.models.java.Package package_ = (org.nasdanika.models.java.Package)theEObject;
				T1 result = casePackage(package_);
				if (result == null) result = caseSource(package_);
				if (result == null) result = caseRange(package_);
				if (result == null) result = caseMarked(package_);
				if (result == null) result = caseIMarked(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.METHOD: {
				Method method = (Method)theEObject;
				T1 result = caseMethod(method);
				if (result == null) result = caseOperation(method);
				if (result == null) result = caseCode(method);
				if (result == null) result = caseTypedElement(method);
				if (result == null) result = caseMember(method);
				if (result == null) result = caseNamedElement(method);
				if (result == null) result = caseSource(method);
				if (result == null) result = caseRange(method);
				if (result == null) result = caseMarked(method);
				if (result == null) result = caseIMarked(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CODE: {
				Code code = (Code)theEObject;
				T1 result = caseCode(code);
				if (result == null) result = caseMember(code);
				if (result == null) result = caseNamedElement(code);
				if (result == null) result = caseSource(code);
				if (result == null) result = caseRange(code);
				if (result == null) result = caseMarked(code);
				if (result == null) result = caseIMarked(code);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.INITIALIZER: {
				Initializer initializer = (Initializer)theEObject;
				T1 result = caseInitializer(initializer);
				if (result == null) result = caseCode(initializer);
				if (result == null) result = caseMember(initializer);
				if (result == null) result = caseNamedElement(initializer);
				if (result == null) result = caseSource(initializer);
				if (result == null) result = caseRange(initializer);
				if (result == null) result = caseMarked(initializer);
				if (result == null) result = caseIMarked(initializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.CLASS_INITIALIZER: {
				ClassInitializer classInitializer = (ClassInitializer)theEObject;
				T1 result = caseClassInitializer(classInitializer);
				if (result == null) result = caseCode(classInitializer);
				if (result == null) result = caseMember(classInitializer);
				if (result == null) result = caseNamedElement(classInitializer);
				if (result == null) result = caseSource(classInitializer);
				if (result == null) result = caseRange(classInitializer);
				if (result == null) result = caseMarked(classInitializer);
				if (result == null) result = caseIMarked(classInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T1 result = caseParameter(parameter);
				if (result == null) result = caseTypedElement(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = caseSource(parameter);
				if (result == null) result = caseRange(parameter);
				if (result == null) result = caseMarked(parameter);
				if (result == null) result = caseIMarked(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T1 result = caseOperation(operation);
				if (result == null) result = caseCode(operation);
				if (result == null) result = caseTypedElement(operation);
				if (result == null) result = caseMember(operation);
				if (result == null) result = caseNamedElement(operation);
				if (result == null) result = caseSource(operation);
				if (result == null) result = caseRange(operation);
				if (result == null) result = caseMarked(operation);
				if (result == null) result = caseIMarked(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaPackage.RECORD: {
				org.nasdanika.models.java.Record record = (org.nasdanika.models.java.Record)theEObject;
				T1 result = caseRecord(record);
				if (result == null) result = caseType(record);
				if (result == null) result = caseMember(record);
				if (result == null) result = caseNamedElement(record);
				if (result == null) result = caseSource(record);
				if (result == null) result = caseRange(record);
				if (result == null) result = caseMarked(record);
				if (result == null) result = caseIMarked(record);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseImportManager(Function<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseComparable(Comparable<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRange(Range object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClass(org.nasdanika.models.java.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConstructor(Constructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEnum(org.nasdanika.models.java.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEnumConstant(EnumConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModule(org.nasdanika.models.java.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePackage(org.nasdanika.models.java.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRecord(org.nasdanika.models.java.Record object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMember(Member object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGenericType(GenericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTypeParameter(TypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInitializer(Initializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClassInitializer(ClassInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAnnotationInterface(AnnotationInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Interface Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Interface Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAnnotationInterfaceMember(AnnotationInterfaceMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCompilationUnit(CompilationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLineComment(LineComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Javadoc Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Javadoc Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJavadocComment(JavadocComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBlockComment(BlockComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMarked(org.nasdanika.ncore.Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //JavaSwitch
