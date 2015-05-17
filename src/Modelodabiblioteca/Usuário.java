/**
 */
package Modelodabiblioteca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuário</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modelodabiblioteca.Usuário#getNumeroRegistro <em>Numero Registro</em>}</li>
 *   <li>{@link Modelodabiblioteca.Usuário#getNome <em>Nome</em>}</li>
 *   <li>{@link Modelodabiblioteca.Usuário#getInstituto <em>Instituto</em>}</li>
 *   <li>{@link Modelodabiblioteca.Usuário#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getUsuário()
 * @model
 * @generated
 */
public interface Usuário extends EObject {

	/**
	 * Returns the value of the '<em><b>Numero Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Registro</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Registro</em>' attribute.
	 * @see #setNumeroRegistro(int)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getUsuário_NumeroRegistro()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumeroRegistro();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Usuário#getNumeroRegistro <em>Numero Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Registro</em>' attribute.
	 * @see #getNumeroRegistro()
	 * @generated
	 */
	void setNumeroRegistro(int value);

	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getUsuário_Nome()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Usuário#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instituto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instituto</em>' attribute.
	 * @see #setInstituto(String)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getUsuário_Instituto()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getInstituto();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Usuário#getInstituto <em>Instituto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instituto</em>' attribute.
	 * @see #getInstituto()
	 * @generated
	 */
	void setInstituto(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getUsuário_Tipo()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Usuário#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void FazerReserva();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void CancelarReserva();
} // Usuário
