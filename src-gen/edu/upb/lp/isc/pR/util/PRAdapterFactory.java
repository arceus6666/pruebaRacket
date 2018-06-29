/**
 * generated by Xtext 2.12.0
 */
package edu.upb.lp.isc.pR.util;

import edu.upb.lp.isc.pR.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.upb.lp.isc.pR.PRPackage
 * @generated
 */
public class PRAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PRPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PRAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PRPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected PRSwitch<Adapter> modelSwitch =
    new PRSwitch<Adapter>()
    {
      @Override
      public Adapter casePrograma(Programa object)
      {
        return createProgramaAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseDefinicion(Definicion object)
      {
        return createDefinicionAdapter();
      }
      @Override
      public Adapter caseExpresion(Expresion object)
      {
        return createExpresionAdapter();
      }
      @Override
      public Adapter caseStringValue(StringValue object)
      {
        return createStringValueAdapter();
      }
      @Override
      public Adapter caseIntValue(IntValue object)
      {
        return createIntValueAdapter();
      }
      @Override
      public Adapter caseIntExpr(IntExpr object)
      {
        return createIntExprAdapter();
      }
      @Override
      public Adapter caseVariableRef(VariableRef object)
      {
        return createVariableRefAdapter();
      }
      @Override
      public Adapter caseSum(Sum object)
      {
        return createSumAdapter();
      }
      @Override
      public Adapter caseMult(Mult object)
      {
        return createMultAdapter();
      }
      @Override
      public Adapter caseRes(Res object)
      {
        return createResAdapter();
      }
      @Override
      public Adapter caseDiv(Div object)
      {
        return createDivAdapter();
      }
      @Override
      public Adapter caseStringExpr(StringExpr object)
      {
        return createStringExprAdapter();
      }
      @Override
      public Adapter caseBooleanExpr(BooleanExpr object)
      {
        return createBooleanExprAdapter();
      }
      @Override
      public Adapter caseCheckBoolExpr(CheckBoolExpr object)
      {
        return createCheckBoolExprAdapter();
      }
      @Override
      public Adapter caseEqualsBoolExpr(EqualsBoolExpr object)
      {
        return createEqualsBoolExprAdapter();
      }
      @Override
      public Adapter caseMenorBoolExpr(MenorBoolExpr object)
      {
        return createMenorBoolExprAdapter();
      }
      @Override
      public Adapter caseMayorBoolExpr(MayorBoolExpr object)
      {
        return createMayorBoolExprAdapter();
      }
      @Override
      public Adapter caseIsEmptyExpr(IsEmptyExpr object)
      {
        return createIsEmptyExprAdapter();
      }
      @Override
      public Adapter caseReadExpr(ReadExpr object)
      {
        return createReadExprAdapter();
      }
      @Override
      public Adapter caseCallExpr(CallExpr object)
      {
        return createCallExprAdapter();
      }
      @Override
      public Adapter caseRefVariable(RefVariable object)
      {
        return createRefVariableAdapter();
      }
      @Override
      public Adapter caseIfExpr(IfExpr object)
      {
        return createIfExprAdapter();
      }
      @Override
      public Adapter caseListExpr(ListExpr object)
      {
        return createListExprAdapter();
      }
      @Override
      public Adapter caseConsList(ConsList object)
      {
        return createConsListAdapter();
      }
      @Override
      public Adapter caseListList(ListList object)
      {
        return createListListAdapter();
      }
      @Override
      public Adapter caseCarList(CarList object)
      {
        return createCarListAdapter();
      }
      @Override
      public Adapter caseCdrList(CdrList object)
      {
        return createCdrListAdapter();
      }
      @Override
      public Adapter caseLengthList(LengthList object)
      {
        return createLengthListAdapter();
      }
      @Override
      public Adapter caseWhileExpr(WhileExpr object)
      {
        return createWhileExprAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.Programa <em>Programa</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.Programa
   * @generated
   */
  public Adapter createProgramaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.Definicion <em>Definicion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.Definicion
   * @generated
   */
  public Adapter createDefinicionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.Expresion <em>Expresion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.Expresion
   * @generated
   */
  public Adapter createExpresionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.StringValue
   * @generated
   */
  public Adapter createStringValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.IntValue
   * @generated
   */
  public Adapter createIntValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.IntExpr <em>Int Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.IntExpr
   * @generated
   */
  public Adapter createIntExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.VariableRef <em>Variable Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.VariableRef
   * @generated
   */
  public Adapter createVariableRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.Sum <em>Sum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.Sum
   * @generated
   */
  public Adapter createSumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.Mult <em>Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.Mult
   * @generated
   */
  public Adapter createMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.Res <em>Res</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.Res
   * @generated
   */
  public Adapter createResAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.StringExpr <em>String Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.StringExpr
   * @generated
   */
  public Adapter createStringExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.BooleanExpr <em>Boolean Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.BooleanExpr
   * @generated
   */
  public Adapter createBooleanExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.CheckBoolExpr <em>Check Bool Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.CheckBoolExpr
   * @generated
   */
  public Adapter createCheckBoolExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.EqualsBoolExpr <em>Equals Bool Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.EqualsBoolExpr
   * @generated
   */
  public Adapter createEqualsBoolExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.MenorBoolExpr <em>Menor Bool Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.MenorBoolExpr
   * @generated
   */
  public Adapter createMenorBoolExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.MayorBoolExpr <em>Mayor Bool Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.MayorBoolExpr
   * @generated
   */
  public Adapter createMayorBoolExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.IsEmptyExpr <em>Is Empty Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.IsEmptyExpr
   * @generated
   */
  public Adapter createIsEmptyExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.ReadExpr <em>Read Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.ReadExpr
   * @generated
   */
  public Adapter createReadExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.CallExpr <em>Call Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.CallExpr
   * @generated
   */
  public Adapter createCallExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.RefVariable <em>Ref Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.RefVariable
   * @generated
   */
  public Adapter createRefVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.IfExpr <em>If Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.IfExpr
   * @generated
   */
  public Adapter createIfExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.ListExpr <em>List Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.ListExpr
   * @generated
   */
  public Adapter createListExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.ConsList <em>Cons List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.ConsList
   * @generated
   */
  public Adapter createConsListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.ListList <em>List List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.ListList
   * @generated
   */
  public Adapter createListListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.CarList <em>Car List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.CarList
   * @generated
   */
  public Adapter createCarListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.CdrList <em>Cdr List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.CdrList
   * @generated
   */
  public Adapter createCdrListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.LengthList <em>Length List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.LengthList
   * @generated
   */
  public Adapter createLengthListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.upb.lp.isc.pR.WhileExpr <em>While Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.upb.lp.isc.pR.WhileExpr
   * @generated
   */
  public Adapter createWhileExprAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PRAdapterFactory
