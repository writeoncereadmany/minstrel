package com.writeoncereadmany.minstrel.generated;

// Generated from Minstrel.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MinstrelLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'.'", "')'", "','", "'+'", "'*'", "'-'", "'['", "'('", "'<'", 
		"'=/='", "'='", "';'", "'<='", "'{'", "'>'", "'/'", "'}'", "'>='", "SPACE", 
		"INTEGER_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", "'of'", "'giving'", 
		"'taking'", "'class'", "'implements'", "'construct'", "'method'", "'returns'", 
		"'interface'", "'extends'", "'function'", "'enum'", "'is'", "'becomes'", 
		"'if'", "'else'", "'while'", "'for'", "'in'", "'return'", "'error'", "'or'", 
		"'and'", "'not'", "IDENTIFIER"
	};
	public static final String[] ruleNames = {
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "LETTER", "DIGIT", "SPACE", "INTEGER_LITERAL", "FLOAT_LITERAL", 
		"STRING_LITERAL", "OF", "GIVING", "TAKING", "CLASS", "IMPLEMENTS", "CONSTRUCT", 
		"METHOD", "RETURNS", "INTERFACE", "EXTENDS", "FUNCTION", "ENUM", "IS", 
		"BECOMES", "IF", "ELSE", "WHILE", "FOR", "IN", "RETURN", "ERROR", "OR", 
		"AND", "NOT", "IDENTIFIER"
	};


	public MinstrelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Minstrel.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 21: SPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\62\u0150\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\6"+
		"\27\u0097\n\27\r\27\16\27\u0098\3\27\3\27\3\30\6\30\u009e\n\30\r\30\16"+
		"\30\u009f\3\31\6\31\u00a3\n\31\r\31\16\31\u00a4\3\31\3\31\6\31\u00a9\n"+
		"\31\r\31\16\31\u00aa\3\32\3\32\7\32\u00af\n\32\f\32\16\32\u00b2\13\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*"+
		"\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/"+
		"\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\7\63\u014c\n\63\f\63\16\63\u014f\13\63\2\64\3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1"+
		"\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\2\1+\2\1-\26\2/\27"+
		"\1\61\30\1\63\31\1\65\32\1\67\33\19\34\1;\35\1=\36\1?\37\1A \1C!\1E\""+
		"\1G#\1I$\1K%\1M&\1O\'\1Q(\1S)\1U*\1W+\1Y,\1[-\1].\1_/\1a\60\1c\61\1e\62"+
		"\1\3\2\6\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\3\2$$\u0154\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2"+
		"\2\5i\3\2\2\2\7k\3\2\2\2\tm\3\2\2\2\13o\3\2\2\2\rq\3\2\2\2\17s\3\2\2\2"+
		"\21u\3\2\2\2\23w\3\2\2\2\25y\3\2\2\2\27{\3\2\2\2\31\177\3\2\2\2\33\u0081"+
		"\3\2\2\2\35\u0083\3\2\2\2\37\u0086\3\2\2\2!\u0088\3\2\2\2#\u008a\3\2\2"+
		"\2%\u008c\3\2\2\2\'\u008e\3\2\2\2)\u0091\3\2\2\2+\u0093\3\2\2\2-\u0096"+
		"\3\2\2\2/\u009d\3\2\2\2\61\u00a2\3\2\2\2\63\u00ac\3\2\2\2\65\u00b5\3\2"+
		"\2\2\67\u00b8\3\2\2\29\u00bf\3\2\2\2;\u00c6\3\2\2\2=\u00cc\3\2\2\2?\u00d7"+
		"\3\2\2\2A\u00e1\3\2\2\2C\u00e8\3\2\2\2E\u00f0\3\2\2\2G\u00fa\3\2\2\2I"+
		"\u0102\3\2\2\2K\u010b\3\2\2\2M\u0110\3\2\2\2O\u0113\3\2\2\2Q\u011b\3\2"+
		"\2\2S\u011e\3\2\2\2U\u0123\3\2\2\2W\u0129\3\2\2\2Y\u012d\3\2\2\2[\u0130"+
		"\3\2\2\2]\u0137\3\2\2\2_\u013d\3\2\2\2a\u0140\3\2\2\2c\u0144\3\2\2\2e"+
		"\u0148\3\2\2\2gh\7_\2\2h\4\3\2\2\2ij\7\60\2\2j\6\3\2\2\2kl\7+\2\2l\b\3"+
		"\2\2\2mn\7.\2\2n\n\3\2\2\2op\7-\2\2p\f\3\2\2\2qr\7,\2\2r\16\3\2\2\2st"+
		"\7/\2\2t\20\3\2\2\2uv\7]\2\2v\22\3\2\2\2wx\7*\2\2x\24\3\2\2\2yz\7>\2\2"+
		"z\26\3\2\2\2{|\7?\2\2|}\7\61\2\2}~\7?\2\2~\30\3\2\2\2\177\u0080\7?\2\2"+
		"\u0080\32\3\2\2\2\u0081\u0082\7=\2\2\u0082\34\3\2\2\2\u0083\u0084\7>\2"+
		"\2\u0084\u0085\7?\2\2\u0085\36\3\2\2\2\u0086\u0087\7}\2\2\u0087 \3\2\2"+
		"\2\u0088\u0089\7@\2\2\u0089\"\3\2\2\2\u008a\u008b\7\61\2\2\u008b$\3\2"+
		"\2\2\u008c\u008d\7\177\2\2\u008d&\3\2\2\2\u008e\u008f\7@\2\2\u008f\u0090"+
		"\7?\2\2\u0090(\3\2\2\2\u0091\u0092\t\2\2\2\u0092*\3\2\2\2\u0093\u0094"+
		"\t\3\2\2\u0094,\3\2\2\2\u0095\u0097\t\4\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009b\b\27\2\2\u009b.\3\2\2\2\u009c\u009e\5+\26\2\u009d\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\60\3\2\2\2\u00a1\u00a3\5+\26\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2"+
		"\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8"+
		"\7\60\2\2\u00a7\u00a9\5+\26\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2"+
		"\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\62\3\2\2\2\u00ac\u00b0"+
		"\7$\2\2\u00ad\u00af\n\5\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b3\u00b4\7$\2\2\u00b4\64\3\2\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7"+
		"\7h\2\2\u00b7\66\3\2\2\2\u00b8\u00b9\7i\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb"+
		"\7x\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7i\2\2\u00be"+
		"8\3\2\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7m\2\2\u00c2"+
		"\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7i\2\2\u00c5:\3\2\2\2\u00c6"+
		"\u00c7\7e\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7u\2\2"+
		"\u00ca\u00cb\7u\2\2\u00cb<\3\2\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7o\2"+
		"\2\u00ce\u00cf\7r\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2"+
		"\7o\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7v\2\2\u00d5"+
		"\u00d6\7u\2\2\u00d6>\3\2\2\2\u00d7\u00d8\7e\2\2\u00d8\u00d9\7q\2\2\u00d9"+
		"\u00da\7p\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7t\2\2"+
		"\u00dd\u00de\7w\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7v\2\2\u00e0@\3\2\2"+
		"\2\u00e1\u00e2\7o\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5"+
		"\7j\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7f\2\2\u00e7B\3\2\2\2\u00e8\u00e9"+
		"\7t\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7w\2\2\u00ec"+
		"\u00ed\7t\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7u\2\2\u00efD\3\2\2\2\u00f0"+
		"\u00f1\7k\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7g\2\2"+
		"\u00f4\u00f5\7t\2\2\u00f5\u00f6\7h\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8"+
		"\7e\2\2\u00f8\u00f9\7g\2\2\u00f9F\3\2\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc"+
		"\7z\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7p\2\2\u00ff"+
		"\u0100\7f\2\2\u0100\u0101\7u\2\2\u0101H\3\2\2\2\u0102\u0103\7h\2\2\u0103"+
		"\u0104\7w\2\2\u0104\u0105\7p\2\2\u0105\u0106\7e\2\2\u0106\u0107\7v\2\2"+
		"\u0107\u0108\7k\2\2\u0108\u0109\7q\2\2\u0109\u010a\7p\2\2\u010aJ\3\2\2"+
		"\2\u010b\u010c\7g\2\2\u010c\u010d\7p\2\2\u010d\u010e\7w\2\2\u010e\u010f"+
		"\7o\2\2\u010fL\3\2\2\2\u0110\u0111\7k\2\2\u0111\u0112\7u\2\2\u0112N\3"+
		"\2\2\2\u0113\u0114\7d\2\2\u0114\u0115\7g\2\2\u0115\u0116\7e\2\2\u0116"+
		"\u0117\7q\2\2\u0117\u0118\7o\2\2\u0118\u0119\7g\2\2\u0119\u011a\7u\2\2"+
		"\u011aP\3\2\2\2\u011b\u011c\7k\2\2\u011c\u011d\7h\2\2\u011dR\3\2\2\2\u011e"+
		"\u011f\7g\2\2\u011f\u0120\7n\2\2\u0120\u0121\7u\2\2\u0121\u0122\7g\2\2"+
		"\u0122T\3\2\2\2\u0123\u0124\7y\2\2\u0124\u0125\7j\2\2\u0125\u0126\7k\2"+
		"\2\u0126\u0127\7n\2\2\u0127\u0128\7g\2\2\u0128V\3\2\2\2\u0129\u012a\7"+
		"h\2\2\u012a\u012b\7q\2\2\u012b\u012c\7t\2\2\u012cX\3\2\2\2\u012d\u012e"+
		"\7k\2\2\u012e\u012f\7p\2\2\u012fZ\3\2\2\2\u0130\u0131\7t\2\2\u0131\u0132"+
		"\7g\2\2\u0132\u0133\7v\2\2\u0133\u0134\7w\2\2\u0134\u0135\7t\2\2\u0135"+
		"\u0136\7p\2\2\u0136\\\3\2\2\2\u0137\u0138\7g\2\2\u0138\u0139\7t\2\2\u0139"+
		"\u013a\7t\2\2\u013a\u013b\7q\2\2\u013b\u013c\7t\2\2\u013c^\3\2\2\2\u013d"+
		"\u013e\7q\2\2\u013e\u013f\7t\2\2\u013f`\3\2\2\2\u0140\u0141\7c\2\2\u0141"+
		"\u0142\7p\2\2\u0142\u0143\7f\2\2\u0143b\3\2\2\2\u0144\u0145\7p\2\2\u0145"+
		"\u0146\7q\2\2\u0146\u0147\7v\2\2\u0147d\3\2\2\2\u0148\u014d\5)\25\2\u0149"+
		"\u014c\5)\25\2\u014a\u014c\5+\26\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2"+
		"\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"f\3\2\2\2\u014f\u014d\3\2\2\2\n\2\u0098\u009f\u00a4\u00aa\u00b0\u014b"+
		"\u014d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}