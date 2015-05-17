/**
 */
package Modelodabiblioteca.impl;

import Modelodabiblioteca.Bibliotecária;
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
 * An implementation of the model object '<em><b>Bibliotecária</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modelodabiblioteca.impl.BibliotecáriaImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link Modelodabiblioteca.impl.BibliotecáriaImpl#getTerminalBibliotecária <em>Terminal Bibliotecária</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BibliotecáriaImpl extends FuncionárioImpl implements Bibliotecária {
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
	 * The cached value of the '{@link #getTerminalBibliotecária() <em>Terminal Bibliotecária</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminalBibliotecária()
	 * @generated
	 * @ordered
	 */
	protected Terminal terminalBibliotecária;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BibliotecáriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelodabibliotecaPackage.Literals.BIBLIOTECÁRIA;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodabibliotecaPackage.BIBLIOTECÁRIA__TERMINAL, oldTerminal, terminal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.BIBLIOTECÁRIA__TERMINAL, oldTerminal, terminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal getTerminalBibliotecária() {
		if (terminalBibliotecária != null && terminalBibliotecária.eIsProxy()) {
			InternalEObject oldTerminalBibliotecária = (InternalEObject)terminalBibliotecária;
			terminalBibliotecária = (Terminal)eResolveProxy(oldTerminalBibliotecária);
			if (terminalBibliotecária != oldTerminalBibliotecária) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodabibliotecaPackage.BIBLIOTECÁRIA__TERMINAL_BIBLIOTECÁRIA, oldTerminalBibliotecária, terminalBibliotecária));
			}
		}
		return terminalBibliotecária;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetTerminalBibliotecária() {
		return terminalBibliotecária;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminalBibliotecária(Terminal newTerminalBibliotecária) {
		Terminal oldTerminalBibliotecária = terminalBibliotecária;
		terminalBibliotecária = newTerminalBibliotecária;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.BIBLIOTECÁRIA__TERMINAL_BIBLIOTECÁRIA, oldTerminalBibliotecária, terminalBibliotecária));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void IncluirExemplar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ExcluirExemplar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void AtualizarExemplar() {
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
			case ModelodabibliotecaPackage.BIBLIOTECÁRIA__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case ModelodabibliotecaPackage.BIBLIOTECÁRIA__TERMINAL_BIBLIOTECÁRIA:
				if (resolve) return getTerminalBibliotecária();
				return basicGetTerminalBibliotecária();
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
			case ModelodabibliotecaPackage.BIBLIOTECÁRIA__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case ModelodabibliotecaPackage.BIBLIOTECÁRIA__TERMINAL_BIBLIOTECÁRIA:
				setTerminalBibliotecária((Terminal)newValue);
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
			case ModelodabibliotecaPackage.BIBLIOTECÁRIA__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case ModelodabibliotecaPackage.BIBLIOTECÁRIA__TERMINAL_BIBLIOTECÁRIA:
				setTerminalBibliotecária((Terminal)null);
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
			case ModelodabibliotecaPackage.BIBLIOTECÁRIA__TERMINAL:
				return terminal != null;
			case ModelodabibliotecaPackage.BIBLIOTECÁRIA__TERMINAL_BIBLIOTECÁRIA:
				return terminalBibliotecária != null;
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
			case ModelodabibliotecaPackage.BIBLIOTECÁRIA___INCLUIR_EXEMPLAR:
				IncluirExemplar();
				return null;
			case ModelodabibliotecaPackage.BIBLIOTECÁRIA___EXCLUIR_EXEMPLAR:
				ExcluirExemplar();
				return null;
			case ModelodabibliotecaPackage.BIBLIOTECÁRIA___ATUALIZAR_EXEMPLAR:
				AtualizarExemplar();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BibliotecáriaImpl
