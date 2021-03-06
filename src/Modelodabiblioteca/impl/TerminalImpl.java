/**
 */
package Modelodabiblioteca.impl;

import Modelodabiblioteca.ModelodabibliotecaPackage;
import Modelodabiblioteca.SistemaEmpréstimo;
import Modelodabiblioteca.Terminal;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TerminalImpl extends SistemaCadastroImpl implements Terminal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelodabibliotecaPackage.Literals.TERMINAL;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == SistemaEmpréstimo.class) {
			switch (baseOperationID) {
				case ModelodabibliotecaPackage.SISTEMA_EMPRÉSTIMO___FAZER_RESERVA: return ModelodabibliotecaPackage.TERMINAL___FAZER_RESERVA;
				case ModelodabibliotecaPackage.SISTEMA_EMPRÉSTIMO___CANCELAR_RESERVA: return ModelodabibliotecaPackage.TERMINAL___CANCELAR_RESERVA;
				case ModelodabibliotecaPackage.SISTEMA_EMPRÉSTIMO___REALIZAR_EMPRESTIMO: return ModelodabibliotecaPackage.TERMINAL___REALIZAR_EMPRESTIMO;
				case ModelodabibliotecaPackage.SISTEMA_EMPRÉSTIMO___DESFAZER_EMPRESTIMO: return ModelodabibliotecaPackage.TERMINAL___DESFAZER_EMPRESTIMO;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelodabibliotecaPackage.TERMINAL___FAZER_RESERVA:
				FazerReserva();
				return null;
			case ModelodabibliotecaPackage.TERMINAL___CANCELAR_RESERVA:
				CancelarReserva();
				return null;
			case ModelodabibliotecaPackage.TERMINAL___REALIZAR_EMPRESTIMO:
				RealizarEmprestimo();
				return null;
			case ModelodabibliotecaPackage.TERMINAL___DESFAZER_EMPRESTIMO:
				DesfazerEmprestimo();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TerminalImpl
