/**
 */
package Modelodabiblioteca.impl;

import Modelodabiblioteca.ModelodabibliotecaPackage;
import Modelodabiblioteca.Usuário;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuário</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modelodabiblioteca.impl.UsuárioImpl#getNumeroRegistro <em>Numero Registro</em>}</li>
 *   <li>{@link Modelodabiblioteca.impl.UsuárioImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link Modelodabiblioteca.impl.UsuárioImpl#getInstituto <em>Instituto</em>}</li>
 *   <li>{@link Modelodabiblioteca.impl.UsuárioImpl#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsuárioImpl extends MinimalEObjectImpl.Container implements Usuário {
	/**
	 * The default value of the '{@link #getNumeroRegistro() <em>Numero Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroRegistro()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_REGISTRO_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getNumeroRegistro() <em>Numero Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroRegistro()
	 * @generated
	 * @ordered
	 */
	protected int numeroRegistro = NUMERO_REGISTRO_EDEFAULT;
	/**
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected String nome = NOME_EDEFAULT;
	/**
	 * The default value of the '{@link #getInstituto() <em>Instituto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstituto()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInstituto() <em>Instituto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstituto()
	 * @generated
	 * @ordered
	 */
	protected String instituto = INSTITUTO_EDEFAULT;
	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsuárioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelodabibliotecaPackage.Literals.USUÁRIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroRegistro(int newNumeroRegistro) {
		int oldNumeroRegistro = numeroRegistro;
		numeroRegistro = newNumeroRegistro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.USUÁRIO__NUMERO_REGISTRO, oldNumeroRegistro, numeroRegistro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNome(String newNome) {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.USUÁRIO__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstituto() {
		return instituto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstituto(String newInstituto) {
		String oldInstituto = instituto;
		instituto = newInstituto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.USUÁRIO__INSTITUTO, oldInstituto, instituto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.USUÁRIO__TIPO, oldTipo, tipo));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelodabibliotecaPackage.USUÁRIO__NUMERO_REGISTRO:
				return getNumeroRegistro();
			case ModelodabibliotecaPackage.USUÁRIO__NOME:
				return getNome();
			case ModelodabibliotecaPackage.USUÁRIO__INSTITUTO:
				return getInstituto();
			case ModelodabibliotecaPackage.USUÁRIO__TIPO:
				return getTipo();
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
			case ModelodabibliotecaPackage.USUÁRIO__NUMERO_REGISTRO:
				setNumeroRegistro((Integer)newValue);
				return;
			case ModelodabibliotecaPackage.USUÁRIO__NOME:
				setNome((String)newValue);
				return;
			case ModelodabibliotecaPackage.USUÁRIO__INSTITUTO:
				setInstituto((String)newValue);
				return;
			case ModelodabibliotecaPackage.USUÁRIO__TIPO:
				setTipo((String)newValue);
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
			case ModelodabibliotecaPackage.USUÁRIO__NUMERO_REGISTRO:
				setNumeroRegistro(NUMERO_REGISTRO_EDEFAULT);
				return;
			case ModelodabibliotecaPackage.USUÁRIO__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case ModelodabibliotecaPackage.USUÁRIO__INSTITUTO:
				setInstituto(INSTITUTO_EDEFAULT);
				return;
			case ModelodabibliotecaPackage.USUÁRIO__TIPO:
				setTipo(TIPO_EDEFAULT);
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
			case ModelodabibliotecaPackage.USUÁRIO__NUMERO_REGISTRO:
				return numeroRegistro != NUMERO_REGISTRO_EDEFAULT;
			case ModelodabibliotecaPackage.USUÁRIO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case ModelodabibliotecaPackage.USUÁRIO__INSTITUTO:
				return INSTITUTO_EDEFAULT == null ? instituto != null : !INSTITUTO_EDEFAULT.equals(instituto);
			case ModelodabibliotecaPackage.USUÁRIO__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
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
			case ModelodabibliotecaPackage.USUÁRIO___FAZER_RESERVA:
				FazerReserva();
				return null;
			case ModelodabibliotecaPackage.USUÁRIO___CANCELAR_RESERVA:
				CancelarReserva();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (NumeroRegistro: ");
		result.append(numeroRegistro);
		result.append(", Nome: ");
		result.append(nome);
		result.append(", Instituto: ");
		result.append(instituto);
		result.append(", Tipo: ");
		result.append(tipo);
		result.append(')');
		return result.toString();
	}

} //UsuárioImpl
