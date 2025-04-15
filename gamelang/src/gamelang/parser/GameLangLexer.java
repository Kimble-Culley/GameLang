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
		Define=10, Print=11, Roll=12, Let=13, Dot=14, Number=15, Identifier=16, 
		Letter=17, LetterOrDigit=18, AT=19, ELLIPSIS=20, WS=21, Comment=22, Line_Comment=23, 
		STRING=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"Define", "Print", "Roll", "Let", "Dot", "Number", "Identifier", "Letter", 
		"LetterOrDigit", "DIGIT", "AT", "ELLIPSIS", "WS", "Comment", "Line_Comment", 
		"STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'STAT'", "'='", "'('", "')'", "'-'", "'+'", "'*'", "'/'", "'^'", 
		"'define'", "'PRINT'", "'ROLL'", "'let'", "'.'", null, null, null, null, 
		"'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "Define", 
		"Print", "Roll", "Let", "Dot", "Number", "Identifier", "Letter", "LetterOrDigit", 
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
		case 16:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 17:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00b1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\6\20d\n\20\r\20\16\20e\3\21\3\21\7\21j\n\21\f\21\16\21m\13\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22u\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23}\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\6\27\u0088\n"+
		"\27\r\27\16\27\u0089\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0092\n\30\f\30"+
		"\16\30\u0095\13\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00a0"+
		"\n\31\f\31\16\31\u00a3\13\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00ab"+
		"\n\32\f\32\16\32\u00ae\13\32\3\32\3\32\3\u0093\2\33\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\2)\25+\26-\27/\30\61\31\63\32\3\2\n\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01"+
		"\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4"+
		"\2\f\f\17\17\4\2$$^^\u00ba\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5:\3\2\2\2\7<\3\2"+
		"\2\2\t>\3\2\2\2\13@\3\2\2\2\rB\3\2\2\2\17D\3\2\2\2\21F\3\2\2\2\23H\3\2"+
		"\2\2\25J\3\2\2\2\27Q\3\2\2\2\31W\3\2\2\2\33\\\3\2\2\2\35`\3\2\2\2\37c"+
		"\3\2\2\2!g\3\2\2\2#t\3\2\2\2%|\3\2\2\2\'~\3\2\2\2)\u0080\3\2\2\2+\u0082"+
		"\3\2\2\2-\u0087\3\2\2\2/\u008d\3\2\2\2\61\u009b\3\2\2\2\63\u00a6\3\2\2"+
		"\2\65\66\7U\2\2\66\67\7V\2\2\678\7C\2\289\7V\2\29\4\3\2\2\2:;\7?\2\2;"+
		"\6\3\2\2\2<=\7*\2\2=\b\3\2\2\2>?\7+\2\2?\n\3\2\2\2@A\7/\2\2A\f\3\2\2\2"+
		"BC\7-\2\2C\16\3\2\2\2DE\7,\2\2E\20\3\2\2\2FG\7\61\2\2G\22\3\2\2\2HI\7"+
		"`\2\2I\24\3\2\2\2JK\7f\2\2KL\7g\2\2LM\7h\2\2MN\7k\2\2NO\7p\2\2OP\7g\2"+
		"\2P\26\3\2\2\2QR\7R\2\2RS\7T\2\2ST\7K\2\2TU\7P\2\2UV\7V\2\2V\30\3\2\2"+
		"\2WX\7T\2\2XY\7Q\2\2YZ\7N\2\2Z[\7N\2\2[\32\3\2\2\2\\]\7n\2\2]^\7g\2\2"+
		"^_\7v\2\2_\34\3\2\2\2`a\7\60\2\2a\36\3\2\2\2bd\5\'\24\2cb\3\2\2\2de\3"+
		"\2\2\2ec\3\2\2\2ef\3\2\2\2f \3\2\2\2gk\5#\22\2hj\5%\23\2ih\3\2\2\2jm\3"+
		"\2\2\2ki\3\2\2\2kl\3\2\2\2l\"\3\2\2\2mk\3\2\2\2nu\t\2\2\2op\n\3\2\2pu"+
		"\6\22\2\2qr\t\4\2\2rs\t\5\2\2su\6\22\3\2tn\3\2\2\2to\3\2\2\2tq\3\2\2\2"+
		"u$\3\2\2\2v}\t\6\2\2wx\n\3\2\2x}\6\23\4\2yz\t\4\2\2z{\t\5\2\2{}\6\23\5"+
		"\2|v\3\2\2\2|w\3\2\2\2|y\3\2\2\2}&\3\2\2\2~\177\4\62;\2\177(\3\2\2\2\u0080"+
		"\u0081\7B\2\2\u0081*\3\2\2\2\u0082\u0083\7\60\2\2\u0083\u0084\7\60\2\2"+
		"\u0084\u0085\7\60\2\2\u0085,\3\2\2\2\u0086\u0088\t\7\2\2\u0087\u0086\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\b\27\2\2\u008c.\3\2\2\2\u008d\u008e\7\61\2"+
		"\2\u008e\u008f\7,\2\2\u008f\u0093\3\2\2\2\u0090\u0092\13\2\2\2\u0091\u0090"+
		"\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7,\2\2\u0097\u0098\7\61"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\30\2\2\u009a\60\3\2\2\2\u009b\u009c"+
		"\7\61\2\2\u009c\u009d\7\61\2\2\u009d\u00a1\3\2\2\2\u009e\u00a0\n\b\2\2"+
		"\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\b\31\2\2"+
		"\u00a5\62\3\2\2\2\u00a6\u00ac\7$\2\2\u00a7\u00ab\n\t\2\2\u00a8\u00a9\7"+
		"^\2\2\u00a9\u00ab\13\2\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7$\2\2\u00b0\64\3\2\2\2\f\2ekt|\u0089"+
		"\u0093\u00a1\u00aa\u00ac\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}