/**
 */
package Modelodabiblioteca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sistema Empr�stimo</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Modelodabiblioteca.ModelodabibliotecaPackage#getSistemaEmpr�stimo()
 * @model
 * @generated
 */
public interface SistemaEmpr�stimo extends EObject {
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

} // SistemaEmpr�stimo
