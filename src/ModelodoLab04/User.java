/**
 */
package ModelodoLab04;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModelodoLab04.User#getForm <em>Form</em>}</li>
 *   <li>{@link ModelodoLab04.User#getNewForm <em>New Form</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModelodoLab04.ModelodoLab04Package#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' reference.
	 * @see #setForm(Form)
	 * @see ModelodoLab04.ModelodoLab04Package#getUser_Form()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Form getForm();

	/**
	 * Sets the value of the '{@link ModelodoLab04.User#getForm <em>Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(Form value);

	/**
	 * Returns the value of the '<em><b>New Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Form</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Form</em>' reference.
	 * @see #setNewForm(Form)
	 * @see ModelodoLab04.ModelodoLab04Package#getUser_NewForm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Form getNewForm();

	/**
	 * Sets the value of the '{@link ModelodoLab04.User#getNewForm <em>New Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Form</em>' reference.
	 * @see #getNewForm()
	 * @generated
	 */
	void setNewForm(Form value);

} // User
