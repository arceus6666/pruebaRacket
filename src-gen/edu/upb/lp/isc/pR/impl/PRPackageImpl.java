/**
 * generated by Xtext 2.12.0
 */
package edu.upb.lp.isc.pR.impl;

import edu.upb.lp.isc.pR.BooleanExpr;
import edu.upb.lp.isc.pR.CallExpr;
import edu.upb.lp.isc.pR.CarList;
import edu.upb.lp.isc.pR.CdrList;
import edu.upb.lp.isc.pR.CheckBoolExpr;
import edu.upb.lp.isc.pR.ConsList;
import edu.upb.lp.isc.pR.Definicion;
import edu.upb.lp.isc.pR.Div;
import edu.upb.lp.isc.pR.EqualsBoolExpr;
import edu.upb.lp.isc.pR.Expresion;
import edu.upb.lp.isc.pR.IfExpr;
import edu.upb.lp.isc.pR.IntExpr;
import edu.upb.lp.isc.pR.IntValue;
import edu.upb.lp.isc.pR.IsEmptyExpr;
import edu.upb.lp.isc.pR.LengthList;
import edu.upb.lp.isc.pR.ListExpr;
import edu.upb.lp.isc.pR.ListList;
import edu.upb.lp.isc.pR.MayorBoolExpr;
import edu.upb.lp.isc.pR.MenorBoolExpr;
import edu.upb.lp.isc.pR.Mult;
import edu.upb.lp.isc.pR.PRFactory;
import edu.upb.lp.isc.pR.PRPackage;
import edu.upb.lp.isc.pR.Programa;
import edu.upb.lp.isc.pR.ReadExpr;
import edu.upb.lp.isc.pR.RefVariable;
import edu.upb.lp.isc.pR.Res;
import edu.upb.lp.isc.pR.StringExpr;
import edu.upb.lp.isc.pR.StringValue;
import edu.upb.lp.isc.pR.Sum;
import edu.upb.lp.isc.pR.Variable;
import edu.upb.lp.isc.pR.VariableRef;
import edu.upb.lp.isc.pR.WhileExpr;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PRPackageImpl extends EPackageImpl implements PRPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definicionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expresionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass checkBoolExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalsBoolExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass menorBoolExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mayorBoolExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isEmptyExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass readExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass consListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass carListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cdrListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lengthListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileExprEClass = null;

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
   * @see edu.upb.lp.isc.pR.PRPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PRPackageImpl()
  {
    super(eNS_URI, PRFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link PRPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PRPackage init()
  {
    if (isInited) return (PRPackage)EPackage.Registry.INSTANCE.getEPackage(PRPackage.eNS_URI);

    // Obtain or create and register package
    PRPackageImpl thePRPackage = (PRPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PRPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PRPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePRPackage.createPackageContents();

    // Initialize created meta-data
    thePRPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePRPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PRPackage.eNS_URI, thePRPackage);
    return thePRPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrograma()
  {
    return programaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrograma_Name()
  {
    return (EAttribute)programaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrograma_Definiciones()
  {
    return (EReference)programaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrograma_Ejecuciones()
  {
    return (EReference)programaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Name()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinicion()
  {
    return definicionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefinicion_Name()
  {
    return (EAttribute)definicionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinicion_Args()
  {
    return (EReference)definicionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinicion_E()
  {
    return (EReference)definicionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpresion()
  {
    return expresionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringValue()
  {
    return stringValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringValue_Str()
  {
    return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntValue()
  {
    return intValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntValue_Val()
  {
    return (EAttribute)intValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntExpr()
  {
    return intExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableRef()
  {
    return variableRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableRef_Var()
  {
    return (EReference)variableRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSum()
  {
    return sumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSum_Value()
  {
    return (EReference)sumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMult()
  {
    return multEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMult_Value()
  {
    return (EReference)multEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRes()
  {
    return resEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRes_Value()
  {
    return (EReference)resEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiv()
  {
    return divEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiv_Value()
  {
    return (EReference)divEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringExpr()
  {
    return stringExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringExpr_Str()
  {
    return (EReference)stringExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanExpr()
  {
    return booleanExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanExpr_Boolean()
  {
    return (EAttribute)booleanExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheckBoolExpr()
  {
    return checkBoolExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheckBoolExpr_E()
  {
    return (EReference)checkBoolExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEqualsBoolExpr()
  {
    return equalsBoolExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMenorBoolExpr()
  {
    return menorBoolExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMayorBoolExpr()
  {
    return mayorBoolExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIsEmptyExpr()
  {
    return isEmptyExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIsEmptyExpr_Arg()
  {
    return (EReference)isEmptyExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReadExpr()
  {
    return readExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallExpr()
  {
    return callExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallExpr_Definicion()
  {
    return (EReference)callExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallExpr_Parametros()
  {
    return (EReference)callExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefVariable()
  {
    return refVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefVariable_Ref()
  {
    return (EReference)refVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfExpr()
  {
    return ifExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfExpr_E()
  {
    return (EReference)ifExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfExpr_TrueE()
  {
    return (EReference)ifExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfExpr_FalseE()
  {
    return (EReference)ifExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListExpr()
  {
    return listExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConsList()
  {
    return consListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConsList_Expr()
  {
    return (EReference)consListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConsList_List()
  {
    return (EReference)consListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListList()
  {
    return listListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListList_Params()
  {
    return (EReference)listListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCarList()
  {
    return carListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCarList_List()
  {
    return (EReference)carListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCdrList()
  {
    return cdrListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCdrList_List()
  {
    return (EReference)cdrListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLengthList()
  {
    return lengthListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLengthList_List()
  {
    return (EReference)lengthListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhileExpr()
  {
    return whileExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileExpr_Expresiones()
  {
    return (EReference)whileExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PRFactory getPRFactory()
  {
    return (PRFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    programaEClass = createEClass(PROGRAMA);
    createEAttribute(programaEClass, PROGRAMA__NAME);
    createEReference(programaEClass, PROGRAMA__DEFINICIONES);
    createEReference(programaEClass, PROGRAMA__EJECUCIONES);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__NAME);

    definicionEClass = createEClass(DEFINICION);
    createEAttribute(definicionEClass, DEFINICION__NAME);
    createEReference(definicionEClass, DEFINICION__ARGS);
    createEReference(definicionEClass, DEFINICION__E);

    expresionEClass = createEClass(EXPRESION);

    stringValueEClass = createEClass(STRING_VALUE);
    createEAttribute(stringValueEClass, STRING_VALUE__STR);

    intValueEClass = createEClass(INT_VALUE);
    createEAttribute(intValueEClass, INT_VALUE__VAL);

    intExprEClass = createEClass(INT_EXPR);

    variableRefEClass = createEClass(VARIABLE_REF);
    createEReference(variableRefEClass, VARIABLE_REF__VAR);

    sumEClass = createEClass(SUM);
    createEReference(sumEClass, SUM__VALUE);

    multEClass = createEClass(MULT);
    createEReference(multEClass, MULT__VALUE);

    resEClass = createEClass(RES);
    createEReference(resEClass, RES__VALUE);

    divEClass = createEClass(DIV);
    createEReference(divEClass, DIV__VALUE);

    stringExprEClass = createEClass(STRING_EXPR);
    createEReference(stringExprEClass, STRING_EXPR__STR);

    booleanExprEClass = createEClass(BOOLEAN_EXPR);
    createEAttribute(booleanExprEClass, BOOLEAN_EXPR__BOOLEAN);

    checkBoolExprEClass = createEClass(CHECK_BOOL_EXPR);
    createEReference(checkBoolExprEClass, CHECK_BOOL_EXPR__E);

    equalsBoolExprEClass = createEClass(EQUALS_BOOL_EXPR);

    menorBoolExprEClass = createEClass(MENOR_BOOL_EXPR);

    mayorBoolExprEClass = createEClass(MAYOR_BOOL_EXPR);

    isEmptyExprEClass = createEClass(IS_EMPTY_EXPR);
    createEReference(isEmptyExprEClass, IS_EMPTY_EXPR__ARG);

    readExprEClass = createEClass(READ_EXPR);

    callExprEClass = createEClass(CALL_EXPR);
    createEReference(callExprEClass, CALL_EXPR__DEFINICION);
    createEReference(callExprEClass, CALL_EXPR__PARAMETROS);

    refVariableEClass = createEClass(REF_VARIABLE);
    createEReference(refVariableEClass, REF_VARIABLE__REF);

    ifExprEClass = createEClass(IF_EXPR);
    createEReference(ifExprEClass, IF_EXPR__E);
    createEReference(ifExprEClass, IF_EXPR__TRUE_E);
    createEReference(ifExprEClass, IF_EXPR__FALSE_E);

    listExprEClass = createEClass(LIST_EXPR);

    consListEClass = createEClass(CONS_LIST);
    createEReference(consListEClass, CONS_LIST__EXPR);
    createEReference(consListEClass, CONS_LIST__LIST);

    listListEClass = createEClass(LIST_LIST);
    createEReference(listListEClass, LIST_LIST__PARAMS);

    carListEClass = createEClass(CAR_LIST);
    createEReference(carListEClass, CAR_LIST__LIST);

    cdrListEClass = createEClass(CDR_LIST);
    createEReference(cdrListEClass, CDR_LIST__LIST);

    lengthListEClass = createEClass(LENGTH_LIST);
    createEReference(lengthListEClass, LENGTH_LIST__LIST);

    whileExprEClass = createEClass(WHILE_EXPR);
    createEReference(whileExprEClass, WHILE_EXPR__EXPRESIONES);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    intValueEClass.getESuperTypes().add(this.getIntExpr());
    intExprEClass.getESuperTypes().add(this.getExpresion());
    sumEClass.getESuperTypes().add(this.getIntExpr());
    multEClass.getESuperTypes().add(this.getIntExpr());
    resEClass.getESuperTypes().add(this.getIntExpr());
    divEClass.getESuperTypes().add(this.getIntExpr());
    stringExprEClass.getESuperTypes().add(this.getExpresion());
    booleanExprEClass.getESuperTypes().add(this.getExpresion());
    checkBoolExprEClass.getESuperTypes().add(this.getExpresion());
    equalsBoolExprEClass.getESuperTypes().add(this.getCheckBoolExpr());
    menorBoolExprEClass.getESuperTypes().add(this.getCheckBoolExpr());
    mayorBoolExprEClass.getESuperTypes().add(this.getCheckBoolExpr());
    readExprEClass.getESuperTypes().add(this.getExpresion());
    callExprEClass.getESuperTypes().add(this.getExpresion());
    refVariableEClass.getESuperTypes().add(this.getExpresion());
    ifExprEClass.getESuperTypes().add(this.getExpresion());
    listExprEClass.getESuperTypes().add(this.getExpresion());
    consListEClass.getESuperTypes().add(this.getListExpr());
    listListEClass.getESuperTypes().add(this.getListExpr());
    carListEClass.getESuperTypes().add(this.getListExpr());
    cdrListEClass.getESuperTypes().add(this.getListExpr());
    lengthListEClass.getESuperTypes().add(this.getListExpr());

    // Initialize classes and features; add operations and parameters
    initEClass(programaEClass, Programa.class, "Programa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrograma_Name(), ecorePackage.getEString(), "name", null, 0, 1, Programa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrograma_Definiciones(), this.getDefinicion(), null, "definiciones", null, 0, -1, Programa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrograma_Ejecuciones(), this.getExpresion(), null, "ejecuciones", null, 0, -1, Programa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definicionEClass, Definicion.class, "Definicion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDefinicion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Definicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefinicion_Args(), this.getVariable(), null, "args", null, 0, -1, Definicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefinicion_E(), this.getExpresion(), null, "e", null, 0, 1, Definicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expresionEClass, Expresion.class, "Expresion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringValue_Str(), ecorePackage.getEString(), "str", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intValueEClass, IntValue.class, "IntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntValue_Val(), ecorePackage.getEInt(), "val", null, 0, 1, IntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intExprEClass, IntExpr.class, "IntExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableRefEClass, VariableRef.class, "VariableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableRef_Var(), this.getVariable(), null, "var", null, 0, 1, VariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sumEClass, Sum.class, "Sum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSum_Value(), ecorePackage.getEObject(), null, "value", null, 0, -1, Sum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multEClass, Mult.class, "Mult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMult_Value(), ecorePackage.getEObject(), null, "value", null, 0, -1, Mult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resEClass, Res.class, "Res", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRes_Value(), ecorePackage.getEObject(), null, "value", null, 0, -1, Res.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(divEClass, Div.class, "Div", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDiv_Value(), ecorePackage.getEObject(), null, "value", null, 0, -1, Div.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringExprEClass, StringExpr.class, "StringExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringExpr_Str(), this.getStringValue(), null, "str", null, 0, 1, StringExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanExprEClass, BooleanExpr.class, "BooleanExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanExpr_Boolean(), ecorePackage.getEString(), "boolean", null, 0, 1, BooleanExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(checkBoolExprEClass, CheckBoolExpr.class, "CheckBoolExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCheckBoolExpr_E(), this.getExpresion(), null, "e", null, 0, -1, CheckBoolExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equalsBoolExprEClass, EqualsBoolExpr.class, "EqualsBoolExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(menorBoolExprEClass, MenorBoolExpr.class, "MenorBoolExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mayorBoolExprEClass, MayorBoolExpr.class, "MayorBoolExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(isEmptyExprEClass, IsEmptyExpr.class, "IsEmptyExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIsEmptyExpr_Arg(), this.getListExpr(), null, "arg", null, 0, 1, IsEmptyExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(readExprEClass, ReadExpr.class, "ReadExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(callExprEClass, CallExpr.class, "CallExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCallExpr_Definicion(), this.getDefinicion(), null, "definicion", null, 0, 1, CallExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCallExpr_Parametros(), this.getExpresion(), null, "parametros", null, 0, -1, CallExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refVariableEClass, RefVariable.class, "RefVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefVariable_Ref(), this.getVariable(), null, "ref", null, 0, 1, RefVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifExprEClass, IfExpr.class, "IfExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfExpr_E(), this.getExpresion(), null, "e", null, 0, 1, IfExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfExpr_TrueE(), this.getExpresion(), null, "trueE", null, 0, -1, IfExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfExpr_FalseE(), this.getExpresion(), null, "falseE", null, 0, 1, IfExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listExprEClass, ListExpr.class, "ListExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(consListEClass, ConsList.class, "ConsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConsList_Expr(), this.getExpresion(), null, "expr", null, 0, -1, ConsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConsList_List(), this.getListExpr(), null, "list", null, 0, 1, ConsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listListEClass, ListList.class, "ListList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListList_Params(), this.getExpresion(), null, "params", null, 0, -1, ListList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(carListEClass, CarList.class, "CarList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCarList_List(), this.getListExpr(), null, "list", null, 0, 1, CarList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cdrListEClass, CdrList.class, "CdrList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCdrList_List(), this.getListExpr(), null, "list", null, 0, 1, CdrList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lengthListEClass, LengthList.class, "LengthList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLengthList_List(), this.getVariable(), null, "list", null, 0, 1, LengthList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whileExprEClass, WhileExpr.class, "WhileExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhileExpr_Expresiones(), this.getExpresion(), null, "expresiones", null, 0, -1, WhileExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PRPackageImpl
