/**
 */
package Modelodabiblioteca.util;

import Modelodabiblioteca.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Modelodabiblioteca.ModelodabibliotecaPackage
 * @generated
 */
public class ModelodabibliotecaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelodabibliotecaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelodabibliotecaSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelodabibliotecaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelodabibliotecaPackage.BIBLIOTECA: {
				Biblioteca biblioteca = (Biblioteca)theEObject;
				T result = caseBiblioteca(biblioteca);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.TERMINAL: {
				Terminal terminal = (Terminal)theEObject;
				T result = caseTerminal(terminal);
				if (result == null) result = caseSistemaCadastro(terminal);
				if (result == null) result = caseSistemaEmpr�stimo(terminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO: {
				SistemaCadastro sistemaCadastro = (SistemaCadastro)theEObject;
				T result = caseSistemaCadastro(sistemaCadastro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.USU�RIO: {
				Usu�rio usu�rio = (Usu�rio)theEObject;
				T result = caseUsu�rio(usu�rio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.PUBLICA��O: {
				Publica��o publica��o = (Publica��o)theEObject;
				T result = casePublica��o(publica��o);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.EXEMPLAR: {
				Exemplar exemplar = (Exemplar)theEObject;
				T result = caseExemplar(exemplar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.SISTEMA_EMPR�STIMO: {
				SistemaEmpr�stimo sistemaEmpr�stimo = (SistemaEmpr�stimo)theEObject;
				T result = caseSistemaEmpr�stimo(sistemaEmpr�stimo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.LIVRO: {
				Livro livro = (Livro)theEObject;
				T result = caseLivro(livro);
				if (result == null) result = casePublica��o(livro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.PERI�DICO: {
				Peri�dico peri�dico = (Peri�dico)theEObject;
				T result = casePeri�dico(peri�dico);
				if (result == null) result = casePublica��o(peri�dico);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.TESE: {
				Tese tese = (Tese)theEObject;
				T result = caseTese(tese);
				if (result == null) result = casePublica��o(tese);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.MANUAL: {
				Manual manual = (Manual)theEObject;
				T result = caseManual(manual);
				if (result == null) result = casePublica��o(manual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.ALUNO: {
				Aluno aluno = (Aluno)theEObject;
				T result = caseAluno(aluno);
				if (result == null) result = caseUsu�rio(aluno);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.PROFESSOR: {
				Professor professor = (Professor)theEObject;
				T result = caseProfessor(professor);
				if (result == null) result = caseFuncion�rio(professor);
				if (result == null) result = caseUsu�rio(professor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.FUNCION�RIO: {
				Funcion�rio funcion�rio = (Funcion�rio)theEObject;
				T result = caseFuncion�rio(funcion�rio);
				if (result == null) result = caseUsu�rio(funcion�rio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.ATENDENTE: {
				Atendente atendente = (Atendente)theEObject;
				T result = caseAtendente(atendente);
				if (result == null) result = caseFuncion�rio(atendente);
				if (result == null) result = caseUsu�rio(atendente);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.BIBLIOTEC�RIA: {
				Bibliotec�ria bibliotec�ria = (Bibliotec�ria)theEObject;
				T result = caseBibliotec�ria(bibliotec�ria);
				if (result == null) result = caseFuncion�rio(bibliotec�ria);
				if (result == null) result = caseUsu�rio(bibliotec�ria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biblioteca</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biblioteca</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiblioteca(Biblioteca object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publica��o</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publica��o</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublica��o(Publica��o object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminal(Terminal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sistema Cadastro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sistema Cadastro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSistemaCadastro(SistemaCadastro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exemplar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exemplar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExemplar(Exemplar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sistema Empr�stimo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sistema Empr�stimo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSistemaEmpr�stimo(SistemaEmpr�stimo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Livro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Livro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivro(Livro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Peri�dico</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Peri�dico</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeri�dico(Peri�dico object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tese</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tese</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTese(Tese object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManual(Manual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usu�rio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usu�rio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsu�rio(Usu�rio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aluno</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aluno</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAluno(Aluno object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Professor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Professor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfessor(Professor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funcion�rio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcion�rio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncion�rio(Funcion�rio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atendente</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atendente</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtendente(Atendente object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliotec�ria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliotec�ria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliotec�ria(Bibliotec�ria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelodabibliotecaSwitch
