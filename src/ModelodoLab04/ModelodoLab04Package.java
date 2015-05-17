/**
 */
package ModelodoLab04;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see ModelodoLab04.ModelodoLab04Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Modelo do Lab04'"
 * @generated
 */
public interface ModelodoLab04Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ModelodoLab04";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ModelodoLab04.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ModelodoLab04";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelodoLab04Package eINSTANCE = ModelodoLab04.impl.ModelodoLab04PackageImpl.init();

	/**
	 * The meta object id for the '{@link ModelodoLab04.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModelodoLab04.impl.FormImpl
	 * @see ModelodoLab04.impl.ModelodoLab04PackageImpl#getForm()
	 * @generated
	 */
	int FORM = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__TITLE = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Date Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__DATE_BIRTH = 3;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__EMAIL = 4;

	/**
	 * The feature id for the '<em><b>CPF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CPF = 5;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__PHONE = 6;

	/**
	 * The feature id for the '<em><b>Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ADDRESS1 = 7;

	/**
	 * The feature id for the '<em><b>Address2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ADDRESS2 = 8;

	/**
	 * The feature id for the '<em><b>CEP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CEP = 9;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CITY = 10;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__STATE = 11;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__COUNTRY = 12;

	/**
	 * The feature id for the '<em><b>Printed Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__PRINTED_FORM = 13;

	/**
	 * The feature id for the '<em><b>Print</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__PRINT = 14;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 15;

	/**
	 * The operation id for the '<em>Submit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___SUBMIT = 0;

	/**
	 * The operation id for the '<em>Check Fields</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___CHECK_FIELDS = 1;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ModelodoLab04.impl.JLabelImpl <em>JLabel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModelodoLab04.impl.JLabelImpl
	 * @see ModelodoLab04.impl.ModelodoLab04PackageImpl#getJLabel()
	 * @generated
	 */
	int JLABEL = 2;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLABEL__FONT = 0;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLABEL__BOUNDS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLABEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>JLabel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLABEL_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Set Font</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLABEL___SET_FONT = 0;

	/**
	 * The operation id for the '<em>Set Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLABEL___SET_BOUNDS = 1;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLABEL___SET_NAME = 2;

	/**
	 * The number of operations of the '<em>JLabel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JLABEL_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ModelodoLab04.impl.PrintImpl <em>Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModelodoLab04.impl.PrintImpl
	 * @see ModelodoLab04.impl.ModelodoLab04PackageImpl#getPrint()
	 * @generated
	 */
	int PRINT = 1;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__FONT = JLABEL__FONT;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__BOUNDS = JLABEL__BOUNDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__NAME = JLABEL__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__TITLE = JLABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__FIRST_NAME = JLABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__LAST_NAME = JLABEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Date Birth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__DATE_BIRTH = JLABEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Email</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__EMAIL = JLABEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CPF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__CPF = JLABEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__PHONE = JLABEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Address1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__ADDRESS1 = JLABEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Address2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__ADDRESS2 = JLABEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>CEP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__CEP = JLABEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__CITY = JLABEL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__STATE = JLABEL_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__COUNTRY = JLABEL_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_FEATURE_COUNT = JLABEL_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Set Font</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT___SET_FONT = JLABEL___SET_FONT;

	/**
	 * The operation id for the '<em>Set Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT___SET_BOUNDS = JLABEL___SET_BOUNDS;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT___SET_NAME = JLABEL___SET_NAME;

	/**
	 * The operation id for the '<em>Print Form</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT___PRINT_FORM = JLABEL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_OPERATION_COUNT = JLABEL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ModelodoLab04.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModelodoLab04.impl.UserImpl
	 * @see ModelodoLab04.impl.ModelodoLab04PackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The feature id for the '<em><b>Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FORM = 0;

	/**
	 * The feature id for the '<em><b>New Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NEW_FORM = 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ModelodoLab04.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see ModelodoLab04.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the attribute '{@link ModelodoLab04.Form#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see ModelodoLab04.Form#getTitle()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Title();

	/**
	 * Returns the meta object for the attribute '{@link ModelodoLab04.Form#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see ModelodoLab04.Form#getFirstName()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link ModelodoLab04.Form#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see ModelodoLab04.Form#getLastName()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_LastName();

	/**
	 * Returns the meta object for the attribute '{@link ModelodoLab04.Form#getDateBirth <em>Date Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Birth</em>'.
	 * @see ModelodoLab04.Form#getDateBirth()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_DateBirth();

	/**
	 * Returns the meta object for the attribute '{@link ModelodoLab04.Form#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see ModelodoLab04.Form#getEmail()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Email();

	/**
	 * Returns the meta object for the attribute '{@link ModelodoLab04.Form#getCPF <em>CPF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CPF</em>'.
	 * @see ModelodoLab04.Form#getCPF()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_CPF();

	/**
	 * Returns the meta object for the attribute '{@link ModelodoLab04.Form#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see ModelodoLab04.Form#getPhone()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Phone();

	/**
	 * Returns the meta object for the attribute '{@link ModelodoLab04.Form#getAddress1 <em>Address1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address1</em>'.
	 * @see ModelodoLab04.Form#getAddress1()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Address1();

	/**
	 * Returns the meta object for the attribute '{@link ModelodoLab04.Form#getAddress2 <em>Address2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address2</em>'.
	 * @see ModelodoLab04.Form#getAddress2()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Address2();

	/**
	 * Returns the meta object for the attribute '{@link ModelodoLab04.Form#getCEP <em>CEP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CEP</em>'.
	 * @see ModelodoLab04.Form#getCEP()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_CEP();

	/**
	 * Returns the meta object for the attribute '{@link ModelodoLab04.Form#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see ModelodoLab04.Form#getCity()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_City();

	/**
	 * Returns the meta object for the attribute '{@link ModelodoLab04.Form#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see ModelodoLab04.Form#getState()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_State();

	/**
	 * Returns the meta object for the attribute '{@link ModelodoLab04.Form#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see ModelodoLab04.Form#getCountry()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Country();

	/**
	 * Returns the meta object for the reference '{@link ModelodoLab04.Form#getPrintedForm <em>Printed Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Printed Form</em>'.
	 * @see ModelodoLab04.Form#getPrintedForm()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_PrintedForm();

	/**
	 * Returns the meta object for the reference '{@link ModelodoLab04.Form#getPrint <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Print</em>'.
	 * @see ModelodoLab04.Form#getPrint()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Print();

	/**
	 * Returns the meta object for the '{@link ModelodoLab04.Form#Submit() <em>Submit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Submit</em>' operation.
	 * @see ModelodoLab04.Form#Submit()
	 * @generated
	 */
	EOperation getForm__Submit();

	/**
	 * Returns the meta object for the '{@link ModelodoLab04.Form#CheckFields() <em>Check Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Fields</em>' operation.
	 * @see ModelodoLab04.Form#CheckFields()
	 * @generated
	 */
	EOperation getForm__CheckFields();

	/**
	 * Returns the meta object for class '{@link ModelodoLab04.Print <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print</em>'.
	 * @see ModelodoLab04.Print
	 * @generated
	 */
	EClass getPrint();

	/**
	 * Returns the meta object for the reference '{@link ModelodoLab04.Print#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Title</em>'.
	 * @see ModelodoLab04.Print#getTitle()
	 * @see #getPrint()
	 * @generated
	 */
	EReference getPrint_Title();

	/**
	 * Returns the meta object for the reference '{@link ModelodoLab04.Print#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Name</em>'.
	 * @see ModelodoLab04.Print#getFirstName()
	 * @see #getPrint()
	 * @generated
	 */
	EReference getPrint_FirstName();

	/**
	 * Returns the meta object for the reference '{@link ModelodoLab04.Print#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Name</em>'.
	 * @see ModelodoLab04.Print#getLastName()
	 * @see #getPrint()
	 * @generated
	 */
	EReference getPrint_LastName();

	/**
	 * Returns the meta object for the reference '{@link ModelodoLab04.Print#getDateBirth <em>Date Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Date Birth</em>'.
	 * @see ModelodoLab04.Print#getDateBirth()
	 * @see #getPrint()
	 * @generated
	 */
	EReference getPrint_DateBirth();

	/**
	 * Returns the meta object for the reference '{@link ModelodoLab04.Print#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Email</em>'.
	 * @see ModelodoLab04.Print#getEmail()
	 * @see #getPrint()
	 * @generated
	 */
	EReference getPrint_Email();

	/**
	 * Returns the meta object for the reference '{@link ModelodoLab04.Print#getCPF <em>CPF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CPF</em>'.
	 * @see ModelodoLab04.Print#getCPF()
	 * @see #getPrint()
	 * @generated
	 */
	EReference getPrint_CPF();

	/**
	 * Returns the meta object for the reference '{@link ModelodoLab04.Print#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phone</em>'.
	 * @see ModelodoLab04.Print#getPhone()
	 * @see #getPrint()
	 * @generated
	 */
	EReference getPrint_Phone();

	/**
	 * Returns the meta object for the reference '{@link ModelodoLab04.Print#getAddress1 <em>Address1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address1</em>'.
	 * @see ModelodoLab04.Print#getAddress1()
	 * @see #getPrint()
	 * @generated
	 */
	EReference getPrint_Address1();

	/**
	 * Returns the meta object for the reference '{@link ModelodoLab04.Print#getAddress2 <em>Address2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address2</em>'.
	 * @see ModelodoLab04.Print#getAddress2()
	 * @see #getPrint()
	 * @generated
	 */
	EReference getPrint_Address2();

	/**
	 * Returns the meta object for the reference '{@link ModelodoLab04.Print#getCEP <em>CEP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CEP</em>'.
	 * @see ModelodoLab04.Print#getCEP()
	 * @see #getPrint()
	 * @generated
	 */
	EReference getPrint_CEP();

	/**
	 * Returns the meta object for the reference '{@link ModelodoLab04.Print#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>City</em>'.
	 * @see ModelodoLab04.Print#getCity()
	 * @see #getPrint()
	 * @generated
	 */
	EReference getPrint_City();

	/**
	 * Returns the meta object for the reference '{@link ModelodoLab04.Print#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see ModelodoLab04.Print#getState()
	 * @see #getPrint()
	 * @generated
	 */
	EReference getPrint_State();

	/**
	 * Returns the meta object for the reference '{@link ModelodoLab04.Print#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see ModelodoLab04.Print#getCountry()
	 * @see #getPrint()
	 * @generated
	 */
	EReference getPrint_Country();

	/**
	 * Returns the meta object for the '{@link ModelodoLab04.Print#PrintForm() <em>Print Form</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print Form</em>' operation.
	 * @see ModelodoLab04.Print#PrintForm()
	 * @generated
	 */
	EOperation getPrint__PrintForm();

	/**
	 * Returns the meta object for class '{@link ModelodoLab04.JLabel <em>JLabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JLabel</em>'.
	 * @see ModelodoLab04.JLabel
	 * @generated
	 */
	EClass getJLabel();

	/**
	 * Returns the meta object for the attribute '{@link ModelodoLab04.JLabel#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see ModelodoLab04.JLabel#getFont()
	 * @see #getJLabel()
	 * @generated
	 */
	EAttribute getJLabel_Font();

	/**
	 * Returns the meta object for the attribute '{@link ModelodoLab04.JLabel#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bounds</em>'.
	 * @see ModelodoLab04.JLabel#getBounds()
	 * @see #getJLabel()
	 * @generated
	 */
	EAttribute getJLabel_Bounds();

	/**
	 * Returns the meta object for the attribute '{@link ModelodoLab04.JLabel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ModelodoLab04.JLabel#getName()
	 * @see #getJLabel()
	 * @generated
	 */
	EAttribute getJLabel_Name();

	/**
	 * Returns the meta object for the '{@link ModelodoLab04.JLabel#setFont() <em>Set Font</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Font</em>' operation.
	 * @see ModelodoLab04.JLabel#setFont()
	 * @generated
	 */
	EOperation getJLabel__SetFont();

	/**
	 * Returns the meta object for the '{@link ModelodoLab04.JLabel#setBounds() <em>Set Bounds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Bounds</em>' operation.
	 * @see ModelodoLab04.JLabel#setBounds()
	 * @generated
	 */
	EOperation getJLabel__SetBounds();

	/**
	 * Returns the meta object for the '{@link ModelodoLab04.JLabel#setName() <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see ModelodoLab04.JLabel#setName()
	 * @generated
	 */
	EOperation getJLabel__SetName();

	/**
	 * Returns the meta object for class '{@link ModelodoLab04.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see ModelodoLab04.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference '{@link ModelodoLab04.User#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Form</em>'.
	 * @see ModelodoLab04.User#getForm()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Form();

	/**
	 * Returns the meta object for the reference '{@link ModelodoLab04.User#getNewForm <em>New Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Form</em>'.
	 * @see ModelodoLab04.User#getNewForm()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_NewForm();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelodoLab04Factory getModelodoLab04Factory();

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
		 * The meta object literal for the '{@link ModelodoLab04.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModelodoLab04.impl.FormImpl
		 * @see ModelodoLab04.impl.ModelodoLab04PackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__TITLE = eINSTANCE.getForm_Title();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__FIRST_NAME = eINSTANCE.getForm_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__LAST_NAME = eINSTANCE.getForm_LastName();

		/**
		 * The meta object literal for the '<em><b>Date Birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__DATE_BIRTH = eINSTANCE.getForm_DateBirth();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__EMAIL = eINSTANCE.getForm_Email();

		/**
		 * The meta object literal for the '<em><b>CPF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__CPF = eINSTANCE.getForm_CPF();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__PHONE = eINSTANCE.getForm_Phone();

		/**
		 * The meta object literal for the '<em><b>Address1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__ADDRESS1 = eINSTANCE.getForm_Address1();

		/**
		 * The meta object literal for the '<em><b>Address2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__ADDRESS2 = eINSTANCE.getForm_Address2();

		/**
		 * The meta object literal for the '<em><b>CEP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__CEP = eINSTANCE.getForm_CEP();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__CITY = eINSTANCE.getForm_City();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__STATE = eINSTANCE.getForm_State();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__COUNTRY = eINSTANCE.getForm_Country();

		/**
		 * The meta object literal for the '<em><b>Printed Form</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__PRINTED_FORM = eINSTANCE.getForm_PrintedForm();

		/**
		 * The meta object literal for the '<em><b>Print</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__PRINT = eINSTANCE.getForm_Print();

		/**
		 * The meta object literal for the '<em><b>Submit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORM___SUBMIT = eINSTANCE.getForm__Submit();

		/**
		 * The meta object literal for the '<em><b>Check Fields</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORM___CHECK_FIELDS = eINSTANCE.getForm__CheckFields();

		/**
		 * The meta object literal for the '{@link ModelodoLab04.impl.PrintImpl <em>Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModelodoLab04.impl.PrintImpl
		 * @see ModelodoLab04.impl.ModelodoLab04PackageImpl#getPrint()
		 * @generated
		 */
		EClass PRINT = eINSTANCE.getPrint();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT__TITLE = eINSTANCE.getPrint_Title();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT__FIRST_NAME = eINSTANCE.getPrint_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT__LAST_NAME = eINSTANCE.getPrint_LastName();

		/**
		 * The meta object literal for the '<em><b>Date Birth</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT__DATE_BIRTH = eINSTANCE.getPrint_DateBirth();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT__EMAIL = eINSTANCE.getPrint_Email();

		/**
		 * The meta object literal for the '<em><b>CPF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT__CPF = eINSTANCE.getPrint_CPF();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT__PHONE = eINSTANCE.getPrint_Phone();

		/**
		 * The meta object literal for the '<em><b>Address1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT__ADDRESS1 = eINSTANCE.getPrint_Address1();

		/**
		 * The meta object literal for the '<em><b>Address2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT__ADDRESS2 = eINSTANCE.getPrint_Address2();

		/**
		 * The meta object literal for the '<em><b>CEP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT__CEP = eINSTANCE.getPrint_CEP();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT__CITY = eINSTANCE.getPrint_City();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT__STATE = eINSTANCE.getPrint_State();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT__COUNTRY = eINSTANCE.getPrint_Country();

		/**
		 * The meta object literal for the '<em><b>Print Form</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRINT___PRINT_FORM = eINSTANCE.getPrint__PrintForm();

		/**
		 * The meta object literal for the '{@link ModelodoLab04.impl.JLabelImpl <em>JLabel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModelodoLab04.impl.JLabelImpl
		 * @see ModelodoLab04.impl.ModelodoLab04PackageImpl#getJLabel()
		 * @generated
		 */
		EClass JLABEL = eINSTANCE.getJLabel();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JLABEL__FONT = eINSTANCE.getJLabel_Font();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JLABEL__BOUNDS = eINSTANCE.getJLabel_Bounds();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JLABEL__NAME = eINSTANCE.getJLabel_Name();

		/**
		 * The meta object literal for the '<em><b>Set Font</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JLABEL___SET_FONT = eINSTANCE.getJLabel__SetFont();

		/**
		 * The meta object literal for the '<em><b>Set Bounds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JLABEL___SET_BOUNDS = eINSTANCE.getJLabel__SetBounds();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JLABEL___SET_NAME = eINSTANCE.getJLabel__SetName();

		/**
		 * The meta object literal for the '{@link ModelodoLab04.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModelodoLab04.impl.UserImpl
		 * @see ModelodoLab04.impl.ModelodoLab04PackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__FORM = eINSTANCE.getUser_Form();

		/**
		 * The meta object literal for the '<em><b>New Form</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__NEW_FORM = eINSTANCE.getUser_NewForm();

	}

} //ModelodoLab04Package
