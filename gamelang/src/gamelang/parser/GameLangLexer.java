// Generated from GameLang.g by ANTLR 4.5
package gamelang.parser; import static gamelang.AST.*;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GameLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		Define=18, Print=19, Roll=20, CALL=21, EXIT_GAME=22, Let=23, Dot=24, Number=25, 
		Identifier=26, Letter=27, LetterOrDigit=28, AT=29, ELLIPSIS=30, WS=31, 
		Comment=32, Line_Comment=33, STRING=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"Define", "Print", "Roll", "CALL", "EXIT_GAME", "Let", "Dot", "Number", 
		"Identifier", "Letter", "LetterOrDigit", "DIGIT", "AT", "ELLIPSIS", "WS", 
		"Comment", "Line_Comment", "STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'STAT'", "'='", "'('", "')'", "'-'", "'+'", "'*'", "'/'", "'^'", 
		"'ORDER66'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'IF'", "'define'", 
		"'PRINT'", "'ROLL'", "'CALL'", "'EXIT_GAME'", "'let'", "'.'", null, null, 
		null, null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "Define", "Print", "Roll", "CALL", 
		"EXIT_GAME", "Let", "Dot", "Number", "Identifier", "Letter", "LetterOrDigit", 
		"AT", "ELLIPSIS", "WS", "Comment", "Line_Comment", "STRING"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public GameLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GameLang.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 27:
			return LetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean Letter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean LetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u00ef\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\32\6\32\u00a2\n\32\r\32\16\32\u00a3\3\33\3\33\7\33\u00a8"+
		"\n\33\f\33\16\33\u00ab\13\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00b3"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00bb\n\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3 \3!\6!\u00c6\n!\r!\16!\u00c7\3!\3!\3\"\3\"\3\"\3\"\7\"\u00d0"+
		"\n\"\f\"\16\"\u00d3\13\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\7#\u00de\n#\f"+
		"#\16#\u00e1\13#\3#\3#\3$\3$\3$\3$\7$\u00e9\n$\f$\16$\u00ec\13$\3$\3$\3"+
		"\u00d1\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\2=\37? A!C\"E#G$\3\2\n\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3"+
		"\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2"+
		"\f\f\17\17\4\2$$^^\u00f8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\3I\3\2\2\2\5N\3\2\2\2\7P\3\2\2\2\tR\3\2\2\2\13T\3\2\2\2"+
		"\rV\3\2\2\2\17X\3\2\2\2\21Z\3\2\2\2\23\\\3\2\2\2\25^\3\2\2\2\27f\3\2\2"+
		"\2\31h\3\2\2\2\33j\3\2\2\2\35m\3\2\2\2\37p\3\2\2\2!s\3\2\2\2#v\3\2\2\2"+
		"%y\3\2\2\2\'\u0080\3\2\2\2)\u0086\3\2\2\2+\u008b\3\2\2\2-\u0090\3\2\2"+
		"\2/\u009a\3\2\2\2\61\u009e\3\2\2\2\63\u00a1\3\2\2\2\65\u00a5\3\2\2\2\67"+
		"\u00b2\3\2\2\29\u00ba\3\2\2\2;\u00bc\3\2\2\2=\u00be\3\2\2\2?\u00c0\3\2"+
		"\2\2A\u00c5\3\2\2\2C\u00cb\3\2\2\2E\u00d9\3\2\2\2G\u00e4\3\2\2\2IJ\7U"+
		"\2\2JK\7V\2\2KL\7C\2\2LM\7V\2\2M\4\3\2\2\2NO\7?\2\2O\6\3\2\2\2PQ\7*\2"+
		"\2Q\b\3\2\2\2RS\7+\2\2S\n\3\2\2\2TU\7/\2\2U\f\3\2\2\2VW\7-\2\2W\16\3\2"+
		"\2\2XY\7,\2\2Y\20\3\2\2\2Z[\7\61\2\2[\22\3\2\2\2\\]\7`\2\2]\24\3\2\2\2"+
		"^_\7Q\2\2_`\7T\2\2`a\7F\2\2ab\7G\2\2bc\7T\2\2cd\78\2\2de\78\2\2e\26\3"+
		"\2\2\2fg\7@\2\2g\30\3\2\2\2hi\7>\2\2i\32\3\2\2\2jk\7@\2\2kl\7?\2\2l\34"+
		"\3\2\2\2mn\7>\2\2no\7?\2\2o\36\3\2\2\2pq\7?\2\2qr\7?\2\2r \3\2\2\2st\7"+
		"#\2\2tu\7?\2\2u\"\3\2\2\2vw\7K\2\2wx\7H\2\2x$\3\2\2\2yz\7f\2\2z{\7g\2"+
		"\2{|\7h\2\2|}\7k\2\2}~\7p\2\2~\177\7g\2\2\177&\3\2\2\2\u0080\u0081\7R"+
		"\2\2\u0081\u0082\7T\2\2\u0082\u0083\7K\2\2\u0083\u0084\7P\2\2\u0084\u0085"+
		"\7V\2\2\u0085(\3\2\2\2\u0086\u0087\7T\2\2\u0087\u0088\7Q\2\2\u0088\u0089"+
		"\7N\2\2\u0089\u008a\7N\2\2\u008a*\3\2\2\2\u008b\u008c\7E\2\2\u008c\u008d"+
		"\7C\2\2\u008d\u008e\7N\2\2\u008e\u008f\7N\2\2\u008f,\3\2\2\2\u0090\u0091"+
		"\7G\2\2\u0091\u0092\7Z\2\2\u0092\u0093\7K\2\2\u0093\u0094\7V\2\2\u0094"+
		"\u0095\7a\2\2\u0095\u0096\7I\2\2\u0096\u0097\7C\2\2\u0097\u0098\7O\2\2"+
		"\u0098\u0099\7G\2\2\u0099.\3\2\2\2\u009a\u009b\7n\2\2\u009b\u009c\7g\2"+
		"\2\u009c\u009d\7v\2\2\u009d\60\3\2\2\2\u009e\u009f\7\60\2\2\u009f\62\3"+
		"\2\2\2\u00a0\u00a2\5;\36\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\64\3\2\2\2\u00a5\u00a9\5\67\34"+
		"\2\u00a6\u00a8\59\35\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\66\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00b3\t\2\2\2\u00ad\u00ae\n\3\2\2\u00ae\u00b3\6\34\2\2\u00af\u00b0\t"+
		"\4\2\2\u00b0\u00b1\t\5\2\2\u00b1\u00b3\6\34\3\2\u00b2\u00ac\3\2\2\2\u00b2"+
		"\u00ad\3\2\2\2\u00b2\u00af\3\2\2\2\u00b38\3\2\2\2\u00b4\u00bb\t\6\2\2"+
		"\u00b5\u00b6\n\3\2\2\u00b6\u00bb\6\35\4\2\u00b7\u00b8\t\4\2\2\u00b8\u00b9"+
		"\t\5\2\2\u00b9\u00bb\6\35\5\2\u00ba\u00b4\3\2\2\2\u00ba\u00b5\3\2\2\2"+
		"\u00ba\u00b7\3\2\2\2\u00bb:\3\2\2\2\u00bc\u00bd\4\62;\2\u00bd<\3\2\2\2"+
		"\u00be\u00bf\7B\2\2\u00bf>\3\2\2\2\u00c0\u00c1\7\60\2\2\u00c1\u00c2\7"+
		"\60\2\2\u00c2\u00c3\7\60\2\2\u00c3@\3\2\2\2\u00c4\u00c6\t\7\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b!\2\2\u00caB\3\2\2\2\u00cb\u00cc"+
		"\7\61\2\2\u00cc\u00cd\7,\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00d0\13\2\2\2"+
		"\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7,\2\2\u00d5"+
		"\u00d6\7\61\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b\"\2\2\u00d8D\3\2\2\2"+
		"\u00d9\u00da\7\61\2\2\u00da\u00db\7\61\2\2\u00db\u00df\3\2\2\2\u00dc\u00de"+
		"\n\b\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\b#"+
		"\2\2\u00e3F\3\2\2\2\u00e4\u00ea\7$\2\2\u00e5\u00e9\n\t\2\2\u00e6\u00e7"+
		"\7^\2\2\u00e7\u00e9\13\2\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7$\2\2\u00eeH\3\2\2\2\f\2\u00a3\u00a9"+
		"\u00b2\u00ba\u00c7\u00d1\u00df\u00e8\u00ea\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}