/**
 */
package ModelodoLab04.impl;

import ModelodoLab04.Form;
import ModelodoLab04.ModelodoLab04Package;
import ModelodoLab04.User;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ModelodoLab04.impl.UserImpl#getForm <em>Form</em>}</li>
 *   <li>{@link ModelodoLab04.impl.UserImpl#getNewForm <em>New Form</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected Form form;

	/**
	 * The cached value of the '{@link #getNewForm() <em>New Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewForm()
	 * @generated
	 * @ordered
	 */
	protected Form newForm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelodoLab04Package.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form getForm() {
		if (form != null && form.eIsProxy()) {
			InternalEObject oldForm = (InternalEObject)form;
			form = (Form)eResolveProxy(oldForm);
			if (form != oldForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodoLab04Package.USER__FORM, oldForm, form));
			}
		}
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form basicGetForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(Form newForm) {
		Form oldForm = form;
		form = newForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.USER__FORM, oldForm, form));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form getNewForm() {
		if (newForm != null && newForm.eIsProxy()) {
			InternalEObject oldNewForm = (InternalEObject)newForm;
			newForm = (Form)eResolveProxy(oldNewForm);
			if (newForm != oldNewForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodoLab04Package.USER__NEW_FORM, oldNewForm, newForm));
			}
		}
		return newForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form basicGetNewForm() {
		return newForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewForm(Form newNewForm) {
		Form oldNewForm = newForm;
		newForm = newNewForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodoLab04Package.USER__NEW_FORM, oldNewForm, newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelodoLab04Package.USER__FORM:
				if (resolve) return getForm();
				return basicGetForm();
			case ModelodoLab04Package.USER__NEW_FORM:
				if (resolve) return getNewForm();
				return basicGetNewForm();
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
			case ModelodoLab04Package.USER__FORM:
				setForm((Form)newValue);
				return;
			case ModelodoLab04Package.USER__NEW_FORM:
				setNewForm((Form)newValue);
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
			case ModelodoLab04Package.USER__FORM:
				setForm((Form)null);
				return;
			case ModelodoLab04Package.USER__NEW_FORM:
				setNewForm((Form)null);
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
			case ModelodoLab04Package.USER__FORM:
				return form != null;
			case ModelodoLab04Package.USER__NEW_FORM:
				return newForm != null;
		}
		return super.eIsSet(featureID);
	}

} //UserImpl
