/**
 */
package Modelodabiblioteca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bibliotecária</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modelodabiblioteca.Bibliotecária#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link Modelodabiblioteca.Bibliotecária#getTerminalBibliotecária <em>Terminal Bibliotecária</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getBibliotecária()
 * @model
 * @generated
 */
public interface Bibliotecária extends Funcionário {
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
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getBibliotecária_Terminal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Bibliotecária#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

	/**
	 * Returns the value of the '<em><b>Terminal Bibliotecária</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal Bibliotecária</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal Bibliotecária</em>' reference.
	 * @see #setTerminalBibliotecária(Terminal)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getBibliotecária_TerminalBibliotecária()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Terminal getTerminalBibliotecária();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Bibliotecária#getTerminalBibliotecária <em>Terminal Bibliotecária</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal Bibliotecária</em>' reference.
	 * @see #getTerminalBibliotecária()
	 * @generated
	 */
	void setTerminalBibliotecária(Terminal value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void IncluirExemplar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ExcluirExemplar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void AtualizarExemplar();

} // Bibliotecária
