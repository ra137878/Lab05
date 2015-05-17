/**
 */
package Modelodabiblioteca.impl;

import Modelodabiblioteca.ModelodabibliotecaPackage;
import Modelodabiblioteca.Publica��o;
import Modelodabiblioteca.SistemaCadastro;
import Modelodabiblioteca.Usu�rio;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sistema Cadastro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Modelodabiblioteca.impl.SistemaCadastroImpl#getListaUsu�rios <em>Lista Usu�rios</em>}</li>
 *   <li>{@link Modelodabiblioteca.impl.SistemaCadastroImpl#getUsu�rio <em>Usu�rio</em>}</li>
 *   <li>{@link Modelodabiblioteca.impl.SistemaCadastroImpl#getListaPublica��es <em>Lista Publica��es</em>}</li>
 *   <li>{@link Modelodabiblioteca.impl.SistemaCadastroImpl#getPublica��o <em>Publica��o</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SistemaCadastroImpl extends MinimalEObjectImpl.Container implements SistemaCadastro {
	/**
	 * The cached value of the '{@link #getListaUsu�rios() <em>Lista Usu�rios</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaUsu�rios()
	 * @generated
	 * @ordered
	 */
	protected Usu�rio listaUsu�rios;

	/**
	 * The cached value of the '{@link #getUsu�rio() <em>Usu�rio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsu�rio()
	 * @generated
	 * @ordered
	 */
	protected Usu�rio usu�rio;

	/**
	 * The cached value of the '{@link #getListaPublica��es() <em>Lista Publica��es</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaPublica��es()
	 * @generated
	 * @ordered
	 */
	protected Publica��o listaPublica��es;

	/**
	 * The cached value of the '{@link #getPublica��o() <em>Publica��o</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublica��o()
	 * @generated
	 * @ordered
	 */
	protected Publica��o publica��o;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SistemaCadastroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelodabibliotecaPackage.Literals.SISTEMA_CADASTRO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usu�rio getListaUsu�rios() {
		if (listaUsu�rios != null && listaUsu�rios.eIsProxy()) {
			InternalEObject oldListaUsu�rios = (InternalEObject)listaUsu�rios;
			listaUsu�rios = (Usu�rio)eResolveProxy(oldListaUsu�rios);
			if (listaUsu�rios != oldListaUsu�rios) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_USU�RIOS, oldListaUsu�rios, listaUsu�rios));
			}
		}
		return listaUsu�rios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usu�rio basicGetListaUsu�rios() {
		return listaUsu�rios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListaUsu�rios(Usu�rio newListaUsu�rios) {
		Usu�rio oldListaUsu�rios = listaUsu�rios;
		listaUsu�rios = newListaUsu�rios;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_USU�RIOS, oldListaUsu�rios, listaUsu�rios));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usu�rio getUsu�rio() {
		if (usu�rio != null && usu�rio.eIsProxy()) {
			InternalEObject oldUsu�rio = (InternalEObject)usu�rio;
			usu�rio = (Usu�rio)eResolveProxy(oldUsu�rio);
			if (usu�rio != oldUsu�rio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodabibliotecaPackage.SISTEMA_CADASTRO__USU�RIO, oldUsu�rio, usu�rio));
			}
		}
		return usu�rio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usu�rio basicGetUsu�rio() {
		return usu�rio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsu�rio(Usu�rio newUsu�rio) {
		Usu�rio oldUsu�rio = usu�rio;
		usu�rio = newUsu�rio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.SISTEMA_CADASTRO__USU�RIO, oldUsu�rio, usu�rio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publica��o getListaPublica��es() {
		if (listaPublica��es != null && listaPublica��es.eIsProxy()) {
			InternalEObject oldListaPublica��es = (InternalEObject)listaPublica��es;
			listaPublica��es = (Publica��o)eResolveProxy(oldListaPublica��es);
			if (listaPublica��es != oldListaPublica��es) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_PUBLICA��ES, oldListaPublica��es, listaPublica��es));
			}
		}
		return listaPublica��es;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publica��o basicGetListaPublica��es() {
		return listaPublica��es;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListaPublica��es(Publica��o newListaPublica��es) {
		Publica��o oldListaPublica��es = listaPublica��es;
		listaPublica��es = newListaPublica��es;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_PUBLICA��ES, oldListaPublica��es, listaPublica��es));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publica��o getPublica��o() {
		if (publica��o != null && publica��o.eIsProxy()) {
			InternalEObject oldPublica��o = (InternalEObject)publica��o;
			publica��o = (Publica��o)eResolveProxy(oldPublica��o);
			if (publica��o != oldPublica��o) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodabibliotecaPackage.SISTEMA_CADASTRO__PUBLICA��O, oldPublica��o, publica��o));
			}
		}
		return publica��o;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publica��o basicGetPublica��o() {
		return publica��o;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublica��o(Publica��o newPublica��o) {
		Publica��o oldPublica��o = publica��o;
		publica��o = newPublica��o;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.SISTEMA_CADASTRO__PUBLICA��O, oldPublica��o, publica��o));
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
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_USU�RIOS:
				if (resolve) return getListaUsu�rios();
				return basicGetListaUsu�rios();
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__USU�RIO:
				if (resolve) return getUsu�rio();
				return basicGetUsu�rio();
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_PUBLICA��ES:
				if (resolve) return getListaPublica��es();
				return basicGetListaPublica��es();
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__PUBLICA��O:
				if (resolve) return getPublica��o();
				return basicGetPublica��o();
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
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_USU�RIOS:
				setListaUsu�rios((Usu�rio)newValue);
				return;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__USU�RIO:
				setUsu�rio((Usu�rio)newValue);
				return;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_PUBLICA��ES:
				setListaPublica��es((Publica��o)newValue);
				return;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__PUBLICA��O:
				setPublica��o((Publica��o)newValue);
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
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_USU�RIOS:
				setListaUsu�rios((Usu�rio)null);
				return;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__USU�RIO:
				setUsu�rio((Usu�rio)null);
				return;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_PUBLICA��ES:
				setListaPublica��es((Publica��o)null);
				return;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__PUBLICA��O:
				setPublica��o((Publica��o)null);
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
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_USU�RIOS:
				return listaUsu�rios != null;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__USU�RIO:
				return usu�rio != null;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_PUBLICA��ES:
				return listaPublica��es != null;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__PUBLICA��O:
				return publica��o != null;
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
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO___CONFERIR_USUARIO:
				ConferirUsuario();
				return null;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO___CADASTRAR_USUARIO:
				CadastrarUsuario();
				return null;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO___INCLUIR_EXEMPLAR:
				IncluirExemplar();
				return null;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO___EXCLUIR_EXEMPLAR:
				ExcluirExemplar();
				return null;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO___ATUALIZAR_EXEMPLAR:
				AtualizarExemplar();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SistemaCadastroImpl
