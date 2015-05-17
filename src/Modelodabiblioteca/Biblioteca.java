/**
 */
package Modelodabiblioteca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biblioteca</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modelodabiblioteca.Biblioteca#getTerminalBiblioteca <em>Terminal Biblioteca</em>}</li>
 *   <li>{@link Modelodabiblioteca.Biblioteca#getSistEmprestimoBiblioteca <em>Sist Emprestimo Biblioteca</em>}</li>
 *   <li>{@link Modelodabiblioteca.Biblioteca#getSistCadastroBiblioteca <em>Sist Cadastro Biblioteca</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getBiblioteca()
 * @model
 * @generated
 */
public interface Biblioteca extends EObject {

	/**
	 * Returns the value of the '<em><b>Terminal Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal Biblioteca</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal Biblioteca</em>' reference.
	 * @see #setTerminalBiblioteca(Terminal)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getBiblioteca_TerminalBiblioteca()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Terminal getTerminalBiblioteca();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Biblioteca#getTerminalBiblioteca <em>Terminal Biblioteca</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal Biblioteca</em>' reference.
	 * @see #getTerminalBiblioteca()
	 * @generated
	 */
	void setTerminalBiblioteca(Terminal value);

	/**
	 * Returns the value of the '<em><b>Sist Emprestimo Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sist Emprestimo Biblioteca</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sist Emprestimo Biblioteca</em>' reference.
	 * @see #setSistEmprestimoBiblioteca(SistemaEmpréstimo)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getBiblioteca_SistEmprestimoBiblioteca()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SistemaEmpréstimo getSistEmprestimoBiblioteca();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Biblioteca#getSistEmprestimoBiblioteca <em>Sist Emprestimo Biblioteca</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sist Emprestimo Biblioteca</em>' reference.
	 * @see #getSistEmprestimoBiblioteca()
	 * @generated
	 */
	void setSistEmprestimoBiblioteca(SistemaEmpréstimo value);

	/**
	 * Returns the value of the '<em><b>Sist Cadastro Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sist Cadastro Biblioteca</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sist Cadastro Biblioteca</em>' reference.
	 * @see #setSistCadastroBiblioteca(SistemaCadastro)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getBiblioteca_SistCadastroBiblioteca()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SistemaCadastro getSistCadastroBiblioteca();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Biblioteca#getSistCadastroBiblioteca <em>Sist Cadastro Biblioteca</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sist Cadastro Biblioteca</em>' reference.
	 * @see #getSistCadastroBiblioteca()
	 * @generated
	 */
	void setSistCadastroBiblioteca(SistemaCadastro value);
} // Biblioteca
