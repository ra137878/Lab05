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
	 * The meta object id for the '{@link ModelodoLab04.impl.PrintImpl <em>Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModelodoLab04.impl.PrintImpl
	 * @see ModelodoLab04.impl.ModelodoLab04PackageImpl#getPrint()
	 * @generated
	 */
	int PRINT = 1;

	/**
	 * The number of structural features of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Print</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT___PRINT = 0;

	/**
	 * The number of operations of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ModelodoLab04.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModelodoLab04.impl.UserImpl
	 * @see ModelodoLab04.impl.ModelodoLab04PackageImpl#getUser()
	 * @generated
	 */
	int USER = 2;

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
	 * Returns the meta object for the '{@link ModelodoLab04.Form#checkFields() <em>Check Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Fields</em>' operation.
	 * @see ModelodoLab04.Form#checkFields()
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
	 * Returns the meta object for the '{@link ModelodoLab04.Print#Print() <em>Print</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print</em>' operation.
	 * @see ModelodoLab04.Print#Print()
	 * @generated
	 */
	EOperation getPrint__Print();

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
		 * The meta object literal for the '<em><b>Print</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRINT___PRINT = eINSTANCE.getPrint__Print();

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
