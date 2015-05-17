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
				if (result == null) result = caseSistemaEmpréstimo(terminal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.SISTEMA_CADASTRO: {
				SistemaCadastro sistemaCadastro = (SistemaCadastro)theEObject;
				T result = caseSistemaCadastro(sistemaCadastro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.USUÁRIO: {
				Usuário usuário = (Usuário)theEObject;
				T result = caseUsuário(usuário);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.PUBLICAÇÃO: {
				Publicação publicação = (Publicação)theEObject;
				T result = casePublicação(publicação);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.EXEMPLAR: {
				Exemplar exemplar = (Exemplar)theEObject;
				T result = caseExemplar(exemplar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.SISTEMA_EMPRÉSTIMO: {
				SistemaEmpréstimo sistemaEmpréstimo = (SistemaEmpréstimo)theEObject;
				T result = caseSistemaEmpréstimo(sistemaEmpréstimo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.LIVRO: {
				Livro livro = (Livro)theEObject;
				T result = caseLivro(livro);
				if (result == null) result = casePublicação(livro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.PERIÓDICO: {
				Periódico periódico = (Periódico)theEObject;
				T result = casePeriódico(periódico);
				if (result == null) result = casePublicação(periódico);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.TESE: {
				Tese tese = (Tese)theEObject;
				T result = caseTese(tese);
				if (result == null) result = casePublicação(tese);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.MANUAL: {
				Manual manual = (Manual)theEObject;
				T result = caseManual(manual);
				if (result == null) result = casePublicação(manual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.ALUNO: {
				Aluno aluno = (Aluno)theEObject;
				T result = caseAluno(aluno);
				if (result == null) result = caseUsuário(aluno);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.PROFESSOR: {
				Professor professor = (Professor)theEObject;
				T result = caseProfessor(professor);
				if (result == null) result = caseFuncionário(professor);
				if (result == null) result = caseUsuário(professor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.FUNCIONÁRIO: {
				Funcionário funcionário = (Funcionário)theEObject;
				T result = caseFuncionário(funcionário);
				if (result == null) result = caseUsuário(funcionário);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.ATENDENTE: {
				Atendente atendente = (Atendente)theEObject;
				T result = caseAtendente(atendente);
				if (result == null) result = caseFuncionário(atendente);
				if (result == null) result = caseUsuário(atendente);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelodabibliotecaPackage.BIBLIOTECÁRIA: {
				Bibliotecária bibliotecária = (Bibliotecária)theEObject;
				T result = caseBibliotecária(bibliotecária);
				if (result == null) result = caseFuncionário(bibliotecária);
				if (result == null) result = caseUsuário(bibliotecária);
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
	 * Returns the result of interpreting the object as an instance of '<em>Publicação</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publicação</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicação(Publicação object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Sistema Empréstimo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sistema Empréstimo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSistemaEmpréstimo(SistemaEmpréstimo object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Periódico</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periódico</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriódico(Periódico object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Usuário</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usuário</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsuário(Usuário object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Funcionário</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcionário</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncionário(Funcionário object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Bibliotecária</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliotecária</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliotecária(Bibliotecária object) {
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
