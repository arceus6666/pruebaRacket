/**
 * generated by Xtext 2.12.0
 */
package edu.upb.lp.isc.pR;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.upb.lp.isc.pR.PRPackage
 * @generated
 */
public interface PRFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PRFactory eINSTANCE = edu.upb.lp.isc.pR.impl.PRFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Programa</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Programa</em>'.
   * @generated
   */
  Programa createPrograma();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Definicion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definicion</em>'.
   * @generated
   */
  Definicion createDefinicion();

  /**
   * Returns a new object of class '<em>Expresion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expresion</em>'.
   * @generated
   */
  Expresion createExpresion();

  /**
   * Returns a new object of class '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Value</em>'.
   * @generated
   */
  StringValue createStringValue();

  /**
   * Returns a new object of class '<em>Int Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Value</em>'.
   * @generated
   */
  IntValue createIntValue();

  /**
   * Returns a new object of class '<em>Int Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Expr</em>'.
   * @generated
   */
  IntExpr createIntExpr();

  /**
   * Returns a new object of class '<em>Sum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum</em>'.
   * @generated
   */
  Sum createSum();

  /**
   * Returns a new object of class '<em>Mult</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mult</em>'.
   * @generated
   */
  Mult createMult();

  /**
   * Returns a new object of class '<em>Res</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Res</em>'.
   * @generated
   */
  Res createRes();

  /**
   * Returns a new object of class '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div</em>'.
   * @generated
   */
  Div createDiv();

  /**
   * Returns a new object of class '<em>String Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Expr</em>'.
   * @generated
   */
  StringExpr createStringExpr();

  /**
   * Returns a new object of class '<em>Boolean Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Expr</em>'.
   * @generated
   */
  BooleanExpr createBooleanExpr();

  /**
   * Returns a new object of class '<em>Expr Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Value</em>'.
   * @generated
   */
  ExprValue createExprValue();

  /**
   * Returns a new object of class '<em>Call Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call Expr</em>'.
   * @generated
   */
  CallExpr createCallExpr();

  /**
   * Returns a new object of class '<em>Ref Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Variable</em>'.
   * @generated
   */
  RefVariable createRefVariable();

  /**
   * Returns a new object of class '<em>If Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Expr</em>'.
   * @generated
   */
  IfExpr createIfExpr();

  /**
   * Returns a new object of class '<em>List Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Expr</em>'.
   * @generated
   */
  ListExpr createListExpr();

  /**
   * Returns a new object of class '<em>List Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Value</em>'.
   * @generated
   */
  ListValue createListValue();

  /**
   * Returns a new object of class '<em>Complex List Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex List Expr</em>'.
   * @generated
   */
  ComplexListExpr createComplexListExpr();

  /**
   * Returns a new object of class '<em>List Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Op</em>'.
   * @generated
   */
  ListOp createListOp();

  /**
   * Returns a new object of class '<em>Car</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Car</em>'.
   * @generated
   */
  Car createCar();

  /**
   * Returns a new object of class '<em>Cdr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cdr</em>'.
   * @generated
   */
  Cdr createCdr();

  /**
   * Returns a new object of class '<em>While Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Expr</em>'.
   * @generated
   */
  WhileExpr createWhileExpr();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PRPackage getPRPackage();

} //PRFactory
