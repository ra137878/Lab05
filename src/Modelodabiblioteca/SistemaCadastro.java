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
 *   <li>{@link Modelodabiblioteca.SistemaCadastro#getListaUsuários <em>Lista Usuários</em>}</li>
 *   <li>{@link Modelodabiblioteca.SistemaCadastro#getUsuário <em>Usuário</em>}</li>
 *   <li>{@link Modelodabiblioteca.SistemaCadastro#getListaPublicações <em>Lista Publicações</em>}</li>
 *   <li>{@link Modelodabiblioteca.SistemaCadastro#getPublicação <em>Publicação</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getSistemaCadastro()
 * @model
 * @generated
 */
public interface SistemaCadastro extends EObject {
	/**
	 * Returns the value of the '<em><b>Lista Usuários</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Usuários</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Usuários</em>' reference.
	 * @see #setListaUsuários(Usuário)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getSistemaCadastro_ListaUsuários()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Usuário getListaUsuários();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.SistemaCadastro#getListaUsuários <em>Lista Usuários</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lista Usuários</em>' reference.
	 * @see #getListaUsuários()
	 * @generated
	 */
	void setListaUsuários(Usuário value);

	/**
	 * Returns the value of the '<em><b>Usuário</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usuário</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuário</em>' reference.
	 * @see #setUsuário(Usuário)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getSistemaCadastro_Usuário()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Usuário getUsuário();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.SistemaCadastro#getUsuário <em>Usuário</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuário</em>' reference.
	 * @see #getUsuário()
	 * @generated
	 */
	void setUsuário(Usuário value);

	/**
	 * Returns the value of the '<em><b>Lista Publicações</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Publicações</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Publicações</em>' reference.
	 * @see #setListaPublicações(Publicação)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getSistemaCadastro_ListaPublicações()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Publicação getListaPublicações();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.SistemaCadastro#getListaPublicações <em>Lista Publicações</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lista Publicações</em>' reference.
	 * @see #getListaPublicações()
	 * @generated
	 */
	void setListaPublicações(Publicação value);

	/**
	 * Returns the value of the '<em><b>Publicação</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publicação</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publicação</em>' reference.
	 * @see #setPublicação(Publicação)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getSistemaCadastro_Publicação()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Publicação getPublicação();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.SistemaCadastro#getPublicação <em>Publicação</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publicação</em>' reference.
	 * @see #getPublicação()
	 * @generated
	 */
	void setPublicação(Publicação value);

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
