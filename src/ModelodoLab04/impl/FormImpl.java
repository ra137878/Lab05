/**
 */
package ModelodoLab04.impl;

import ModelodoLab04.Form;
import ModelodoLab04.ModelodoLab04Package;
import ModelodoLab04.Print;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ModelodoLab04.impl.FormImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link ModelodoLab04.impl.FormImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link ModelodoLab04.impl.FormImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link ModelodoLab04.impl.FormImpl#getDateBirth <em>Date Birth</em>}</li>
 *   <li>{@link ModelodoLab04.impl.FormImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link ModelodoLab04.impl.FormImpl#getCPF <em>CPF</em>}</li>
 *   <li>{@link ModelodoLab04.impl.FormImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link ModelodoLab04.impl.FormImpl#getAddress1 <em>Address1</em>}</li>
 *   <li>{@link ModelodoLab04.impl.FormImpl#getAddress2 <em>Address2</em>}</li>
 *   <li>{@link ModelodoLab04.impl.FormImpl#getCEP <em>CEP</em>}</li>
 *   <li>{@link ModelodoLab04.impl.FormImpl#getCity <em>City</em>}</li>
 *   <li>{@link ModelodoLab04.impl.FormImpl#getState <em>State</em>}</li>
 *   <li>{@link ModelodoLab04.impl.FormImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link ModelodoLab04.impl.FormImpl#getPrintedForm <em>Printed Form</em>}</li>
 *   <li>{@link ModelodoLab04.impl.FormImpl#getPrint <em>Print</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormImpl extends MinimalEObjectImpl.Container implements Form {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateBirth() <em>Date Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateBirth()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_BIRTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateBirth() <em>Date Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateBirth()
	 * @generated
	 * @ordered
	 */
	protected String dateBirth = DATE_BIRTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCPF() <em>CPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPF()
	 * @generated
	 * @ordered
	 */
	protected static final String CPF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCPF() <em>CPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPF()
	 * @generated
	 * @ordered
	 */
	protected String cpf = CPF_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected String phone = PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress1() <em>Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress1()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress1() <em>Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress1()
	 * @generated
	 * @ordered
	 */
	protected String address1 = ADDRESS1_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress2() <em>Address2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress2()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress2() <em>Address2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress2()
	 * @generated
	 * @ordered
	 */
	protected String address2 = ADDRESS2_EDEFAULT;

	/**
	 * The default value of the '{@link #getCEP() <em>CEP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCEP()
	 * @generated
	 * @ordered
	 */
	protected static final String CEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCEP() <em>CEP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCEP()
	 * @generated
	 * @ordered
	 */
	protected String cep = CEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrintedForm() <em>Printed Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintedForm()
	 * @generated
	 * @ordered
	 */
	protected Print printedForm;

	/**
	 * The cached value of the '{@link #getPrint() <em>Print</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrint()
	 * @generated
	 * @ordered
	 */
	protected Print print;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelodoLab04Package.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.FORM__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.FORM__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.FORM__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateBirth() {
		return dateBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateBirth(String newDateBirth) {
		String oldDateBirth = dateBirth;
		dateBirth = newDateBirth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.FORM__DATE_BIRTH, oldDateBirth, dateBirth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.FORM__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCPF() {
		return cpf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPF(String newCPF) {
		String oldCPF = cpf;
		cpf = newCPF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.FORM__CPF, oldCPF, cpf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(String newPhone) {
		String oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.FORM__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress1(String newAddress1) {
		String oldAddress1 = address1;
		address1 = newAddress1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.FORM__ADDRESS1, oldAddress1, address1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress2(String newAddress2) {
		String oldAddress2 = address2;
		address2 = newAddress2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.FORM__ADDRESS2, oldAddress2, address2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCEP() {
		return cep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCEP(String newCEP) {
		String oldCEP = cep;
		cep = newCEP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.FORM__CEP, oldCEP, cep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.FORM__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.FORM__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.FORM__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Print getPrintedForm() {
		if (printedForm != null && printedForm.eIsProxy()) {
			InternalEObject oldPrintedForm = (InternalEObject)printedForm;
			printedForm = (Print)eResolveProxy(oldPrintedForm);
			if (printedForm != oldPrintedForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodoLab04Package.FORM__PRINTED_FORM, oldPrintedForm, printedForm));
			}
		}
		return printedForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Print basicGetPrintedForm() {
		return printedForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintedForm(Print newPrintedForm) {
		Print oldPrintedForm = printedForm;
		printedForm = newPrintedForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.FORM__PRINTED_FORM, oldPrintedForm, printedForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Print getPrint() {
		if (print != null && print.eIsProxy()) {
			InternalEObject oldPrint = (InternalEObject)print;
			print = (Print)eResolveProxy(oldPrint);
			if (print != oldPrint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodoLab04Package.FORM__PRINT, oldPrint, print));
			}
		}
		return print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Print basicGetPrint() {
		return print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrint(Print newPrint) {
		Print oldPrint = print;
		print = newPrint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.FORM__PRINT, oldPrint, print));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Submit() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void CheckFields() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelodoLab04Package.FORM__TITLE:
				return getTitle();
			case ModelodoLab04Package.FORM__FIRST_NAME:
				return getFirstName();
			case ModelodoLab04Package.FORM__LAST_NAME:
				return getLastName();
			case ModelodoLab04Package.FORM__DATE_BIRTH:
				return getDateBirth();
			case ModelodoLab04Package.FORM__EMAIL:
				return getEmail();
			case ModelodoLab04Package.FORM__CPF:
				return getCPF();
			case ModelodoLab04Package.FORM__PHONE:
				return getPhone();
			case ModelodoLab04Package.FORM__ADDRESS1:
				return getAddress1();
			case ModelodoLab04Package.FORM__ADDRESS2:
				return getAddress2();
			case ModelodoLab04Package.FORM__CEP:
				return getCEP();
			case ModelodoLab04Package.FORM__CITY:
				return getCity();
			case ModelodoLab04Package.FORM__STATE:
				return getState();
			case ModelodoLab04Package.FORM__COUNTRY:
				return getCountry();
			case ModelodoLab04Package.FORM__PRINTED_FORM:
				if (resolve) return getPrintedForm();
				return basicGetPrintedForm();
			case ModelodoLab04Package.FORM__PRINT:
				if (resolve) return getPrint();
				return basicGetPrint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelodoLab04Package.FORM__TITLE:
				setTitle((String)newValue);
				return;
			case ModelodoLab04Package.FORM__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case ModelodoLab04Package.FORM__LAST_NAME:
				setLastName((String)newValue);
				return;
			case ModelodoLab04Package.FORM__DATE_BIRTH:
				setDateBirth((String)newValue);
				return;
			case ModelodoLab04Package.FORM__EMAIL:
				setEmail((String)newValue);
				return;
			case ModelodoLab04Package.FORM__CPF:
				setCPF((String)newValue);
				return;
			case ModelodoLab04Package.FORM__PHONE:
				setPhone((String)newValue);
				return;
			case ModelodoLab04Package.FORM__ADDRESS1:
				setAddress1((String)newValue);
				return;
			case ModelodoLab04Package.FORM__ADDRESS2:
				setAddress2((String)newValue);
				return;
			case ModelodoLab04Package.FORM__CEP:
				setCEP((String)newValue);
				return;
			case ModelodoLab04Package.FORM__CITY:
				setCity((String)newValue);
				return;
			case ModelodoLab04Package.FORM__STATE:
				setState((String)newValue);
				return;
			case ModelodoLab04Package.FORM__COUNTRY:
				setCountry((String)newValue);
				return;
			case ModelodoLab04Package.FORM__PRINTED_FORM:
				setPrintedForm((Print)newValue);
				return;
			case ModelodoLab04Package.FORM__PRINT:
				setPrint((Print)newValue);
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
			case ModelodoLab04Package.FORM__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ModelodoLab04Package.FORM__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case ModelodoLab04Package.FORM__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case ModelodoLab04Package.FORM__DATE_BIRTH:
				setDateBirth(DATE_BIRTH_EDEFAULT);
				return;
			case ModelodoLab04Package.FORM__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ModelodoLab04Package.FORM__CPF:
				setCPF(CPF_EDEFAULT);
				return;
			case ModelodoLab04Package.FORM__PHONE:
				setPhone(PHONE_EDEFAULT);
				return;
			case ModelodoLab04Package.FORM__ADDRESS1:
				setAddress1(ADDRESS1_EDEFAULT);
				return;
			case ModelodoLab04Package.FORM__ADDRESS2:
				setAddress2(ADDRESS2_EDEFAULT);
				return;
			case ModelodoLab04Package.FORM__CEP:
				setCEP(CEP_EDEFAULT);
				return;
			case ModelodoLab04Package.FORM__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case ModelodoLab04Package.FORM__STATE:
				setState(STATE_EDEFAULT);
				return;
			case ModelodoLab04Package.FORM__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case ModelodoLab04Package.FORM__PRINTED_FORM:
				setPrintedForm((Print)null);
				return;
			case ModelodoLab04Package.FORM__PRINT:
				setPrint((Print)null);
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
			case ModelodoLab04Package.FORM__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ModelodoLab04Package.FORM__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case ModelodoLab04Package.FORM__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case ModelodoLab04Package.FORM__DATE_BIRTH:
				return DATE_BIRTH_EDEFAULT == null ? dateBirth != null : !DATE_BIRTH_EDEFAULT.equals(dateBirth);
			case ModelodoLab04Package.FORM__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ModelodoLab04Package.FORM__CPF:
				return CPF_EDEFAULT == null ? cpf != null : !CPF_EDEFAULT.equals(cpf);
			case ModelodoLab04Package.FORM__PHONE:
				return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
			case ModelodoLab04Package.FORM__ADDRESS1:
				return ADDRESS1_EDEFAULT == null ? address1 != null : !ADDRESS1_EDEFAULT.equals(address1);
			case ModelodoLab04Package.FORM__ADDRESS2:
				return ADDRESS2_EDEFAULT == null ? address2 != null : !ADDRESS2_EDEFAULT.equals(address2);
			case ModelodoLab04Package.FORM__CEP:
				return CEP_EDEFAULT == null ? cep != null : !CEP_EDEFAULT.equals(cep);
			case ModelodoLab04Package.FORM__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case ModelodoLab04Package.FORM__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case ModelodoLab04Package.FORM__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case ModelodoLab04Package.FORM__PRINTED_FORM:
				return printedForm != null;
			case ModelodoLab04Package.FORM__PRINT:
				return print != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelodoLab04Package.FORM___SUBMIT:
				Submit();
				return null;
			case ModelodoLab04Package.FORM___CHECK_FIELDS:
				CheckFields();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Title: ");
		result.append(title);
		result.append(", FirstName: ");
		result.append(firstName);
		result.append(", LastName: ");
		result.append(lastName);
		result.append(", DateBirth: ");
		result.append(dateBirth);
		result.append(", Email: ");
		result.append(email);
		result.append(", CPF: ");
		result.append(cpf);
		result.append(", Phone: ");
		result.append(phone);
		result.append(", Address1: ");
		result.append(address1);
		result.append(", Address2: ");
		result.append(address2);
		result.append(", CEP: ");
		result.append(cep);
		result.append(", City: ");
		result.append(city);
		result.append(", State: ");
		result.append(state);
		result.append(", Country: ");
		result.append(country);
		result.append(')');
		return result.toString();
	}

} //FormImpl
