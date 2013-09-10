package com.writeoncereadmany.minstrel.generated;

// Generated from Minstrel.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MinstrelParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, SPACE=20, INTEGER_LITERAL=21, FLOAT_LITERAL=22, 
		STRING_LITERAL=23, OF=24, GIVING=25, TAKING=26, CLASS=27, IMPLEMENTS=28, 
		CONSTRUCT=29, METHOD=30, RETURNS=31, INTERFACE=32, EXTENDS=33, FUNCTION=34, 
		ENUM=35, IS=36, BECOMES=37, IF=38, ELSE=39, WHILE=40, FOR=41, IN=42, RETURN=43, 
		ERROR=44, OR=45, AND=46, NOT=47, IDENTIFIER=48;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'.'", "')'", "','", "'+'", "'*'", "'-'", "'['", "'('", 
		"'<'", "'=/='", "'='", "';'", "'<='", "'{'", "'>'", "'/'", "'}'", "'>='", 
		"SPACE", "INTEGER_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", "'of'", 
		"'giving'", "'taking'", "'class'", "'implements'", "'construct'", "'method'", 
		"'returns'", "'interface'", "'extends'", "'function'", "'enum'", "'is'", 
		"'becomes'", "'if'", "'else'", "'while'", "'for'", "'in'", "'return'", 
		"'error'", "'or'", "'and'", "'not'", "IDENTIFIER"
	};
	public static final int
		RULE_program = 0, RULE_generic_argument_list = 1, RULE_initial_generic_parameter = 2, 
		RULE_additional_generic_parameter = 3, RULE_variance_modifier = 4, RULE_type = 5, 
		RULE_inner_type = 6, RULE_modifier = 7, RULE_class_definition = 8, RULE_class_body = 9, 
		RULE_field_definition = 10, RULE_constructor_definition = 11, RULE_method_definition = 12, 
		RULE_parameter_list = 13, RULE_parameter = 14, RULE_argument_list = 15, 
		RULE_block = 16, RULE_interface_definition = 17, RULE_interface_body = 18, 
		RULE_method_declaration = 19, RULE_function_interface_definition = 20, 
		RULE_function_definition = 21, RULE_enum_definition = 22, RULE_enum_value = 23, 
		RULE_name = 24, RULE_statement = 25, RULE_definition = 26, RULE_expression = 27;
	public static final String[] ruleNames = {
		"program", "generic_argument_list", "initial_generic_parameter", "additional_generic_parameter", 
		"variance_modifier", "type", "inner_type", "modifier", "class_definition", 
		"class_body", "field_definition", "constructor_definition", "method_definition", 
		"parameter_list", "parameter", "argument_list", "block", "interface_definition", 
		"interface_body", "method_declaration", "function_interface_definition", 
		"function_definition", "enum_definition", "enum_value", "name", "statement", 
		"definition", "expression"
	};

	@Override
	public String getGrammarFileName() { return "Minstrel.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public MinstrelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 9) | (1L << INTEGER_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << CLASS) | (1L << INTERFACE) | (1L << FUNCTION) | (1L << ENUM) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << ERROR) | (1L << NOT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(56); statement();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_argument_listContext extends ParserRuleContext {
		public Initial_generic_parameterContext initial_generic_parameter() {
			return getRuleContext(Initial_generic_parameterContext.class,0);
		}
		public Additional_generic_parameterContext additional_generic_parameter(int i) {
			return getRuleContext(Additional_generic_parameterContext.class,i);
		}
		public List<Additional_generic_parameterContext> additional_generic_parameter() {
			return getRuleContexts(Additional_generic_parameterContext.class);
		}
		public Generic_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterGeneric_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitGeneric_argument_list(this);
		}
	}

	public final Generic_argument_listContext generic_argument_list() throws RecognitionException {
		Generic_argument_listContext _localctx = new Generic_argument_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_generic_argument_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62); initial_generic_parameter();
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(63); match(4);
					setState(64); additional_generic_parameter();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initial_generic_parameterContext extends ParserRuleContext {
		public Variance_modifierContext variance_modifier() {
			return getRuleContext(Variance_modifierContext.class,0);
		}
		public Inner_typeContext inner_type() {
			return getRuleContext(Inner_typeContext.class,0);
		}
		public Initial_generic_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_generic_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterInitial_generic_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitInitial_generic_parameter(this);
		}
	}

	public final Initial_generic_parameterContext initial_generic_parameter() throws RecognitionException {
		Initial_generic_parameterContext _localctx = new Initial_generic_parameterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_initial_generic_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); variance_modifier();
			setState(71); inner_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Additional_generic_parameterContext extends ParserRuleContext {
		public Variance_modifierContext variance_modifier() {
			return getRuleContext(Variance_modifierContext.class,0);
		}
		public Inner_typeContext inner_type() {
			return getRuleContext(Inner_typeContext.class,0);
		}
		public Additional_generic_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additional_generic_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterAdditional_generic_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitAdditional_generic_parameter(this);
		}
	}

	public final Additional_generic_parameterContext additional_generic_parameter() throws RecognitionException {
		Additional_generic_parameterContext _localctx = new Additional_generic_parameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_additional_generic_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << GIVING) | (1L << TAKING))) != 0)) {
				{
				setState(73); variance_modifier();
				}
			}

			setState(76); inner_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variance_modifierContext extends ParserRuleContext {
		public TerminalNode OF() { return getToken(MinstrelParser.OF, 0); }
		public TerminalNode TAKING() { return getToken(MinstrelParser.TAKING, 0); }
		public TerminalNode GIVING() { return getToken(MinstrelParser.GIVING, 0); }
		public Variance_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variance_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterVariance_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitVariance_modifier(this);
		}
	}

	public final Variance_modifierContext variance_modifier() throws RecognitionException {
		Variance_modifierContext _localctx = new Variance_modifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variance_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << GIVING) | (1L << TAKING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Generic_argument_listContext generic_argument_list() {
			return getRuleContext(Generic_argument_listContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(80); modifier();
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(86); name();
			setState(88);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << GIVING) | (1L << TAKING))) != 0)) {
				{
				setState(87); generic_argument_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inner_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Inner_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterInner_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitInner_type(this);
		}
	}

	public final Inner_typeContext inner_type() throws RecognitionException {
		Inner_typeContext _localctx = new Inner_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inner_type);
		try {
			setState(95);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); name();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 2);
				{
				setState(91); match(9);
				setState(92); type();
				setState(93); match(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_definitionContext extends ParserRuleContext {
		public Generic_argument_listContext generic_argument_list() {
			return getRuleContext(Generic_argument_listContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(MinstrelParser.IMPLEMENTS, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(MinstrelParser.CLASS, 0); }
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterClass_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitClass_definition(this);
		}
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_class_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(CLASS);
			setState(100); name();
			setState(102);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << GIVING) | (1L << TAKING))) != 0)) {
				{
				setState(101); generic_argument_list();
				}
			}

			setState(104); match(IMPLEMENTS);
			setState(105); type();
			setState(106); match(15);
			setState(107); class_body();
			setState(108); match(18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public List<Field_definitionContext> field_definition() {
			return getRuleContexts(Field_definitionContext.class);
		}
		public Constructor_definitionContext constructor_definition(int i) {
			return getRuleContext(Constructor_definitionContext.class,i);
		}
		public List<Method_definitionContext> method_definition() {
			return getRuleContexts(Method_definitionContext.class);
		}
		public List<Constructor_definitionContext> constructor_definition() {
			return getRuleContexts(Constructor_definitionContext.class);
		}
		public Field_definitionContext field_definition(int i) {
			return getRuleContext(Field_definitionContext.class,i);
		}
		public Method_definitionContext method_definition(int i) {
			return getRuleContext(Method_definitionContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitClass_body(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTRUCT) | (1L << METHOD) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(113);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(110); field_definition();
					}
					break;
				case CONSTRUCT:
					{
					setState(111); constructor_definition();
					}
					break;
				case METHOD:
					{
					setState(112); method_definition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_definitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Field_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterField_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitField_definition(this);
		}
	}

	public final Field_definitionContext field_definition() throws RecognitionException {
		Field_definitionContext _localctx = new Field_definitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_field_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); type();
			setState(119); name();
			setState(120); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_definitionContext extends ParserRuleContext {
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CONSTRUCT() { return getToken(MinstrelParser.CONSTRUCT, 0); }
		public Constructor_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterConstructor_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitConstructor_definition(this);
		}
	}

	public final Constructor_definitionContext constructor_definition() throws RecognitionException {
		Constructor_definitionContext _localctx = new Constructor_definitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constructor_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(CONSTRUCT);
			setState(123); parameter_list();
			setState(124); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_definitionContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(MinstrelParser.METHOD, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(MinstrelParser.RETURNS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterMethod_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitMethod_definition(this);
		}
	}

	public final Method_definitionContext method_definition() throws RecognitionException {
		Method_definitionContext _localctx = new Method_definitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_method_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(METHOD);
			setState(127); name();
			setState(128); parameter_list();
			setState(129); match(RETURNS);
			setState(130); type();
			setState(131); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(8);
			setState(142);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(134); parameter();
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(135); match(4);
					setState(136); parameter();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(144); match(1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); type();
			setState(147); name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitArgument_list(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(8);
			setState(158);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 9) | (1L << INTEGER_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << FUNCTION) | (1L << NOT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(150); expression(0);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(151); match(4);
					setState(152); expression(0);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(160); match(1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(15);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 9) | (1L << INTEGER_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << CLASS) | (1L << INTERFACE) | (1L << FUNCTION) | (1L << ENUM) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << ERROR) | (1L << NOT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(163); statement();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169); match(18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_definitionContext extends ParserRuleContext {
		public Interface_bodyContext interface_body() {
			return getRuleContext(Interface_bodyContext.class,0);
		}
		public Generic_argument_listContext generic_argument_list() {
			return getRuleContext(Generic_argument_listContext.class,0);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode INTERFACE() { return getToken(MinstrelParser.INTERFACE, 0); }
		public TerminalNode EXTENDS() { return getToken(MinstrelParser.EXTENDS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Interface_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterInterface_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitInterface_definition(this);
		}
	}

	public final Interface_definitionContext interface_definition() throws RecognitionException {
		Interface_definitionContext _localctx = new Interface_definitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interface_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(INTERFACE);
			setState(172); name();
			setState(174);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << GIVING) | (1L << TAKING))) != 0)) {
				{
				setState(173); generic_argument_list();
				}
			}

			setState(185);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(176); match(EXTENDS);
				setState(177); type();
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(178); match(4);
					setState(179); type();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(187); match(15);
			setState(188); interface_body();
			setState(189); match(18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_bodyContext extends ParserRuleContext {
		public Method_declarationContext method_declaration(int i) {
			return getRuleContext(Method_declarationContext.class,i);
		}
		public List<Method_declarationContext> method_declaration() {
			return getRuleContexts(Method_declarationContext.class);
		}
		public Interface_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterInterface_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitInterface_body(this);
		}
	}

	public final Interface_bodyContext interface_body() throws RecognitionException {
		Interface_bodyContext _localctx = new Interface_bodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interface_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==METHOD) {
				{
				{
				setState(191); method_declaration();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declarationContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(MinstrelParser.METHOD, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(MinstrelParser.RETURNS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitMethod_declaration(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(METHOD);
			setState(198); name();
			setState(199); parameter_list();
			setState(200); match(RETURNS);
			setState(201); type();
			setState(202); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_interface_definitionContext extends ParserRuleContext {
		public Generic_argument_listContext generic_argument_list() {
			return getRuleContext(Generic_argument_listContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(MinstrelParser.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(MinstrelParser.RETURNS, 0); }
		public TerminalNode INTERFACE() { return getToken(MinstrelParser.INTERFACE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Function_interface_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_interface_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterFunction_interface_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitFunction_interface_definition(this);
		}
	}

	public final Function_interface_definitionContext function_interface_definition() throws RecognitionException {
		Function_interface_definitionContext _localctx = new Function_interface_definitionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_interface_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(FUNCTION);
			setState(205); match(INTERFACE);
			setState(206); name();
			setState(208);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << GIVING) | (1L << TAKING))) != 0)) {
				{
				setState(207); generic_argument_list();
				}
			}

			setState(210); parameter_list();
			setState(211); match(RETURNS);
			setState(212); type();
			setState(213); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definitionContext extends ParserRuleContext {
		public Generic_argument_listContext generic_argument_list() {
			return getRuleContext(Generic_argument_listContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(MinstrelParser.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(MinstrelParser.RETURNS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); match(FUNCTION);
			setState(217);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << GIVING) | (1L << TAKING))) != 0)) {
				{
				setState(216); generic_argument_list();
				}
			}

			setState(219); name();
			setState(220); parameter_list();
			setState(221); match(RETURNS);
			setState(222); type();
			setState(223); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_definitionContext extends ParserRuleContext {
		public List<Enum_valueContext> enum_value() {
			return getRuleContexts(Enum_valueContext.class);
		}
		public TerminalNode ENUM() { return getToken(MinstrelParser.ENUM, 0); }
		public Enum_valueContext enum_value(int i) {
			return getRuleContext(Enum_valueContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Enum_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterEnum_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitEnum_definition(this);
		}
	}

	public final Enum_definitionContext enum_definition() throws RecognitionException {
		Enum_definitionContext _localctx = new Enum_definitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enum_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(ENUM);
			setState(226); name();
			setState(227); match(15);
			setState(228); enum_value();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(229); match(4);
				setState(230); enum_value();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236); match(18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_valueContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Enum_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterEnum_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitEnum_value(this);
		}
	}

	public final Enum_valueContext enum_value() throws RecognitionException {
		Enum_valueContext _localctx = new Enum_valueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enum_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MinstrelParser.IDENTIFIER, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Return_statementContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(MinstrelParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitReturn_statement(this);
		}
	}
	public static class Error_statementContext extends StatementContext {
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode ERROR() { return getToken(MinstrelParser.ERROR, 0); }
		public Error_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterError_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitError_statement(this);
		}
	}
	public static class Reassignment_statementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BECOMES() { return getToken(MinstrelParser.BECOMES, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Reassignment_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterReassignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitReassignment_statement(this);
		}
	}
	public static class Expression_statementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitExpression_statement(this);
		}
	}
	public static class Declaration_statementContext extends StatementContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(MinstrelParser.IS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Declaration_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterDeclaration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitDeclaration_statement(this);
		}
	}
	public static class If_statementContext extends StatementContext {
		public TerminalNode ELSE(int i) {
			return getToken(MinstrelParser.ELSE, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(MinstrelParser.IF); }
		public List<TerminalNode> ELSE() { return getTokens(MinstrelParser.ELSE); }
		public TerminalNode IF(int i) {
			return getToken(MinstrelParser.IF, i);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public If_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitIf_statement(this);
		}
	}
	public static class While_statementContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(MinstrelParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitWhile_statement(this);
		}
	}
	public static class Definition_statementContext extends StatementContext {
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public Definition_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterDefinition_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitDefinition_statement(this);
		}
	}
	public static class For_statementContext extends StatementContext {
		public TerminalNode IN() { return getToken(MinstrelParser.IN, 0); }
		public TerminalNode FOR() { return getToken(MinstrelParser.FOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public For_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitFor_statement(this);
		}
	}
	public static class Initialisation_statementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(MinstrelParser.IS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Initialisation_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterInitialisation_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitInitialisation_statement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(297);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new Expression_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242); expression(0);
				setState(243); match(13);
				}
				break;

			case 2:
				_localctx = new Declaration_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(245); type();
				setState(246); name();
				setState(247); match(IS);
				setState(248); expression(0);
				setState(249); match(13);
				}
				break;

			case 3:
				_localctx = new Initialisation_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(251); name();
				setState(252); match(IS);
				setState(253); expression(0);
				setState(254); match(13);
				}
				break;

			case 4:
				_localctx = new Reassignment_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(256); name();
				setState(257); match(BECOMES);
				setState(258); expression(0);
				setState(259); match(13);
				}
				break;

			case 5:
				_localctx = new If_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(261); match(IF);
				setState(262); expression(0);
				setState(263); block();
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(264); match(ELSE);
						setState(265); match(IF);
						setState(266); expression(0);
						setState(267); block();
						}
						} 
					}
					setState(273);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(276);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(274); match(ELSE);
					setState(275); block();
					}
				}

				}
				break;

			case 6:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(278); match(WHILE);
				setState(279); expression(0);
				setState(280); block();
				}
				break;

			case 7:
				_localctx = new For_statementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(282); match(FOR);
				setState(283); name();
				setState(284); match(IN);
				setState(285); expression(0);
				setState(286); block();
				}
				break;

			case 8:
				_localctx = new Return_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(288); match(RETURN);
				setState(289); expression(0);
				setState(290); match(13);
				}
				break;

			case 9:
				_localctx = new Error_statementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(292); match(ERROR);
				setState(293); argument_list();
				setState(294); match(13);
				}
				break;

			case 10:
				_localctx = new Definition_statementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(296); definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public Enum_definitionContext enum_definition() {
			return getRuleContext(Enum_definitionContext.class,0);
		}
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public Interface_definitionContext interface_definition() {
			return getRuleContext(Interface_definitionContext.class,0);
		}
		public Function_interface_definitionContext function_interface_definition() {
			return getRuleContext(Function_interface_definitionContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_definition);
		try {
			setState(304);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299); class_definition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300); interface_definition();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301); function_definition();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302); function_interface_definition();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(303); enum_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class Or_expressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(MinstrelParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Or_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitOr_expression(this);
		}
	}
	public static class Factor_expressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Factor_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterFactor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitFactor_expression(this);
		}
	}
	public static class Term_expressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Term_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterTerm_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitTerm_expression(this);
		}
	}
	public static class Negation_expressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Negation_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterNegation_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitNegation_expression(this);
		}
	}
	public static class Parenthesised_expressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Parenthesised_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterParenthesised_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitParenthesised_expression(this);
		}
	}
	public static class ComparisonContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitComparison(this);
		}
	}
	public static class Not_expressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(MinstrelParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Not_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterNot_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitNot_expression(this);
		}
	}
	public static class Float_literalContext extends ExpressionContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(MinstrelParser.FLOAT_LITERAL, 0); }
		public Float_literalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterFloat_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitFloat_literal(this);
		}
	}
	public static class And_expressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(MinstrelParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public And_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitAnd_expression(this);
		}
	}
	public static class Function_callContext extends ExpressionContext {
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_callContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitFunction_call(this);
		}
	}
	public static class Method_callContext extends ExpressionContext {
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Method_callContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitMethod_call(this);
		}
	}
	public static class Anonymous_function_definitionContext extends ExpressionContext {
		public Generic_argument_listContext generic_argument_list() {
			return getRuleContext(Generic_argument_listContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(MinstrelParser.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(MinstrelParser.RETURNS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Anonymous_function_definitionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterAnonymous_function_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitAnonymous_function_definition(this);
		}
	}
	public static class Integer_literalContext extends ExpressionContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(MinstrelParser.INTEGER_LITERAL, 0); }
		public Integer_literalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitInteger_literal(this);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MinstrelParser.IDENTIFIER, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitVariable(this);
		}
	}
	public static class String_literalContext extends ExpressionContext {
		public TerminalNode STRING_LITERAL() { return getToken(MinstrelParser.STRING_LITERAL, 0); }
		public String_literalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinstrelListener ) ((MinstrelListener)listener).exitString_literal(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			switch (_input.LA(1)) {
			case 7:
				{
				_localctx = new Negation_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(307); match(7);
				setState(308); expression(7);
				}
				break;
			case NOT:
				{
				_localctx = new Not_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309); match(NOT);
				setState(310); expression(3);
				}
				break;
			case 9:
				{
				_localctx = new Parenthesised_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(311); match(9);
				setState(312); expression(0);
				setState(313); match(3);
				}
				break;
			case INTEGER_LITERAL:
				{
				_localctx = new Integer_literalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315); match(INTEGER_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				{
				_localctx = new Float_literalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316); match(FLOAT_LITERAL);
				}
				break;
			case STRING_LITERAL:
				{
				_localctx = new String_literalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317); match(STRING_LITERAL);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(318); match(IDENTIFIER);
				}
				break;
			case FUNCTION:
				{
				_localctx = new Anonymous_function_definitionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(319); match(FUNCTION);
				setState(321);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << GIVING) | (1L << TAKING))) != 0)) {
					{
					setState(320); generic_argument_list();
					}
				}

				setState(323); parameter_list();
				setState(324); match(RETURNS);
				setState(325); type();
				setState(326); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(352);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new Factor_expressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(330);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(331);
						_la = _input.LA(1);
						if ( !(_la==6 || _la==17) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(332); expression(7);
						}
						break;

					case 2:
						{
						_localctx = new Term_expressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(333);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(334);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==7) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(335); expression(6);
						}
						break;

					case 3:
						{
						_localctx = new ComparisonContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(336);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(337);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 16) | (1L << 19))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(338); expression(5);
						}
						break;

					case 4:
						{
						_localctx = new And_expressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(339);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(340); match(AND);
						setState(341); expression(3);
						}
						break;

					case 5:
						{
						_localctx = new Or_expressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(342);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(343); match(OR);
						setState(344); expression(2);
						}
						break;

					case 6:
						{
						_localctx = new Function_callContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(345);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(346); argument_list();
						}
						break;

					case 7:
						{
						_localctx = new Method_callContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(347);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(348); match(2);
						setState(349); name();
						setState(350); argument_list();
						}
						break;
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 6 >= _localctx._p;

		case 1: return 5 >= _localctx._p;

		case 2: return 4 >= _localctx._p;

		case 3: return 2 >= _localctx._p;

		case 4: return 1 >= _localctx._p;

		case 5: return 9 >= _localctx._p;

		case 6: return 8 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\62\u0168\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\3\3\3\3\3\7\3D\n\3\f\3\16\3G\13\3\3\4\3\4\3\4\3\5\5\5M\n\5\3\5\3\5\3"+
		"\6\3\6\3\7\7\7T\n\7\f\7\16\7W\13\7\3\7\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\5\bb\n\b\3\t\3\t\3\n\3\n\3\n\5\ni\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\7\13t\n\13\f\13\16\13w\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u008c\n"+
		"\17\f\17\16\17\u008f\13\17\5\17\u0091\n\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\7\21\u009c\n\21\f\21\16\21\u009f\13\21\5\21\u00a1\n"+
		"\21\3\21\3\21\3\22\3\22\7\22\u00a7\n\22\f\22\16\22\u00aa\13\22\3\22\3"+
		"\22\3\23\3\23\3\23\5\23\u00b1\n\23\3\23\3\23\3\23\3\23\7\23\u00b7\n\23"+
		"\f\23\16\23\u00ba\13\23\5\23\u00bc\n\23\3\23\3\23\3\23\3\23\3\24\7\24"+
		"\u00c3\n\24\f\24\16\24\u00c6\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\5\26\u00d3\n\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\5\27\u00dc\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u00ea\n\30\f\30\16\30\u00ed\13\30\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\7\33\u0110\n\33\f\33\16\33\u0113\13\33\3\33\3\33\5\33\u0117\n\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u012c\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u0133"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0144\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u014b\n\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0163\n\35\f\35\16\35\u0166"+
		"\13\35\3\35\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668\2\6\3\2\32\34\4\2\b\b\23\23\4\2\7\7\t\t\6\2\f\16\20\20\22\22\25"+
		"\25\u017f\2=\3\2\2\2\4@\3\2\2\2\6H\3\2\2\2\bL\3\2\2\2\nP\3\2\2\2\fU\3"+
		"\2\2\2\16a\3\2\2\2\20c\3\2\2\2\22e\3\2\2\2\24u\3\2\2\2\26x\3\2\2\2\30"+
		"|\3\2\2\2\32\u0080\3\2\2\2\34\u0087\3\2\2\2\36\u0094\3\2\2\2 \u0097\3"+
		"\2\2\2\"\u00a4\3\2\2\2$\u00ad\3\2\2\2&\u00c4\3\2\2\2(\u00c7\3\2\2\2*\u00ce"+
		"\3\2\2\2,\u00d9\3\2\2\2.\u00e3\3\2\2\2\60\u00f0\3\2\2\2\62\u00f2\3\2\2"+
		"\2\64\u012b\3\2\2\2\66\u0132\3\2\2\28\u014a\3\2\2\2:<\5\64\33\2;:\3\2"+
		"\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?=\3\2\2\2@E\5\6\4\2AB\7"+
		"\6\2\2BD\5\b\5\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\5\3\2\2\2GE"+
		"\3\2\2\2HI\5\n\6\2IJ\5\16\b\2J\7\3\2\2\2KM\5\n\6\2LK\3\2\2\2LM\3\2\2\2"+
		"MN\3\2\2\2NO\5\16\b\2O\t\3\2\2\2PQ\t\2\2\2Q\13\3\2\2\2RT\5\20\t\2SR\3"+
		"\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XZ\5\62\32\2Y"+
		"[\5\4\3\2ZY\3\2\2\2Z[\3\2\2\2[\r\3\2\2\2\\b\5\62\32\2]^\7\13\2\2^_\5\f"+
		"\7\2_`\7\5\2\2`b\3\2\2\2a\\\3\2\2\2a]\3\2\2\2b\17\3\2\2\2cd\5\62\32\2"+
		"d\21\3\2\2\2ef\7\35\2\2fh\5\62\32\2gi\5\4\3\2hg\3\2\2\2hi\3\2\2\2ij\3"+
		"\2\2\2jk\7\36\2\2kl\5\f\7\2lm\7\21\2\2mn\5\24\13\2no\7\24\2\2o\23\3\2"+
		"\2\2pt\5\26\f\2qt\5\30\r\2rt\5\32\16\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t"+
		"w\3\2\2\2us\3\2\2\2uv\3\2\2\2v\25\3\2\2\2wu\3\2\2\2xy\5\f\7\2yz\5\62\32"+
		"\2z{\7\17\2\2{\27\3\2\2\2|}\7\37\2\2}~\5\34\17\2~\177\5\"\22\2\177\31"+
		"\3\2\2\2\u0080\u0081\7 \2\2\u0081\u0082\5\62\32\2\u0082\u0083\5\34\17"+
		"\2\u0083\u0084\7!\2\2\u0084\u0085\5\f\7\2\u0085\u0086\5\"\22\2\u0086\33"+
		"\3\2\2\2\u0087\u0090\7\n\2\2\u0088\u008d\5\36\20\2\u0089\u008a\7\6\2\2"+
		"\u008a\u008c\5\36\20\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0088\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\3"+
		"\2\2\u0093\35\3\2\2\2\u0094\u0095\5\f\7\2\u0095\u0096\5\62\32\2\u0096"+
		"\37\3\2\2\2\u0097\u00a0\7\n\2\2\u0098\u009d\58\35\2\u0099\u009a\7\6\2"+
		"\2\u009a\u009c\58\35\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u0098\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\3"+
		"\2\2\u00a3!\3\2\2\2\u00a4\u00a8\7\21\2\2\u00a5\u00a7\5\64\33\2\u00a6\u00a5"+
		"\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\24\2\2\u00ac#\3\2\2\2"+
		"\u00ad\u00ae\7\"\2\2\u00ae\u00b0\5\62\32\2\u00af\u00b1\5\4\3\2\u00b0\u00af"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00bb\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3"+
		"\u00b8\5\f\7\2\u00b4\u00b5\7\6\2\2\u00b5\u00b7\5\f\7\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\21\2\2\u00be\u00bf\5&\24\2\u00bf"+
		"\u00c0\7\24\2\2\u00c0%\3\2\2\2\u00c1\u00c3\5(\25\2\u00c2\u00c1\3\2\2\2"+
		"\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\'\3"+
		"\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7 \2\2\u00c8\u00c9\5\62\32\2\u00c9"+
		"\u00ca\5\34\17\2\u00ca\u00cb\7!\2\2\u00cb\u00cc\5\f\7\2\u00cc\u00cd\7"+
		"\17\2\2\u00cd)\3\2\2\2\u00ce\u00cf\7$\2\2\u00cf\u00d0\7\"\2\2\u00d0\u00d2"+
		"\5\62\32\2\u00d1\u00d3\5\4\3\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2"+
		"\u00d3\u00d4\3\2\2\2\u00d4\u00d5\5\34\17\2\u00d5\u00d6\7!\2\2\u00d6\u00d7"+
		"\5\f\7\2\u00d7\u00d8\7\17\2\2\u00d8+\3\2\2\2\u00d9\u00db\7$\2\2\u00da"+
		"\u00dc\5\4\3\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00de\5\62\32\2\u00de\u00df\5\34\17\2\u00df\u00e0\7!\2\2\u00e0"+
		"\u00e1\5\f\7\2\u00e1\u00e2\5\"\22\2\u00e2-\3\2\2\2\u00e3\u00e4\7%\2\2"+
		"\u00e4\u00e5\5\62\32\2\u00e5\u00e6\7\21\2\2\u00e6\u00eb\5\60\31\2\u00e7"+
		"\u00e8\7\6\2\2\u00e8\u00ea\5\60\31\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3"+
		"\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00ef\7\24\2\2\u00ef/\3\2\2\2\u00f0\u00f1\5\62\32"+
		"\2\u00f1\61\3\2\2\2\u00f2\u00f3\7\62\2\2\u00f3\63\3\2\2\2\u00f4\u00f5"+
		"\58\35\2\u00f5\u00f6\7\17\2\2\u00f6\u012c\3\2\2\2\u00f7\u00f8\5\f\7\2"+
		"\u00f8\u00f9\5\62\32\2\u00f9\u00fa\7&\2\2\u00fa\u00fb\58\35\2\u00fb\u00fc"+
		"\7\17\2\2\u00fc\u012c\3\2\2\2\u00fd\u00fe\5\62\32\2\u00fe\u00ff\7&\2\2"+
		"\u00ff\u0100\58\35\2\u0100\u0101\7\17\2\2\u0101\u012c\3\2\2\2\u0102\u0103"+
		"\5\62\32\2\u0103\u0104\7\'\2\2\u0104\u0105\58\35\2\u0105\u0106\7\17\2"+
		"\2\u0106\u012c\3\2\2\2\u0107\u0108\7(\2\2\u0108\u0109\58\35\2\u0109\u0111"+
		"\5\"\22\2\u010a\u010b\7)\2\2\u010b\u010c\7(\2\2\u010c\u010d\58\35\2\u010d"+
		"\u010e\5\"\22\2\u010e\u0110\3\2\2\2\u010f\u010a\3\2\2\2\u0110\u0113\3"+
		"\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0116\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0115\7)\2\2\u0115\u0117\5\"\22\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u012c\3\2\2\2\u0118\u0119\7*\2\2\u0119"+
		"\u011a\58\35\2\u011a\u011b\5\"\22\2\u011b\u012c\3\2\2\2\u011c\u011d\7"+
		"+\2\2\u011d\u011e\5\62\32\2\u011e\u011f\7,\2\2\u011f\u0120\58\35\2\u0120"+
		"\u0121\5\"\22\2\u0121\u012c\3\2\2\2\u0122\u0123\7-\2\2\u0123\u0124\58"+
		"\35\2\u0124\u0125\7\17\2\2\u0125\u012c\3\2\2\2\u0126\u0127\7.\2\2\u0127"+
		"\u0128\5 \21\2\u0128\u0129\7\17\2\2\u0129\u012c\3\2\2\2\u012a\u012c\5"+
		"\66\34\2\u012b\u00f4\3\2\2\2\u012b\u00f7\3\2\2\2\u012b\u00fd\3\2\2\2\u012b"+
		"\u0102\3\2\2\2\u012b\u0107\3\2\2\2\u012b\u0118\3\2\2\2\u012b\u011c\3\2"+
		"\2\2\u012b\u0122\3\2\2\2\u012b\u0126\3\2\2\2\u012b\u012a\3\2\2\2\u012c"+
		"\65\3\2\2\2\u012d\u0133\5\22\n\2\u012e\u0133\5$\23\2\u012f\u0133\5,\27"+
		"\2\u0130\u0133\5*\26\2\u0131\u0133\5.\30\2\u0132\u012d\3\2\2\2\u0132\u012e"+
		"\3\2\2\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133"+
		"\67\3\2\2\2\u0134\u0135\b\35\1\2\u0135\u0136\7\t\2\2\u0136\u014b\58\35"+
		"\2\u0137\u0138\7\61\2\2\u0138\u014b\58\35\2\u0139\u013a\7\13\2\2\u013a"+
		"\u013b\58\35\2\u013b\u013c\7\5\2\2\u013c\u014b\3\2\2\2\u013d\u014b\7\27"+
		"\2\2\u013e\u014b\7\30\2\2\u013f\u014b\7\31\2\2\u0140\u014b\7\62\2\2\u0141"+
		"\u0143\7$\2\2\u0142\u0144\5\4\3\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145\u0146\5\34\17\2\u0146\u0147\7!\2\2\u0147"+
		"\u0148\5\f\7\2\u0148\u0149\5\"\22\2\u0149\u014b\3\2\2\2\u014a\u0134\3"+
		"\2\2\2\u014a\u0137\3\2\2\2\u014a\u0139\3\2\2\2\u014a\u013d\3\2\2\2\u014a"+
		"\u013e\3\2\2\2\u014a\u013f\3\2\2\2\u014a\u0140\3\2\2\2\u014a\u0141\3\2"+
		"\2\2\u014b\u0164\3\2\2\2\u014c\u014d\6\35\2\3\u014d\u014e\t\3\2\2\u014e"+
		"\u0163\58\35\2\u014f\u0150\6\35\3\3\u0150\u0151\t\4\2\2\u0151\u0163\5"+
		"8\35\2\u0152\u0153\6\35\4\3\u0153\u0154\t\5\2\2\u0154\u0163\58\35\2\u0155"+
		"\u0156\6\35\5\3\u0156\u0157\7\60\2\2\u0157\u0163\58\35\2\u0158\u0159\6"+
		"\35\6\3\u0159\u015a\7/\2\2\u015a\u0163\58\35\2\u015b\u015c\6\35\7\3\u015c"+
		"\u0163\5 \21\2\u015d\u015e\6\35\b\3\u015e\u015f\7\4\2\2\u015f\u0160\5"+
		"\62\32\2\u0160\u0161\5 \21\2\u0161\u0163\3\2\2\2\u0162\u014c\3\2\2\2\u0162"+
		"\u014f\3\2\2\2\u0162\u0152\3\2\2\2\u0162\u0155\3\2\2\2\u0162\u0158\3\2"+
		"\2\2\u0162\u015b\3\2\2\2\u0162\u015d\3\2\2\2\u0163\u0166\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u01659\3\2\2\2\u0166\u0164\3\2\2\2"+
		"\37=ELUZahsu\u008d\u0090\u009d\u00a0\u00a8\u00b0\u00b8\u00bb\u00c4\u00d2"+
		"\u00db\u00eb\u0111\u0116\u012b\u0132\u0143\u014a\u0162\u0164";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}