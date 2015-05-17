/**
 */
package Modelodabiblioteca.impl;

import Modelodabiblioteca.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelodabibliotecaFactoryImpl extends EFactoryImpl implements ModelodabibliotecaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelodabibliotecaFactory init() {
		try {
			ModelodabibliotecaFactory theModelodabibliotecaFactory = (ModelodabibliotecaFactory)EPackage.Registry.INSTANCE.getEFactory(ModelodabibliotecaPackage.eNS_URI);
			if (theModelodabibliotecaFactory != null) {
				return theModelodabibliotecaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelodabibliotecaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelodabibliotecaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelodabibliotecaPackage.BIBLIOTECA: return createBiblioteca();
			case ModelodabibliotecaPackage.PUBLICA��O: return createPublica��o();
			case ModelodabibliotecaPackage.TERMINAL: return createTerminal();
			case ModelodabibliotecaPackage.EXEMPLAR: return createExemplar();
			case ModelodabibliotecaPackage.EMPR�STIMO: return createEmpr�stimo();
			case ModelodabibliotecaPackage.LIVRO: return createLivro();
			case ModelodabibliotecaPackage.PERI�DICO: return createPeri�dico();
			case ModelodabibliotecaPackage.TESE: return createTese();
			case ModelodabibliotecaPackage.MANUAL: return createManual();
			case ModelodabibliotecaPackage.USU�RIO: return createUsu�rio();
			case ModelodabibliotecaPackage.ALUNO: return createAluno();
			case ModelodabibliotecaPackage.PROFESSOR: return createProfessor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Biblioteca createBiblioteca() {
		BibliotecaImpl biblioteca = new BibliotecaImpl();
		return biblioteca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publica��o createPublica��o() {
		Publica��oImpl publica��o = new Publica��oImpl();
		return publica��o;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal createTerminal() {
		TerminalImpl terminal = new TerminalImpl();
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exemplar createExemplar() {
		ExemplarImpl exemplar = new ExemplarImpl();
		return exemplar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empr�stimo createEmpr�stimo() {
		Empr�stimoImpl empr�stimo = new Empr�stimoImpl();
		return empr�stimo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Livro createLivro() {
		LivroImpl livro = new LivroImpl();
		return livro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Peri�dico createPeri�dico() {
		Peri�dicoImpl peri�dico = new Peri�dicoImpl();
		return peri�dico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tese createTese() {
		TeseImpl tese = new TeseImpl();
		return tese;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manual createManual() {
		ManualImpl manual = new ManualImpl();
		return manual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usu�rio createUsu�rio() {
		Usu�rioImpl usu�rio = new Usu�rioImpl();
		return usu�rio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aluno createAluno() {
		AlunoImpl aluno = new AlunoImpl();
		return aluno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor createProfessor() {
		ProfessorImpl professor = new ProfessorImpl();
		return professor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelodabibliotecaPackage getModelodabibliotecaPackage() {
		return (ModelodabibliotecaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelodabibliotecaPackage getPackage() {
		return ModelodabibliotecaPackage.eINSTANCE;
	}

} //ModelodabibliotecaFactoryImpl
