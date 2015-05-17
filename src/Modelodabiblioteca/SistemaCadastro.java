/**
 */
package Modelodabiblioteca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sistema Cadastro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modelodabiblioteca.SistemaCadastro#getListaUsu�rios <em>Lista Usu�rios</em>}</li>
 *   <li>{@link Modelodabiblioteca.SistemaCadastro#getUsu�rio <em>Usu�rio</em>}</li>
 *   <li>{@link Modelodabiblioteca.SistemaCadastro#getListaPublica��es <em>Lista Publica��es</em>}</li>
 *   <li>{@link Modelodabiblioteca.SistemaCadastro#getPublica��o <em>Publica��o</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getSistemaCadastro()
 * @model
 * @generated
 */
public interface SistemaCadastro extends EObject {
	/**
	 * Returns the value of the '<em><b>Lista Usu�rios</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Usu�rios</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Usu�rios</em>' reference.
	 * @see #setListaUsu�rios(Usu�rio)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getSistemaCadastro_ListaUsu�rios()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Usu�rio getListaUsu�rios();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.SistemaCadastro#getListaUsu�rios <em>Lista Usu�rios</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lista Usu�rios</em>' reference.
	 * @see #getListaUsu�rios()
	 * @generated
	 */
	void setListaUsu�rios(Usu�rio value);

	/**
	 * Returns the value of the '<em><b>Usu�rio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usu�rio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usu�rio</em>' reference.
	 * @see #setUsu�rio(Usu�rio)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getSistemaCadastro_Usu�rio()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Usu�rio getUsu�rio();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.SistemaCadastro#getUsu�rio <em>Usu�rio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usu�rio</em>' reference.
	 * @see #getUsu�rio()
	 * @generated
	 */
	void setUsu�rio(Usu�rio value);

	/**
	 * Returns the value of the '<em><b>Lista Publica��es</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Publica��es</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Publica��es</em>' reference.
	 * @see #setListaPublica��es(Publica��o)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getSistemaCadastro_ListaPublica��es()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Publica��o getListaPublica��es();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.SistemaCadastro#getListaPublica��es <em>Lista Publica��es</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lista Publica��es</em>' reference.
	 * @see #getListaPublica��es()
	 * @generated
	 */
	void setListaPublica��es(Publica��o value);

	/**
	 * Returns the value of the '<em><b>Publica��o</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publica��o</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publica��o</em>' reference.
	 * @see #setPublica��o(Publica��o)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getSistemaCadastro_Publica��o()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Publica��o getPublica��o();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.SistemaCadastro#getPublica��o <em>Publica��o</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publica��o</em>' reference.
	 * @see #getPublica��o()
	 * @generated
	 */
	void setPublica��o(Publica��o value);

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

} // SistemaCadastro
