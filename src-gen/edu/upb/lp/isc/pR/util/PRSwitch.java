/**
 * generated by Xtext 2.12.0
 */
package edu.upb.lp.isc.pR.util;

import edu.upb.lp.isc.pR.*;

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
 * @see edu.upb.lp.isc.pR.PRPackage
 * @generated
 */
public class PRSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PRPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PRSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PRPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PRPackage.PROGRAMA:
      {
        Programa programa = (Programa)theEObject;
        T result = casePrograma(programa);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.DEFINICION:
      {
        Definicion definicion = (Definicion)theEObject;
        T result = caseDefinicion(definicion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.EXPRESION:
      {
        Expresion expresion = (Expresion)theEObject;
        T result = caseExpresion(expresion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.STRING_VALUE:
      {
        StringValue stringValue = (StringValue)theEObject;
        T result = caseStringValue(stringValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.INT_VALUE:
      {
        IntValue intValue = (IntValue)theEObject;
        T result = caseIntValue(intValue);
        if (result == null) result = caseIntExpr(intValue);
        if (result == null) result = caseExpresion(intValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.INT_EXPR:
      {
        IntExpr intExpr = (IntExpr)theEObject;
        T result = caseIntExpr(intExpr);
        if (result == null) result = caseExpresion(intExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.VARIABLE_REF:
      {
        VariableRef variableRef = (VariableRef)theEObject;
        T result = caseVariableRef(variableRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.SUM:
      {
        Sum sum = (Sum)theEObject;
        T result = caseSum(sum);
        if (result == null) result = caseIntExpr(sum);
        if (result == null) result = caseExpresion(sum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.MULT:
      {
        Mult mult = (Mult)theEObject;
        T result = caseMult(mult);
        if (result == null) result = caseIntExpr(mult);
        if (result == null) result = caseExpresion(mult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.RES:
      {
        Res res = (Res)theEObject;
        T result = caseRes(res);
        if (result == null) result = caseIntExpr(res);
        if (result == null) result = caseExpresion(res);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.DIV:
      {
        Div div = (Div)theEObject;
        T result = caseDiv(div);
        if (result == null) result = caseIntExpr(div);
        if (result == null) result = caseExpresion(div);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.STRING_EXPR:
      {
        StringExpr stringExpr = (StringExpr)theEObject;
        T result = caseStringExpr(stringExpr);
        if (result == null) result = caseExpresion(stringExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.BOOLEAN_EXPR:
      {
        BooleanExpr booleanExpr = (BooleanExpr)theEObject;
        T result = caseBooleanExpr(booleanExpr);
        if (result == null) result = caseExpresion(booleanExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.CHECK_BOOL_EXPR:
      {
        CheckBoolExpr checkBoolExpr = (CheckBoolExpr)theEObject;
        T result = caseCheckBoolExpr(checkBoolExpr);
        if (result == null) result = caseExpresion(checkBoolExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.EQUALS_BOOL_EXPR:
      {
        EqualsBoolExpr equalsBoolExpr = (EqualsBoolExpr)theEObject;
        T result = caseEqualsBoolExpr(equalsBoolExpr);
        if (result == null) result = caseCheckBoolExpr(equalsBoolExpr);
        if (result == null) result = caseExpresion(equalsBoolExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.MENOR_BOOL_EXPR:
      {
        MenorBoolExpr menorBoolExpr = (MenorBoolExpr)theEObject;
        T result = caseMenorBoolExpr(menorBoolExpr);
        if (result == null) result = caseCheckBoolExpr(menorBoolExpr);
        if (result == null) result = caseExpresion(menorBoolExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.MAYOR_BOOL_EXPR:
      {
        MayorBoolExpr mayorBoolExpr = (MayorBoolExpr)theEObject;
        T result = caseMayorBoolExpr(mayorBoolExpr);
        if (result == null) result = caseCheckBoolExpr(mayorBoolExpr);
        if (result == null) result = caseExpresion(mayorBoolExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.IS_EMPTY_EXPR:
      {
        IsEmptyExpr isEmptyExpr = (IsEmptyExpr)theEObject;
        T result = caseIsEmptyExpr(isEmptyExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.READ_EXPR:
      {
        ReadExpr readExpr = (ReadExpr)theEObject;
        T result = caseReadExpr(readExpr);
        if (result == null) result = caseExpresion(readExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.CALL_EXPR:
      {
        CallExpr callExpr = (CallExpr)theEObject;
        T result = caseCallExpr(callExpr);
        if (result == null) result = caseExpresion(callExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.REF_VARIABLE:
      {
        RefVariable refVariable = (RefVariable)theEObject;
        T result = caseRefVariable(refVariable);
        if (result == null) result = caseExpresion(refVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.IF_EXPR:
      {
        IfExpr ifExpr = (IfExpr)theEObject;
        T result = caseIfExpr(ifExpr);
        if (result == null) result = caseExpresion(ifExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.LIST_EXPR:
      {
        ListExpr listExpr = (ListExpr)theEObject;
        T result = caseListExpr(listExpr);
        if (result == null) result = caseExpresion(listExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.CONS_LIST:
      {
        ConsList consList = (ConsList)theEObject;
        T result = caseConsList(consList);
        if (result == null) result = caseListExpr(consList);
        if (result == null) result = caseExpresion(consList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.LIST_LIST:
      {
        ListList listList = (ListList)theEObject;
        T result = caseListList(listList);
        if (result == null) result = caseListExpr(listList);
        if (result == null) result = caseExpresion(listList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.CAR_LIST:
      {
        CarList carList = (CarList)theEObject;
        T result = caseCarList(carList);
        if (result == null) result = caseListExpr(carList);
        if (result == null) result = caseExpresion(carList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.CDR_LIST:
      {
        CdrList cdrList = (CdrList)theEObject;
        T result = caseCdrList(cdrList);
        if (result == null) result = caseListExpr(cdrList);
        if (result == null) result = caseExpresion(cdrList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.LENGTH_LIST:
      {
        LengthList lengthList = (LengthList)theEObject;
        T result = caseLengthList(lengthList);
        if (result == null) result = caseListExpr(lengthList);
        if (result == null) result = caseExpresion(lengthList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PRPackage.WHILE_EXPR:
      {
        WhileExpr whileExpr = (WhileExpr)theEObject;
        T result = caseWhileExpr(whileExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Programa</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Programa</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrograma(Programa object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definicion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definicion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinicion(Definicion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expresion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expresion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpresion(Expresion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValue(StringValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntValue(IntValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntExpr(IntExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableRef(VariableRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSum(Sum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mult</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mult</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMult(Mult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Res</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Res</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRes(Res object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiv(Div object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringExpr(StringExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanExpr(BooleanExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check Bool Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Bool Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckBoolExpr(CheckBoolExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equals Bool Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equals Bool Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqualsBoolExpr(EqualsBoolExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Menor Bool Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Menor Bool Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMenorBoolExpr(MenorBoolExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mayor Bool Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mayor Bool Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMayorBoolExpr(MayorBoolExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Is Empty Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Is Empty Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIsEmptyExpr(IsEmptyExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Read Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Read Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReadExpr(ReadExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallExpr(CallExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefVariable(RefVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfExpr(IfExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListExpr(ListExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cons List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cons List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConsList(ConsList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListList(ListList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Car List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Car List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCarList(CarList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cdr List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cdr List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCdrList(CdrList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Length List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Length List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLengthList(LengthList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhileExpr(WhileExpr object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PRSwitch
