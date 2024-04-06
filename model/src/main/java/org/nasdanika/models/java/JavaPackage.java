/**
 */
package org.nasdanika.models.java;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.java.JavaFactory
 * @model kind="package"
 * @generated
 */
public interface JavaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "java";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/java";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.java";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaPackage eINSTANCE = org.nasdanika.models.java.impl.JavaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.SourceImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 6;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.ModuleImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 25;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.MethodImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 27;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.PackageImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 26;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.CompilationUnitImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getCompilationUnit()
	 * @generated
	 */
	int COMPILATION_UNIT = 8;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.nasdanika.models.java.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see org.nasdanika.models.java.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see org.nasdanika.models.java.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.EnumConstant <em>Enum Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Constant</em>'.
	 * @see org.nasdanika.models.java.EnumConstant
	 * @generated
	 */
	EClass getEnumConstant();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.nasdanika.models.java.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.java.Field#getInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initializer</em>'.
	 * @see org.nasdanika.models.java.Field#getInitializer()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Initializer();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see org.nasdanika.models.java.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.MemberImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 10;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.TypeImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 16;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.ClassImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 19;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.OperationImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 32;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.ConstructorImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 21;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.EnumImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 22;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.FieldImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 24;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.InterfaceImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 20;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.RecordImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 33;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.CommentImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 9;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.CodeImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 28;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.EnumConstantImpl <em>Enum Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.EnumConstantImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getEnumConstant()
	 * @generated
	 */
	int ENUM_CONSTANT = 23;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.InitializerImpl <em>Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.InitializerImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getInitializer()
	 * @generated
	 */
	int INITIALIZER = 29;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.ClassInitializerImpl <em>Class Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.ClassInitializerImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getClassInitializer()
	 * @generated
	 */
	int CLASS_INITIALIZER = 30;

	/**
	 * The meta object id for the '{@link java.util.function.Function <em>Import Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.function.Function
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getImportManager()
	 * @generated
	 */
	int IMPORT_MANAGER = 0;


	/**
	 * The number of structural features of the '<em>Import Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Import Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.function.BiFunction <em>Merger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.function.BiFunction
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getMerger()
	 * @generated
	 */
	int MERGER = 1;


	/**
	 * The number of structural features of the '<em>Merger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Merger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.function.Predicate <em>Digest Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.function.Predicate
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getDigestPredicate()
	 * @generated
	 */
	int DIGEST_PREDICATE = 2;

	/**
	 * The number of structural features of the '<em>Digest Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_PREDICATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Digest Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_PREDICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.lang.Comparable <em>Comparable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Comparable
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getComparable()
	 * @generated
	 */
	int COMPARABLE = 3;

	/**
	 * The number of structural features of the '<em>Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.PositionImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__LINE = COMPARABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__COLUMN = COMPARABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = COMPARABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = COMPARABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.RangeImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 5;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__BEGIN = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__END = 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE___CONTAINS__RANGE = 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE___CONTAINS__POSITION = 1;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE___OVERLAPS__RANGE = 2;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__MARKERS = NcorePackage.MARKED__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__BEGIN = NcorePackage.MARKED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__END = NcorePackage.MARKED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SOURCE = NcorePackage.MARKED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__CHILDREN = NcorePackage.MARKED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__COVERAGE = NcorePackage.MARKED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__REFERENCES = NcorePackage.MARKED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__GENERATION_MODE = NcorePackage.MARKED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = NcorePackage.MARKED_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___CONTAINS__RANGE = NcorePackage.MARKED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___CONTAINS__POSITION = NcorePackage.MARKED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___OVERLAPS__RANGE = NcorePackage.MARKED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___GENERATE__FUNCTION = NcorePackage.MARKED_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = NcorePackage.MARKED_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.NamedElementImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__MARKERS = SOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__BEGIN = SOURCE__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__END = SOURCE__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__SOURCE = SOURCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CHILDREN = SOURCE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__COVERAGE = SOURCE__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__REFERENCES = SOURCE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__GENERATION_MODE = SOURCE__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__FULLY_QUALIFIED_NAME = SOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__REFERRERS = SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___CONTAINS__RANGE = SOURCE___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___CONTAINS__POSITION = SOURCE___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___OVERLAPS__RANGE = SOURCE___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___GENERATE__FUNCTION = SOURCE___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = SOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__MARKERS = NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__BEGIN = NAMED_ELEMENT__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__END = NAMED_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__SOURCE = NAMED_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__CHILDREN = NAMED_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__COVERAGE = NAMED_ELEMENT__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__REFERENCES = NAMED_ELEMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__GENERATION_MODE = NAMED_ELEMENT__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__FULLY_QUALIFIED_NAME = NAMED_ELEMENT__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__REFERRERS = NAMED_ELEMENT__REFERRERS;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__TYPES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__PACKAGE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__IMPORTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT___CONTAINS__RANGE = NAMED_ELEMENT___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT___CONTAINS__POSITION = NAMED_ELEMENT___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT___OVERLAPS__RANGE = NAMED_ELEMENT___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT___GENERATE__FUNCTION = NAMED_ELEMENT___GENERATE__FUNCTION;

	/**
	 * The operation id for the '<em>Merge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT___MERGE__STRING_BIFUNCTION = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Merge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT___MERGE__BIFUNCTION = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__MARKERS = NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__BEGIN = NAMED_ELEMENT__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__END = NAMED_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__SOURCE = NAMED_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__CHILDREN = NAMED_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__COVERAGE = NAMED_ELEMENT__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__REFERENCES = NAMED_ELEMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__GENERATION_MODE = NAMED_ELEMENT__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__FULLY_QUALIFIED_NAME = NAMED_ELEMENT__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__REFERRERS = NAMED_ELEMENT__REFERRERS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__COMMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__MODIFIERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Referenced Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__REFERENCED_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Annotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ANNOTATE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER___CONTAINS__RANGE = NAMED_ELEMENT___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER___CONTAINS__POSITION = NAMED_ELEMENT___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER___OVERLAPS__RANGE = NAMED_ELEMENT___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER___GENERATE__FUNCTION = NAMED_ELEMENT___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.ReferenceImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__MARKERS = NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__BEGIN = NAMED_ELEMENT__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__END = NAMED_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SOURCE = NAMED_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CHILDREN = NAMED_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__COVERAGE = NAMED_ELEMENT__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENCES = NAMED_ELEMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__GENERATION_MODE = NAMED_ELEMENT__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__FULLY_QUALIFIED_NAME = NAMED_ELEMENT__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERRERS = NAMED_ELEMENT__REFERRERS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE___CONTAINS__RANGE = NAMED_ELEMENT___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE___CONTAINS__POSITION = NAMED_ELEMENT___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE___OVERLAPS__RANGE = NAMED_ELEMENT___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE___GENERATE__FUNCTION = NAMED_ELEMENT___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.GenericTypeImpl <em>Generic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.GenericTypeImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getGenericType()
	 * @generated
	 */
	int GENERIC_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__MARKERS = REFERENCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__BEGIN = REFERENCE__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__END = REFERENCE__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__SOURCE = REFERENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__CHILDREN = REFERENCE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__COVERAGE = REFERENCE__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__REFERENCES = REFERENCE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__GENERATION_MODE = REFERENCE__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__NAME = REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__FULLY_QUALIFIED_NAME = REFERENCE__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__REFERRERS = REFERENCE__REFERRERS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__TARGET = REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__TYPE_ARGUMENTS = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__LOWER_BOUND = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__UPPER_BOUND = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE__PRIMITIVE = REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Generic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE___CONTAINS__RANGE = REFERENCE___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE___CONTAINS__POSITION = REFERENCE___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE___OVERLAPS__RANGE = REFERENCE___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE___GENERATE__FUNCTION = REFERENCE___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Generic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.AnnotationImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 13;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__MARKERS = REFERENCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__BEGIN = REFERENCE__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__END = REFERENCE__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__SOURCE = REFERENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__CHILDREN = REFERENCE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__COVERAGE = REFERENCE__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__REFERENCES = REFERENCE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__GENERATION_MODE = REFERENCE__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__FULLY_QUALIFIED_NAME = REFERENCE__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__REFERRERS = REFERENCE__REFERRERS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TARGET = REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ELEMENTS = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION___CONTAINS__RANGE = REFERENCE___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION___CONTAINS__POSITION = REFERENCE___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION___OVERLAPS__RANGE = REFERENCE___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION___GENERATE__FUNCTION = REFERENCE___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.TypeParameterImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getTypeParameter()
	 * @generated
	 */
	int TYPE_PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__MARKERS = NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__BEGIN = NAMED_ELEMENT__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__END = NAMED_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__SOURCE = NAMED_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__CHILDREN = NAMED_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__COVERAGE = NAMED_ELEMENT__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__REFERENCES = NAMED_ELEMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__GENERATION_MODE = NAMED_ELEMENT__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__FULLY_QUALIFIED_NAME = NAMED_ELEMENT__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__REFERRERS = NAMED_ELEMENT__REFERRERS;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__BOUNDS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER___CONTAINS__RANGE = NAMED_ELEMENT___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER___CONTAINS__POSITION = NAMED_ELEMENT___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER___OVERLAPS__RANGE = NAMED_ELEMENT___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER___GENERATE__FUNCTION = NAMED_ELEMENT___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.TypedElementImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__MARKERS = NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__BEGIN = NAMED_ELEMENT__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__END = NAMED_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__SOURCE = NAMED_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__CHILDREN = NAMED_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__COVERAGE = NAMED_ELEMENT__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__REFERENCES = NAMED_ELEMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__GENERATION_MODE = NAMED_ELEMENT__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__FULLY_QUALIFIED_NAME = NAMED_ELEMENT__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__REFERRERS = NAMED_ELEMENT__REFERRERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT___CONTAINS__RANGE = NAMED_ELEMENT___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT___CONTAINS__POSITION = NAMED_ELEMENT___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT___OVERLAPS__RANGE = NAMED_ELEMENT___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT___GENERATE__FUNCTION = NAMED_ELEMENT___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__MARKERS = MEMBER__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__BEGIN = MEMBER__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__END = MEMBER__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SOURCE = MEMBER__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CHILDREN = MEMBER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__COVERAGE = MEMBER__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__REFERENCES = MEMBER__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__GENERATION_MODE = MEMBER__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__FULLY_QUALIFIED_NAME = MEMBER__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__REFERRERS = MEMBER__REFERRERS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__COMMENT = MEMBER__COMMENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__MODIFIERS = MEMBER__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Referenced Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__REFERENCED_TYPES = MEMBER__REFERENCED_TYPES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ANNOTATIONS = MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ANNOTATE = MEMBER__ANNOTATE;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__MEMBERS = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SUPERTYPES = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TYPE_PARAMETERS = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Permits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PERMITS = MEMBER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___CONTAINS__RANGE = MEMBER___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___CONTAINS__POSITION = MEMBER___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___OVERLAPS__RANGE = MEMBER___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___GENERATE__FUNCTION = MEMBER___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.AnnotationInterfaceImpl <em>Annotation Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.AnnotationInterfaceImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getAnnotationInterface()
	 * @generated
	 */
	int ANNOTATION_INTERFACE = 17;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__MARKERS = TYPE__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__BEGIN = TYPE__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__END = TYPE__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__SOURCE = TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__CHILDREN = TYPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__COVERAGE = TYPE__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__REFERENCES = TYPE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__GENERATION_MODE = TYPE__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__FULLY_QUALIFIED_NAME = TYPE__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__REFERRERS = TYPE__REFERRERS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__COMMENT = TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__MODIFIERS = TYPE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Referenced Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__REFERENCED_TYPES = TYPE__REFERENCED_TYPES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__ANNOTATE = TYPE__ANNOTATE;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__MEMBERS = TYPE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Supertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__SUPERTYPES = TYPE__SUPERTYPES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__TYPE_PARAMETERS = TYPE__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Permits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE__PERMITS = TYPE__PERMITS;

	/**
	 * The number of structural features of the '<em>Annotation Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE___CONTAINS__RANGE = TYPE___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE___CONTAINS__POSITION = TYPE___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE___OVERLAPS__RANGE = TYPE___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE___GENERATE__FUNCTION = TYPE___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Annotation Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.AnnotationInterfaceMemberImpl <em>Annotation Interface Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.AnnotationInterfaceMemberImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getAnnotationInterfaceMember()
	 * @generated
	 */
	int ANNOTATION_INTERFACE_MEMBER = 18;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER__MARKERS = MEMBER__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER__BEGIN = MEMBER__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER__END = MEMBER__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER__SOURCE = MEMBER__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER__CHILDREN = MEMBER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER__COVERAGE = MEMBER__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER__REFERENCES = MEMBER__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER__GENERATION_MODE = MEMBER__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER__FULLY_QUALIFIED_NAME = MEMBER__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER__REFERRERS = MEMBER__REFERRERS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER__COMMENT = MEMBER__COMMENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER__MODIFIERS = MEMBER__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Referenced Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER__REFERENCED_TYPES = MEMBER__REFERENCED_TYPES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER__ANNOTATIONS = MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER__ANNOTATE = MEMBER__ANNOTATE;

	/**
	 * The number of structural features of the '<em>Annotation Interface Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER___CONTAINS__RANGE = MEMBER___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER___CONTAINS__POSITION = MEMBER___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER___OVERLAPS__RANGE = MEMBER___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER___GENERATE__FUNCTION = MEMBER___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Annotation Interface Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_INTERFACE_MEMBER_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MARKERS = TYPE__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__BEGIN = TYPE__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__END = TYPE__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SOURCE = TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CHILDREN = TYPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COVERAGE = TYPE__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__REFERENCES = TYPE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GENERATION_MODE = TYPE__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FULLY_QUALIFIED_NAME = TYPE__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__REFERRERS = TYPE__REFERRERS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMMENT = TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MODIFIERS = TYPE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Referenced Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__REFERENCED_TYPES = TYPE__REFERENCED_TYPES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ANNOTATE = TYPE__ANNOTATE;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MEMBERS = TYPE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Supertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPERTYPES = TYPE__SUPERTYPES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TYPE_PARAMETERS = TYPE__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Permits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PERMITS = TYPE__PERMITS;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___CONTAINS__RANGE = TYPE___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___CONTAINS__POSITION = TYPE___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___OVERLAPS__RANGE = TYPE___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GENERATE__FUNCTION = TYPE___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__MARKERS = TYPE__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__BEGIN = TYPE__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__END = TYPE__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SOURCE = TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CHILDREN = TYPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__COVERAGE = TYPE__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__REFERENCES = TYPE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__GENERATION_MODE = TYPE__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__FULLY_QUALIFIED_NAME = TYPE__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__REFERRERS = TYPE__REFERRERS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__COMMENT = TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__MODIFIERS = TYPE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Referenced Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__REFERENCED_TYPES = TYPE__REFERENCED_TYPES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ANNOTATE = TYPE__ANNOTATE;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__MEMBERS = TYPE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Supertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SUPERTYPES = TYPE__SUPERTYPES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__TYPE_PARAMETERS = TYPE__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Permits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PERMITS = TYPE__PERMITS;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___CONTAINS__RANGE = TYPE___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___CONTAINS__POSITION = TYPE___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___OVERLAPS__RANGE = TYPE___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___GENERATE__FUNCTION = TYPE___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__MARKERS = MEMBER__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__BEGIN = MEMBER__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__END = MEMBER__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__SOURCE = MEMBER__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CHILDREN = MEMBER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__COVERAGE = MEMBER__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__REFERENCES = MEMBER__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__GENERATION_MODE = MEMBER__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__FULLY_QUALIFIED_NAME = MEMBER__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__REFERRERS = MEMBER__REFERRERS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__COMMENT = MEMBER__COMMENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__MODIFIERS = MEMBER__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Referenced Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__REFERENCED_TYPES = MEMBER__REFERENCED_TYPES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ANNOTATIONS = MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ANNOTATE = MEMBER__ANNOTATE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__BODY = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE___CONTAINS__RANGE = MEMBER___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE___CONTAINS__POSITION = MEMBER___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE___OVERLAPS__RANGE = MEMBER___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE___GENERATE__FUNCTION = MEMBER___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MARKERS = CODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BEGIN = CODE__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__END = CODE__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SOURCE = CODE__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CHILDREN = CODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__COVERAGE = CODE__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REFERENCES = CODE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__GENERATION_MODE = CODE__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = CODE__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__FULLY_QUALIFIED_NAME = CODE__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REFERRERS = CODE__REFERRERS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__COMMENT = CODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MODIFIERS = CODE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Referenced Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REFERENCED_TYPES = CODE__REFERENCED_TYPES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ANNOTATIONS = CODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ANNOTATE = CODE__ANNOTATE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY = CODE__BODY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE = CODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiver Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RECEIVER_PARAMETER = CODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = CODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EXCEPTIONS = CODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE_PARAMETERS = CODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SIGNATURE = CODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = CODE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___CONTAINS__RANGE = CODE___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___CONTAINS__POSITION = CODE___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___OVERLAPS__RANGE = CODE___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GENERATE__FUNCTION = CODE___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = CODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__MARKERS = OPERATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__BEGIN = OPERATION__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__END = OPERATION__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__SOURCE = OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__CHILDREN = OPERATION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__COVERAGE = OPERATION__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__REFERENCES = OPERATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__GENERATION_MODE = OPERATION__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__FULLY_QUALIFIED_NAME = OPERATION__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__REFERRERS = OPERATION__REFERRERS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__COMMENT = OPERATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__MODIFIERS = OPERATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Referenced Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__REFERENCED_TYPES = OPERATION__REFERENCED_TYPES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__ANNOTATIONS = OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__ANNOTATE = OPERATION__ANNOTATE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__BODY = OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__TYPE = OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Receiver Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__RECEIVER_PARAMETER = OPERATION__RECEIVER_PARAMETER;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__PARAMETERS = OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__EXCEPTIONS = OPERATION__EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__TYPE_PARAMETERS = OPERATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__SIGNATURE = OPERATION__SIGNATURE;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR___CONTAINS__RANGE = OPERATION___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR___CONTAINS__POSITION = OPERATION___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR___OVERLAPS__RANGE = OPERATION___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR___GENERATE__FUNCTION = OPERATION___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__MARKERS = TYPE__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__BEGIN = TYPE__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__END = TYPE__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__SOURCE = TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__CHILDREN = TYPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__COVERAGE = TYPE__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__REFERENCES = TYPE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__GENERATION_MODE = TYPE__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__FULLY_QUALIFIED_NAME = TYPE__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__REFERRERS = TYPE__REFERRERS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__COMMENT = TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__MODIFIERS = TYPE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Referenced Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__REFERENCED_TYPES = TYPE__REFERENCED_TYPES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__ANNOTATE = TYPE__ANNOTATE;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__MEMBERS = TYPE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Supertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__SUPERTYPES = TYPE__SUPERTYPES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__TYPE_PARAMETERS = TYPE__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Permits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__PERMITS = TYPE__PERMITS;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM___CONTAINS__RANGE = TYPE___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM___CONTAINS__POSITION = TYPE___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM___OVERLAPS__RANGE = TYPE___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM___GENERATE__FUNCTION = TYPE___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__MARKERS = MEMBER__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__BEGIN = MEMBER__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__END = MEMBER__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__SOURCE = MEMBER__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__CHILDREN = MEMBER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__COVERAGE = MEMBER__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__REFERENCES = MEMBER__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__GENERATION_MODE = MEMBER__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__FULLY_QUALIFIED_NAME = MEMBER__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__REFERRERS = MEMBER__REFERRERS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__COMMENT = MEMBER__COMMENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__MODIFIERS = MEMBER__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Referenced Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__REFERENCED_TYPES = MEMBER__REFERENCED_TYPES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__ANNOTATIONS = MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT__ANNOTATE = MEMBER__ANNOTATE;

	/**
	 * The number of structural features of the '<em>Enum Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT___CONTAINS__RANGE = MEMBER___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT___CONTAINS__POSITION = MEMBER___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT___OVERLAPS__RANGE = MEMBER___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT___GENERATE__FUNCTION = MEMBER___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Enum Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__MARKERS = MEMBER__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__BEGIN = MEMBER__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__END = MEMBER__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SOURCE = MEMBER__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CHILDREN = MEMBER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__COVERAGE = MEMBER__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__REFERENCES = MEMBER__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__GENERATION_MODE = MEMBER__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FULLY_QUALIFIED_NAME = MEMBER__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__REFERRERS = MEMBER__REFERRERS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__COMMENT = MEMBER__COMMENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__MODIFIERS = MEMBER__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Referenced Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__REFERENCED_TYPES = MEMBER__REFERENCED_TYPES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ANNOTATIONS = MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ANNOTATE = MEMBER__ANNOTATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__INITIALIZER = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___CONTAINS__RANGE = MEMBER___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___CONTAINS__POSITION = MEMBER___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___OVERLAPS__RANGE = MEMBER___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GENERATE__FUNCTION = MEMBER___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MARKERS = SOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__BEGIN = SOURCE__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__END = SOURCE__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__SOURCE = SOURCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CHILDREN = SOURCE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__COVERAGE = SOURCE__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__REFERENCES = SOURCE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__GENERATION_MODE = SOURCE__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PACKAGES = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___CONTAINS__RANGE = SOURCE___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___CONTAINS__POSITION = SOURCE___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___OVERLAPS__RANGE = SOURCE___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE___GENERATE__FUNCTION = SOURCE___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.impl.ParameterImpl
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 31;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MARKERS = SOURCE__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__BEGIN = SOURCE__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__END = SOURCE__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SOURCE = SOURCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CHILDREN = SOURCE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COVERAGE = SOURCE__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__REFERENCES = SOURCE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__GENERATION_MODE = SOURCE__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___CONTAINS__RANGE = SOURCE___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___CONTAINS__POSITION = SOURCE___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___OVERLAPS__RANGE = SOURCE___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GENERATE__FUNCTION = SOURCE___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = SOURCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__MARKERS = OPERATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BEGIN = OPERATION__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__END = OPERATION__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SOURCE = OPERATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CHILDREN = OPERATION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__COVERAGE = OPERATION__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__REFERENCES = OPERATION__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__GENERATION_MODE = OPERATION__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__FULLY_QUALIFIED_NAME = OPERATION__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__REFERRERS = OPERATION__REFERRERS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__COMMENT = OPERATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__MODIFIERS = OPERATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Referenced Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__REFERENCED_TYPES = OPERATION__REFERENCED_TYPES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ANNOTATIONS = OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ANNOTATE = OPERATION__ANNOTATE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BODY = OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TYPE = OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Receiver Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RECEIVER_PARAMETER = OPERATION__RECEIVER_PARAMETER;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETERS = OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__EXCEPTIONS = OPERATION__EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TYPE_PARAMETERS = OPERATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SIGNATURE = OPERATION__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__OVERRIDES = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Overridden By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__OVERRIDDEN_BY = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD___CONTAINS__RANGE = OPERATION___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD___CONTAINS__POSITION = OPERATION___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD___OVERLAPS__RANGE = OPERATION___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD___GENERATE__FUNCTION = OPERATION___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__MARKERS = CODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__BEGIN = CODE__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__END = CODE__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__SOURCE = CODE__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__CHILDREN = CODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__COVERAGE = CODE__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__REFERENCES = CODE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__GENERATION_MODE = CODE__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__NAME = CODE__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__FULLY_QUALIFIED_NAME = CODE__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__REFERRERS = CODE__REFERRERS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__COMMENT = CODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__MODIFIERS = CODE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Referenced Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__REFERENCED_TYPES = CODE__REFERENCED_TYPES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__ANNOTATIONS = CODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__ANNOTATE = CODE__ANNOTATE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__BODY = CODE__BODY;

	/**
	 * The number of structural features of the '<em>Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER_FEATURE_COUNT = CODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER___CONTAINS__RANGE = CODE___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER___CONTAINS__POSITION = CODE___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER___OVERLAPS__RANGE = CODE___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER___GENERATE__FUNCTION = CODE___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER_OPERATION_COUNT = CODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER__MARKERS = CODE__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER__BEGIN = CODE__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER__END = CODE__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER__SOURCE = CODE__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER__CHILDREN = CODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER__COVERAGE = CODE__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER__REFERENCES = CODE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER__GENERATION_MODE = CODE__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER__NAME = CODE__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER__FULLY_QUALIFIED_NAME = CODE__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER__REFERRERS = CODE__REFERRERS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER__COMMENT = CODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER__MODIFIERS = CODE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Referenced Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER__REFERENCED_TYPES = CODE__REFERENCED_TYPES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER__ANNOTATIONS = CODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER__ANNOTATE = CODE__ANNOTATE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER__BODY = CODE__BODY;

	/**
	 * The number of structural features of the '<em>Class Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER_FEATURE_COUNT = CODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER___CONTAINS__RANGE = CODE___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER___CONTAINS__POSITION = CODE___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER___OVERLAPS__RANGE = CODE___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER___GENERATE__FUNCTION = CODE___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Class Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INITIALIZER_OPERATION_COUNT = CODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MARKERS = TYPED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__BEGIN = TYPED_ELEMENT__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__END = TYPED_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SOURCE = TYPED_ELEMENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CHILDREN = TYPED_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COVERAGE = TYPED_ELEMENT__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REFERENCES = TYPED_ELEMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__GENERATION_MODE = TYPED_ELEMENT__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__FULLY_QUALIFIED_NAME = TYPED_ELEMENT__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REFERRERS = TYPED_ELEMENT__REFERRERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Var Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VAR_ARG = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MODIFIERS = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___CONTAINS__RANGE = TYPED_ELEMENT___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___CONTAINS__POSITION = TYPED_ELEMENT___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___OVERLAPS__RANGE = TYPED_ELEMENT___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GENERATE__FUNCTION = TYPED_ELEMENT___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__MARKERS = TYPE__MARKERS;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__BEGIN = TYPE__BEGIN;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__END = TYPE__END;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__SOURCE = TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__CHILDREN = TYPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__COVERAGE = TYPE__COVERAGE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__REFERENCES = TYPE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Generation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__GENERATION_MODE = TYPE__GENERATION_MODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__FULLY_QUALIFIED_NAME = TYPE__FULLY_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Referrers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__REFERRERS = TYPE__REFERRERS;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__COMMENT = TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__MODIFIERS = TYPE__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Referenced Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__REFERENCED_TYPES = TYPE__REFERENCED_TYPES;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__ANNOTATE = TYPE__ANNOTATE;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__MEMBERS = TYPE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Supertypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__SUPERTYPES = TYPE__SUPERTYPES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__TYPE_PARAMETERS = TYPE__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Permits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__PERMITS = TYPE__PERMITS;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD___CONTAINS__RANGE = TYPE___CONTAINS__RANGE;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD___CONTAINS__POSITION = TYPE___CONTAINS__POSITION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD___OVERLAPS__RANGE = TYPE___OVERLAPS__RANGE;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD___GENERATE__FUNCTION = TYPE___GENERATE__FUNCTION;

	/**
	 * The number of operations of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.java.GenerationMode <em>Generation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.java.GenerationMode
	 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getGenerationMode()
	 * @generated
	 */
	int GENERATION_MODE = 34;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.nasdanika.models.java.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.java.Module#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.nasdanika.models.java.Module#getPackages()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Packages();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.nasdanika.models.java.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.java.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.java.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see org.nasdanika.models.java.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.java.Source#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.nasdanika.models.java.Source#getSource()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.java.Source#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.models.java.Source#getChildren()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.java.Source#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coverage</em>'.
	 * @see org.nasdanika.models.java.Source#getCoverage()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Coverage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.java.Source#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.nasdanika.models.java.Source#getReferences()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_References();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.java.Source#getGenerationMode <em>Generation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation Mode</em>'.
	 * @see org.nasdanika.models.java.Source#getGenerationMode()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_GenerationMode();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.java.Source#generate(java.util.function.Function) <em>Generate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate</em>' operation.
	 * @see org.nasdanika.models.java.Source#generate(java.util.function.Function)
	 * @generated
	 */
	EOperation getSource__Generate__Function();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see org.nasdanika.models.java.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.java.GenerationMode <em>Generation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generation Mode</em>'.
	 * @see org.nasdanika.models.java.GenerationMode
	 * @generated
	 */
	EEnum getGenerationMode();

	/**
	 * Returns the meta object for class '{@link java.util.function.Function <em>Import Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Manager</em>'.
	 * @see java.util.function.Function
	 * @model instanceClass="java.util.function.Function&lt;String, String&gt;"
	 * @generated
	 */
	EClass getImportManager();

	/**
	 * Returns the meta object for class '{@link java.util.function.BiFunction <em>Merger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merger</em>'.
	 * @see java.util.function.BiFunction
	 * @model instanceClass="java.util.function.BiFunction&lt;String, String, String&gt;"
	 * @generated
	 */
	EClass getMerger();

	/**
	 * Returns the meta object for class '{@link java.util.function.Predicate <em>Digest Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digest Predicate</em>'.
	 * @see java.util.function.Predicate
	 * @model instanceClass="java.util.function.Predicate&lt;org.eclipse.emf.ecore.EObject&gt;"
	 * @generated
	 */
	EClass getDigestPredicate();

	/**
	 * Returns the meta object for class '{@link java.lang.Comparable <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparable</em>'.
	 * @see java.lang.Comparable
	 * @model instanceClass="java.lang.Comparable" typeParameters="T"
	 * @generated
	 */
	EClass getComparable();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see org.nasdanika.models.java.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.java.Position#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see org.nasdanika.models.java.Position#getLine()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Line();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.java.Position#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.nasdanika.models.java.Position#getColumn()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Column();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see org.nasdanika.models.java.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.java.Range#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Begin</em>'.
	 * @see org.nasdanika.models.java.Range#getBegin()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_Begin();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.java.Range#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see org.nasdanika.models.java.Range#getEnd()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_End();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.java.Range#contains(org.nasdanika.models.java.Range) <em>Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains</em>' operation.
	 * @see org.nasdanika.models.java.Range#contains(org.nasdanika.models.java.Range)
	 * @generated
	 */
	EOperation getRange__Contains__Range();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.java.Range#contains(org.nasdanika.models.java.Position) <em>Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains</em>' operation.
	 * @see org.nasdanika.models.java.Range#contains(org.nasdanika.models.java.Position)
	 * @generated
	 */
	EOperation getRange__Contains__Position();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.java.Range#overlaps(org.nasdanika.models.java.Range) <em>Overlaps</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Overlaps</em>' operation.
	 * @see org.nasdanika.models.java.Range#overlaps(org.nasdanika.models.java.Range)
	 * @generated
	 */
	EOperation getRange__Overlaps__Range();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see org.nasdanika.models.java.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.java.Member#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comment</em>'.
	 * @see org.nasdanika.models.java.Member#getComment()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Comment();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.java.Member#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modifiers</em>'.
	 * @see org.nasdanika.models.java.Member#getModifiers()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Modifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.java.Member#getReferencedTypes <em>Referenced Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referenced Types</em>'.
	 * @see org.nasdanika.models.java.Member#getReferencedTypes()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_ReferencedTypes();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.java.Member#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotations</em>'.
	 * @see org.nasdanika.models.java.Member#getAnnotations()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Annotations();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.java.Member#isAnnotate <em>Annotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotate</em>'.
	 * @see org.nasdanika.models.java.Member#isAnnotate()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Annotate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.nasdanika.models.java.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.java.Reference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.models.java.Reference#getTarget()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.GenericType <em>Generic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Type</em>'.
	 * @see org.nasdanika.models.java.GenericType
	 * @generated
	 */
	EClass getGenericType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.java.GenericType#getTypeArguments <em>Type Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Arguments</em>'.
	 * @see org.nasdanika.models.java.GenericType#getTypeArguments()
	 * @see #getGenericType()
	 * @generated
	 */
	EReference getGenericType_TypeArguments();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.java.GenericType#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see org.nasdanika.models.java.GenericType#getLowerBound()
	 * @see #getGenericType()
	 * @generated
	 */
	EReference getGenericType_LowerBound();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.java.GenericType#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see org.nasdanika.models.java.GenericType#getUpperBound()
	 * @see #getGenericType()
	 * @generated
	 */
	EReference getGenericType_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.java.GenericType#isPrimitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive</em>'.
	 * @see org.nasdanika.models.java.GenericType#isPrimitive()
	 * @see #getGenericType()
	 * @generated
	 */
	EAttribute getGenericType_Primitive();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.nasdanika.models.java.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.java.Annotation#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.models.java.Annotation#getElements()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Elements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.TypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Parameter</em>'.
	 * @see org.nasdanika.models.java.TypeParameter
	 * @generated
	 */
	EClass getTypeParameter();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.java.TypeParameter#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bounds</em>'.
	 * @see org.nasdanika.models.java.TypeParameter#getBounds()
	 * @see #getTypeParameter()
	 * @generated
	 */
	EReference getTypeParameter_Bounds();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see org.nasdanika.models.java.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.java.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.nasdanika.models.java.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see org.nasdanika.models.java.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.java.Method#getOverrides <em>Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overrides</em>'.
	 * @see org.nasdanika.models.java.Method#getOverrides()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Overrides();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.java.Method#getOverriddenBy <em>Overridden By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Overridden By</em>'.
	 * @see org.nasdanika.models.java.Method#getOverriddenBy()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_OverriddenBy();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see org.nasdanika.models.java.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.java.Code#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.nasdanika.models.java.Code#getBody()
	 * @see #getCode()
	 * @generated
	 */
	EReference getCode_Body();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Initializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initializer</em>'.
	 * @see org.nasdanika.models.java.Initializer
	 * @generated
	 */
	EClass getInitializer();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.ClassInitializer <em>Class Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Initializer</em>'.
	 * @see org.nasdanika.models.java.ClassInitializer
	 * @generated
	 */
	EClass getClassInitializer();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.nasdanika.models.java.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.java.Parameter#isVarArg <em>Var Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Arg</em>'.
	 * @see org.nasdanika.models.java.Parameter#isVarArg()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_VarArg();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.java.Parameter#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modifiers</em>'.
	 * @see org.nasdanika.models.java.Parameter#getModifiers()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Modifiers();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.nasdanika.models.java.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.java.Operation#getReceiverParameter <em>Receiver Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receiver Parameter</em>'.
	 * @see org.nasdanika.models.java.Operation#getReceiverParameter()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReceiverParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.java.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.nasdanika.models.java.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.java.Operation#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions</em>'.
	 * @see org.nasdanika.models.java.Operation#getExceptions()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Exceptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.java.Operation#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see org.nasdanika.models.java.Operation#getTypeParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_TypeParameters();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.java.Operation#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see org.nasdanika.models.java.Operation#getSignature()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Signature();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.nasdanika.models.java.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.java.Type#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.nasdanika.models.java.Type#getMembers()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Members();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.java.Type#getSupertypes <em>Supertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supertypes</em>'.
	 * @see org.nasdanika.models.java.Type#getSupertypes()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Supertypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.java.Type#getPermits <em>Permits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permits</em>'.
	 * @see org.nasdanika.models.java.Type#getPermits()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Permits();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.java.Type#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see org.nasdanika.models.java.Type#getTypeParameters()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_TypeParameters();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.AnnotationInterface <em>Annotation Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Interface</em>'.
	 * @see org.nasdanika.models.java.AnnotationInterface
	 * @generated
	 */
	EClass getAnnotationInterface();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.AnnotationInterfaceMember <em>Annotation Interface Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Interface Member</em>'.
	 * @see org.nasdanika.models.java.AnnotationInterfaceMember
	 * @generated
	 */
	EClass getAnnotationInterfaceMember();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Unit</em>'.
	 * @see org.nasdanika.models.java.CompilationUnit
	 * @generated
	 */
	EClass getCompilationUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.java.CompilationUnit#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.nasdanika.models.java.CompilationUnit#getTypes()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_Types();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.java.CompilationUnit#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see org.nasdanika.models.java.CompilationUnit#getPackageName()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EAttribute getCompilationUnit_PackageName();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.java.CompilationUnit#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Imports</em>'.
	 * @see org.nasdanika.models.java.CompilationUnit#getImports()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EAttribute getCompilationUnit_Imports();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.java.CompilationUnit#merge(java.lang.String, java.util.function.BiFunction) <em>Merge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Merge</em>' operation.
	 * @see org.nasdanika.models.java.CompilationUnit#merge(java.lang.String, java.util.function.BiFunction)
	 * @generated
	 */
	EOperation getCompilationUnit__Merge__String_BiFunction();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.java.CompilationUnit#merge(java.util.function.BiFunction) <em>Merge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Merge</em>' operation.
	 * @see org.nasdanika.models.java.CompilationUnit#merge(java.util.function.BiFunction)
	 * @generated
	 */
	EOperation getCompilationUnit__Merge__BiFunction();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.nasdanika.models.java.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.java.Comment#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.nasdanika.models.java.Comment#getComment()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Comment();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.java.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.nasdanika.models.java.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.java.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.java.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.java.NamedElement#getFullyQualifiedName <em>Fully Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fully Qualified Name</em>'.
	 * @see org.nasdanika.models.java.NamedElement#getFullyQualifiedName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_FullyQualifiedName();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.java.NamedElement#getReferrers <em>Referrers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referrers</em>'.
	 * @see org.nasdanika.models.java.NamedElement#getReferrers()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_Referrers();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaFactory getJavaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.ClassImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.ConstructorImpl <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.ConstructorImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getConstructor()
		 * @generated
		 */
		EClass CONSTRUCTOR = eINSTANCE.getConstructor();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.EnumImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.EnumConstantImpl <em>Enum Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.EnumConstantImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getEnumConstant()
		 * @generated
		 */
		EClass ENUM_CONSTANT = eINSTANCE.getEnumConstant();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.FieldImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Initializer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__INITIALIZER = eINSTANCE.getField_Initializer();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.InterfaceImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.ModuleImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__PACKAGES = eINSTANCE.getModule_Packages();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.PackageImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.SourceImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__SOURCE = eINSTANCE.getSource_Source();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__CHILDREN = eINSTANCE.getSource_Children();

		/**
		 * The meta object literal for the '<em><b>Coverage</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__COVERAGE = eINSTANCE.getSource_Coverage();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__REFERENCES = eINSTANCE.getSource_References();

		/**
		 * The meta object literal for the '<em><b>Generation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__GENERATION_MODE = eINSTANCE.getSource_GenerationMode();

		/**
		 * The meta object literal for the '<em><b>Generate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE___GENERATE__FUNCTION = eINSTANCE.getSource__Generate__Function();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.RecordImpl <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.RecordImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getRecord()
		 * @generated
		 */
		EClass RECORD = eINSTANCE.getRecord();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.GenerationMode <em>Generation Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.GenerationMode
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getGenerationMode()
		 * @generated
		 */
		EEnum GENERATION_MODE = eINSTANCE.getGenerationMode();

		/**
		 * The meta object literal for the '{@link java.util.function.Function <em>Import Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.function.Function
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getImportManager()
		 * @generated
		 */
		EClass IMPORT_MANAGER = eINSTANCE.getImportManager();

		/**
		 * The meta object literal for the '{@link java.util.function.BiFunction <em>Merger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.function.BiFunction
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getMerger()
		 * @generated
		 */
		EClass MERGER = eINSTANCE.getMerger();

		/**
		 * The meta object literal for the '{@link java.util.function.Predicate <em>Digest Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.function.Predicate
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getDigestPredicate()
		 * @generated
		 */
		EClass DIGEST_PREDICATE = eINSTANCE.getDigestPredicate();

		/**
		 * The meta object literal for the '{@link java.lang.Comparable <em>Comparable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Comparable
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getComparable()
		 * @generated
		 */
		EClass COMPARABLE = eINSTANCE.getComparable();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.PositionImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__LINE = eINSTANCE.getPosition_Line();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__COLUMN = eINSTANCE.getPosition_Column();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.RangeImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__BEGIN = eINSTANCE.getRange_Begin();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__END = eINSTANCE.getRange_End();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE___CONTAINS__RANGE = eINSTANCE.getRange__Contains__Range();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE___CONTAINS__POSITION = eINSTANCE.getRange__Contains__Position();

		/**
		 * The meta object literal for the '<em><b>Overlaps</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RANGE___OVERLAPS__RANGE = eINSTANCE.getRange__Overlaps__Range();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.MemberImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__COMMENT = eINSTANCE.getMember_Comment();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__MODIFIERS = eINSTANCE.getMember_Modifiers();

		/**
		 * The meta object literal for the '<em><b>Referenced Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__REFERENCED_TYPES = eINSTANCE.getMember_ReferencedTypes();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__ANNOTATIONS = eINSTANCE.getMember_Annotations();

		/**
		 * The meta object literal for the '<em><b>Annotate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__ANNOTATE = eINSTANCE.getMember_Annotate();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.ReferenceImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__TARGET = eINSTANCE.getReference_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.GenericTypeImpl <em>Generic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.GenericTypeImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getGenericType()
		 * @generated
		 */
		EClass GENERIC_TYPE = eINSTANCE.getGenericType();

		/**
		 * The meta object literal for the '<em><b>Type Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TYPE__TYPE_ARGUMENTS = eINSTANCE.getGenericType_TypeArguments();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TYPE__LOWER_BOUND = eINSTANCE.getGenericType_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TYPE__UPPER_BOUND = eINSTANCE.getGenericType_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Primitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_TYPE__PRIMITIVE = eINSTANCE.getGenericType_Primitive();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.AnnotationImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__ELEMENTS = eINSTANCE.getAnnotation_Elements();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.TypeParameterImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getTypeParameter()
		 * @generated
		 */
		EClass TYPE_PARAMETER = eINSTANCE.getTypeParameter();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_PARAMETER__BOUNDS = eINSTANCE.getTypeParameter_Bounds();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.TypedElementImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.MethodImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Overrides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__OVERRIDES = eINSTANCE.getMethod_Overrides();

		/**
		 * The meta object literal for the '<em><b>Overridden By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__OVERRIDDEN_BY = eINSTANCE.getMethod_OverriddenBy();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.CodeImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE__BODY = eINSTANCE.getCode_Body();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.InitializerImpl <em>Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.InitializerImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getInitializer()
		 * @generated
		 */
		EClass INITIALIZER = eINSTANCE.getInitializer();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.ClassInitializerImpl <em>Class Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.ClassInitializerImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getClassInitializer()
		 * @generated
		 */
		EClass CLASS_INITIALIZER = eINSTANCE.getClassInitializer();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.ParameterImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Var Arg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VAR_ARG = eINSTANCE.getParameter_VarArg();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MODIFIERS = eINSTANCE.getParameter_Modifiers();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.OperationImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Receiver Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RECEIVER_PARAMETER = eINSTANCE.getOperation_ReceiverParameter();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__EXCEPTIONS = eINSTANCE.getOperation_Exceptions();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__TYPE_PARAMETERS = eINSTANCE.getOperation_TypeParameters();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__SIGNATURE = eINSTANCE.getOperation_Signature();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.TypeImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__MEMBERS = eINSTANCE.getType_Members();

		/**
		 * The meta object literal for the '<em><b>Supertypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__SUPERTYPES = eINSTANCE.getType_Supertypes();

		/**
		 * The meta object literal for the '<em><b>Permits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__PERMITS = eINSTANCE.getType_Permits();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__TYPE_PARAMETERS = eINSTANCE.getType_TypeParameters();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.AnnotationInterfaceImpl <em>Annotation Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.AnnotationInterfaceImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getAnnotationInterface()
		 * @generated
		 */
		EClass ANNOTATION_INTERFACE = eINSTANCE.getAnnotationInterface();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.AnnotationInterfaceMemberImpl <em>Annotation Interface Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.AnnotationInterfaceMemberImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getAnnotationInterfaceMember()
		 * @generated
		 */
		EClass ANNOTATION_INTERFACE_MEMBER = eINSTANCE.getAnnotationInterfaceMember();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.CompilationUnitImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getCompilationUnit()
		 * @generated
		 */
		EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__TYPES = eINSTANCE.getCompilationUnit_Types();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_UNIT__PACKAGE_NAME = eINSTANCE.getCompilationUnit_PackageName();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_UNIT__IMPORTS = eINSTANCE.getCompilationUnit_Imports();

		/**
		 * The meta object literal for the '<em><b>Merge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPILATION_UNIT___MERGE__STRING_BIFUNCTION = eINSTANCE.getCompilationUnit__Merge__String_BiFunction();

		/**
		 * The meta object literal for the '<em><b>Merge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPILATION_UNIT___MERGE__BIFUNCTION = eINSTANCE.getCompilationUnit__Merge__BiFunction();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.CommentImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__COMMENT = eINSTANCE.getComment_Comment();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.java.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.java.impl.NamedElementImpl
		 * @see org.nasdanika.models.java.impl.JavaPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Fully Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__FULLY_QUALIFIED_NAME = eINSTANCE.getNamedElement_FullyQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Referrers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__REFERRERS = eINSTANCE.getNamedElement_Referrers();

	}

} //JavaPackage
