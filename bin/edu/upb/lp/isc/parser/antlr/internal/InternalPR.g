/*
 * generated by Xtext 2.12.0
 */
grammar InternalPR;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package edu.upb.lp.isc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package edu.upb.lp.isc.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.upb.lp.isc.services.PRGrammarAccess;

}

@parser::members {

 	private PRGrammarAccess grammarAccess;

    public InternalPRParser(TokenStream input, PRGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Programa";
   	}

   	@Override
   	protected PRGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulePrograma
entryRulePrograma returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramaRule()); }
	iv_rulePrograma=rulePrograma
	{ $current=$iv_rulePrograma.current; }
	EOF;

// Rule Programa
rulePrograma returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=';'
		{
			newLeafNode(otherlv_0, grammarAccess.getProgramaAccess().getSemicolonKeyword_0());
		}
		otherlv_1='Author'
		{
			newLeafNode(otherlv_1, grammarAccess.getProgramaAccess().getAuthorKeyword_1());
		}
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getProgramaAccess().getColonKeyword_2());
		}
		this_STRING_3=RULE_STRING
		{
			newLeafNode(this_STRING_3, grammarAccess.getProgramaAccess().getSTRINGTerminalRuleCall_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getProgramaAccess().getSemicolonKeyword_4());
		}
		(
			(
				lv_name_5_0=RULE_ID
				{
					newLeafNode(lv_name_5_0, grammarAccess.getProgramaAccess().getNameIDTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProgramaRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_5_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramaAccess().getVariablesVariableParserRuleCall_6_0());
				}
				lv_variables_6_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramaRule());
					}
					add(
						$current,
						"variables",
						lv_variables_6_0,
						"edu.upb.lp.isc.PR.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramaAccess().getDefinicionesDefinicionParserRuleCall_7_0());
				}
				lv_definiciones_7_0=ruleDefinicion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramaRule());
					}
					add(
						$current,
						"definiciones",
						lv_definiciones_7_0,
						"edu.upb.lp.isc.PR.Definicion");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_8='?'
			{
				newLeafNode(otherlv_8, grammarAccess.getProgramaAccess().getQuestionMarkKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProgramaAccess().getEjecucionesExpresionParserRuleCall_8_1_0());
					}
					lv_ejecuciones_9_0=ruleExpresion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProgramaRule());
						}
						add(
							$current,
							"ejecuciones",
							lv_ejecuciones_9_0,
							"edu.upb.lp.isc.PR.Expresion");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getVariableAccess().getVariableAction_0(),
					$current);
			}
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getLeftParenthesisKeyword_1());
		}
		otherlv_2='define'
		{
			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getDefineKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableAccess().getValueValueParserRuleCall_4_0());
				}
				lv_value_4_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"edu.upb.lp.isc.PR.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleDefinicion
entryRuleDefinicion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinicionRule()); }
	iv_ruleDefinicion=ruleDefinicion
	{ $current=$iv_ruleDefinicion.current; }
	EOF;

// Rule Definicion
ruleDefinicion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDefinicionAccess().getDefinicionAction_0(),
					$current);
			}
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getDefinicionAccess().getLeftParenthesisKeyword_1());
		}
		otherlv_2='define'
		{
			newLeafNode(otherlv_2, grammarAccess.getDefinicionAccess().getDefineKeyword_2());
		}
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getDefinicionAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getDefinicionAccess().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefinicionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinicionAccess().getArgsArgumentoParserRuleCall_5_0());
				}
				lv_args_5_0=ruleArgumento
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinicionRule());
					}
					add(
						$current,
						"args",
						lv_args_5_0,
						"edu.upb.lp.isc.PR.Argumento");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getDefinicionAccess().getRightParenthesisKeyword_6());
		}
		otherlv_7='('
		{
			newLeafNode(otherlv_7, grammarAccess.getDefinicionAccess().getLeftParenthesisKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinicionAccess().getOperadorOperadorParserRuleCall_8_0());
				}
				lv_operador_8_0=ruleOperador
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinicionRule());
					}
					set(
						$current,
						"operador",
						lv_operador_8_0,
						"edu.upb.lp.isc.PR.Operador");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinicionAccess().getValoresExpresionParserRuleCall_9_0());
				}
				lv_valores_9_0=ruleExpresion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinicionRule());
					}
					add(
						$current,
						"valores",
						lv_valores_9_0,
						"edu.upb.lp.isc.PR.Expresion");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_10=')'
		{
			newLeafNode(otherlv_10, grammarAccess.getDefinicionAccess().getRightParenthesisKeyword_10());
		}
		otherlv_11=')'
		{
			newLeafNode(otherlv_11, grammarAccess.getDefinicionAccess().getRightParenthesisKeyword_11());
		}
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current; }
	EOF;

// Rule Value
ruleValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getValueAccess().getRefValueParserRuleCall_0());
		}
		this_RefValue_0=ruleRefValue
		{
			$current = $this_RefValue_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_1());
		}
		this_StringValue_1=ruleStringValue
		{
			$current = $this_StringValue_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_2());
		}
		this_IntValue_2=ruleIntValue
		{
			$current = $this_IntValue_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRefValue
entryRuleRefValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefValueRule()); }
	iv_ruleRefValue=ruleRefValue
	{ $current=$iv_ruleRefValue.current; }
	EOF;

// Rule RefValue
ruleRefValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getRefValueRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getRefValueAccess().getRefArgumentoCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleStringValue
entryRuleStringValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringValueRule()); }
	iv_ruleStringValue=ruleStringValue
	{ $current=$iv_ruleStringValue.current; }
	EOF;

// Rule StringValue
ruleStringValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_str_0_0=RULE_STRING
			{
				newLeafNode(lv_str_0_0, grammarAccess.getStringValueAccess().getStrSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getStringValueRule());
				}
				setWithLastConsumed(
					$current,
					"str",
					lv_str_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleIntValue
entryRuleIntValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntValueRule()); }
	iv_ruleIntValue=ruleIntValue
	{ $current=$iv_ruleIntValue.current; }
	EOF;

// Rule IntValue
ruleIntValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_val_0_0=RULE_INT
			{
				newLeafNode(lv_val_0_0, grammarAccess.getIntValueAccess().getValINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIntValueRule());
				}
				setWithLastConsumed(
					$current,
					"val",
					lv_val_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleArgumento
entryRuleArgumento returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArgumentoRule()); }
	iv_ruleArgumento=ruleArgumento
	{ $current=$iv_ruleArgumento.current; }
	EOF;

// Rule Argumento
ruleArgumento returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getArgumentoAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getArgumentoRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleExpresion
entryRuleExpresion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpresionRule()); }
	iv_ruleExpresion=ruleExpresion
	{ $current=$iv_ruleExpresion.current; }
	EOF;

// Rule Expresion
ruleExpresion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getExpresionAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExpresionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getExpresionAccess().getDefinicionesDefinicionCrossReference_1_0());
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getExpresionAccess().getParametrosValueParserRuleCall_2_0_0());
					}
					lv_parametros_2_1=ruleValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpresionRule());
						}
						add(
							$current,
							"parametros",
							lv_parametros_2_1,
							"edu.upb.lp.isc.PR.Value");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getExpresionAccess().getParametrosExpresionParserRuleCall_2_0_1());
					}
					lv_parametros_2_2=ruleExpresion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpresionRule());
						}
						add(
							$current,
							"parametros",
							lv_parametros_2_2,
							"edu.upb.lp.isc.PR.Expresion");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getExpresionAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleOperador
entryRuleOperador returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOperadorRule()); }
	iv_ruleOperador=ruleOperador
	{ $current=$iv_ruleOperador.current.getText(); }
	EOF;

// Rule Operador
ruleOperador returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='+'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperadorAccess().getPlusSignKeyword_0());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperadorAccess().getHyphenMinusKeyword_1());
		}
		    |
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperadorAccess().getAsteriskKeyword_2());
		}
		    |
		kw='/'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperadorAccess().getSolidusKeyword_3());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
