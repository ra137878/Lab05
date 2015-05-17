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
	 * The feature id for the '<em><b>Lista Usu�rios</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_CADASTRO__LISTA_USU�RIOS = 0;

	/**
	 * The feature id for the '<em><b>Usu�rio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_CADASTRO__USU�RIO = 1;

	/**
	 * The feature id for the '<em><b>Lista Publica��es</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_CADASTRO__LISTA_PUBLICA��ES = 2;

	/**
	 * The feature id for the '<em><b>Publica��o</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_CADASTRO__PUBLICA��O = 3;

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
	 * The meta object id for the '{@link Modelodabiblioteca.impl.Publica��oImpl <em>Publica��o</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.Publica��oImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getPublica��o()
	 * @generated
	 */
	int PUBLICA��O = 4;

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
	 * The feature id for the '<em><b>Lista Usu�rios</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__LISTA_USU�RIOS = SISTEMA_CADASTRO__LISTA_USU�RIOS;

	/**
	 * The feature id for the '<em><b>Usu�rio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__USU�RIO = SISTEMA_CADASTRO__USU�RIO;

	/**
	 * The feature id for the '<em><b>Lista Publica��es</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__LISTA_PUBLICA��ES = SISTEMA_CADASTRO__LISTA_PUBLICA��ES;

	/**
	 * The feature id for the '<em><b>Publica��o</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__PUBLICA��O = SISTEMA_CADASTRO__PUBLICA��O;

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
	 * The meta object id for the '{@link Modelodabiblioteca.impl.SistemaEmpr�stimoImpl <em>Sistema Empr�stimo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.SistemaEmpr�stimoImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getSistemaEmpr�stimo()
	 * @generated
	 */
	int SISTEMA_EMPR�STIMO = 6;

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
	 * The meta object id for the '{@link Modelodabiblioteca.impl.Peri�dicoImpl <em>Peri�dico</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.Peri�dicoImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getPeri�dico()
	 * @generated
	 */
	int PERI�DICO = 8;

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
	 * The meta object id for the '{@link Modelodabiblioteca.impl.Usu�rioImpl <em>Usu�rio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.Usu�rioImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getUsu�rio()
	 * @generated
	 */
	int USU�RIO = 3;

	/**
	 * The feature id for the '<em><b>Numero Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USU�RIO__NUMERO_REGISTRO = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USU�RIO__NOME = 1;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USU�RIO__INSTITUTO = 2;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USU�RIO__TIPO = 3;

	/**
	 * The number of structural features of the '<em>Usu�rio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USU�RIO_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Fazer Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USU�RIO___FAZER_RESERVA = 0;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USU�RIO___CANCELAR_RESERVA = 1;

	/**
	 * The number of operations of the '<em>Usu�rio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USU�RIO_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICA��O__NOME = 0;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICA��O__AUTOR = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICA��O__DATA = 2;

	/**
	 * The feature id for the '<em><b>Exemplar Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICA��O__EXEMPLAR_BIBLIOTECA = 3;

	/**
	 * The number of structural features of the '<em>Publica��o</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICA��O_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Publica��o</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICA��O_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Sistema Empr�stimo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_EMPR�STIMO_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Fazer Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_EMPR�STIMO___FAZER_RESERVA = 0;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_EMPR�STIMO___CANCELAR_RESERVA = 1;

	/**
	 * The operation id for the '<em>Realizar Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_EMPR�STIMO___REALIZAR_EMPRESTIMO = 2;

	/**
	 * The operation id for the '<em>Desfazer Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_EMPR�STIMO___DESFAZER_EMPRESTIMO = 3;

	/**
	 * The number of operations of the '<em>Sistema Empr�stimo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_EMPR�STIMO_OPERATION_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__NOME = PUBLICA��O__NOME;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__AUTOR = PUBLICA��O__AUTOR;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__DATA = PUBLICA��O__DATA;

	/**
	 * The feature id for the '<em><b>Exemplar Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__EXEMPLAR_BIBLIOTECA = PUBLICA��O__EXEMPLAR_BIBLIOTECA;

	/**
	 * The number of structural features of the '<em>Livro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO_FEATURE_COUNT = PUBLICA��O_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Livro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO_OPERATION_COUNT = PUBLICA��O_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERI�DICO__NOME = PUBLICA��O__NOME;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERI�DICO__AUTOR = PUBLICA��O__AUTOR;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERI�DICO__DATA = PUBLICA��O__DATA;

	/**
	 * The feature id for the '<em><b>Exemplar Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERI�DICO__EXEMPLAR_BIBLIOTECA = PUBLICA��O__EXEMPLAR_BIBLIOTECA;

	/**
	 * The number of structural features of the '<em>Peri�dico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERI�DICO_FEATURE_COUNT = PUBLICA��O_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Peri�dico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERI�DICO_OPERATION_COUNT = PUBLICA��O_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__NOME = PUBLICA��O__NOME;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__AUTOR = PUBLICA��O__AUTOR;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__DATA = PUBLICA��O__DATA;

	/**
	 * The feature id for the '<em><b>Exemplar Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__EXEMPLAR_BIBLIOTECA = PUBLICA��O__EXEMPLAR_BIBLIOTECA;

	/**
	 * The number of structural features of the '<em>Tese</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE_FEATURE_COUNT = PUBLICA��O_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tese</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE_OPERATION_COUNT = PUBLICA��O_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__NOME = PUBLICA��O__NOME;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__AUTOR = PUBLICA��O__AUTOR;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__DATA = PUBLICA��O__DATA;

	/**
	 * The feature id for the '<em><b>Exemplar Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__EXEMPLAR_BIBLIOTECA = PUBLICA��O__EXEMPLAR_BIBLIOTECA;

	/**
	 * The number of structural features of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_FEATURE_COUNT = PUBLICA��O_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_OPERATION_COUNT = PUBLICA��O_OPERATION_COUNT + 0;

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
	int ALUNO__NUMERO_REGISTRO = USU�RIO__NUMERO_REGISTRO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__NOME = USU�RIO__NOME;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__INSTITUTO = USU�RIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__TIPO = USU�RIO__TIPO;

	/**
	 * The number of structural features of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_FEATURE_COUNT = USU�RIO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Fazer Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___FAZER_RESERVA = USU�RIO___FAZER_RESERVA;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___CANCELAR_RESERVA = USU�RIO___CANCELAR_RESERVA;

	/**
	 * The number of operations of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_OPERATION_COUNT = USU�RIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.Funcion�rioImpl <em>Funcion�rio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.Funcion�rioImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getFuncion�rio()
	 * @generated
	 */
	int FUNCION�RIO = 13;

	/**
	 * The feature id for the '<em><b>Numero Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION�RIO__NUMERO_REGISTRO = USU�RIO__NUMERO_REGISTRO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION�RIO__NOME = USU�RIO__NOME;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION�RIO__INSTITUTO = USU�RIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION�RIO__TIPO = USU�RIO__TIPO;

	/**
	 * The number of structural features of the '<em>Funcion�rio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION�RIO_FEATURE_COUNT = USU�RIO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Fazer Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION�RIO___FAZER_RESERVA = USU�RIO___FAZER_RESERVA;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION�RIO___CANCELAR_RESERVA = USU�RIO___CANCELAR_RESERVA;

	/**
	 * The number of operations of the '<em>Funcion�rio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION�RIO_OPERATION_COUNT = USU�RIO_OPERATION_COUNT + 0;

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
	int PROFESSOR__NUMERO_REGISTRO = FUNCION�RIO__NUMERO_REGISTRO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NOME = FUNCION�RIO__NOME;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__INSTITUTO = FUNCION�RIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__TIPO = FUNCION�RIO__TIPO;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = FUNCION�RIO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Fazer Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___FAZER_RESERVA = FUNCION�RIO___FAZER_RESERVA;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___CANCELAR_RESERVA = FUNCION�RIO___CANCELAR_RESERVA;

	/**
	 * The operation id for the '<em>Bloquear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___BLOQUEAR = FUNCION�RIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Desbloquear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___DESBLOQUEAR = FUNCION�RIO_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = FUNCION�RIO_OPERATION_COUNT + 2;


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
	int ATENDENTE__NUMERO_REGISTRO = FUNCION�RIO__NUMERO_REGISTRO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__NOME = FUNCION�RIO__NOME;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__INSTITUTO = FUNCION�RIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__TIPO = FUNCION�RIO__TIPO;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__TERMINAL = FUNCION�RIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Terminal Atendente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__TERMINAL_ATENDENTE = FUNCION�RIO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atendente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE_FEATURE_COUNT = FUNCION�RIO_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Fazer Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___FAZER_RESERVA = FUNCION�RIO___FAZER_RESERVA;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___CANCELAR_RESERVA = FUNCION�RIO___CANCELAR_RESERVA;

	/**
	 * The operation id for the '<em>Realizar Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___REALIZAR_EMPRESTIMO = FUNCION�RIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Desfazer Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___DESFAZER_EMPRESTIMO = FUNCION�RIO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Conferir Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___CONFERIR_USUARIO = FUNCION�RIO_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Cadastrar Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___CADASTRAR_USUARIO = FUNCION�RIO_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Atendente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE_OPERATION_COUNT = FUNCION�RIO_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link Modelodabiblioteca.impl.Bibliotec�riaImpl <em>Bibliotec�ria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Modelodabiblioteca.impl.Bibliotec�riaImpl
	 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getBibliotec�ria()
	 * @generated
	 */
	int BIBLIOTEC�RIA = 15;

	/**
	 * The feature id for the '<em><b>Numero Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTEC�RIA__NUMERO_REGISTRO = FUNCION�RIO__NUMERO_REGISTRO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTEC�RIA__NOME = FUNCION�RIO__NOME;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTEC�RIA__INSTITUTO = FUNCION�RIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTEC�RIA__TIPO = FUNCION�RIO__TIPO;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTEC�RIA__TERMINAL = FUNCION�RIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Terminal Bibliotec�ria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTEC�RIA__TERMINAL_BIBLIOTEC�RIA = FUNCION�RIO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bibliotec�ria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTEC�RIA_FEATURE_COUNT = FUNCION�RIO_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Fazer Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTEC�RIA___FAZER_RESERVA = FUNCION�RIO___FAZER_RESERVA;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTEC�RIA___CANCELAR_RESERVA = FUNCION�RIO___CANCELAR_RESERVA;

	/**
	 * The operation id for the '<em>Incluir Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTEC�RIA___INCLUIR_EXEMPLAR = FUNCION�RIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Excluir Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTEC�RIA___EXCLUIR_EXEMPLAR = FUNCION�RIO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Atualizar Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTEC�RIA___ATUALIZAR_EXEMPLAR = FUNCION�RIO_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bibliotec�ria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTEC�RIA_OPERATION_COUNT = FUNCION�RIO_OPERATION_COUNT + 3;


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
	 * Returns the meta object for class '{@link Modelodabiblioteca.Publica��o <em>Publica��o</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publica��o</em>'.
	 * @see Modelodabiblioteca.Publica��o
	 * @generated
	 */
	EClass getPublica��o();

	/**
	 * Returns the meta object for the attribute '{@link Modelodabiblioteca.Publica��o#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see Modelodabiblioteca.Publica��o#getNome()
	 * @see #getPublica��o()
	 * @generated
	 */
	EAttribute getPublica��o_Nome();

	/**
	 * Returns the meta object for the attribute '{@link Modelodabiblioteca.Publica��o#getAutor <em>Autor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autor</em>'.
	 * @see Modelodabiblioteca.Publica��o#getAutor()
	 * @see #getPublica��o()
	 * @generated
	 */
	EAttribute getPublica��o_Autor();

	/**
	 * Returns the meta object for the attribute '{@link Modelodabiblioteca.Publica��o#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see Modelodabiblioteca.Publica��o#getData()
	 * @see #getPublica��o()
	 * @generated
	 */
	EAttribute getPublica��o_Data();

	/**
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.Publica��o#getExemplarBiblioteca <em>Exemplar Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exemplar Biblioteca</em>'.
	 * @see Modelodabiblioteca.Publica��o#getExemplarBiblioteca()
	 * @see #getPublica��o()
	 * @generated
	 */
	EReference getPublica��o_ExemplarBiblioteca();

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
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.SistemaCadastro#getListaUsu�rios <em>Lista Usu�rios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lista Usu�rios</em>'.
	 * @see Modelodabiblioteca.SistemaCadastro#getListaUsu�rios()
	 * @see #getSistemaCadastro()
	 * @generated
	 */
	EReference getSistemaCadastro_ListaUsu�rios();

	/**
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.SistemaCadastro#getUsu�rio <em>Usu�rio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usu�rio</em>'.
	 * @see Modelodabiblioteca.SistemaCadastro#getUsu�rio()
	 * @see #getSistemaCadastro()
	 * @generated
	 */
	EReference getSistemaCadastro_Usu�rio();

	/**
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.SistemaCadastro#getListaPublica��es <em>Lista Publica��es</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lista Publica��es</em>'.
	 * @see Modelodabiblioteca.SistemaCadastro#getListaPublica��es()
	 * @see #getSistemaCadastro()
	 * @generated
	 */
	EReference getSistemaCadastro_ListaPublica��es();

	/**
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.SistemaCadastro#getPublica��o <em>Publica��o</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publica��o</em>'.
	 * @see Modelodabiblioteca.SistemaCadastro#getPublica��o()
	 * @see #getSistemaCadastro()
	 * @generated
	 */
	EReference getSistemaCadastro_Publica��o();

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
	 * Returns the meta object for class '{@link Modelodabiblioteca.SistemaEmpr�stimo <em>Sistema Empr�stimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sistema Empr�stimo</em>'.
	 * @see Modelodabiblioteca.SistemaEmpr�stimo
	 * @generated
	 */
	EClass getSistemaEmpr�stimo();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.SistemaEmpr�stimo#FazerReserva() <em>Fazer Reserva</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fazer Reserva</em>' operation.
	 * @see Modelodabiblioteca.SistemaEmpr�stimo#FazerReserva()
	 * @generated
	 */
	EOperation getSistemaEmpr�stimo__FazerReserva();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.SistemaEmpr�stimo#CancelarReserva() <em>Cancelar Reserva</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancelar Reserva</em>' operation.
	 * @see Modelodabiblioteca.SistemaEmpr�stimo#CancelarReserva()
	 * @generated
	 */
	EOperation getSistemaEmpr�stimo__CancelarReserva();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.SistemaEmpr�stimo#RealizarEmprestimo() <em>Realizar Emprestimo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Realizar Emprestimo</em>' operation.
	 * @see Modelodabiblioteca.SistemaEmpr�stimo#RealizarEmprestimo()
	 * @generated
	 */
	EOperation getSistemaEmpr�stimo__RealizarEmprestimo();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.SistemaEmpr�stimo#DesfazerEmprestimo() <em>Desfazer Emprestimo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Desfazer Emprestimo</em>' operation.
	 * @see Modelodabiblioteca.SistemaEmpr�stimo#DesfazerEmprestimo()
	 * @generated
	 */
	EOperation getSistemaEmpr�stimo__DesfazerEmprestimo();

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
	 * Returns the meta object for class '{@link Modelodabiblioteca.Peri�dico <em>Peri�dico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Peri�dico</em>'.
	 * @see Modelodabiblioteca.Peri�dico
	 * @generated
	 */
	EClass getPeri�dico();

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
	 * Returns the meta object for class '{@link Modelodabiblioteca.Usu�rio <em>Usu�rio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usu�rio</em>'.
	 * @see Modelodabiblioteca.Usu�rio
	 * @generated
	 */
	EClass getUsu�rio();

	/**
	 * Returns the meta object for the attribute '{@link Modelodabiblioteca.Usu�rio#getNumeroRegistro <em>Numero Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Registro</em>'.
	 * @see Modelodabiblioteca.Usu�rio#getNumeroRegistro()
	 * @see #getUsu�rio()
	 * @generated
	 */
	EAttribute getUsu�rio_NumeroRegistro();

	/**
	 * Returns the meta object for the attribute '{@link Modelodabiblioteca.Usu�rio#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see Modelodabiblioteca.Usu�rio#getNome()
	 * @see #getUsu�rio()
	 * @generated
	 */
	EAttribute getUsu�rio_Nome();

	/**
	 * Returns the meta object for the attribute '{@link Modelodabiblioteca.Usu�rio#getInstituto <em>Instituto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instituto</em>'.
	 * @see Modelodabiblioteca.Usu�rio#getInstituto()
	 * @see #getUsu�rio()
	 * @generated
	 */
	EAttribute getUsu�rio_Instituto();

	/**
	 * Returns the meta object for the attribute '{@link Modelodabiblioteca.Usu�rio#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see Modelodabiblioteca.Usu�rio#getTipo()
	 * @see #getUsu�rio()
	 * @generated
	 */
	EAttribute getUsu�rio_Tipo();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.Usu�rio#FazerReserva() <em>Fazer Reserva</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fazer Reserva</em>' operation.
	 * @see Modelodabiblioteca.Usu�rio#FazerReserva()
	 * @generated
	 */
	EOperation getUsu�rio__FazerReserva();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.Usu�rio#CancelarReserva() <em>Cancelar Reserva</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancelar Reserva</em>' operation.
	 * @see Modelodabiblioteca.Usu�rio#CancelarReserva()
	 * @generated
	 */
	EOperation getUsu�rio__CancelarReserva();

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
	 * Returns the meta object for class '{@link Modelodabiblioteca.Funcion�rio <em>Funcion�rio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcion�rio</em>'.
	 * @see Modelodabiblioteca.Funcion�rio
	 * @generated
	 */
	EClass getFuncion�rio();

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
	 * Returns the meta object for class '{@link Modelodabiblioteca.Bibliotec�ria <em>Bibliotec�ria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bibliotec�ria</em>'.
	 * @see Modelodabiblioteca.Bibliotec�ria
	 * @generated
	 */
	EClass getBibliotec�ria();

	/**
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.Bibliotec�ria#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see Modelodabiblioteca.Bibliotec�ria#getTerminal()
	 * @see #getBibliotec�ria()
	 * @generated
	 */
	EReference getBibliotec�ria_Terminal();

	/**
	 * Returns the meta object for the reference '{@link Modelodabiblioteca.Bibliotec�ria#getTerminalBibliotec�ria <em>Terminal Bibliotec�ria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal Bibliotec�ria</em>'.
	 * @see Modelodabiblioteca.Bibliotec�ria#getTerminalBibliotec�ria()
	 * @see #getBibliotec�ria()
	 * @generated
	 */
	EReference getBibliotec�ria_TerminalBibliotec�ria();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.Bibliotec�ria#IncluirExemplar() <em>Incluir Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Incluir Exemplar</em>' operation.
	 * @see Modelodabiblioteca.Bibliotec�ria#IncluirExemplar()
	 * @generated
	 */
	EOperation getBibliotec�ria__IncluirExemplar();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.Bibliotec�ria#ExcluirExemplar() <em>Excluir Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Excluir Exemplar</em>' operation.
	 * @see Modelodabiblioteca.Bibliotec�ria#ExcluirExemplar()
	 * @generated
	 */
	EOperation getBibliotec�ria__ExcluirExemplar();

	/**
	 * Returns the meta object for the '{@link Modelodabiblioteca.Bibliotec�ria#AtualizarExemplar() <em>Atualizar Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Atualizar Exemplar</em>' operation.
	 * @see Modelodabiblioteca.Bibliotec�ria#AtualizarExemplar()
	 * @generated
	 */
	EOperation getBibliotec�ria__AtualizarExemplar();

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
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.Publica��oImpl <em>Publica��o</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.Publica��oImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getPublica��o()
		 * @generated
		 */
		EClass PUBLICA��O = eINSTANCE.getPublica��o();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICA��O__NOME = eINSTANCE.getPublica��o_Nome();

		/**
		 * The meta object literal for the '<em><b>Autor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICA��O__AUTOR = eINSTANCE.getPublica��o_Autor();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICA��O__DATA = eINSTANCE.getPublica��o_Data();

		/**
		 * The meta object literal for the '<em><b>Exemplar Biblioteca</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICA��O__EXEMPLAR_BIBLIOTECA = eINSTANCE.getPublica��o_ExemplarBiblioteca();

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
		 * The meta object literal for the '<em><b>Lista Usu�rios</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SISTEMA_CADASTRO__LISTA_USU�RIOS = eINSTANCE.getSistemaCadastro_ListaUsu�rios();

		/**
		 * The meta object literal for the '<em><b>Usu�rio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SISTEMA_CADASTRO__USU�RIO = eINSTANCE.getSistemaCadastro_Usu�rio();

		/**
		 * The meta object literal for the '<em><b>Lista Publica��es</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SISTEMA_CADASTRO__LISTA_PUBLICA��ES = eINSTANCE.getSistemaCadastro_ListaPublica��es();

		/**
		 * The meta object literal for the '<em><b>Publica��o</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SISTEMA_CADASTRO__PUBLICA��O = eINSTANCE.getSistemaCadastro_Publica��o();

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
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.SistemaEmpr�stimoImpl <em>Sistema Empr�stimo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.SistemaEmpr�stimoImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getSistemaEmpr�stimo()
		 * @generated
		 */
		EClass SISTEMA_EMPR�STIMO = eINSTANCE.getSistemaEmpr�stimo();

		/**
		 * The meta object literal for the '<em><b>Fazer Reserva</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA_EMPR�STIMO___FAZER_RESERVA = eINSTANCE.getSistemaEmpr�stimo__FazerReserva();

		/**
		 * The meta object literal for the '<em><b>Cancelar Reserva</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA_EMPR�STIMO___CANCELAR_RESERVA = eINSTANCE.getSistemaEmpr�stimo__CancelarReserva();

		/**
		 * The meta object literal for the '<em><b>Realizar Emprestimo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA_EMPR�STIMO___REALIZAR_EMPRESTIMO = eINSTANCE.getSistemaEmpr�stimo__RealizarEmprestimo();

		/**
		 * The meta object literal for the '<em><b>Desfazer Emprestimo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA_EMPR�STIMO___DESFAZER_EMPRESTIMO = eINSTANCE.getSistemaEmpr�stimo__DesfazerEmprestimo();

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
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.Peri�dicoImpl <em>Peri�dico</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.Peri�dicoImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getPeri�dico()
		 * @generated
		 */
		EClass PERI�DICO = eINSTANCE.getPeri�dico();

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
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.Usu�rioImpl <em>Usu�rio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.Usu�rioImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getUsu�rio()
		 * @generated
		 */
		EClass USU�RIO = eINSTANCE.getUsu�rio();

		/**
		 * The meta object literal for the '<em><b>Numero Registro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USU�RIO__NUMERO_REGISTRO = eINSTANCE.getUsu�rio_NumeroRegistro();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USU�RIO__NOME = eINSTANCE.getUsu�rio_Nome();

		/**
		 * The meta object literal for the '<em><b>Instituto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USU�RIO__INSTITUTO = eINSTANCE.getUsu�rio_Instituto();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USU�RIO__TIPO = eINSTANCE.getUsu�rio_Tipo();

		/**
		 * The meta object literal for the '<em><b>Fazer Reserva</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USU�RIO___FAZER_RESERVA = eINSTANCE.getUsu�rio__FazerReserva();

		/**
		 * The meta object literal for the '<em><b>Cancelar Reserva</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USU�RIO___CANCELAR_RESERVA = eINSTANCE.getUsu�rio__CancelarReserva();

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
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.Funcion�rioImpl <em>Funcion�rio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.Funcion�rioImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getFuncion�rio()
		 * @generated
		 */
		EClass FUNCION�RIO = eINSTANCE.getFuncion�rio();

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
		 * The meta object literal for the '{@link Modelodabiblioteca.impl.Bibliotec�riaImpl <em>Bibliotec�ria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Modelodabiblioteca.impl.Bibliotec�riaImpl
		 * @see Modelodabiblioteca.impl.ModelodabibliotecaPackageImpl#getBibliotec�ria()
		 * @generated
		 */
		EClass BIBLIOTEC�RIA = eINSTANCE.getBibliotec�ria();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIBLIOTEC�RIA__TERMINAL = eINSTANCE.getBibliotec�ria_Terminal();

		/**
		 * The meta object literal for the '<em><b>Terminal Bibliotec�ria</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIBLIOTEC�RIA__TERMINAL_BIBLIOTEC�RIA = eINSTANCE.getBibliotec�ria_TerminalBibliotec�ria();

		/**
		 * The meta object literal for the '<em><b>Incluir Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTEC�RIA___INCLUIR_EXEMPLAR = eINSTANCE.getBibliotec�ria__IncluirExemplar();

		/**
		 * The meta object literal for the '<em><b>Excluir Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTEC�RIA___EXCLUIR_EXEMPLAR = eINSTANCE.getBibliotec�ria__ExcluirExemplar();

		/**
		 * The meta object literal for the '<em><b>Atualizar Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTEC�RIA___ATUALIZAR_EXEMPLAR = eINSTANCE.getBibliotec�ria__AtualizarExemplar();

	}

} //ModelodabibliotecaPackage
