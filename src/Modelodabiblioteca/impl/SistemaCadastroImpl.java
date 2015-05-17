/**
 */
package Modelodabiblioteca.impl;

import Modelodabiblioteca.ModelodabibliotecaPackage;
import Modelodabiblioteca.Publicação;
import Modelodabiblioteca.SistemaCadastro;
import Modelodabiblioteca.Usuário;

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
 *   <li>{@link Modelodabiblioteca.impl.SistemaCadastroImpl#getListaUsuários <em>Lista Usuários</em>}</li>
 *   <li>{@link Modelodabiblioteca.impl.SistemaCadastroImpl#getUsuário <em>Usuário</em>}</li>
 *   <li>{@link Modelodabiblioteca.impl.SistemaCadastroImpl#getListaPublicações <em>Lista Publicações</em>}</li>
 *   <li>{@link Modelodabiblioteca.impl.SistemaCadastroImpl#getPublicação <em>Publicação</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SistemaCadastroImpl extends MinimalEObjectImpl.Container implements SistemaCadastro {
	/**
	 * The cached value of the '{@link #getListaUsuários() <em>Lista Usuários</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaUsuários()
	 * @generated
	 * @ordered
	 */
	protected Usuário listaUsuários;

	/**
	 * The cached value of the '{@link #getUsuário() <em>Usuário</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuário()
	 * @generated
	 * @ordered
	 */
	protected Usuário usuário;

	/**
	 * The cached value of the '{@link #getListaPublicações() <em>Lista Publicações</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaPublicações()
	 * @generated
	 * @ordered
	 */
	protected Publicação listaPublicações;

	/**
	 * The cached value of the '{@link #getPublicação() <em>Publicação</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicação()
	 * @generated
	 * @ordered
	 */
	protected Publicação publicação;

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
	public Usuário getListaUsuários() {
		if (listaUsuários != null && listaUsuários.eIsProxy()) {
			InternalEObject oldListaUsuários = (InternalEObject)listaUsuários;
			listaUsuários = (Usuário)eResolveProxy(oldListaUsuários);
			if (listaUsuários != oldListaUsuários) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_USUÁRIOS, oldListaUsuários, listaUsuários));
			}
		}
		return listaUsuários;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usuário basicGetListaUsuários() {
		return listaUsuários;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListaUsuários(Usuário newListaUsuários) {
		Usuário oldListaUsuários = listaUsuários;
		listaUsuários = newListaUsuários;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_USUÁRIOS, oldListaUsuários, listaUsuários));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usuário getUsuário() {
		if (usuário != null && usuário.eIsProxy()) {
			InternalEObject oldUsuário = (InternalEObject)usuário;
			usuário = (Usuário)eResolveProxy(oldUsuário);
			if (usuário != oldUsuário) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodabibliotecaPackage.SISTEMA_CADASTRO__USUÁRIO, oldUsuário, usuário));
			}
		}
		return usuário;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usuário basicGetUsuário() {
		return usuário;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsuário(Usuário newUsuário) {
		Usuário oldUsuário = usuário;
		usuário = newUsuário;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.SISTEMA_CADASTRO__USUÁRIO, oldUsuário, usuário));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publicação getListaPublicações() {
		if (listaPublicações != null && listaPublicações.eIsProxy()) {
			InternalEObject oldListaPublicações = (InternalEObject)listaPublicações;
			listaPublicações = (Publicação)eResolveProxy(oldListaPublicações);
			if (listaPublicações != oldListaPublicações) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_PUBLICAÇÕES, oldListaPublicações, listaPublicações));
			}
		}
		return listaPublicações;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publicação basicGetListaPublicações() {
		return listaPublicações;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListaPublicações(Publicação newListaPublicações) {
		Publicação oldListaPublicações = listaPublicações;
		listaPublicações = newListaPublicações;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_PUBLICAÇÕES, oldListaPublicações, listaPublicações));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publicação getPublicação() {
		if (publicação != null && publicação.eIsProxy()) {
			InternalEObject oldPublicação = (InternalEObject)publicação;
			publicação = (Publicação)eResolveProxy(oldPublicação);
			if (publicação != oldPublicação) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelodabibliotecaPackage.SISTEMA_CADASTRO__PUBLICAÇÃO, oldPublicação, publicação));
			}
		}
		return publicação;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publicação basicGetPublicação() {
		return publicação;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicação(Publicação newPublicação) {
		Publicação oldPublicação = publicação;
		publicação = newPublicação;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelodabibliotecaPackage.SISTEMA_CADASTRO__PUBLICAÇÃO, oldPublicação, publicação));
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
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_USUÁRIOS:
				if (resolve) return getListaUsuários();
				return basicGetListaUsuários();
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__USUÁRIO:
				if (resolve) return getUsuário();
				return basicGetUsuário();
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_PUBLICAÇÕES:
				if (resolve) return getListaPublicações();
				return basicGetListaPublicações();
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__PUBLICAÇÃO:
				if (resolve) return getPublicação();
				return basicGetPublicação();
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
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_USUÁRIOS:
				setListaUsuários((Usuário)newValue);
				return;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__USUÁRIO:
				setUsuário((Usuário)newValue);
				return;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_PUBLICAÇÕES:
				setListaPublicações((Publicação)newValue);
				return;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__PUBLICAÇÃO:
				setPublicação((Publicação)newValue);
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
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_USUÁRIOS:
				setListaUsuários((Usuário)null);
				return;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__USUÁRIO:
				setUsuário((Usuário)null);
				return;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_PUBLICAÇÕES:
				setListaPublicações((Publicação)null);
				return;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__PUBLICAÇÃO:
				setPublicação((Publicação)null);
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
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_USUÁRIOS:
				return listaUsuários != null;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__USUÁRIO:
				return usuário != null;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__LISTA_PUBLICAÇÕES:
				return listaPublicações != null;
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO__PUBLICAÇÃO:
				return publicação != null;
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
