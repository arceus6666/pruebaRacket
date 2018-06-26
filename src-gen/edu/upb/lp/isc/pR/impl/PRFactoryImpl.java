/**
 * generated by Xtext 2.12.0
 */
package edu.upb.lp.isc.pR.impl;

import edu.upb.lp.isc.pR.*;

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
public class PRFactoryImpl extends EFactoryImpl implements PRFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PRFactory init()
  {
    try
    {
      PRFactory thePRFactory = (PRFactory)EPackage.Registry.INSTANCE.getEFactory(PRPackage.eNS_URI);
      if (thePRFactory != null)
      {
        return thePRFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PRFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PRFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PRPackage.PROGRAMA: return createPrograma();
      case PRPackage.VARIABLE: return createVariable();
      case PRPackage.EXPRESION: return createExpresion();
      case PRPackage.VALUE: return createValue();
      case PRPackage.REF_VALUE: return createRefValue();
      case PRPackage.STRING_VALUE: return createStringValue();
      case PRPackage.INT_VALUE: return createIntValue();
      case PRPackage.ARGUMENTO: return createArgumento();
      case PRPackage.FUNCION: return createFuncion();
      case PRPackage.ACCION: return createAccion();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Programa createPrograma()
  {
    ProgramaImpl programa = new ProgramaImpl();
    return programa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expresion createExpresion()
  {
    ExpresionImpl expresion = new ExpresionImpl();
    return expresion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefValue createRefValue()
  {
    RefValueImpl refValue = new RefValueImpl();
    return refValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntValue createIntValue()
  {
    IntValueImpl intValue = new IntValueImpl();
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argumento createArgumento()
  {
    ArgumentoImpl argumento = new ArgumentoImpl();
    return argumento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Funcion createFuncion()
  {
    FuncionImpl funcion = new FuncionImpl();
    return funcion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Accion createAccion()
  {
    AccionImpl accion = new AccionImpl();
    return accion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PRPackage getPRPackage()
  {
    return (PRPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PRPackage getPackage()
  {
    return PRPackage.eINSTANCE;
  }

} //PRFactoryImpl
