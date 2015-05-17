/**
 */
package Modelodabiblioteca.impl;

import Modelodabiblioteca.Aluno;
import Modelodabiblioteca.Atendente;
import Modelodabiblioteca.Biblioteca;
import Modelodabiblioteca.Bibliotec�ria;
import Modelodabiblioteca.Exemplar;
import Modelodabiblioteca.Funcion�rio;
import Modelodabiblioteca.Livro;
import Modelodabiblioteca.Manual;
import Modelodabiblioteca.ModelodabibliotecaFactory;
import Modelodabiblioteca.ModelodabibliotecaPackage;
import Modelodabiblioteca.Peri�dico;
import Modelodabiblioteca.Professor;
import Modelodabiblioteca.Publica��o;
import Modelodabiblioteca.SistemaCadastro;
import Modelodabiblioteca.SistemaEmpr�stimo;
import Modelodabiblioteca.Terminal;
import Modelodabiblioteca.Tese;
import Modelodabiblioteca.Usu�rio;
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
	private EClass publica��oEClass = null;

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
	private EClass sistemaEmpr�stimoEClass = null;

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
	private EClass peri�dicoEClass = null;

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
	private EClass usu�rioEClass = null;

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
	private EClass funcion�rioEClass = null;

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
	private EClass bibliotec�riaEClass = null;

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
	public EClass getPublica��o() {
		return publica��oEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublica��o_Nome() {
		return (EAttribute)publica��oEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublica��o_Autor() {
		return (EAttribute)publica��oEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublica��o_Data() {
		return (EAttribute)publica��oEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublica��o_ExemplarBiblioteca() {
		return (EReference)publica��oEClass.getEStructuralFeatures().get(3);
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
	public EReference getSistemaCadastro_ListaUsu�rios() {
		return (EReference)sistemaCadastroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSistemaCadastro_Usu�rio() {
		return (EReference)sistemaCadastroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSistemaCadastro_ListaPublica��es() {
		return (EReference)sistemaCadastroEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSistemaCadastro_Publica��o() {
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
	public EClass getSistemaEmpr�stimo() {
		return sistemaEmpr�stimoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSistemaEmpr�stimo__FazerReserva() {
		return sistemaEmpr�stimoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSistemaEmpr�stimo__CancelarReserva() {
		return sistemaEmpr�stimoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSistemaEmpr�stimo__RealizarEmprestimo() {
		return sistemaEmpr�stimoEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSistemaEmpr�stimo__DesfazerEmprestimo() {
		return sistemaEmpr�stimoEClass.getEOperations().get(3);
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
	public EClass getPeri�dico() {
		return peri�dicoEClass;
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
	public EClass getUsu�rio() {
		return usu�rioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsu�rio_NumeroRegistro() {
		return (EAttribute)usu�rioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsu�rio_Nome() {
		return (EAttribute)usu�rioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsu�rio_Instituto() {
		return (EAttribute)usu�rioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsu�rio_Tipo() {
		return (EAttribute)usu�rioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsu�rio__FazerReserva() {
		return usu�rioEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsu�rio__CancelarReserva() {
		return usu�rioEClass.getEOperations().get(1);
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
	public EClass getFuncion�rio() {
		return funcion�rioEClass;
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
	public EClass getBibliotec�ria() {
		return bibliotec�riaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBibliotec�ria_Terminal() {
		return (EReference)bibliotec�riaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBibliotec�ria_TerminalBibliotec�ria() {
		return (EReference)bibliotec�riaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBibliotec�ria__IncluirExemplar() {
		return bibliotec�riaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBibliotec�ria__ExcluirExemplar() {
		return bibliotec�riaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBibliotec�ria__AtualizarExemplar() {
		return bibliotec�riaEClass.getEOperations().get(2);
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
		createEReference(sistemaCadastroEClass, SISTEMA_CADASTRO__LISTA_USU�RIOS);
		createEReference(sistemaCadastroEClass, SISTEMA_CADASTRO__USU�RIO);
		createEReference(sistemaCadastroEClass, SISTEMA_CADASTRO__LISTA_PUBLICA��ES);
		createEReference(sistemaCadastroEClass, SISTEMA_CADASTRO__PUBLICA��O);
		createEOperation(sistemaCadastroEClass, SISTEMA_CADASTRO___CONFERIR_USUARIO);
		createEOperation(sistemaCadastroEClass, SISTEMA_CADASTRO___CADASTRAR_USUARIO);
		createEOperation(sistemaCadastroEClass, SISTEMA_CADASTRO___INCLUIR_EXEMPLAR);
		createEOperation(sistemaCadastroEClass, SISTEMA_CADASTRO___EXCLUIR_EXEMPLAR);
		createEOperation(sistemaCadastroEClass, SISTEMA_CADASTRO___ATUALIZAR_EXEMPLAR);

		usu�rioEClass = createEClass(USU�RIO);
		createEAttribute(usu�rioEClass, USU�RIO__NUMERO_REGISTRO);
		createEAttribute(usu�rioEClass, USU�RIO__NOME);
		createEAttribute(usu�rioEClass, USU�RIO__INSTITUTO);
		createEAttribute(usu�rioEClass, USU�RIO__TIPO);
		createEOperation(usu�rioEClass, USU�RIO___FAZER_RESERVA);
		createEOperation(usu�rioEClass, USU�RIO___CANCELAR_RESERVA);

		publica��oEClass = createEClass(PUBLICA��O);
		createEAttribute(publica��oEClass, PUBLICA��O__NOME);
		createEAttribute(publica��oEClass, PUBLICA��O__AUTOR);
		createEAttribute(publica��oEClass, PUBLICA��O__DATA);
		createEReference(publica��oEClass, PUBLICA��O__EXEMPLAR_BIBLIOTECA);

		exemplarEClass = createEClass(EXEMPLAR);
		createEAttribute(exemplarEClass, EXEMPLAR__QUANTIDADE);
		createEAttribute(exemplarEClass, EXEMPLAR__NUMERO_ETIQUETA);

		sistemaEmpr�stimoEClass = createEClass(SISTEMA_EMPR�STIMO);
		createEOperation(sistemaEmpr�stimoEClass, SISTEMA_EMPR�STIMO___FAZER_RESERVA);
		createEOperation(sistemaEmpr�stimoEClass, SISTEMA_EMPR�STIMO___CANCELAR_RESERVA);
		createEOperation(sistemaEmpr�stimoEClass, SISTEMA_EMPR�STIMO___REALIZAR_EMPRESTIMO);
		createEOperation(sistemaEmpr�stimoEClass, SISTEMA_EMPR�STIMO___DESFAZER_EMPRESTIMO);

		livroEClass = createEClass(LIVRO);

		peri�dicoEClass = createEClass(PERI�DICO);

		teseEClass = createEClass(TESE);

		manualEClass = createEClass(MANUAL);

		alunoEClass = createEClass(ALUNO);

		professorEClass = createEClass(PROFESSOR);
		createEOperation(professorEClass, PROFESSOR___BLOQUEAR);
		createEOperation(professorEClass, PROFESSOR___DESBLOQUEAR);

		funcion�rioEClass = createEClass(FUNCION�RIO);

		atendenteEClass = createEClass(ATENDENTE);
		createEReference(atendenteEClass, ATENDENTE__TERMINAL);
		createEReference(atendenteEClass, ATENDENTE__TERMINAL_ATENDENTE);
		createEOperation(atendenteEClass, ATENDENTE___REALIZAR_EMPRESTIMO);
		createEOperation(atendenteEClass, ATENDENTE___DESFAZER_EMPRESTIMO);
		createEOperation(atendenteEClass, ATENDENTE___CONFERIR_USUARIO);
		createEOperation(atendenteEClass, ATENDENTE___CADASTRAR_USUARIO);

		bibliotec�riaEClass = createEClass(BIBLIOTEC�RIA);
		createEReference(bibliotec�riaEClass, BIBLIOTEC�RIA__TERMINAL);
		createEReference(bibliotec�riaEClass, BIBLIOTEC�RIA__TERMINAL_BIBLIOTEC�RIA);
		createEOperation(bibliotec�riaEClass, BIBLIOTEC�RIA___INCLUIR_EXEMPLAR);
		createEOperation(bibliotec�riaEClass, BIBLIOTEC�RIA___EXCLUIR_EXEMPLAR);
		createEOperation(bibliotec�riaEClass, BIBLIOTEC�RIA___ATUALIZAR_EXEMPLAR);
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
		terminalEClass.getESuperTypes().add(this.getSistemaEmpr�stimo());
		livroEClass.getESuperTypes().add(this.getPublica��o());
		peri�dicoEClass.getESuperTypes().add(this.getPublica��o());
		teseEClass.getESuperTypes().add(this.getPublica��o());
		manualEClass.getESuperTypes().add(this.getPublica��o());
		alunoEClass.getESuperTypes().add(this.getUsu�rio());
		professorEClass.getESuperTypes().add(this.getFuncion�rio());
		funcion�rioEClass.getESuperTypes().add(this.getUsu�rio());
		atendenteEClass.getESuperTypes().add(this.getFuncion�rio());
		bibliotec�riaEClass.getESuperTypes().add(this.getFuncion�rio());

		// Initialize classes, features, and operations; add parameters
		initEClass(bibliotecaEClass, Biblioteca.class, "Biblioteca", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBiblioteca_TerminalBiblioteca(), this.getTerminal(), null, "TerminalBiblioteca", null, 1, 1, Biblioteca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBiblioteca_SistEmprestimoBiblioteca(), this.getSistemaEmpr�stimo(), null, "SistEmprestimoBiblioteca", null, 1, 1, Biblioteca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBiblioteca_SistCadastroBiblioteca(), this.getSistemaCadastro(), null, "SistCadastroBiblioteca", null, 1, 1, Biblioteca.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(terminalEClass, Terminal.class, "Terminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sistemaCadastroEClass, SistemaCadastro.class, "SistemaCadastro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSistemaCadastro_ListaUsu�rios(), this.getUsu�rio(), null, "ListaUsu�rios", null, 1, 1, SistemaCadastro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSistemaCadastro_Usu�rio(), this.getUsu�rio(), null, "usu�rio", null, 1, 1, SistemaCadastro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSistemaCadastro_ListaPublica��es(), this.getPublica��o(), null, "ListaPublica��es", null, 1, 1, SistemaCadastro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSistemaCadastro_Publica��o(), this.getPublica��o(), null, "publica��o", null, 1, 1, SistemaCadastro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getSistemaCadastro__ConferirUsuario(), null, "ConferirUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSistemaCadastro__CadastrarUsuario(), null, "CadastrarUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSistemaCadastro__IncluirExemplar(), null, "IncluirExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSistemaCadastro__ExcluirExemplar(), null, "ExcluirExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSistemaCadastro__AtualizarExemplar(), null, "AtualizarExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(usu�rioEClass, Usu�rio.class, "Usu�rio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsu�rio_NumeroRegistro(), theTypesPackage.getInteger(), "NumeroRegistro", null, 1, 1, Usu�rio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsu�rio_Nome(), theTypesPackage.getString(), "Nome", null, 1, 1, Usu�rio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsu�rio_Instituto(), theTypesPackage.getString(), "Instituto", null, 1, 1, Usu�rio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsu�rio_Tipo(), theTypesPackage.getString(), "Tipo", null, 1, 1, Usu�rio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getUsu�rio__FazerReserva(), null, "FazerReserva", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUsu�rio__CancelarReserva(), null, "CancelarReserva", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(publica��oEClass, Publica��o.class, "Publica��o", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublica��o_Nome(), theTypesPackage.getString(), "Nome", null, 1, 1, Publica��o.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPublica��o_Autor(), theTypesPackage.getString(), "Autor", null, 1, 1, Publica��o.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPublica��o_Data(), theTypesPackage.getInteger(), "Data", null, 1, 1, Publica��o.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPublica��o_ExemplarBiblioteca(), this.getExemplar(), null, "ExemplarBiblioteca", null, 1, 1, Publica��o.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(exemplarEClass, Exemplar.class, "Exemplar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExemplar_Quantidade(), theTypesPackage.getInteger(), "Quantidade", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExemplar_NumeroEtiqueta(), theTypesPackage.getInteger(), "NumeroEtiqueta", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sistemaEmpr�stimoEClass, SistemaEmpr�stimo.class, "SistemaEmpr�stimo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSistemaEmpr�stimo__FazerReserva(), null, "FazerReserva", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSistemaEmpr�stimo__CancelarReserva(), null, "CancelarReserva", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSistemaEmpr�stimo__RealizarEmprestimo(), null, "RealizarEmprestimo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSistemaEmpr�stimo__DesfazerEmprestimo(), null, "DesfazerEmprestimo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(livroEClass, Livro.class, "Livro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(peri�dicoEClass, Peri�dico.class, "Peri�dico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(teseEClass, Tese.class, "Tese", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manualEClass, Manual.class, "Manual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alunoEClass, Aluno.class, "Aluno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(professorEClass, Professor.class, "Professor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getProfessor__Bloquear(), null, "Bloquear", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProfessor__Desbloquear(), null, "Desbloquear", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(funcion�rioEClass, Funcion�rio.class, "Funcion�rio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atendenteEClass, Atendente.class, "Atendente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtendente_Terminal(), this.getTerminal(), null, "terminal", null, 1, 1, Atendente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAtendente_TerminalAtendente(), this.getTerminal(), null, "TerminalAtendente", null, 1, 1, Atendente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getAtendente__RealizarEmprestimo(), null, "RealizarEmprestimo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAtendente__DesfazerEmprestimo(), null, "DesfazerEmprestimo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAtendente__ConferirUsuario(), null, "ConferirUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAtendente__CadastrarUsuario(), null, "CadastrarUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bibliotec�riaEClass, Bibliotec�ria.class, "Bibliotec�ria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBibliotec�ria_Terminal(), this.getTerminal(), null, "terminal", null, 1, 1, Bibliotec�ria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBibliotec�ria_TerminalBibliotec�ria(), this.getTerminal(), null, "TerminalBibliotec�ria", null, 1, 1, Bibliotec�ria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getBibliotec�ria__IncluirExemplar(), null, "IncluirExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBibliotec�ria__ExcluirExemplar(), null, "ExcluirExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBibliotec�ria__AtualizarExemplar(), null, "AtualizarExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

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
