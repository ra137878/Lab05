/**
 */
package Modelodabiblioteca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bibliotec�ria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modelodabiblioteca.Bibliotec�ria#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link Modelodabiblioteca.Bibliotec�ria#getTerminalBibliotec�ria <em>Terminal Bibliotec�ria</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getBibliotec�ria()
 * @model
 * @generated
 */
public interface Bibliotec�ria extends Funcion�rio {
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
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getBibliotec�ria_Terminal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Bibliotec�ria#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

	/**
	 * Returns the value of the '<em><b>Terminal Bibliotec�ria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal Bibliotec�ria</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal Bibliotec�ria</em>' reference.
	 * @see #setTerminalBibliotec�ria(Terminal)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getBibliotec�ria_TerminalBibliotec�ria()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Terminal getTerminalBibliotec�ria();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Bibliotec�ria#getTerminalBibliotec�ria <em>Terminal Bibliotec�ria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal Bibliotec�ria</em>' reference.
	 * @see #getTerminalBibliotec�ria()
	 * @generated
	 */
	void setTerminalBibliotec�ria(Terminal value);

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

} // Bibliotec�ria
