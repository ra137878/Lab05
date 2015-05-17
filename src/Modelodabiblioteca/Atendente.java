/**
 */
package Modelodabiblioteca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atendente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modelodabiblioteca.Atendente#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link Modelodabiblioteca.Atendente#getTerminalAtendente <em>Terminal Atendente</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getAtendente()
 * @model
 * @generated
 */
public interface Atendente extends Funcionário {
	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getAtendente_Terminal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Atendente#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

	/**
	 * Returns the value of the '<em><b>Terminal Atendente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal Atendente</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal Atendente</em>' reference.
	 * @see #setTerminalAtendente(Terminal)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getAtendente_TerminalAtendente()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Terminal getTerminalAtendente();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Atendente#getTerminalAtendente <em>Terminal Atendente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal Atendente</em>' reference.
	 * @see #getTerminalAtendente()
	 * @generated
	 */
	void setTerminalAtendente(Terminal value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void RealizarEmprestimo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void DesfazerEmprestimo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ConferirUsuario();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void CadastrarUsuario();

} // Atendente
