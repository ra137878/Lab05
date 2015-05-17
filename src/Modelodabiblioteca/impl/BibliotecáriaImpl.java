/**
 */
package Modelodabiblioteca.impl;

import Modelodabiblioteca.Bibliotec�ria;
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
 * An implementation of the model object '<em><b>Bibliotec�ria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modelodabiblioteca.impl.Bibliotec�riaImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link Modelodabiblioteca.impl.Bibliotec�riaImpl#getTerminalBibliotec�ria <em>Terminal Bibliotec�ria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Bibliotec�riaImpl extends Funcion�rioImpl implements Bibliotec�ria {
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
	 * The cached value of the '{@link #getTerminalBibliotec�ria() <em>Terminal Bibliotec�ria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminalBibliotec�ria()
	 * @generated
	 * @ordered
	 */
	protected Terminal terminalBibliotec�ria;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bibliotec�riaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelodabibliotecaPackage.Literals.BIBLIOTEC�RIA;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodabibliotecaPackage.BIBLIOTEC�RIA__TERMINAL, oldTerminal, terminal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.BIBLIOTEC�RIA__TERMINAL, oldTerminal, terminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal getTerminalBibliotec�ria() {
		if (terminalBibliotec�ria != null && terminalBibliotec�ria.eIsProxy()) {
			InternalEObject oldTerminalBibliotec�ria = (InternalEObject)terminalBibliotec�ria;
			terminalBibliotec�ria = (Terminal)eResolveProxy(oldTerminalBibliotec�ria);
			if (terminalBibliotec�ria != oldTerminalBibliotec�ria) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodabibliotecaPackage.BIBLIOTEC�RIA__TERMINAL_BIBLIOTEC�RIA, oldTerminalBibliotec�ria, terminalBibliotec�ria));
			}
		}
		return terminalBibliotec�ria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetTerminalBibliotec�ria() {
		return terminalBibliotec�ria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminalBibliotec�ria(Terminal newTerminalBibliotec�ria) {
		Terminal oldTerminalBibliotec�ria = terminalBibliotec�ria;
		terminalBibliotec�ria = newTerminalBibliotec�ria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.BIBLIOTEC�RIA__TERMINAL_BIBLIOTEC�RIA, oldTerminalBibliotec�ria, terminalBibliotec�ria));
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
			case ModelodabibliotecaPackage.BIBLIOTEC�RIA__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case ModelodabibliotecaPackage.BIBLIOTEC�RIA__TERMINAL_BIBLIOTEC�RIA:
				if (resolve) return getTerminalBibliotec�ria();
				return basicGetTerminalBibliotec�ria();
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
			case ModelodabibliotecaPackage.BIBLIOTEC�RIA__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case ModelodabibliotecaPackage.BIBLIOTEC�RIA__TERMINAL_BIBLIOTEC�RIA:
				setTerminalBibliotec�ria((Terminal)newValue);
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
			case ModelodabibliotecaPackage.BIBLIOTEC�RIA__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case ModelodabibliotecaPackage.BIBLIOTEC�RIA__TERMINAL_BIBLIOTEC�RIA:
				setTerminalBibliotec�ria((Terminal)null);
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
			case ModelodabibliotecaPackage.BIBLIOTEC�RIA__TERMINAL:
				return terminal != null;
			case ModelodabibliotecaPackage.BIBLIOTEC�RIA__TERMINAL_BIBLIOTEC�RIA:
				return terminalBibliotec�ria != null;
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
			case ModelodabibliotecaPackage.BIBLIOTEC�RIA___INCLUIR_EXEMPLAR:
				IncluirExemplar();
				return null;
			case ModelodabibliotecaPackage.BIBLIOTEC�RIA___EXCLUIR_EXEMPLAR:
				ExcluirExemplar();
				return null;
			case ModelodabibliotecaPackage.BIBLIOTEC�RIA___ATUALIZAR_EXEMPLAR:
				AtualizarExemplar();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //Bibliotec�riaImpl
