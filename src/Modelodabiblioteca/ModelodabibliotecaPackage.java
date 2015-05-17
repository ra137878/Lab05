/**
 */
package Modelodabiblioteca;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	 * The feature id for the '<em><b>Terminal Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA__TERMINAL_BIBLIOTECA = 0;

	/**
	 * The feature id for the '<em><b>Sist Emprestimo Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA__SIST_EMPRESTIMO_BIBLIOTECA = 1;

	/**
	 * The feature id for the '<em><b>Sist Cadastro Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA__SIST_CADASTRO_BIBLIOTECA = 2;

	/**
	 * The number of structural features of the '<em>Biblioteca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Biblioteca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.SistemaCadastroImpl <em>Sistema Cadastro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.SistemaCadastroImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getSistemaCadastro()
	 * @generated
	 */
	int SISTEMA_CADASTRO = 2;

	/**
	 * The feature id for the '<em><b>Lista Usuários</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_CADASTRO__LISTA_USUÁRIOS = 0;

	/**
	 * The feature id for the '<em><b>Usuário</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_CADASTRO__USUÁRIO = 1;

	/**
	 * The feature id for the '<em><b>Lista Publicações</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_CADASTRO__LISTA_PUBLICAÇÕES = 2;

	/**
	 * The feature id for the '<em><b>Publicação</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_CADASTRO__PUBLICAÇÃO = 3;

	/**
	 * The number of structural features of the '<em>Sistema Cadastro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_CADASTRO_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Conferir Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_CADASTRO___CONFERIR_USUARIO = 0;

	/**
	 * The operation id for the '<em>Cadastrar Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_CADASTRO___CADASTRAR_USUARIO = 1;

	/**
	 * The operation id for the '<em>Incluir Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_CADASTRO___INCLUIR_EXEMPLAR = 2;

	/**
	 * The operation id for the '<em>Excluir Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_CADASTRO___EXCLUIR_EXEMPLAR = 3;

	/**
	 * The operation id for the '<em>Atualizar Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_CADASTRO___ATUALIZAR_EXEMPLAR = 4;

	/**
	 * The number of operations of the '<em>Sistema Cadastro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_CADASTRO_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.PublicaçãoImpl <em>Publicação</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.PublicaçãoImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getPublicação()
	 * @generated
	 */
	int PUBLICAÇÃO = 4;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.TerminalImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 1;

	/**
	 * The feature id for the '<em><b>Lista Usuários</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__LISTA_USUÁRIOS = SISTEMA_CADASTRO__LISTA_USUÁRIOS;

	/**
	 * The feature id for the '<em><b>Usuário</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__USUÁRIO = SISTEMA_CADASTRO__USUÁRIO;

	/**
	 * The feature id for the '<em><b>Lista Publicações</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__LISTA_PUBLICAÇÕES = SISTEMA_CADASTRO__LISTA_PUBLICAÇÕES;

	/**
	 * The feature id for the '<em><b>Publicação</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__PUBLICAÇÃO = SISTEMA_CADASTRO__PUBLICAÇÃO;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = SISTEMA_CADASTRO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Conferir Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___CONFERIR_USUARIO = SISTEMA_CADASTRO___CONFERIR_USUARIO;

	/**
	 * The operation id for the '<em>Cadastrar Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___CADASTRAR_USUARIO = SISTEMA_CADASTRO___CADASTRAR_USUARIO;

	/**
	 * The operation id for the '<em>Incluir Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___INCLUIR_EXEMPLAR = SISTEMA_CADASTRO___INCLUIR_EXEMPLAR;

	/**
	 * The operation id for the '<em>Excluir Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___EXCLUIR_EXEMPLAR = SISTEMA_CADASTRO___EXCLUIR_EXEMPLAR;

	/**
	 * The operation id for the '<em>Atualizar Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___ATUALIZAR_EXEMPLAR = SISTEMA_CADASTRO___ATUALIZAR_EXEMPLAR;

	/**
	 * The operation id for the '<em>Fazer Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___FAZER_RESERVA = SISTEMA_CADASTRO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___CANCELAR_RESERVA = SISTEMA_CADASTRO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Realizar Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___REALIZAR_EMPRESTIMO = SISTEMA_CADASTRO_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Desfazer Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___DESFAZER_EMPRESTIMO = SISTEMA_CADASTRO_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = SISTEMA_CADASTRO_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.ExemplarImpl <em>Exemplar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.ExemplarImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getExemplar()
	 * @generated
	 */
	int EXEMPLAR = 5;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.SistemaEmpréstimoImpl <em>Sistema Empréstimo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.SistemaEmpréstimoImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getSistemaEmpréstimo()
	 * @generated
	 */
	int SISTEMA_EMPRÉSTIMO = 6;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.LivroImpl <em>Livro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.LivroImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getLivro()
	 * @generated
	 */
	int LIVRO = 7;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.PeriódicoImpl <em>Periódico</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.PeriódicoImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getPeriódico()
	 * @generated
	 */
	int PERIÓDICO = 8;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.TeseImpl <em>Tese</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.TeseImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getTese()
	 * @generated
	 */
	int TESE = 9;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.ManualImpl <em>Manual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.ManualImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getManual()
	 * @generated
	 */
	int MANUAL = 10;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.UsuárioImpl <em>Usuário</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.UsuárioImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getUsuário()
	 * @generated
	 */
	int USUÁRIO = 3;

	/**
	 * The feature id for the '<em><b>Numero Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__NUMERO_REGISTRO = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__NOME = 1;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__INSTITUTO = 2;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__TIPO = 3;

	/**
	 * The number of structural features of the '<em>Usuário</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Fazer Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO___FAZER_RESERVA = 0;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO___CANCELAR_RESERVA = 1;

	/**
	 * The number of operations of the '<em>Usuário</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICAÇÃO__NOME = 0;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICAÇÃO__AUTOR = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICAÇÃO__DATA = 2;

	/**
	 * The feature id for the '<em><b>Exemplar Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICAÇÃO__EXEMPLAR_BIBLIOTECA = 3;

	/**
	 * The number of structural features of the '<em>Publicação</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICAÇÃO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Publicação</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICAÇÃO_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Quantidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__QUANTIDADE = 0;

	/**
	 * The feature id for the '<em><b>Numero Etiqueta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__NUMERO_ETIQUETA = 1;

	/**
	 * The number of structural features of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Sistema Empréstimo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_EMPRÉSTIMO_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Fazer Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_EMPRÉSTIMO___FAZER_RESERVA = 0;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_EMPRÉSTIMO___CANCELAR_RESERVA = 1;

	/**
	 * The operation id for the '<em>Realizar Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_EMPRÉSTIMO___REALIZAR_EMPRESTIMO = 2;

	/**
	 * The operation id for the '<em>Desfazer Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_EMPRÉSTIMO___DESFAZER_EMPRESTIMO = 3;

	/**
	 * The number of operations of the '<em>Sistema Empréstimo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_EMPRÉSTIMO_OPERATION_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__NOME = PUBLICAÇÃO__NOME;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__AUTOR = PUBLICAÇÃO__AUTOR;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__DATA = PUBLICAÇÃO__DATA;

	/**
	 * The feature id for the '<em><b>Exemplar Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__EXEMPLAR_BIBLIOTECA = PUBLICAÇÃO__EXEMPLAR_BIBLIOTECA;

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
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIÓDICO__NOME = PUBLICAÇÃO__NOME;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIÓDICO__AUTOR = PUBLICAÇÃO__AUTOR;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIÓDICO__DATA = PUBLICAÇÃO__DATA;

	/**
	 * The feature id for the '<em><b>Exemplar Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIÓDICO__EXEMPLAR_BIBLIOTECA = PUBLICAÇÃO__EXEMPLAR_BIBLIOTECA;

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
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__NOME = PUBLICAÇÃO__NOME;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__AUTOR = PUBLICAÇÃO__AUTOR;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__DATA = PUBLICAÇÃO__DATA;

	/**
	 * The feature id for the '<em><b>Exemplar Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__EXEMPLAR_BIBLIOTECA = PUBLICAÇÃO__EXEMPLAR_BIBLIOTECA;

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
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__NOME = PUBLICAÇÃO__NOME;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__AUTOR = PUBLICAÇÃO__AUTOR;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__DATA = PUBLICAÇÃO__DATA;

	/**
	 * The feature id for the '<em><b>Exemplar Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__EXEMPLAR_BIBLIOTECA = PUBLICAÇÃO__EXEMPLAR_BIBLIOTECA;

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
	 * The meta object id for the '{@link Modelodabiblioteca.impl.AlunoImpl <em>Aluno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.AlunoImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getAluno()
	 * @generated
	 */
	int ALUNO = 11;

	/**
	 * The feature id for the '<em><b>Numero Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__NUMERO_REGISTRO = USUÁRIO__NUMERO_REGISTRO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__NOME = USUÁRIO__NOME;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__INSTITUTO = USUÁRIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__TIPO = USUÁRIO__TIPO;

	/**
	 * The number of structural features of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_FEATURE_COUNT = USUÁRIO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Fazer Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___FAZER_RESERVA = USUÁRIO___FAZER_RESERVA;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___CANCELAR_RESERVA = USUÁRIO___CANCELAR_RESERVA;

	/**
	 * The number of operations of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_OPERATION_COUNT = USUÁRIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.FuncionárioImpl <em>Funcionário</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.FuncionárioImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getFuncionário()
	 * @generated
	 */
	int FUNCIONÁRIO = 13;

	/**
	 * The feature id for the '<em><b>Numero Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO__NUMERO_REGISTRO = USUÁRIO__NUMERO_REGISTRO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO__NOME = USUÁRIO__NOME;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO__INSTITUTO = USUÁRIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO__TIPO = USUÁRIO__TIPO;

	/**
	 * The number of structural features of the '<em>Funcionário</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO_FEATURE_COUNT = USUÁRIO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Fazer Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO___FAZER_RESERVA = USUÁRIO___FAZER_RESERVA;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO___CANCELAR_RESERVA = USUÁRIO___CANCELAR_RESERVA;

	/**
	 * The number of operations of the '<em>Funcionário</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONÁRIO_OPERATION_COUNT = USUÁRIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.ProfessorImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getProfessor()
	 * @generated
	 */
	int PROFESSOR = 12;

	/**
	 * The feature id for the '<em><b>Numero Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NUMERO_REGISTRO = FUNCIONÁRIO__NUMERO_REGISTRO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NOME = FUNCIONÁRIO__NOME;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__INSTITUTO = FUNCIONÁRIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__TIPO = FUNCIONÁRIO__TIPO;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = FUNCIONÁRIO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Fazer Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___FAZER_RESERVA = FUNCIONÁRIO___FAZER_RESERVA;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___CANCELAR_RESERVA = FUNCIONÁRIO___CANCELAR_RESERVA;

	/**
	 * The operation id for the '<em>Bloquear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___BLOQUEAR = FUNCIONÁRIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Desbloquear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___DESBLOQUEAR = FUNCIONÁRIO_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = FUNCIONÁRIO_OPERATION_COUNT + 2;


	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.AtendenteImpl <em>Atendente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.AtendenteImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getAtendente()
	 * @generated
	 */
	int ATENDENTE = 14;

	/**
	 * The feature id for the '<em><b>Numero Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__NUMERO_REGISTRO = FUNCIONÁRIO__NUMERO_REGISTRO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__NOME = FUNCIONÁRIO__NOME;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__INSTITUTO = FUNCIONÁRIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__TIPO = FUNCIONÁRIO__TIPO;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__TERMINAL = FUNCIONÁRIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Terminal Atendente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__TERMINAL_ATENDENTE = FUNCIONÁRIO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atendente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE_FEATURE_COUNT = FUNCIONÁRIO_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Fazer Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___FAZER_RESERVA = FUNCIONÁRIO___FAZER_RESERVA;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___CANCELAR_RESERVA = FUNCIONÁRIO___CANCELAR_RESERVA;

	/**
	 * The operation id for the '<em>Realizar Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___REALIZAR_EMPRESTIMO = FUNCIONÁRIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Desfazer Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___DESFAZER_EMPRESTIMO = FUNCIONÁRIO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Conferir Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___CONFERIR_USUARIO = FUNCIONÁRIO_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Cadastrar Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___CADASTRAR_USUARIO = FUNCIONÁRIO_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Atendente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE_OPERATION_COUNT = FUNCIONÁRIO_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.BibliotecáriaImpl <em>Bibliotecária</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.BibliotecáriaImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getBibliotecária()
	 * @generated
	 */
	int BIBLIOTECÁRIA = 15;

	/**
	 * The feature id for the '<em><b>Numero Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA__NUMERO_REGISTRO = FUNCIONÁRIO__NUMERO_REGISTRO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA__NOME = FUNCIONÁRIO__NOME;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA__INSTITUTO = FUNCIONÁRIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA__TIPO = FUNCIONÁRIO__TIPO;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA__TERMINAL = FUNCIONÁRIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Terminal Bibliotecária</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA__TERMINAL_BIBLIOTECÁRIA = FUNCIONÁRIO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bibliotecária</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA_FEATURE_COUNT = FUNCIONÁRIO_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Fazer Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA___FAZER_RESERVA = FUNCIONÁRIO___FAZER_RESERVA;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA___CANCELAR_RESERVA = FUNCIONÁRIO___CANCELAR_RESERVA;

	/**
	 * The operation id for the '<em>Incluir Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA___INCLUIR_EXEMPLAR = FUNCIONÁRIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Excluir Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA___EXCLUIR_EXEMPLAR = FUNCIONÁRIO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Atualizar Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA___ATUALIZAR_EXEMPLAR = FUNCIONÁRIO_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bibliotecária</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECÁRIA_OPERATION_COUNT = FUNCIONÁRIO_OPERATION_COUNT + 3;


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
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.Biblioteca#getTerminalBiblioteca <em>Terminal Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal Biblioteca</em>'.
	 * @see Modelodabiblioteca.Biblioteca#getTerminalBiblioteca()
	 * @see #getBiblioteca()
	 * @generated
	 */
	EReference getBiblioteca_TerminalBiblioteca();

	/**
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.Biblioteca#getSistEmprestimoBiblioteca <em>Sist Emprestimo Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sist Emprestimo Biblioteca</em>'.
	 * @see Modelodabiblioteca.Biblioteca#getSistEmprestimoBiblioteca()
	 * @see #getBiblioteca()
	 * @generated
	 */
	EReference getBiblioteca_SistEmprestimoBiblioteca();

	/**
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.Biblioteca#getSistCadastroBiblioteca <em>Sist Cadastro Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sist Cadastro Biblioteca</em>'.
	 * @see Modelodabiblioteca.Biblioteca#getSistCadastroBiblioteca()
	 * @see #getBiblioteca()
	 * @generated
	 */
	EReference getBiblioteca_SistCadastroBiblioteca();

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
	 * Returns the meta object for the attribute '{@link Modelodabiblioteca.Publicação#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see Modelodabiblioteca.Publicação#getNome()
	 * @see #getPublicação()
	 * @generated
	 */
	EAttribute getPublicação_Nome();

	/**
	 * Returns the meta object for the attribute '{@link Modelodabiblioteca.Publicação#getAutor <em>Autor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autor</em>'.
	 * @see Modelodabiblioteca.Publicação#getAutor()
	 * @see #getPublicação()
	 * @generated
	 */
	EAttribute getPublicação_Autor();

	/**
	 * Returns the meta object for the attribute '{@link Modelodabiblioteca.Publicação#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see Modelodabiblioteca.Publicação#getData()
	 * @see #getPublicação()
	 * @generated
	 */
	EAttribute getPublicação_Data();

	/**
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.Publicação#getExemplarBiblioteca <em>Exemplar Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exemplar Biblioteca</em>'.
	 * @see Modelodabiblioteca.Publicação#getExemplarBiblioteca()
	 * @see #getPublicação()
	 * @generated
	 */
	EReference getPublicação_ExemplarBiblioteca();

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
	 * Returns the meta object for class '{@link Modelodabiblioteca.SistemaCadastro <em>Sistema Cadastro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sistema Cadastro</em>'.
	 * @see Modelodabiblioteca.SistemaCadastro
	 * @generated
	 */
	EClass getSistemaCadastro();

	/**
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.SistemaCadastro#getListaUsuários <em>Lista Usuários</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lista Usuários</em>'.
	 * @see Modelodabiblioteca.SistemaCadastro#getListaUsuários()
	 * @see #getSistemaCadastro()
	 * @generated
	 */
	EReference getSistemaCadastro_ListaUsuários();

	/**
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.SistemaCadastro#getUsuário <em>Usuário</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usuário</em>'.
	 * @see Modelodabiblioteca.SistemaCadastro#getUsuário()
	 * @see #getSistemaCadastro()
	 * @generated
	 */
	EReference getSistemaCadastro_Usuário();

	/**
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.SistemaCadastro#getListaPublicações <em>Lista Publicações</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lista Publicações</em>'.
	 * @see Modelodabiblioteca.SistemaCadastro#getListaPublicações()
	 * @see #getSistemaCadastro()
	 * @generated
	 */
	EReference getSistemaCadastro_ListaPublicações();

	/**
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.SistemaCadastro#getPublicação <em>Publicação</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publicação</em>'.
	 * @see Modelodabiblioteca.SistemaCadastro#getPublicação()
	 * @see #getSistemaCadastro()
	 * @generated
	 */
	EReference getSistemaCadastro_Publicação();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.SistemaCadastro#ConferirUsuario() <em>Conferir Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conferir Usuario</em>' operation.
	 * @see Modelodabiblioteca.SistemaCadastro#ConferirUsuario()
	 * @generated
	 */
	EOperation getSistemaCadastro__ConferirUsuario();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.SistemaCadastro#CadastrarUsuario() <em>Cadastrar Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cadastrar Usuario</em>' operation.
	 * @see Modelodabiblioteca.SistemaCadastro#CadastrarUsuario()
	 * @generated
	 */
	EOperation getSistemaCadastro__CadastrarUsuario();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.SistemaCadastro#IncluirExemplar() <em>Incluir Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Incluir Exemplar</em>' operation.
	 * @see Modelodabiblioteca.SistemaCadastro#IncluirExemplar()
	 * @generated
	 */
	EOperation getSistemaCadastro__IncluirExemplar();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.SistemaCadastro#ExcluirExemplar() <em>Excluir Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Excluir Exemplar</em>' operation.
	 * @see Modelodabiblioteca.SistemaCadastro#ExcluirExemplar()
	 * @generated
	 */
	EOperation getSistemaCadastro__ExcluirExemplar();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.SistemaCadastro#AtualizarExemplar() <em>Atualizar Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Atualizar Exemplar</em>' operation.
	 * @see Modelodabiblioteca.SistemaCadastro#AtualizarExemplar()
	 * @generated
	 */
	EOperation getSistemaCadastro__AtualizarExemplar();

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
	 * Returns the meta object for the attribute '{@link Modelodabiblioteca.Exemplar#getQuantidade <em>Quantidade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantidade</em>'.
	 * @see Modelodabiblioteca.Exemplar#getQuantidade()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_Quantidade();

	/**
	 * Returns the meta object for the attribute '{@link Modelodabiblioteca.Exemplar#getNumeroEtiqueta <em>Numero Etiqueta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Etiqueta</em>'.
	 * @see Modelodabiblioteca.Exemplar#getNumeroEtiqueta()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_NumeroEtiqueta();

	/**
	 * Returns the meta object for class '{@link Modelodabiblioteca.SistemaEmpréstimo <em>Sistema Empréstimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sistema Empréstimo</em>'.
	 * @see Modelodabiblioteca.SistemaEmpréstimo
	 * @generated
	 */
	EClass getSistemaEmpréstimo();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.SistemaEmpréstimo#FazerReserva() <em>Fazer Reserva</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fazer Reserva</em>' operation.
	 * @see Modelodabiblioteca.SistemaEmpréstimo#FazerReserva()
	 * @generated
	 */
	EOperation getSistemaEmpréstimo__FazerReserva();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.SistemaEmpréstimo#CancelarReserva() <em>Cancelar Reserva</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancelar Reserva</em>' operation.
	 * @see Modelodabiblioteca.SistemaEmpréstimo#CancelarReserva()
	 * @generated
	 */
	EOperation getSistemaEmpréstimo__CancelarReserva();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.SistemaEmpréstimo#RealizarEmprestimo() <em>Realizar Emprestimo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Realizar Emprestimo</em>' operation.
	 * @see Modelodabiblioteca.SistemaEmpréstimo#RealizarEmprestimo()
	 * @generated
	 */
	EOperation getSistemaEmpréstimo__RealizarEmprestimo();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.SistemaEmpréstimo#DesfazerEmprestimo() <em>Desfazer Emprestimo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Desfazer Emprestimo</em>' operation.
	 * @see Modelodabiblioteca.SistemaEmpréstimo#DesfazerEmprestimo()
	 * @generated
	 */
	EOperation getSistemaEmpréstimo__DesfazerEmprestimo();

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
	 * Returns the meta object for the attribute '{@link Modelodabiblioteca.Usuário#getNumeroRegistro <em>Numero Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Registro</em>'.
	 * @see Modelodabiblioteca.Usuário#getNumeroRegistro()
	 * @see #getUsuário()
	 * @generated
	 */
	EAttribute getUsuário_NumeroRegistro();

	/**
	 * Returns the meta object for the attribute '{@link Modelodabiblioteca.Usuário#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see Modelodabiblioteca.Usuário#getNome()
	 * @see #getUsuário()
	 * @generated
	 */
	EAttribute getUsuário_Nome();

	/**
	 * Returns the meta object for the attribute '{@link Modelodabiblioteca.Usuário#getInstituto <em>Instituto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instituto</em>'.
	 * @see Modelodabiblioteca.Usuário#getInstituto()
	 * @see #getUsuário()
	 * @generated
	 */
	EAttribute getUsuário_Instituto();

	/**
	 * Returns the meta object for the attribute '{@link Modelodabiblioteca.Usuário#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see Modelodabiblioteca.Usuário#getTipo()
	 * @see #getUsuário()
	 * @generated
	 */
	EAttribute getUsuário_Tipo();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.Usuário#FazerReserva() <em>Fazer Reserva</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fazer Reserva</em>' operation.
	 * @see Modelodabiblioteca.Usuário#FazerReserva()
	 * @generated
	 */
	EOperation getUsuário__FazerReserva();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.Usuário#CancelarReserva() <em>Cancelar Reserva</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancelar Reserva</em>' operation.
	 * @see Modelodabiblioteca.Usuário#CancelarReserva()
	 * @generated
	 */
	EOperation getUsuário__CancelarReserva();

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
	 * Returns the meta object for the '{@link Modelodabiblioteca.Professor#Bloquear() <em>Bloquear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bloquear</em>' operation.
	 * @see Modelodabiblioteca.Professor#Bloquear()
	 * @generated
	 */
	EOperation getProfessor__Bloquear();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.Professor#Desbloquear() <em>Desbloquear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Desbloquear</em>' operation.
	 * @see Modelodabiblioteca.Professor#Desbloquear()
	 * @generated
	 */
	EOperation getProfessor__Desbloquear();

	/**
	 * Returns the meta object for class '{@link Modelodabiblioteca.Funcionário <em>Funcionário</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcionário</em>'.
	 * @see Modelodabiblioteca.Funcionário
	 * @generated
	 */
	EClass getFuncionário();

	/**
	 * Returns the meta object for class '{@link Modelodabiblioteca.Atendente <em>Atendente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atendente</em>'.
	 * @see Modelodabiblioteca.Atendente
	 * @generated
	 */
	EClass getAtendente();

	/**
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.Atendente#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see Modelodabiblioteca.Atendente#getTerminal()
	 * @see #getAtendente()
	 * @generated
	 */
	EReference getAtendente_Terminal();

	/**
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.Atendente#getTerminalAtendente <em>Terminal Atendente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal Atendente</em>'.
	 * @see Modelodabiblioteca.Atendente#getTerminalAtendente()
	 * @see #getAtendente()
	 * @generated
	 */
	EReference getAtendente_TerminalAtendente();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.Atendente#RealizarEmprestimo() <em>Realizar Emprestimo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Realizar Emprestimo</em>' operation.
	 * @see Modelodabiblioteca.Atendente#RealizarEmprestimo()
	 * @generated
	 */
	EOperation getAtendente__RealizarEmprestimo();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.Atendente#DesfazerEmprestimo() <em>Desfazer Emprestimo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Desfazer Emprestimo</em>' operation.
	 * @see Modelodabiblioteca.Atendente#DesfazerEmprestimo()
	 * @generated
	 */
	EOperation getAtendente__DesfazerEmprestimo();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.Atendente#ConferirUsuario() <em>Conferir Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conferir Usuario</em>' operation.
	 * @see Modelodabiblioteca.Atendente#ConferirUsuario()
	 * @generated
	 */
	EOperation getAtendente__ConferirUsuario();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.Atendente#CadastrarUsuario() <em>Cadastrar Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cadastrar Usuario</em>' operation.
	 * @see Modelodabiblioteca.Atendente#CadastrarUsuario()
	 * @generated
	 */
	EOperation getAtendente__CadastrarUsuario();

	/**
	 * Returns the meta object for class '{@link Modelodabiblioteca.Bibliotecária <em>Bibliotecária</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bibliotecária</em>'.
	 * @see Modelodabiblioteca.Bibliotecária
	 * @generated
	 */
	EClass getBibliotecária();

	/**
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.Bibliotecária#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see Modelodabiblioteca.Bibliotecária#getTerminal()
	 * @see #getBibliotecária()
	 * @generated
	 */
	EReference getBibliotecária_Terminal();

	/**
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.Bibliotecária#getTerminalBibliotecária <em>Terminal Bibliotecária</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal Bibliotecária</em>'.
	 * @see Modelodabiblioteca.Bibliotecária#getTerminalBibliotecária()
	 * @see #getBibliotecária()
	 * @generated
	 */
	EReference getBibliotecária_TerminalBibliotecária();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.Bibliotecária#IncluirExemplar() <em>Incluir Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Incluir Exemplar</em>' operation.
	 * @see Modelodabiblioteca.Bibliotecária#IncluirExemplar()
	 * @generated
	 */
	EOperation getBibliotecária__IncluirExemplar();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.Bibliotecária#ExcluirExemplar() <em>Excluir Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Excluir Exemplar</em>' operation.
	 * @see Modelodabiblioteca.Bibliotecária#ExcluirExemplar()
	 * @generated
	 */
	EOperation getBibliotecária__ExcluirExemplar();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.Bibliotecária#AtualizarExemplar() <em>Atualizar Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Atualizar Exemplar</em>' operation.
	 * @see Modelodabiblioteca.Bibliotecária#AtualizarExemplar()
	 * @generated
	 */
	EOperation getBibliotecária__AtualizarExemplar();

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
		 * The meta object literal for the '<em><b>Terminal Biblioteca</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIBLIOTECA__TERMINAL_BIBLIOTECA = eINSTANCE.getBiblioteca_TerminalBiblioteca();

		/**
		 * The meta object literal for the '<em><b>Sist Emprestimo Biblioteca</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIBLIOTECA__SIST_EMPRESTIMO_BIBLIOTECA = eINSTANCE.getBiblioteca_SistEmprestimoBiblioteca();

		/**
		 * The meta object literal for the '<em><b>Sist Cadastro Biblioteca</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIBLIOTECA__SIST_CADASTRO_BIBLIOTECA = eINSTANCE.getBiblioteca_SistCadastroBiblioteca();

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
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICAÇÃO__NOME = eINSTANCE.getPublicação_Nome();

		/**
		 * The meta object literal for the '<em><b>Autor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICAÇÃO__AUTOR = eINSTANCE.getPublicação_Autor();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICAÇÃO__DATA = eINSTANCE.getPublicação_Data();

		/**
		 * The meta object literal for the '<em><b>Exemplar Biblioteca</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICAÇÃO__EXEMPLAR_BIBLIOTECA = eINSTANCE.getPublicação_ExemplarBiblioteca();

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
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.SistemaCadastroImpl <em>Sistema Cadastro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.SistemaCadastroImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getSistemaCadastro()
		 * @generated
		 */
		EClass SISTEMA_CADASTRO = eINSTANCE.getSistemaCadastro();

		/**
		 * The meta object literal for the '<em><b>Lista Usuários</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SISTEMA_CADASTRO__LISTA_USUÁRIOS = eINSTANCE.getSistemaCadastro_ListaUsuários();

		/**
		 * The meta object literal for the '<em><b>Usuário</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SISTEMA_CADASTRO__USUÁRIO = eINSTANCE.getSistemaCadastro_Usuário();

		/**
		 * The meta object literal for the '<em><b>Lista Publicações</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SISTEMA_CADASTRO__LISTA_PUBLICAÇÕES = eINSTANCE.getSistemaCadastro_ListaPublicações();

		/**
		 * The meta object literal for the '<em><b>Publicação</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SISTEMA_CADASTRO__PUBLICAÇÃO = eINSTANCE.getSistemaCadastro_Publicação();

		/**
		 * The meta object literal for the '<em><b>Conferir Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA_CADASTRO___CONFERIR_USUARIO = eINSTANCE.getSistemaCadastro__ConferirUsuario();

		/**
		 * The meta object literal for the '<em><b>Cadastrar Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA_CADASTRO___CADASTRAR_USUARIO = eINSTANCE.getSistemaCadastro__CadastrarUsuario();

		/**
		 * The meta object literal for the '<em><b>Incluir Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA_CADASTRO___INCLUIR_EXEMPLAR = eINSTANCE.getSistemaCadastro__IncluirExemplar();

		/**
		 * The meta object literal for the '<em><b>Excluir Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA_CADASTRO___EXCLUIR_EXEMPLAR = eINSTANCE.getSistemaCadastro__ExcluirExemplar();

		/**
		 * The meta object literal for the '<em><b>Atualizar Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA_CADASTRO___ATUALIZAR_EXEMPLAR = eINSTANCE.getSistemaCadastro__AtualizarExemplar();

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
		 * The meta object literal for the '<em><b>Quantidade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__QUANTIDADE = eINSTANCE.getExemplar_Quantidade();

		/**
		 * The meta object literal for the '<em><b>Numero Etiqueta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__NUMERO_ETIQUETA = eINSTANCE.getExemplar_NumeroEtiqueta();

		/**
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.SistemaEmpréstimoImpl <em>Sistema Empréstimo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.SistemaEmpréstimoImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getSistemaEmpréstimo()
		 * @generated
		 */
		EClass SISTEMA_EMPRÉSTIMO = eINSTANCE.getSistemaEmpréstimo();

		/**
		 * The meta object literal for the '<em><b>Fazer Reserva</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA_EMPRÉSTIMO___FAZER_RESERVA = eINSTANCE.getSistemaEmpréstimo__FazerReserva();

		/**
		 * The meta object literal for the '<em><b>Cancelar Reserva</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA_EMPRÉSTIMO___CANCELAR_RESERVA = eINSTANCE.getSistemaEmpréstimo__CancelarReserva();

		/**
		 * The meta object literal for the '<em><b>Realizar Emprestimo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA_EMPRÉSTIMO___REALIZAR_EMPRESTIMO = eINSTANCE.getSistemaEmpréstimo__RealizarEmprestimo();

		/**
		 * The meta object literal for the '<em><b>Desfazer Emprestimo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA_EMPRÉSTIMO___DESFAZER_EMPRESTIMO = eINSTANCE.getSistemaEmpréstimo__DesfazerEmprestimo();

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
		 * The meta object literal for the '<em><b>Numero Registro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUÁRIO__NUMERO_REGISTRO = eINSTANCE.getUsuário_NumeroRegistro();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUÁRIO__NOME = eINSTANCE.getUsuário_Nome();

		/**
		 * The meta object literal for the '<em><b>Instituto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUÁRIO__INSTITUTO = eINSTANCE.getUsuário_Instituto();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUÁRIO__TIPO = eINSTANCE.getUsuário_Tipo();

		/**
		 * The meta object literal for the '<em><b>Fazer Reserva</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUÁRIO___FAZER_RESERVA = eINSTANCE.getUsuário__FazerReserva();

		/**
		 * The meta object literal for the '<em><b>Cancelar Reserva</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUÁRIO___CANCELAR_RESERVA = eINSTANCE.getUsuário__CancelarReserva();

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

		/**
		 * The meta object literal for the '<em><b>Bloquear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROFESSOR___BLOQUEAR = eINSTANCE.getProfessor__Bloquear();

		/**
		 * The meta object literal for the '<em><b>Desbloquear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROFESSOR___DESBLOQUEAR = eINSTANCE.getProfessor__Desbloquear();

		/**
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.FuncionárioImpl <em>Funcionário</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.FuncionárioImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getFuncionário()
		 * @generated
		 */
		EClass FUNCIONÁRIO = eINSTANCE.getFuncionário();

		/**
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.AtendenteImpl <em>Atendente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.AtendenteImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getAtendente()
		 * @generated
		 */
		EClass ATENDENTE = eINSTANCE.getAtendente();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATENDENTE__TERMINAL = eINSTANCE.getAtendente_Terminal();

		/**
		 * The meta object literal for the '<em><b>Terminal Atendente</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATENDENTE__TERMINAL_ATENDENTE = eINSTANCE.getAtendente_TerminalAtendente();

		/**
		 * The meta object literal for the '<em><b>Realizar Emprestimo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATENDENTE___REALIZAR_EMPRESTIMO = eINSTANCE.getAtendente__RealizarEmprestimo();

		/**
		 * The meta object literal for the '<em><b>Desfazer Emprestimo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATENDENTE___DESFAZER_EMPRESTIMO = eINSTANCE.getAtendente__DesfazerEmprestimo();

		/**
		 * The meta object literal for the '<em><b>Conferir Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATENDENTE___CONFERIR_USUARIO = eINSTANCE.getAtendente__ConferirUsuario();

		/**
		 * The meta object literal for the '<em><b>Cadastrar Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATENDENTE___CADASTRAR_USUARIO = eINSTANCE.getAtendente__CadastrarUsuario();

		/**
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.BibliotecáriaImpl <em>Bibliotecária</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.BibliotecáriaImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getBibliotecária()
		 * @generated
		 */
		EClass BIBLIOTECÁRIA = eINSTANCE.getBibliotecária();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIBLIOTECÁRIA__TERMINAL = eINSTANCE.getBibliotecária_Terminal();

		/**
		 * The meta object literal for the '<em><b>Terminal Bibliotecária</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIBLIOTECÁRIA__TERMINAL_BIBLIOTECÁRIA = eINSTANCE.getBibliotecária_TerminalBibliotecária();

		/**
		 * The meta object literal for the '<em><b>Incluir Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECÁRIA___INCLUIR_EXEMPLAR = eINSTANCE.getBibliotecária__IncluirExemplar();

		/**
		 * The meta object literal for the '<em><b>Excluir Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECÁRIA___EXCLUIR_EXEMPLAR = eINSTANCE.getBibliotecária__ExcluirExemplar();

		/**
		 * The meta object literal for the '<em><b>Atualizar Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECÁRIA___ATUALIZAR_EXEMPLAR = eINSTANCE.getBibliotecária__AtualizarExemplar();

	}

} //ModelodabibliotecaPackage
