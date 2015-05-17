/**
 */
package Modelodabiblioteca.util;

import Modelodabiblioteca.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Modelodabiblioteca.ModelodabibliotecaPackage
 * @generated
 */
public class ModelodabibliotecaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelodabibliotecaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelodabibliotecaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelodabibliotecaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelodabibliotecaSwitch<Adapter> modelSwitch =
		new ModelodabibliotecaSwitch<Adapter>() {
			@Override
			public Adapter caseBiblioteca(Biblioteca object) {
				return createBibliotecaAdapter();
			}
			@Override
			public Adapter caseTerminal(Terminal object) {
				return createTerminalAdapter();
			}
			@Override
			public Adapter caseSistemaCadastro(SistemaCadastro object) {
				return createSistemaCadastroAdapter();
			}
			@Override
			public Adapter caseUsu�rio(Usu�rio object) {
				return createUsu�rioAdapter();
			}
			@Override
			public Adapter casePublica��o(Publica��o object) {
				return createPublica��oAdapter();
			}
			@Override
			public Adapter caseExemplar(Exemplar object) {
				return createExemplarAdapter();
			}
			@Override
			public Adapter caseSistemaEmpr�stimo(SistemaEmpr�stimo object) {
				return createSistemaEmpr�stimoAdapter();
			}
			@Override
			public Adapter caseLivro(Livro object) {
				return createLivroAdapter();
			}
			@Override
			public Adapter casePeri�dico(Peri�dico object) {
				return createPeri�dicoAdapter();
			}
			@Override
			public Adapter caseTese(Tese object) {
				return createTeseAdapter();
			}
			@Override
			public Adapter caseManual(Manual object) {
				return createManualAdapter();
			}
			@Override
			public Adapter caseAluno(Aluno object) {
				return createAlunoAdapter();
			}
			@Override
			public Adapter caseProfessor(Professor object) {
				return createProfessorAdapter();
			}
			@Override
			public Adapter caseFuncion�rio(Funcion�rio object) {
				return createFuncion�rioAdapter();
			}
			@Override
			public Adapter caseAtendente(Atendente object) {
				return createAtendenteAdapter();
			}
			@Override
			public Adapter caseBibliotec�ria(Bibliotec�ria object) {
				return createBibliotec�riaAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Modelodabiblioteca.Biblioteca <em>Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelodabiblioteca.Biblioteca
	 * @generated
	 */
	public Adapter createBibliotecaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelodabiblioteca.Publica��o <em>Publica��o</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelodabiblioteca.Publica��o
	 * @generated
	 */
	public Adapter createPublica��oAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelodabiblioteca.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelodabiblioteca.Terminal
	 * @generated
	 */
	public Adapter createTerminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelodabiblioteca.SistemaCadastro <em>Sistema Cadastro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelodabiblioteca.SistemaCadastro
	 * @generated
	 */
	public Adapter createSistemaCadastroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelodabiblioteca.Exemplar <em>Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelodabiblioteca.Exemplar
	 * @generated
	 */
	public Adapter createExemplarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelodabiblioteca.SistemaEmpr�stimo <em>Sistema Empr�stimo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelodabiblioteca.SistemaEmpr�stimo
	 * @generated
	 */
	public Adapter createSistemaEmpr�stimoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelodabiblioteca.Livro <em>Livro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelodabiblioteca.Livro
	 * @generated
	 */
	public Adapter createLivroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelodabiblioteca.Peri�dico <em>Peri�dico</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelodabiblioteca.Peri�dico
	 * @generated
	 */
	public Adapter createPeri�dicoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelodabiblioteca.Tese <em>Tese</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelodabiblioteca.Tese
	 * @generated
	 */
	public Adapter createTeseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelodabiblioteca.Manual <em>Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelodabiblioteca.Manual
	 * @generated
	 */
	public Adapter createManualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelodabiblioteca.Usu�rio <em>Usu�rio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelodabiblioteca.Usu�rio
	 * @generated
	 */
	public Adapter createUsu�rioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelodabiblioteca.Aluno <em>Aluno</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelodabiblioteca.Aluno
	 * @generated
	 */
	public Adapter createAlunoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelodabiblioteca.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelodabiblioteca.Professor
	 * @generated
	 */
	public Adapter createProfessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelodabiblioteca.Funcion�rio <em>Funcion�rio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelodabiblioteca.Funcion�rio
	 * @generated
	 */
	public Adapter createFuncion�rioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelodabiblioteca.Atendente <em>Atendente</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelodabiblioteca.Atendente
	 * @generated
	 */
	public Adapter createAtendenteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Modelodabiblioteca.Bibliotec�ria <em>Bibliotec�ria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Modelodabiblioteca.Bibliotec�ria
	 * @generated
	 */
	public Adapter createBibliotec�riaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelodabibliotecaAdapterFactory
