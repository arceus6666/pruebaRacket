/*
 * generated by Xtext 2.12.0
 */
package edu.upb.lp.isc.serializer;

import com.google.inject.Inject;
import edu.upb.lp.isc.pR.Argumento;
import edu.upb.lp.isc.pR.Definicion;
import edu.upb.lp.isc.pR.Expresion;
import edu.upb.lp.isc.pR.IntValue;
import edu.upb.lp.isc.pR.PRPackage;
import edu.upb.lp.isc.pR.Programa;
import edu.upb.lp.isc.pR.RefValue;
import edu.upb.lp.isc.pR.StringValue;
import edu.upb.lp.isc.pR.Variable;
import edu.upb.lp.isc.services.PRGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PRSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PRGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PRPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PRPackage.ARGUMENTO:
				sequence_Argumento(context, (Argumento) semanticObject); 
				return; 
			case PRPackage.DEFINICION:
				sequence_Definicion(context, (Definicion) semanticObject); 
				return; 
			case PRPackage.EXPRESION:
				sequence_Expresion(context, (Expresion) semanticObject); 
				return; 
			case PRPackage.INT_VALUE:
				sequence_IntValue(context, (IntValue) semanticObject); 
				return; 
			case PRPackage.PROGRAMA:
				sequence_Programa(context, (Programa) semanticObject); 
				return; 
			case PRPackage.REF_VALUE:
				sequence_RefValue(context, (RefValue) semanticObject); 
				return; 
			case PRPackage.STRING_VALUE:
				sequence_StringValue(context, (StringValue) semanticObject); 
				return; 
			case PRPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Argumento returns Argumento
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Argumento(ISerializationContext context, Argumento semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PRPackage.Literals.ARGUMENTO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PRPackage.Literals.ARGUMENTO__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArgumentoAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definicion returns Definicion
	 *
	 * Constraint:
	 *     (name=ID args+=Argumento* operador=Operador valores+=Expresion+)
	 */
	protected void sequence_Definicion(ISerializationContext context, Definicion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expresion returns Expresion
	 *
	 * Constraint:
	 *     (definiciones+=[Definicion|ID] (parametros+=Value | parametros+=Expresion)*)
	 */
	protected void sequence_Expresion(ISerializationContext context, Expresion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns IntValue
	 *     IntValue returns IntValue
	 *
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_IntValue(ISerializationContext context, IntValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PRPackage.Literals.INT_VALUE__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PRPackage.Literals.INT_VALUE__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntValueAccess().getValINTTerminalRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Programa returns Programa
	 *
	 * Constraint:
	 *     (name=ID variables+=Variable* definiciones+=Definicion* ejecuciones+=Expresion*)
	 */
	protected void sequence_Programa(ISerializationContext context, Programa semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns RefValue
	 *     RefValue returns RefValue
	 *
	 * Constraint:
	 *     ref=[Argumento|ID]
	 */
	protected void sequence_RefValue(ISerializationContext context, RefValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PRPackage.Literals.REF_VALUE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PRPackage.Literals.REF_VALUE__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRefValueAccess().getRefArgumentoIDTerminalRuleCall_0_1(), semanticObject.eGet(PRPackage.Literals.REF_VALUE__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Value returns StringValue
	 *     StringValue returns StringValue
	 *
	 * Constraint:
	 *     str=STRING
	 */
	protected void sequence_StringValue(ISerializationContext context, StringValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PRPackage.Literals.STRING_VALUE__STR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PRPackage.Literals.STRING_VALUE__STR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringValueAccess().getStrSTRINGTerminalRuleCall_0(), semanticObject.getStr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (name=ID value=Value)
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PRPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PRPackage.Literals.VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, PRPackage.Literals.VARIABLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PRPackage.Literals.VARIABLE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableAccess().getValueValueParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
