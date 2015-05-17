/**
 */
package Modelodabiblioteca.impl;

import Modelodabiblioteca.Aluno;
import Modelodabiblioteca.Atendente;
import Modelodabiblioteca.Biblioteca;
import Modelodabiblioteca.Bibliotecária;
import Modelodabiblioteca.Exemplar;
import Modelodabiblioteca.Funcionário;
import Modelodabiblioteca.Livro;
import Modelodabiblioteca.Manual;
import Modelodabiblioteca.ModelodabibliotecaFactory;
import Modelodabiblioteca.ModelodabibliotecaPackage;
import Modelodabiblioteca.Periódico;
import Modelodabiblioteca.Professor;
import Modelodabiblioteca.Publicação;
import Modelodabiblioteca.SistemaCadastro;
import Modelodabiblioteca.SistemaEmpréstimo;
import Modelodabiblioteca.Terminal;
import Modelodabiblioteca.Tese;
import Modelodabiblioteca.Usuário;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelodabibliotecaPackageImpl extends EPackageImpl implements ModelodabibliotecaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bibliotecaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicaçãoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sistemaCadastroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exemplarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sistemaEmpréstimoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periódicoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usuárioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alunoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcionárioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atendenteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bibliotecáriaEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Modelodabiblioteca.ModelodabibliotecaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelodabibliotecaPackageImpl() {
		super(eNS_URI, ModelodabibliotecaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelodabibliotecaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelodabibliotecaPackage init() {
		if (isInited) return (ModelodabibliotecaPackage)EPackage.Registry.INSTANCE.getEPackage(ModelodabibliotecaPackage.eNS_URI);

		// Obtain or create and register package
		ModelodabibliotecaPackageImpl theModelodabibliotecaPackage = (ModelodabibliotecaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelodabibliotecaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelodabibliotecaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theModelodabibliotecaPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theModelodabibliotecaPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelodabibliotecaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelodabibliotecaPackage.eNS_URI, theModelodabibliotecaPackage);
		return theModelodabibliotecaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBiblioteca() {
		return bibliotecaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBiblioteca_TerminalBiblioteca() {
		return (EReference)bibliotecaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBiblioteca_SistEmprestimoBiblioteca() {
		return (EReference)bibliotecaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBiblioteca_SistCadastroBiblioteca() {
		return (EReference)bibliotecaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicação() {
		return publicaçãoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicação_Nome() {
		return (EAttribute)publicaçãoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicação_Autor() {
		return (EAttribute)publicaçãoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicação_Data() {
		return (EAttribute)publicaçãoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicação_ExemplarBiblioteca() {
		return (EReference)publicaçãoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminal() {
		return terminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSistemaCadastro() {
		return sistemaCadastroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSistemaCadastro_ListaUsuários() {
		return (EReference)sistemaCadastroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSistemaCadastro_Usuário() {
		return (EReference)sistemaCadastroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSistemaCadastro_ListaPublicações() {
		return (EReference)sistemaCadastroEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSistemaCadastro_Publicação() {
		return (EReference)sistemaCadastroEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSistemaCadastro__ConferirUsuario() {
		return sistemaCadastroEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSistemaCadastro__CadastrarUsuario() {
		return sistemaCadastroEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSistemaCadastro__IncluirExemplar() {
		return sistemaCadastroEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSistemaCadastro__ExcluirExemplar() {
		return sistemaCadastroEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSistemaCadastro__AtualizarExemplar() {
		return sistemaCadastroEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExemplar() {
		return exemplarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_Quantidade() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_NumeroEtiqueta() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSistemaEmpréstimo() {
		return sistemaEmpréstimoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSistemaEmpréstimo__FazerReserva() {
		return sistemaEmpréstimoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSistemaEmpréstimo__CancelarReserva() {
		return sistemaEmpréstimoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSistemaEmpréstimo__RealizarEmprestimo() {
		return sistemaEmpréstimoEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSistemaEmpréstimo__DesfazerEmprestimo() {
		return sistemaEmpréstimoEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivro() {
		return livroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriódico() {
		return periódicoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTese() {
		return teseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManual() {
		return manualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsuário() {
		return usuárioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuário_NumeroRegistro() {
		return (EAttribute)usuárioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuário_Nome() {
		return (EAttribute)usuárioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuário_Instituto() {
		return (EAttribute)usuárioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuário_Tipo() {
		return (EAttribute)usuárioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsuário__FazerReserva() {
		return usuárioEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsuário__CancelarReserva() {
		return usuárioEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAluno() {
		return alunoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfessor() {
		return professorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProfessor__Bloquear() {
		return professorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProfessor__Desbloquear() {
		return professorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncionário() {
		return funcionárioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtendente() {
		return atendenteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtendente_Terminal() {
		return (EReference)atendenteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtendente_TerminalAtendente() {
		return (EReference)atendenteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtendente__RealizarEmprestimo() {
		return atendenteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtendente__DesfazerEmprestimo() {
		return atendenteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtendente__ConferirUsuario() {
		return atendenteEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtendente__CadastrarUsuario() {
		return atendenteEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBibliotecária() {
		return bibliotecáriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBibliotecária_Terminal() {
		return (EReference)bibliotecáriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBibliotecária_TerminalBibliotecária() {
		return (EReference)bibliotecáriaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBibliotecária__IncluirExemplar() {
		return bibliotecáriaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBibliotecária__ExcluirExemplar() {
		return bibliotecáriaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBibliotecária__AtualizarExemplar() {
		return bibliotecáriaEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelodabibliotecaFactory getModelodabibliotecaFactory() {
		return (ModelodabibliotecaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bibliotecaEClass = createEClass(BIBLIOTECA);
		createEReference(bibliotecaEClass, BIBLIOTECA__TERMINAL_BIBLIOTECA);
		createEReference(bibliotecaEClass, BIBLIOTECA__SIST_EMPRESTIMO_BIBLIOTECA);
		createEReference(bibliotecaEClass, BIBLIOTECA__SIST_CADASTRO_BIBLIOTECA);

		terminalEClass = createEClass(TERMINAL);

		sistemaCadastroEClass = createEClass(SISTEMA_CADASTRO);
		createEReference(sistemaCadastroEClass, SISTEMA_CADASTRO__LISTA_USUÁRIOS);
		createEReference(sistemaCadastroEClass, SISTEMA_CADASTRO__USUÁRIO);
		createEReference(sistemaCadastroEClass, SISTEMA_CADASTRO__LISTA_PUBLICAÇÕES);
		createEReference(sistemaCadastroEClass, SISTEMA_CADASTRO__PUBLICAÇÃO);
		createEOperation(sistemaCadastroEClass, SISTEMA_CADASTRO___CONFERIR_USUARIO);
		createEOperation(sistemaCadastroEClass, SISTEMA_CADASTRO___CADASTRAR_USUARIO);
		createEOperation(sistemaCadastroEClass, SISTEMA_CADASTRO___INCLUIR_EXEMPLAR);
		createEOperation(sistemaCadastroEClass, SISTEMA_CADASTRO___EXCLUIR_EXEMPLAR);
		createEOperation(sistemaCadastroEClass, SISTEMA_CADASTRO___ATUALIZAR_EXEMPLAR);

		usuárioEClass = createEClass(USUÁRIO);
		createEAttribute(usuárioEClass, USUÁRIO__NUMERO_REGISTRO);
		createEAttribute(usuárioEClass, USUÁRIO__NOME);
		createEAttribute(usuárioEClass, USUÁRIO__INSTITUTO);
		createEAttribute(usuárioEClass, USUÁRIO__TIPO);
		createEOperation(usuárioEClass, USUÁRIO___FAZER_RESERVA);
		createEOperation(usuárioEClass, USUÁRIO___CANCELAR_RESERVA);

		publicaçãoEClass = createEClass(PUBLICAÇÃO);
		createEAttribute(publicaçãoEClass, PUBLICAÇÃO__NOME);
		createEAttribute(publicaçãoEClass, PUBLICAÇÃO__AUTOR);
		createEAttribute(publicaçãoEClass, PUBLICAÇÃO__DATA);
		createEReference(publicaçãoEClass, PUBLICAÇÃO__EXEMPLAR_BIBLIOTECA);

		exemplarEClass = createEClass(EXEMPLAR);
		createEAttribute(exemplarEClass, EXEMPLAR__QUANTIDADE);
		createEAttribute(exemplarEClass, EXEMPLAR__NUMERO_ETIQUETA);

		sistemaEmpréstimoEClass = createEClass(SISTEMA_EMPRÉSTIMO);
		createEOperation(sistemaEmpréstimoEClass, SISTEMA_EMPRÉSTIMO___FAZER_RESERVA);
		createEOperation(sistemaEmpréstimoEClass, SISTEMA_EMPRÉSTIMO___CANCELAR_RESERVA);
		createEOperation(sistemaEmpréstimoEClass, SISTEMA_EMPRÉSTIMO___REALIZAR_EMPRESTIMO);
		createEOperation(sistemaEmpréstimoEClass, SISTEMA_EMPRÉSTIMO___DESFAZER_EMPRESTIMO);

		livroEClass = createEClass(LIVRO);

		periódicoEClass = createEClass(PERIÓDICO);

		teseEClass = createEClass(TESE);

		manualEClass = createEClass(MANUAL);

		alunoEClass = createEClass(ALUNO);

		professorEClass = createEClass(PROFESSOR);
		createEOperation(professorEClass, PROFESSOR___BLOQUEAR);
		createEOperation(professorEClass, PROFESSOR___DESBLOQUEAR);

		funcionárioEClass = createEClass(FUNCIONÁRIO);

		atendenteEClass = createEClass(ATENDENTE);
		createEReference(atendenteEClass, ATENDENTE__TERMINAL);
		createEReference(atendenteEClass, ATENDENTE__TERMINAL_ATENDENTE);
		createEOperation(atendenteEClass, ATENDENTE___REALIZAR_EMPRESTIMO);
		createEOperation(atendenteEClass, ATENDENTE___DESFAZER_EMPRESTIMO);
		createEOperation(atendenteEClass, ATENDENTE___CONFERIR_USUARIO);
		createEOperation(atendenteEClass, ATENDENTE___CADASTRAR_USUARIO);

		bibliotecáriaEClass = createEClass(BIBLIOTECÁRIA);
		createEReference(bibliotecáriaEClass, BIBLIOTECÁRIA__TERMINAL);
		createEReference(bibliotecáriaEClass, BIBLIOTECÁRIA__TERMINAL_BIBLIOTECÁRIA);
		createEOperation(bibliotecáriaEClass, BIBLIOTECÁRIA___INCLUIR_EXEMPLAR);
		createEOperation(bibliotecáriaEClass, BIBLIOTECÁRIA___EXCLUIR_EXEMPLAR);
		createEOperation(bibliotecáriaEClass, BIBLIOTECÁRIA___ATUALIZAR_EXEMPLAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		terminalEClass.getESuperTypes().add(this.getSistemaCadastro());
		terminalEClass.getESuperTypes().add(this.getSistemaEmpréstimo());
		livroEClass.getESuperTypes().add(this.getPublicação());
		periódicoEClass.getESuperTypes().add(this.getPublicação());
		teseEClass.getESuperTypes().add(this.getPublicação());
		manualEClass.getESuperTypes().add(this.getPublicação());
		alunoEClass.getESuperTypes().add(this.getUsuário());
		professorEClass.getESuperTypes().add(this.getFuncionário());
		funcionárioEClass.getESuperTypes().add(this.getUsuário());
		atendenteEClass.getESuperTypes().add(this.getFuncionário());
		bibliotecáriaEClass.getESuperTypes().add(this.getFuncionário());

		// Initialize classes, features, and operations; add parameters
		initEClass(bibliotecaEClass, Biblioteca.class, "Biblioteca", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBiblioteca_TerminalBiblioteca(), this.getTerminal(), null, "TerminalBiblioteca", null, 1, 1, Biblioteca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBiblioteca_SistEmprestimoBiblioteca(), this.getSistemaEmpréstimo(), null, "SistEmprestimoBiblioteca", null, 1, 1, Biblioteca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBiblioteca_SistCadastroBiblioteca(), this.getSistemaCadastro(), null, "SistCadastroBiblioteca", null, 1, 1, Biblioteca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(terminalEClass, Terminal.class, "Terminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sistemaCadastroEClass, SistemaCadastro.class, "SistemaCadastro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSistemaCadastro_ListaUsuários(), this.getUsuário(), null, "ListaUsuários", null, 1, 1, SistemaCadastro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSistemaCadastro_Usuário(), this.getUsuário(), null, "usuário", null, 1, 1, SistemaCadastro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSistemaCadastro_ListaPublicações(), this.getPublicação(), null, "ListaPublicações", null, 1, 1, SistemaCadastro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSistemaCadastro_Publicação(), this.getPublicação(), null, "publicação", null, 1, 1, SistemaCadastro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getSistemaCadastro__ConferirUsuario(), null, "ConferirUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSistemaCadastro__CadastrarUsuario(), null, "CadastrarUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSistemaCadastro__IncluirExemplar(), null, "IncluirExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSistemaCadastro__ExcluirExemplar(), null, "ExcluirExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSistemaCadastro__AtualizarExemplar(), null, "AtualizarExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(usuárioEClass, Usuário.class, "Usuário", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsuário_NumeroRegistro(), theTypesPackage.getInteger(), "NumeroRegistro", null, 1, 1, Usuário.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuário_Nome(), theTypesPackage.getString(), "Nome", null, 1, 1, Usuário.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuário_Instituto(), theTypesPackage.getString(), "Instituto", null, 1, 1, Usuário.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuário_Tipo(), theTypesPackage.getString(), "Tipo", null, 1, 1, Usuário.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getUsuário__FazerReserva(), null, "FazerReserva", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUsuário__CancelarReserva(), null, "CancelarReserva", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(publicaçãoEClass, Publicação.class, "Publicação", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicação_Nome(), theTypesPackage.getString(), "Nome", null, 1, 1, Publicação.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPublicação_Autor(), theTypesPackage.getString(), "Autor", null, 1, 1, Publicação.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPublicação_Data(), theTypesPackage.getInteger(), "Data", null, 1, 1, Publicação.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPublicação_ExemplarBiblioteca(), this.getExemplar(), null, "ExemplarBiblioteca", null, 1, 1, Publicação.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(exemplarEClass, Exemplar.class, "Exemplar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExemplar_Quantidade(), theTypesPackage.getInteger(), "Quantidade", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExemplar_NumeroEtiqueta(), theTypesPackage.getInteger(), "NumeroEtiqueta", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sistemaEmpréstimoEClass, SistemaEmpréstimo.class, "SistemaEmpréstimo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSistemaEmpréstimo__FazerReserva(), null, "FazerReserva", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSistemaEmpréstimo__CancelarReserva(), null, "CancelarReserva", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSistemaEmpréstimo__RealizarEmprestimo(), null, "RealizarEmprestimo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSistemaEmpréstimo__DesfazerEmprestimo(), null, "DesfazerEmprestimo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(livroEClass, Livro.class, "Livro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(periódicoEClass, Periódico.class, "Periódico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(teseEClass, Tese.class, "Tese", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manualEClass, Manual.class, "Manual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alunoEClass, Aluno.class, "Aluno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(professorEClass, Professor.class, "Professor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getProfessor__Bloquear(), null, "Bloquear", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProfessor__Desbloquear(), null, "Desbloquear", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(funcionárioEClass, Funcionário.class, "Funcionário", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atendenteEClass, Atendente.class, "Atendente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtendente_Terminal(), this.getTerminal(), null, "terminal", null, 1, 1, Atendente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAtendente_TerminalAtendente(), this.getTerminal(), null, "TerminalAtendente", null, 1, 1, Atendente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getAtendente__RealizarEmprestimo(), null, "RealizarEmprestimo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAtendente__DesfazerEmprestimo(), null, "DesfazerEmprestimo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAtendente__ConferirUsuario(), null, "ConferirUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAtendente__CadastrarUsuario(), null, "CadastrarUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bibliotecáriaEClass, Bibliotecária.class, "Bibliotecária", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBibliotecária_Terminal(), this.getTerminal(), null, "terminal", null, 1, 1, Bibliotecária.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBibliotecária_TerminalBibliotecária(), this.getTerminal(), null, "TerminalBibliotecária", null, 1, 1, Bibliotecária.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getBibliotecária__IncluirExemplar(), null, "IncluirExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBibliotecária__ExcluirExemplar(), null, "ExcluirExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBibliotecária__AtualizarExemplar(), null, "AtualizarExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "Modelo da biblioteca"
		   });
	}

} //ModelodabibliotecaPackageImpl
