/**
 */
package Modelodabiblioteca.impl;

import Modelodabiblioteca.Exemplar;
import Modelodabiblioteca.ModelodabibliotecaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exemplar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modelodabiblioteca.impl.ExemplarImpl#getQuantidade <em>Quantidade</em>}</li>
 *   <li>{@link Modelodabiblioteca.impl.ExemplarImpl#getNumeroEtiqueta <em>Numero Etiqueta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExemplarImpl extends MinimalEObjectImpl.Container implements Exemplar {
	/**
	 * The default value of the '{@link #getQuantidade() <em>Quantidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantidade()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTIDADE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getQuantidade() <em>Quantidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantidade()
	 * @generated
	 * @ordered
	 */
	protected int quantidade = QUANTIDADE_EDEFAULT;
	/**
	 * The default value of the '{@link #getNumeroEtiqueta() <em>Numero Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroEtiqueta()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_ETIQUETA_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getNumeroEtiqueta() <em>Numero Etiqueta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroEtiqueta()
	 * @generated
	 * @ordered
	 */
	protected int numeroEtiqueta = NUMERO_ETIQUETA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExemplarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelodabibliotecaPackage.Literals.EXEMPLAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantidade(int newQuantidade) {
		int oldQuantidade = quantidade;
		quantidade = newQuantidade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.EXEMPLAR__QUANTIDADE, oldQuantidade, quantidade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumeroEtiqueta() {
		return numeroEtiqueta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroEtiqueta(int newNumeroEtiqueta) {
		int oldNumeroEtiqueta = numeroEtiqueta;
		numeroEtiqueta = newNumeroEtiqueta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.EXEMPLAR__NUMERO_ETIQUETA, oldNumeroEtiqueta, numeroEtiqueta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelodabibliotecaPackage.EXEMPLAR__QUANTIDADE:
				return getQuantidade();
			case ModelodabibliotecaPackage.EXEMPLAR__NUMERO_ETIQUETA:
				return getNumeroEtiqueta();
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
			case ModelodabibliotecaPackage.EXEMPLAR__QUANTIDADE:
				setQuantidade((Integer)newValue);
				return;
			case ModelodabibliotecaPackage.EXEMPLAR__NUMERO_ETIQUETA:
				setNumeroEtiqueta((Integer)newValue);
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
			case ModelodabibliotecaPackage.EXEMPLAR__QUANTIDADE:
				setQuantidade(QUANTIDADE_EDEFAULT);
				return;
			case ModelodabibliotecaPackage.EXEMPLAR__NUMERO_ETIQUETA:
				setNumeroEtiqueta(NUMERO_ETIQUETA_EDEFAULT);
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
			case ModelodabibliotecaPackage.EXEMPLAR__QUANTIDADE:
				return quantidade != QUANTIDADE_EDEFAULT;
			case ModelodabibliotecaPackage.EXEMPLAR__NUMERO_ETIQUETA:
				return numeroEtiqueta != NUMERO_ETIQUETA_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (Quantidade: ");
		result.append(quantidade);
		result.append(", NumeroEtiqueta: ");
		result.append(numeroEtiqueta);
		result.append(')');
		return result.toString();
	}

} //ExemplarImpl
