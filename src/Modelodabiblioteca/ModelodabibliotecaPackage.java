/**
 */
package Modelodabiblioteca;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Modelodabiblioteca.ModelodabibliotecaFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Modelo da biblioteca'"
 * @generated
 */
public interface ModelodabibliotecaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Modelodabiblioteca";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Modelodabiblioteca.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Modelodabiblioteca";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelodabibliotecaPackage eINSTANCE = Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl.init();

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.BibliotecaImpl <em>Biblioteca</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.BibliotecaImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getBiblioteca()
	 * @generated
	 */
	int BIBLIOTECA = 0;

	/**
	 * The number of structural features of the '<em>Biblioteca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Biblioteca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.PublicaçãoImpl <em>Publicação</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.PublicaçãoImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getPublicação()
	 * @generated
	 */
	int PUBLICAÇÃO = 1;

	/**
	 * The number of structural features of the '<em>Publicação</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICAÇÃO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Publicação</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICAÇÃO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.TerminalImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 2;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.ExemplarImpl <em>Exemplar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.ExemplarImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getExemplar()
	 * @generated
	 */
	int EXEMPLAR = 3;

	/**
	 * The number of structural features of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.EmpréstimoImpl <em>Empréstimo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.EmpréstimoImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getEmpréstimo()
	 * @generated
	 */
	int EMPRÉSTIMO = 4;

	/**
	 * The number of structural features of the '<em>Empréstimo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRÉSTIMO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Empréstimo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRÉSTIMO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.LivroImpl <em>Livro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.LivroImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getLivro()
	 * @generated
	 */
	int LIVRO = 5;

	/**
	 * The number of structural features of the '<em>Livro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO_FEATURE_COUNT = PUBLICAÇÃO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Livro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO_OPERATION_COUNT = PUBLICAÇÃO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.PeriódicoImpl <em>Periódico</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.PeriódicoImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getPeriódico()
	 * @generated
	 */
	int PERIÓDICO = 6;

	/**
	 * The number of structural features of the '<em>Periódico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIÓDICO_FEATURE_COUNT = PUBLICAÇÃO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Periódico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIÓDICO_OPERATION_COUNT = PUBLICAÇÃO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.TeseImpl <em>Tese</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.TeseImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getTese()
	 * @generated
	 */
	int TESE = 7;

	/**
	 * The number of structural features of the '<em>Tese</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE_FEATURE_COUNT = PUBLICAÇÃO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tese</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE_OPERATION_COUNT = PUBLICAÇÃO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.ManualImpl <em>Manual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.ManualImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getManual()
	 * @generated
	 */
	int MANUAL = 8;

	/**
	 * The number of structural features of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_FEATURE_COUNT = PUBLICAÇÃO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_OPERATION_COUNT = PUBLICAÇÃO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.UsuárioImpl <em>Usuário</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.UsuárioImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getUsuário()
	 * @generated
	 */
	int USUÁRIO = 9;

	/**
	 * The number of structural features of the '<em>Usuário</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Usuário</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.AlunoImpl <em>Aluno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.AlunoImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getAluno()
	 * @generated
	 */
	int ALUNO = 10;

	/**
	 * The number of structural features of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_FEATURE_COUNT = USUÁRIO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_OPERATION_COUNT = USUÁRIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.ProfessorImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getProfessor()
	 * @generated
	 */
	int PROFESSOR = 11;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = USUÁRIO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = USUÁRIO_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Modelodabiblioteca.Biblioteca <em>Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biblioteca</em>'.
	 * @see Modelodabiblioteca.Biblioteca
	 * @generated
	 */
	EClass getBiblioteca();

	/**
	 * Returns the meta object for class '{@link Modelodabiblioteca.Publicação <em>Publicação</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publicação</em>'.
	 * @see Modelodabiblioteca.Publicação
	 * @generated
	 */
	EClass getPublicação();

	/**
	 * Returns the meta object for class '{@link Modelodabiblioteca.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see Modelodabiblioteca.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for class '{@link Modelodabiblioteca.Exemplar <em>Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exemplar</em>'.
	 * @see Modelodabiblioteca.Exemplar
	 * @generated
	 */
	EClass getExemplar();

	/**
	 * Returns the meta object for class '{@link Modelodabiblioteca.Empréstimo <em>Empréstimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empréstimo</em>'.
	 * @see Modelodabiblioteca.Empréstimo
	 * @generated
	 */
	EClass getEmpréstimo();

	/**
	 * Returns the meta object for class '{@link Modelodabiblioteca.Livro <em>Livro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Livro</em>'.
	 * @see Modelodabiblioteca.Livro
	 * @generated
	 */
	EClass getLivro();

	/**
	 * Returns the meta object for class '{@link Modelodabiblioteca.Periódico <em>Periódico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periódico</em>'.
	 * @see Modelodabiblioteca.Periódico
	 * @generated
	 */
	EClass getPeriódico();

	/**
	 * Returns the meta object for class '{@link Modelodabiblioteca.Tese <em>Tese</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tese</em>'.
	 * @see Modelodabiblioteca.Tese
	 * @generated
	 */
	EClass getTese();

	/**
	 * Returns the meta object for class '{@link Modelodabiblioteca.Manual <em>Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual</em>'.
	 * @see Modelodabiblioteca.Manual
	 * @generated
	 */
	EClass getManual();

	/**
	 * Returns the meta object for class '{@link Modelodabiblioteca.Usuário <em>Usuário</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuário</em>'.
	 * @see Modelodabiblioteca.Usuário
	 * @generated
	 */
	EClass getUsuário();

	/**
	 * Returns the meta object for class '{@link Modelodabiblioteca.Aluno <em>Aluno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aluno</em>'.
	 * @see Modelodabiblioteca.Aluno
	 * @generated
	 */
	EClass getAluno();

	/**
	 * Returns the meta object for class '{@link Modelodabiblioteca.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor</em>'.
	 * @see Modelodabiblioteca.Professor
	 * @generated
	 */
	EClass getProfessor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelodabibliotecaFactory getModelodabibliotecaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.BibliotecaImpl <em>Biblioteca</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.BibliotecaImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getBiblioteca()
		 * @generated
		 */
		EClass BIBLIOTECA = eINSTANCE.getBiblioteca();

		/**
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.PublicaçãoImpl <em>Publicação</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.PublicaçãoImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getPublicação()
		 * @generated
		 */
		EClass PUBLICAÇÃO = eINSTANCE.getPublicação();

		/**
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.TerminalImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.ExemplarImpl <em>Exemplar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.ExemplarImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getExemplar()
		 * @generated
		 */
		EClass EXEMPLAR = eINSTANCE.getExemplar();

		/**
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.EmpréstimoImpl <em>Empréstimo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.EmpréstimoImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getEmpréstimo()
		 * @generated
		 */
		EClass EMPRÉSTIMO = eINSTANCE.getEmpréstimo();

		/**
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.LivroImpl <em>Livro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.LivroImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getLivro()
		 * @generated
		 */
		EClass LIVRO = eINSTANCE.getLivro();

		/**
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.PeriódicoImpl <em>Periódico</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.PeriódicoImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getPeriódico()
		 * @generated
		 */
		EClass PERIÓDICO = eINSTANCE.getPeriódico();

		/**
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.TeseImpl <em>Tese</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.TeseImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getTese()
		 * @generated
		 */
		EClass TESE = eINSTANCE.getTese();

		/**
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.ManualImpl <em>Manual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.ManualImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getManual()
		 * @generated
		 */
		EClass MANUAL = eINSTANCE.getManual();

		/**
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.UsuárioImpl <em>Usuário</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.UsuárioImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getUsuário()
		 * @generated
		 */
		EClass USUÁRIO = eINSTANCE.getUsuário();

		/**
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.AlunoImpl <em>Aluno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.AlunoImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getAluno()
		 * @generated
		 */
		EClass ALUNO = eINSTANCE.getAluno();

		/**
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.ProfessorImpl <em>Professor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.ProfessorImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getProfessor()
		 * @generated
		 */
		EClass PROFESSOR = eINSTANCE.getProfessor();

	}

} //ModelodabibliotecaPackage
