/**
 */
package Modelodabiblioteca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exemplar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Modelodabiblioteca.Exemplar#getQuantidade <em>Quantidade</em>}</li>
 *   <li>{@link Modelodabiblioteca.Exemplar#getNumeroEtiqueta <em>Numero Etiqueta</em>}</li>
 * </ul>
 * </p>
 *
 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getExemplar()
 * @model
 * @generated
 */
public interface Exemplar extends EObject {

	/**
	 * Returns the value of the '<em><b>Quantidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantidade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantidade</em>' attribute.
	 * @see #setQuantidade(int)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getExemplar_Quantidade()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getQuantidade();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Exemplar#getQuantidade <em>Quantidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantidade</em>' attribute.
	 * @see #getQuantidade()
	 * @generated
	 */
	void setQuantidade(int value);

	/**
	 * Returns the value of the '<em><b>Numero Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Etiqueta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Etiqueta</em>' attribute.
	 * @see #setNumeroEtiqueta(int)
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getExemplar_NumeroEtiqueta()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumeroEtiqueta();

	/**
	 * Sets the value of the '{@link Modelodabiblioteca.Exemplar#getNumeroEtiqueta <em>Numero Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Etiqueta</em>' attribute.
	 * @see #getNumeroEtiqueta()
	 * @generated
	 */
	void setNumeroEtiqueta(int value);
} // Exemplar
