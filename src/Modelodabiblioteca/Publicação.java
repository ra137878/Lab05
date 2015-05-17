/**
 */
package Modelodabiblioteca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publica��o</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modelodabiblioteca.Publica��o#getNome <em>Nome</em>}</li>
 *   <li>{@link Modelodabiblioteca.Publica��o#getAutor <em>Autor</em>}</li>
 *   <li>{@link Modelodabiblioteca.Publica��o#getData <em>Data</em>}</li>
 *   <li>{@link Modelodabiblioteca.Publica��o#getExemplarBiblioteca <em>Exemplar Biblioteca</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getPublica��o()
 * @model
 * @generated
 */
public interface Publica��o extends EObject {

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
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getPublica��o_Nome()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Publica��o#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autor</em>' attribute.
	 * @see #setAutor(String)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getPublica��o_Autor()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAutor();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Publica��o#getAutor <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autor</em>' attribute.
	 * @see #getAutor()
	 * @generated
	 */
	void setAutor(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(int)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getPublica��o_Data()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getData();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Publica��o#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(int value);

	/**
	 * Returns the value of the '<em><b>Exemplar Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exemplar Biblioteca</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exemplar Biblioteca</em>' reference.
	 * @see #setExemplarBiblioteca(Exemplar)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getPublica��o_ExemplarBiblioteca()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Exemplar getExemplarBiblioteca();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Publica��o#getExemplarBiblioteca <em>Exemplar Biblioteca</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exemplar Biblioteca</em>' reference.
	 * @see #getExemplarBiblioteca()
	 * @generated
	 */
	void setExemplarBiblioteca(Exemplar value);
} // Publica��o
