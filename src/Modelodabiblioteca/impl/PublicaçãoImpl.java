/**
 */
package Modelodabiblioteca.impl;

import Modelodabiblioteca.Exemplar;
import Modelodabiblioteca.ModelodabibliotecaPackage;
import Modelodabiblioteca.Publica��o;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publica��o</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modelodabiblioteca.impl.Publica��oImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link Modelodabiblioteca.impl.Publica��oImpl#getAutor <em>Autor</em>}</li>
 *   <li>{@link Modelodabiblioteca.impl.Publica��oImpl#getData <em>Data</em>}</li>
 *   <li>{@link Modelodabiblioteca.impl.Publica��oImpl#getExemplarBiblioteca <em>Exemplar Biblioteca</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Publica��oImpl extends MinimalEObjectImpl.Container implements Publica��o {
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
	 * The default value of the '{@link #getAutor() <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTOR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAutor() <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected String autor = AUTOR_EDEFAULT;
	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final int DATA_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected int data = DATA_EDEFAULT;
	/**
	 * The cached value of the '{@link #getExemplarBiblioteca() <em>Exemplar Biblioteca</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExemplarBiblioteca()
	 * @generated
	 * @ordered
	 */
	protected Exemplar exemplarBiblioteca;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Publica��oImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelodabibliotecaPackage.Literals.PUBLICA��O;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.PUBLICA��O__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutor(String newAutor) {
		String oldAutor = autor;
		autor = newAutor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.PUBLICA��O__AUTOR, oldAutor, autor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(int newData) {
		int oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.PUBLICA��O__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exemplar getExemplarBiblioteca() {
		if (exemplarBiblioteca != null && exemplarBiblioteca.eIsProxy()) {
			InternalEObject oldExemplarBiblioteca = (InternalEObject)exemplarBiblioteca;
			exemplarBiblioteca = (Exemplar)eResolveProxy(oldExemplarBiblioteca);
			if (exemplarBiblioteca != oldExemplarBiblioteca) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodabibliotecaPackage.PUBLICA��O__EXEMPLAR_BIBLIOTECA, oldExemplarBiblioteca, exemplarBiblioteca));
			}
		}
		return exemplarBiblioteca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exemplar basicGetExemplarBiblioteca() {
		return exemplarBiblioteca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExemplarBiblioteca(Exemplar newExemplarBiblioteca) {
		Exemplar oldExemplarBiblioteca = exemplarBiblioteca;
		exemplarBiblioteca = newExemplarBiblioteca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.PUBLICA��O__EXEMPLAR_BIBLIOTECA, oldExemplarBiblioteca, exemplarBiblioteca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelodabibliotecaPackage.PUBLICA��O__NOME:
				return getNome();
			case ModelodabibliotecaPackage.PUBLICA��O__AUTOR:
				return getAutor();
			case ModelodabibliotecaPackage.PUBLICA��O__DATA:
				return getData();
			case ModelodabibliotecaPackage.PUBLICA��O__EXEMPLAR_BIBLIOTECA:
				if (resolve) return getExemplarBiblioteca();
				return basicGetExemplarBiblioteca();
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
			case ModelodabibliotecaPackage.PUBLICA��O__NOME:
				setNome((String)newValue);
				return;
			case ModelodabibliotecaPackage.PUBLICA��O__AUTOR:
				setAutor((String)newValue);
				return;
			case ModelodabibliotecaPackage.PUBLICA��O__DATA:
				setData((Integer)newValue);
				return;
			case ModelodabibliotecaPackage.PUBLICA��O__EXEMPLAR_BIBLIOTECA:
				setExemplarBiblioteca((Exemplar)newValue);
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
			case ModelodabibliotecaPackage.PUBLICA��O__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case ModelodabibliotecaPackage.PUBLICA��O__AUTOR:
				setAutor(AUTOR_EDEFAULT);
				return;
			case ModelodabibliotecaPackage.PUBLICA��O__DATA:
				setData(DATA_EDEFAULT);
				return;
			case ModelodabibliotecaPackage.PUBLICA��O__EXEMPLAR_BIBLIOTECA:
				setExemplarBiblioteca((Exemplar)null);
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
			case ModelodabibliotecaPackage.PUBLICA��O__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case ModelodabibliotecaPackage.PUBLICA��O__AUTOR:
				return AUTOR_EDEFAULT == null ? autor != null : !AUTOR_EDEFAULT.equals(autor);
			case ModelodabibliotecaPackage.PUBLICA��O__DATA:
				return data != DATA_EDEFAULT;
			case ModelodabibliotecaPackage.PUBLICA��O__EXEMPLAR_BIBLIOTECA:
				return exemplarBiblioteca != null;
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
		result.append(" (Nome: ");
		result.append(nome);
		result.append(", Autor: ");
		result.append(autor);
		result.append(", Data: ");
		result.append(data);
		result.append(')');
		return result.toString();
	}

} //Publica��oImpl
