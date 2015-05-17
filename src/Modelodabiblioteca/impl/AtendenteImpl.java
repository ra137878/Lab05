/**
 */
package Modelodabiblioteca.impl;

import Modelodabiblioteca.Atendente;
import Modelodabiblioteca.ModelodabibliotecaPackage;
import Modelodabiblioteca.Terminal;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atendente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modelodabiblioteca.impl.AtendenteImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link Modelodabiblioteca.impl.AtendenteImpl#getTerminalAtendente <em>Terminal Atendente</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtendenteImpl extends FuncionárioImpl implements Atendente {
	/**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal terminal;

	/**
	 * The cached value of the '{@link #getTerminalAtendente() <em>Terminal Atendente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminalAtendente()
	 * @generated
	 * @ordered
	 */
	protected Terminal terminalAtendente;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtendenteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelodabibliotecaPackage.Literals.ATENDENTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal getTerminal() {
		if (terminal != null && terminal.eIsProxy()) {
			InternalEObject oldTerminal = (InternalEObject)terminal;
			terminal = (Terminal)eResolveProxy(oldTerminal);
			if (terminal != oldTerminal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodabibliotecaPackage.ATENDENTE__TERMINAL, oldTerminal, terminal));
			}
		}
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetTerminal() {
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminal(Terminal newTerminal) {
		Terminal oldTerminal = terminal;
		terminal = newTerminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.ATENDENTE__TERMINAL, oldTerminal, terminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal getTerminalAtendente() {
		if (terminalAtendente != null && terminalAtendente.eIsProxy()) {
			InternalEObject oldTerminalAtendente = (InternalEObject)terminalAtendente;
			terminalAtendente = (Terminal)eResolveProxy(oldTerminalAtendente);
			if (terminalAtendente != oldTerminalAtendente) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodabibliotecaPackage.ATENDENTE__TERMINAL_ATENDENTE, oldTerminalAtendente, terminalAtendente));
			}
		}
		return terminalAtendente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetTerminalAtendente() {
		return terminalAtendente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminalAtendente(Terminal newTerminalAtendente) {
		Terminal oldTerminalAtendente = terminalAtendente;
		terminalAtendente = newTerminalAtendente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.ATENDENTE__TERMINAL_ATENDENTE, oldTerminalAtendente, terminalAtendente));
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
	public void ConferirUsuario() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void CadastrarUsuario() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelodabibliotecaPackage.ATENDENTE__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case ModelodabibliotecaPackage.ATENDENTE__TERMINAL_ATENDENTE:
				if (resolve) return getTerminalAtendente();
				return basicGetTerminalAtendente();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelodabibliotecaPackage.ATENDENTE__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case ModelodabibliotecaPackage.ATENDENTE__TERMINAL_ATENDENTE:
				setTerminalAtendente((Terminal)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelodabibliotecaPackage.ATENDENTE__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case ModelodabibliotecaPackage.ATENDENTE__TERMINAL_ATENDENTE:
				setTerminalAtendente((Terminal)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelodabibliotecaPackage.ATENDENTE__TERMINAL:
				return terminal != null;
			case ModelodabibliotecaPackage.ATENDENTE__TERMINAL_ATENDENTE:
				return terminalAtendente != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelodabibliotecaPackage.ATENDENTE___REALIZAR_EMPRESTIMO:
				RealizarEmprestimo();
				return null;
			case ModelodabibliotecaPackage.ATENDENTE___DESFAZER_EMPRESTIMO:
				DesfazerEmprestimo();
				return null;
			case ModelodabibliotecaPackage.ATENDENTE___CONFERIR_USUARIO:
				ConferirUsuario();
				return null;
			case ModelodabibliotecaPackage.ATENDENTE___CADASTRAR_USUARIO:
				CadastrarUsuario();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AtendenteImpl
