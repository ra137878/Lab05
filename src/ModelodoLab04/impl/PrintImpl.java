/**
 */
package ModelodoLab04.impl;

import ModelodoLab04.JLabel;
import ModelodoLab04.ModelodoLab04Package;
import ModelodoLab04.Print;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Print</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ModelodoLab04.impl.PrintImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link ModelodoLab04.impl.PrintImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link ModelodoLab04.impl.PrintImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link ModelodoLab04.impl.PrintImpl#getDateBirth <em>Date Birth</em>}</li>
 *   <li>{@link ModelodoLab04.impl.PrintImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link ModelodoLab04.impl.PrintImpl#getCPF <em>CPF</em>}</li>
 *   <li>{@link ModelodoLab04.impl.PrintImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link ModelodoLab04.impl.PrintImpl#getAddress1 <em>Address1</em>}</li>
 *   <li>{@link ModelodoLab04.impl.PrintImpl#getAddress2 <em>Address2</em>}</li>
 *   <li>{@link ModelodoLab04.impl.PrintImpl#getCEP <em>CEP</em>}</li>
 *   <li>{@link ModelodoLab04.impl.PrintImpl#getCity <em>City</em>}</li>
 *   <li>{@link ModelodoLab04.impl.PrintImpl#getState <em>State</em>}</li>
 *   <li>{@link ModelodoLab04.impl.PrintImpl#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrintImpl extends JLabelImpl implements Print {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected JLabel title;
	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected JLabel firstName;
	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected JLabel lastName;
	/**
	 * The cached value of the '{@link #getDateBirth() <em>Date Birth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateBirth()
	 * @generated
	 * @ordered
	 */
	protected JLabel dateBirth;
	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected JLabel email;
	/**
	 * The cached value of the '{@link #getCPF() <em>CPF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPF()
	 * @generated
	 * @ordered
	 */
	protected JLabel cpf;
	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected JLabel phone;
	/**
	 * The cached value of the '{@link #getAddress1() <em>Address1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress1()
	 * @generated
	 * @ordered
	 */
	protected JLabel address1;
	/**
	 * The cached value of the '{@link #getAddress2() <em>Address2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress2()
	 * @generated
	 * @ordered
	 */
	protected JLabel address2;
	/**
	 * The cached value of the '{@link #getCEP() <em>CEP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCEP()
	 * @generated
	 * @ordered
	 */
	protected JLabel cep;
	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected JLabel city;
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected JLabel state;
	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected JLabel country;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelodoLab04Package.Literals.PRINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel getTitle() {
		if (title != null && title.eIsProxy()) {
			InternalEObject oldTitle = (InternalEObject)title;
			title = (JLabel)eResolveProxy(oldTitle);
			if (title != oldTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodoLab04Package.PRINT__TITLE, oldTitle, title));
			}
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel basicGetTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(JLabel newTitle) {
		JLabel oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.PRINT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel getFirstName() {
		if (firstName != null && firstName.eIsProxy()) {
			InternalEObject oldFirstName = (InternalEObject)firstName;
			firstName = (JLabel)eResolveProxy(oldFirstName);
			if (firstName != oldFirstName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodoLab04Package.PRINT__FIRST_NAME, oldFirstName, firstName));
			}
		}
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel basicGetFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(JLabel newFirstName) {
		JLabel oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.PRINT__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel getLastName() {
		if (lastName != null && lastName.eIsProxy()) {
			InternalEObject oldLastName = (InternalEObject)lastName;
			lastName = (JLabel)eResolveProxy(oldLastName);
			if (lastName != oldLastName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodoLab04Package.PRINT__LAST_NAME, oldLastName, lastName));
			}
		}
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel basicGetLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(JLabel newLastName) {
		JLabel oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.PRINT__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel getDateBirth() {
		if (dateBirth != null && dateBirth.eIsProxy()) {
			InternalEObject oldDateBirth = (InternalEObject)dateBirth;
			dateBirth = (JLabel)eResolveProxy(oldDateBirth);
			if (dateBirth != oldDateBirth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodoLab04Package.PRINT__DATE_BIRTH, oldDateBirth, dateBirth));
			}
		}
		return dateBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel basicGetDateBirth() {
		return dateBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateBirth(JLabel newDateBirth) {
		JLabel oldDateBirth = dateBirth;
		dateBirth = newDateBirth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.PRINT__DATE_BIRTH, oldDateBirth, dateBirth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel getEmail() {
		if (email != null && email.eIsProxy()) {
			InternalEObject oldEmail = (InternalEObject)email;
			email = (JLabel)eResolveProxy(oldEmail);
			if (email != oldEmail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodoLab04Package.PRINT__EMAIL, oldEmail, email));
			}
		}
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel basicGetEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(JLabel newEmail) {
		JLabel oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.PRINT__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel getCPF() {
		if (cpf != null && cpf.eIsProxy()) {
			InternalEObject oldCPF = (InternalEObject)cpf;
			cpf = (JLabel)eResolveProxy(oldCPF);
			if (cpf != oldCPF) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodoLab04Package.PRINT__CPF, oldCPF, cpf));
			}
		}
		return cpf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel basicGetCPF() {
		return cpf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPF(JLabel newCPF) {
		JLabel oldCPF = cpf;
		cpf = newCPF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.PRINT__CPF, oldCPF, cpf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel getPhone() {
		if (phone != null && phone.eIsProxy()) {
			InternalEObject oldPhone = (InternalEObject)phone;
			phone = (JLabel)eResolveProxy(oldPhone);
			if (phone != oldPhone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodoLab04Package.PRINT__PHONE, oldPhone, phone));
			}
		}
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel basicGetPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(JLabel newPhone) {
		JLabel oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.PRINT__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel getAddress1() {
		if (address1 != null && address1.eIsProxy()) {
			InternalEObject oldAddress1 = (InternalEObject)address1;
			address1 = (JLabel)eResolveProxy(oldAddress1);
			if (address1 != oldAddress1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodoLab04Package.PRINT__ADDRESS1, oldAddress1, address1));
			}
		}
		return address1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel basicGetAddress1() {
		return address1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress1(JLabel newAddress1) {
		JLabel oldAddress1 = address1;
		address1 = newAddress1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.PRINT__ADDRESS1, oldAddress1, address1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel getAddress2() {
		if (address2 != null && address2.eIsProxy()) {
			InternalEObject oldAddress2 = (InternalEObject)address2;
			address2 = (JLabel)eResolveProxy(oldAddress2);
			if (address2 != oldAddress2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodoLab04Package.PRINT__ADDRESS2, oldAddress2, address2));
			}
		}
		return address2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel basicGetAddress2() {
		return address2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress2(JLabel newAddress2) {
		JLabel oldAddress2 = address2;
		address2 = newAddress2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.PRINT__ADDRESS2, oldAddress2, address2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel getCEP() {
		if (cep != null && cep.eIsProxy()) {
			InternalEObject oldCEP = (InternalEObject)cep;
			cep = (JLabel)eResolveProxy(oldCEP);
			if (cep != oldCEP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodoLab04Package.PRINT__CEP, oldCEP, cep));
			}
		}
		return cep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel basicGetCEP() {
		return cep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCEP(JLabel newCEP) {
		JLabel oldCEP = cep;
		cep = newCEP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.PRINT__CEP, oldCEP, cep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel getCity() {
		if (city != null && city.eIsProxy()) {
			InternalEObject oldCity = (InternalEObject)city;
			city = (JLabel)eResolveProxy(oldCity);
			if (city != oldCity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodoLab04Package.PRINT__CITY, oldCity, city));
			}
		}
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel basicGetCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(JLabel newCity) {
		JLabel oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.PRINT__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject)state;
			state = (JLabel)eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodoLab04Package.PRINT__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(JLabel newState) {
		JLabel oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.PRINT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel getCountry() {
		if (country != null && country.eIsProxy()) {
			InternalEObject oldCountry = (InternalEObject)country;
			country = (JLabel)eResolveProxy(oldCountry);
			if (country != oldCountry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodoLab04Package.PRINT__COUNTRY, oldCountry, country));
			}
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JLabel basicGetCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(JLabel newCountry) {
		JLabel oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.PRINT__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void PrintForm() {
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
			case ModelodoLab04Package.PRINT__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case ModelodoLab04Package.PRINT__FIRST_NAME:
				if (resolve) return getFirstName();
				return basicGetFirstName();
			case ModelodoLab04Package.PRINT__LAST_NAME:
				if (resolve) return getLastName();
				return basicGetLastName();
			case ModelodoLab04Package.PRINT__DATE_BIRTH:
				if (resolve) return getDateBirth();
				return basicGetDateBirth();
			case ModelodoLab04Package.PRINT__EMAIL:
				if (resolve) return getEmail();
				return basicGetEmail();
			case ModelodoLab04Package.PRINT__CPF:
				if (resolve) return getCPF();
				return basicGetCPF();
			case ModelodoLab04Package.PRINT__PHONE:
				if (resolve) return getPhone();
				return basicGetPhone();
			case ModelodoLab04Package.PRINT__ADDRESS1:
				if (resolve) return getAddress1();
				return basicGetAddress1();
			case ModelodoLab04Package.PRINT__ADDRESS2:
				if (resolve) return getAddress2();
				return basicGetAddress2();
			case ModelodoLab04Package.PRINT__CEP:
				if (resolve) return getCEP();
				return basicGetCEP();
			case ModelodoLab04Package.PRINT__CITY:
				if (resolve) return getCity();
				return basicGetCity();
			case ModelodoLab04Package.PRINT__STATE:
				if (resolve) return getState();
				return basicGetState();
			case ModelodoLab04Package.PRINT__COUNTRY:
				if (resolve) return getCountry();
				return basicGetCountry();
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
			case ModelodoLab04Package.PRINT__TITLE:
				setTitle((JLabel)newValue);
				return;
			case ModelodoLab04Package.PRINT__FIRST_NAME:
				setFirstName((JLabel)newValue);
				return;
			case ModelodoLab04Package.PRINT__LAST_NAME:
				setLastName((JLabel)newValue);
				return;
			case ModelodoLab04Package.PRINT__DATE_BIRTH:
				setDateBirth((JLabel)newValue);
				return;
			case ModelodoLab04Package.PRINT__EMAIL:
				setEmail((JLabel)newValue);
				return;
			case ModelodoLab04Package.PRINT__CPF:
				setCPF((JLabel)newValue);
				return;
			case ModelodoLab04Package.PRINT__PHONE:
				setPhone((JLabel)newValue);
				return;
			case ModelodoLab04Package.PRINT__ADDRESS1:
				setAddress1((JLabel)newValue);
				return;
			case ModelodoLab04Package.PRINT__ADDRESS2:
				setAddress2((JLabel)newValue);
				return;
			case ModelodoLab04Package.PRINT__CEP:
				setCEP((JLabel)newValue);
				return;
			case ModelodoLab04Package.PRINT__CITY:
				setCity((JLabel)newValue);
				return;
			case ModelodoLab04Package.PRINT__STATE:
				setState((JLabel)newValue);
				return;
			case ModelodoLab04Package.PRINT__COUNTRY:
				setCountry((JLabel)newValue);
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
			case ModelodoLab04Package.PRINT__TITLE:
				setTitle((JLabel)null);
				return;
			case ModelodoLab04Package.PRINT__FIRST_NAME:
				setFirstName((JLabel)null);
				return;
			case ModelodoLab04Package.PRINT__LAST_NAME:
				setLastName((JLabel)null);
				return;
			case ModelodoLab04Package.PRINT__DATE_BIRTH:
				setDateBirth((JLabel)null);
				return;
			case ModelodoLab04Package.PRINT__EMAIL:
				setEmail((JLabel)null);
				return;
			case ModelodoLab04Package.PRINT__CPF:
				setCPF((JLabel)null);
				return;
			case ModelodoLab04Package.PRINT__PHONE:
				setPhone((JLabel)null);
				return;
			case ModelodoLab04Package.PRINT__ADDRESS1:
				setAddress1((JLabel)null);
				return;
			case ModelodoLab04Package.PRINT__ADDRESS2:
				setAddress2((JLabel)null);
				return;
			case ModelodoLab04Package.PRINT__CEP:
				setCEP((JLabel)null);
				return;
			case ModelodoLab04Package.PRINT__CITY:
				setCity((JLabel)null);
				return;
			case ModelodoLab04Package.PRINT__STATE:
				setState((JLabel)null);
				return;
			case ModelodoLab04Package.PRINT__COUNTRY:
				setCountry((JLabel)null);
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
			case ModelodoLab04Package.PRINT__TITLE:
				return title != null;
			case ModelodoLab04Package.PRINT__FIRST_NAME:
				return firstName != null;
			case ModelodoLab04Package.PRINT__LAST_NAME:
				return lastName != null;
			case ModelodoLab04Package.PRINT__DATE_BIRTH:
				return dateBirth != null;
			case ModelodoLab04Package.PRINT__EMAIL:
				return email != null;
			case ModelodoLab04Package.PRINT__CPF:
				return cpf != null;
			case ModelodoLab04Package.PRINT__PHONE:
				return phone != null;
			case ModelodoLab04Package.PRINT__ADDRESS1:
				return address1 != null;
			case ModelodoLab04Package.PRINT__ADDRESS2:
				return address2 != null;
			case ModelodoLab04Package.PRINT__CEP:
				return cep != null;
			case ModelodoLab04Package.PRINT__CITY:
				return city != null;
			case ModelodoLab04Package.PRINT__STATE:
				return state != null;
			case ModelodoLab04Package.PRINT__COUNTRY:
				return country != null;
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
			case ModelodoLab04Package.PRINT___PRINT_FORM:
				PrintForm();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PrintImpl
