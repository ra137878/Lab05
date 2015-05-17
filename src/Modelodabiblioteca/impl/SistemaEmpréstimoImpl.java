/**
 */
package Modelodabiblioteca.impl;

import Modelodabiblioteca.ModelodabibliotecaPackage;
import Modelodabiblioteca.SistemaEmpréstimo;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sistema Empréstimo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SistemaEmpréstimoImpl extends MinimalEObjectImpl.Container implements SistemaEmpréstimo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SistemaEmpréstimoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelodabibliotecaPackage.Literals.SISTEMA_EMPRÉSTIMO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void FazerReserva() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void CancelarReserva() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void RealizarEmprestimo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void DesfazerEmprestimo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelodabibliotecaPackage.SISTEMA_EMPRÉSTIMO___FAZER_RESERVA:
				FazerReserva();
				return null;
			case ModelodabibliotecaPackage.SISTEMA_EMPRÉSTIMO___CANCELAR_RESERVA:
				CancelarReserva();
				return null;
			case ModelodabibliotecaPackage.SISTEMA_EMPRÉSTIMO___REALIZAR_EMPRESTIMO:
				RealizarEmprestimo();
				return null;
			case ModelodabibliotecaPackage.SISTEMA_EMPRÉSTIMO___DESFAZER_EMPRESTIMO:
				DesfazerEmprestimo();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SistemaEmpréstimoImpl
