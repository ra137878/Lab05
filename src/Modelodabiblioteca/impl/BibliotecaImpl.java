/**
 */
package Modelodabiblioteca.impl;

import Modelodabiblioteca.Biblioteca;
import Modelodabiblioteca.ModelodabibliotecaPackage;

import Modelodabiblioteca.SistemaCadastro;
import Modelodabiblioteca.SistemaEmpréstimo;
import Modelodabiblioteca.Terminal;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biblioteca</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modelodabiblioteca.impl.BibliotecaImpl#getTerminalBiblioteca <em>Terminal Biblioteca</em>}</li>
 *   <li>{@link Modelodabiblioteca.impl.BibliotecaImpl#getSistEmprestimoBiblioteca <em>Sist Emprestimo Biblioteca</em>}</li>
 *   <li>{@link Modelodabiblioteca.impl.BibliotecaImpl#getSistCadastroBiblioteca <em>Sist Cadastro Biblioteca</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BibliotecaImpl extends MinimalEObjectImpl.Container implements Biblioteca {
	/**
	 * The cached value of the '{@link #getTerminalBiblioteca() <em>Terminal Biblioteca</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminalBiblioteca()
	 * @generated
	 * @ordered
	 */
	protected Terminal terminalBiblioteca;
	/**
	 * The cached value of the '{@link #getSistEmprestimoBiblioteca() <em>Sist Emprestimo Biblioteca</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSistEmprestimoBiblioteca()
	 * @generated
	 * @ordered
	 */
	protected SistemaEmpréstimo sistEmprestimoBiblioteca;
	/**
	 * The cached value of the '{@link #getSistCadastroBiblioteca() <em>Sist Cadastro Biblioteca</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSistCadastroBiblioteca()
	 * @generated
	 * @ordered
	 */
	protected SistemaCadastro sistCadastroBiblioteca;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BibliotecaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelodabibliotecaPackage.Literals.BIBLIOTECA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal getTerminalBiblioteca() {
		if (terminalBiblioteca != null && terminalBiblioteca.eIsProxy()) {
			InternalEObject oldTerminalBiblioteca = (InternalEObject)terminalBiblioteca;
			terminalBiblioteca = (Terminal)eResolveProxy(oldTerminalBiblioteca);
			if (terminalBiblioteca != oldTerminalBiblioteca) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodabibliotecaPackage.BIBLIOTECA__TERMINAL_BIBLIOTECA, oldTerminalBiblioteca, terminalBiblioteca));
			}
		}
		return terminalBiblioteca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetTerminalBiblioteca() {
		return terminalBiblioteca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminalBiblioteca(Terminal newTerminalBiblioteca) {
		Terminal oldTerminalBiblioteca = terminalBiblioteca;
		terminalBiblioteca = newTerminalBiblioteca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.BIBLIOTECA__TERMINAL_BIBLIOTECA, oldTerminalBiblioteca, terminalBiblioteca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SistemaEmpréstimo getSistEmprestimoBiblioteca() {
		if (sistEmprestimoBiblioteca != null && sistEmprestimoBiblioteca.eIsProxy()) {
			InternalEObject oldSistEmprestimoBiblioteca = (InternalEObject)sistEmprestimoBiblioteca;
			sistEmprestimoBiblioteca = (SistemaEmpréstimo)eResolveProxy(oldSistEmprestimoBiblioteca);
			if (sistEmprestimoBiblioteca != oldSistEmprestimoBiblioteca) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodabibliotecaPackage.BIBLIOTECA__SIST_EMPRESTIMO_BIBLIOTECA, oldSistEmprestimoBiblioteca, sistEmprestimoBiblioteca));
			}
		}
		return sistEmprestimoBiblioteca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SistemaEmpréstimo basicGetSistEmprestimoBiblioteca() {
		return sistEmprestimoBiblioteca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSistEmprestimoBiblioteca(SistemaEmpréstimo newSistEmprestimoBiblioteca) {
		SistemaEmpréstimo oldSistEmprestimoBiblioteca = sistEmprestimoBiblioteca;
		sistEmprestimoBiblioteca = newSistEmprestimoBiblioteca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.BIBLIOTECA__SIST_EMPRESTIMO_BIBLIOTECA, oldSistEmprestimoBiblioteca, sistEmprestimoBiblioteca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SistemaCadastro getSistCadastroBiblioteca() {
		if (sistCadastroBiblioteca != null && sistCadastroBiblioteca.eIsProxy()) {
			InternalEObject oldSistCadastroBiblioteca = (InternalEObject)sistCadastroBiblioteca;
			sistCadastroBiblioteca = (SistemaCadastro)eResolveProxy(oldSistCadastroBiblioteca);
			if (sistCadastroBiblioteca != oldSistCadastroBiblioteca) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodabibliotecaPackage.BIBLIOTECA__SIST_CADASTRO_BIBLIOTECA, oldSistCadastroBiblioteca, sistCadastroBiblioteca));
			}
		}
		return sistCadastroBiblioteca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SistemaCadastro basicGetSistCadastroBiblioteca() {
		return sistCadastroBiblioteca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSistCadastroBiblioteca(SistemaCadastro newSistCadastroBiblioteca) {
		SistemaCadastro oldSistCadastroBiblioteca = sistCadastroBiblioteca;
		sistCadastroBiblioteca = newSistCadastroBiblioteca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.BIBLIOTECA__SIST_CADASTRO_BIBLIOTECA, oldSistCadastroBiblioteca, sistCadastroBiblioteca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelodabibliotecaPackage.BIBLIOTECA__TERMINAL_BIBLIOTECA:
				if (resolve) return getTerminalBiblioteca();
				return basicGetTerminalBiblioteca();
			case ModelodabibliotecaPackage.BIBLIOTECA__SIST_EMPRESTIMO_BIBLIOTECA:
				if (resolve) return getSistEmprestimoBiblioteca();
				return basicGetSistEmprestimoBiblioteca();
			case ModelodabibliotecaPackage.BIBLIOTECA__SIST_CADASTRO_BIBLIOTECA:
				if (resolve) return getSistCadastroBiblioteca();
				return basicGetSistCadastroBiblioteca();
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
			case ModelodabibliotecaPackage.BIBLIOTECA__TERMINAL_BIBLIOTECA:
				setTerminalBiblioteca((Terminal)newValue);
				return;
			case ModelodabibliotecaPackage.BIBLIOTECA__SIST_EMPRESTIMO_BIBLIOTECA:
				setSistEmprestimoBiblioteca((SistemaEmpréstimo)newValue);
				return;
			case ModelodabibliotecaPackage.BIBLIOTECA__SIST_CADASTRO_BIBLIOTECA:
				setSistCadastroBiblioteca((SistemaCadastro)newValue);
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
			case ModelodabibliotecaPackage.BIBLIOTECA__TERMINAL_BIBLIOTECA:
				setTerminalBiblioteca((Terminal)null);
				return;
			case ModelodabibliotecaPackage.BIBLIOTECA__SIST_EMPRESTIMO_BIBLIOTECA:
				setSistEmprestimoBiblioteca((SistemaEmpréstimo)null);
				return;
			case ModelodabibliotecaPackage.BIBLIOTECA__SIST_CADASTRO_BIBLIOTECA:
				setSistCadastroBiblioteca((SistemaCadastro)null);
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
			case ModelodabibliotecaPackage.BIBLIOTECA__TERMINAL_BIBLIOTECA:
				return terminalBiblioteca != null;
			case ModelodabibliotecaPackage.BIBLIOTECA__SIST_EMPRESTIMO_BIBLIOTECA:
				return sistEmprestimoBiblioteca != null;
			case ModelodabibliotecaPackage.BIBLIOTECA__SIST_CADASTRO_BIBLIOTECA:
				return sistCadastroBiblioteca != null;
		}
		return super.eIsSet(featureID);
	}

} //BibliotecaImpl
