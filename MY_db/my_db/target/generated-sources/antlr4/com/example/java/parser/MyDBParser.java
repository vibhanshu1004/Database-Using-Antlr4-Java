// Generated from com/example/java/parser/MyDB.g4 by ANTLR 4.13.1
package com.example.java.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyDBParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		IDENTIFIER=25, STRING=26, INT_TYPE=27, VARCHAR_TYPE=28, BOOLEAN_TYPE=29, 
		WS=30;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_createStatement = 2, RULE_columnDef = 3, 
		RULE_insertStatement = 4, RULE_selectStatement = 5, RULE_deleteStatement = 6, 
		RULE_updateStatement = 7, RULE_exportStatement = 8, RULE_dropStatement = 9, 
		RULE_saveStatement = 10, RULE_loadStatement = 11, RULE_whereClause = 12, 
		RULE_condition = 13, RULE_columnNameList = 14, RULE_valueList = 15, RULE_typeName = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "statement", "createStatement", "columnDef", "insertStatement", 
			"selectStatement", "deleteStatement", "updateStatement", "exportStatement", 
			"dropStatement", "saveStatement", "loadStatement", "whereClause", "condition", 
			"columnNameList", "valueList", "typeName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CREATE'", "'TABLE'", "'('", "','", "')'", "';'", "'INSERT'", 
			"'INTO'", "'VALUES'", "'SELECT'", "'FROM'", "'DELETE'", "'UPDATE'", "'SET'", 
			"'='", "'EXPORT'", "'TO'", "'DROP'", "'SAVE'", "'DATABASE'", "'LOAD'", 
			"'WHERE'", "'AND'", "'OR'", null, null, "'INT'", "'VARCHAR'", "'BOOLEAN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "IDENTIFIER", "STRING", "INT_TYPE", "VARCHAR_TYPE", "BOOLEAN_TYPE", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	@Override
	public String getGrammarFileName() { return "MyDB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyDBParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyDBParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyDBVisitor ) return ((MyDBVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				statement();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2962562L) != 0) );
			setState(39);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public CreateStatementContext createStatement() {
			return getRuleContext(CreateStatementContext.class,0);
		}
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public UpdateStatementContext updateStatement() {
			return getRuleContext(UpdateStatementContext.class,0);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public DropStatementContext dropStatement() {
			return getRuleContext(DropStatementContext.class,0);
		}
		public SaveStatementContext saveStatement() {
			return getRuleContext(SaveStatementContext.class,0);
		}
		public LoadStatementContext loadStatement() {
			return getRuleContext(LoadStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyDBVisitor ) return ((MyDBVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				createStatement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				insertStatement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				selectStatement();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				deleteStatement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				updateStatement();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				exportStatement();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 7);
				{
				setState(47);
				dropStatement();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 8);
				{
				setState(48);
				saveStatement();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 9);
				{
				setState(49);
				loadStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateStatementContext extends ParserRuleContext {
		public Token tblName;
		public List<ColumnDefContext> columnDef() {
			return getRuleContexts(ColumnDefContext.class);
		}
		public ColumnDefContext columnDef(int i) {
			return getRuleContext(ColumnDefContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(MyDBParser.IDENTIFIER, 0); }
		public CreateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).enterCreateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).exitCreateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyDBVisitor ) return ((MyDBVisitor<? extends T>)visitor).visitCreateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStatementContext createStatement() throws RecognitionException {
		CreateStatementContext _localctx = new CreateStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			match(T__1);
			setState(54);
			((CreateStatementContext)_localctx).tblName = match(IDENTIFIER);
			setState(55);
			match(T__2);
			setState(56);
			columnDef();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(57);
				match(T__3);
				setState(58);
				columnDef();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(T__4);
			setState(65);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnDefContext extends ParserRuleContext {
		public Token colName;
		public TypeNameContext colType;
		public TerminalNode IDENTIFIER() { return getToken(MyDBParser.IDENTIFIER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ColumnDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).enterColumnDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).exitColumnDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyDBVisitor ) return ((MyDBVisitor<? extends T>)visitor).visitColumnDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefContext columnDef() throws RecognitionException {
		ColumnDefContext _localctx = new ColumnDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_columnDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			((ColumnDefContext)_localctx).colName = match(IDENTIFIER);
			setState(68);
			((ColumnDefContext)_localctx).colType = typeName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InsertStatementContext extends ParserRuleContext {
		public Token tblName;
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MyDBParser.IDENTIFIER, 0); }
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).enterInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).exitInsertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyDBVisitor ) return ((MyDBVisitor<? extends T>)visitor).visitInsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_insertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__6);
			setState(71);
			match(T__7);
			setState(72);
			((InsertStatementContext)_localctx).tblName = match(IDENTIFIER);
			setState(73);
			match(T__2);
			setState(74);
			columnNameList();
			setState(75);
			match(T__4);
			setState(76);
			match(T__8);
			setState(77);
			match(T__2);
			setState(78);
			valueList();
			setState(79);
			match(T__4);
			setState(80);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectStatementContext extends ParserRuleContext {
		public Token tblName;
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MyDBParser.IDENTIFIER, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyDBVisitor ) return ((MyDBVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__9);
			setState(83);
			columnNameList();
			setState(84);
			match(T__10);
			setState(85);
			((SelectStatementContext)_localctx).tblName = match(IDENTIFIER);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(86);
				whereClause();
				}
			}

			setState(89);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteStatementContext extends ParserRuleContext {
		public Token tblName;
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MyDBParser.IDENTIFIER, 0); }
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).exitDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyDBVisitor ) return ((MyDBVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_deleteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__11);
			setState(92);
			match(T__10);
			setState(93);
			((DeleteStatementContext)_localctx).tblName = match(IDENTIFIER);
			setState(94);
			whereClause();
			setState(95);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateStatementContext extends ParserRuleContext {
		public Token tblName;
		public Token column;
		public Token newValue;
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyDBParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyDBParser.IDENTIFIER, i);
		}
		public TerminalNode STRING() { return getToken(MyDBParser.STRING, 0); }
		public UpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).enterUpdateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).exitUpdateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyDBVisitor ) return ((MyDBVisitor<? extends T>)visitor).visitUpdateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStatementContext updateStatement() throws RecognitionException {
		UpdateStatementContext _localctx = new UpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_updateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__12);
			setState(98);
			((UpdateStatementContext)_localctx).tblName = match(IDENTIFIER);
			setState(99);
			match(T__13);
			setState(100);
			((UpdateStatementContext)_localctx).column = match(IDENTIFIER);
			setState(101);
			match(T__14);
			setState(102);
			((UpdateStatementContext)_localctx).newValue = match(STRING);
			setState(103);
			whereClause();
			setState(104);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends ParserRuleContext {
		public Token tblName;
		public Token filePath;
		public TerminalNode IDENTIFIER() { return getToken(MyDBParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(MyDBParser.STRING, 0); }
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyDBVisitor ) return ((MyDBVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__15);
			setState(107);
			((ExportStatementContext)_localctx).tblName = match(IDENTIFIER);
			setState(108);
			match(T__16);
			setState(109);
			((ExportStatementContext)_localctx).filePath = match(STRING);
			setState(110);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DropStatementContext extends ParserRuleContext {
		public Token tblName;
		public TerminalNode IDENTIFIER() { return getToken(MyDBParser.IDENTIFIER, 0); }
		public DropStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).enterDropStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).exitDropStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyDBVisitor ) return ((MyDBVisitor<? extends T>)visitor).visitDropStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropStatementContext dropStatement() throws RecognitionException {
		DropStatementContext _localctx = new DropStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dropStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__17);
			setState(113);
			match(T__1);
			setState(114);
			((DropStatementContext)_localctx).tblName = match(IDENTIFIER);
			setState(115);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SaveStatementContext extends ParserRuleContext {
		public Token filePath;
		public TerminalNode STRING() { return getToken(MyDBParser.STRING, 0); }
		public SaveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).enterSaveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).exitSaveStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyDBVisitor ) return ((MyDBVisitor<? extends T>)visitor).visitSaveStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaveStatementContext saveStatement() throws RecognitionException {
		SaveStatementContext _localctx = new SaveStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_saveStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__18);
			setState(118);
			match(T__19);
			setState(119);
			match(T__16);
			setState(120);
			((SaveStatementContext)_localctx).filePath = match(STRING);
			setState(121);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoadStatementContext extends ParserRuleContext {
		public Token filePath;
		public TerminalNode STRING() { return getToken(MyDBParser.STRING, 0); }
		public LoadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loadStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).enterLoadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).exitLoadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyDBVisitor ) return ((MyDBVisitor<? extends T>)visitor).visitLoadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoadStatementContext loadStatement() throws RecognitionException {
		LoadStatementContext _localctx = new LoadStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loadStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__20);
			setState(124);
			match(T__19);
			setState(125);
			match(T__10);
			setState(126);
			((LoadStatementContext)_localctx).filePath = match(STRING);
			setState(127);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyDBVisitor ) return ((MyDBVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whereClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__21);
			setState(130);
			condition();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22 || _la==T__23) {
				{
				{
				setState(131);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				condition();
				}
				}
				setState(137);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public Token column;
		public Token value;
		public TerminalNode IDENTIFIER() { return getToken(MyDBParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(MyDBParser.STRING, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyDBVisitor ) return ((MyDBVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			((ConditionContext)_localctx).column = match(IDENTIFIER);
			setState(139);
			match(T__14);
			setState(140);
			((ConditionContext)_localctx).value = match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNameListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyDBParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyDBParser.IDENTIFIER, i);
		}
		public ColumnNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).enterColumnNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).exitColumnNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyDBVisitor ) return ((MyDBVisitor<? extends T>)visitor).visitColumnNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameListContext columnNameList() throws RecognitionException {
		ColumnNameListContext _localctx = new ColumnNameListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_columnNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(IDENTIFIER);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(143);
				match(T__3);
				setState(144);
				match(IDENTIFIER);
				}
				}
				setState(149);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueListContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MyDBParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MyDBParser.STRING, i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyDBVisitor ) return ((MyDBVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(STRING);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(151);
				match(T__3);
				setState(152);
				match(STRING);
				}
				}
				setState(157);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(MyDBParser.INT_TYPE, 0); }
		public TerminalNode VARCHAR_TYPE() { return getToken(MyDBParser.VARCHAR_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(MyDBParser.BOOLEAN_TYPE, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyDBListener ) ((MyDBListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyDBVisitor ) return ((MyDBVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00a1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0004\u0000$\b\u0000\u000b"+
		"\u0000\f\u0000%\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u00013\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002<\b\u0002\n\u0002"+
		"\f\u0002?\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005X\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0086\b\f\n\f\f\f"+
		"\u0089\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0092\b\u000e\n\u000e\f\u000e\u0095\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u009a\b\u000f\n\u000f\f\u000f\u009d"+
		"\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \u0000\u0002\u0001\u0000\u0017\u0018\u0001\u0000\u001b\u001d\u009d\u0000"+
		"#\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u00044\u0001"+
		"\u0000\u0000\u0000\u0006C\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000"+
		"\u0000\nR\u0001\u0000\u0000\u0000\f[\u0001\u0000\u0000\u0000\u000ea\u0001"+
		"\u0000\u0000\u0000\u0010j\u0001\u0000\u0000\u0000\u0012p\u0001\u0000\u0000"+
		"\u0000\u0014u\u0001\u0000\u0000\u0000\u0016{\u0001\u0000\u0000\u0000\u0018"+
		"\u0081\u0001\u0000\u0000\u0000\u001a\u008a\u0001\u0000\u0000\u0000\u001c"+
		"\u008e\u0001\u0000\u0000\u0000\u001e\u0096\u0001\u0000\u0000\u0000 \u009e"+
		"\u0001\u0000\u0000\u0000\"$\u0003\u0002\u0001\u0000#\"\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0005\u0000\u0000\u0001(\u0001"+
		"\u0001\u0000\u0000\u0000)3\u0003\u0004\u0002\u0000*3\u0003\b\u0004\u0000"+
		"+3\u0003\n\u0005\u0000,3\u0003\f\u0006\u0000-3\u0003\u000e\u0007\u0000"+
		".3\u0003\u0010\b\u0000/3\u0003\u0012\t\u000003\u0003\u0014\n\u000013\u0003"+
		"\u0016\u000b\u00002)\u0001\u0000\u0000\u00002*\u0001\u0000\u0000\u0000"+
		"2+\u0001\u0000\u0000\u00002,\u0001\u0000\u0000\u00002-\u0001\u0000\u0000"+
		"\u00002.\u0001\u0000\u0000\u00002/\u0001\u0000\u0000\u000020\u0001\u0000"+
		"\u0000\u000021\u0001\u0000\u0000\u00003\u0003\u0001\u0000\u0000\u0000"+
		"45\u0005\u0001\u0000\u000056\u0005\u0002\u0000\u000067\u0005\u0019\u0000"+
		"\u000078\u0005\u0003\u0000\u00008=\u0003\u0006\u0003\u00009:\u0005\u0004"+
		"\u0000\u0000:<\u0003\u0006\u0003\u0000;9\u0001\u0000\u0000\u0000<?\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u0005\u0000"+
		"\u0000AB\u0005\u0006\u0000\u0000B\u0005\u0001\u0000\u0000\u0000CD\u0005"+
		"\u0019\u0000\u0000DE\u0003 \u0010\u0000E\u0007\u0001\u0000\u0000\u0000"+
		"FG\u0005\u0007\u0000\u0000GH\u0005\b\u0000\u0000HI\u0005\u0019\u0000\u0000"+
		"IJ\u0005\u0003\u0000\u0000JK\u0003\u001c\u000e\u0000KL\u0005\u0005\u0000"+
		"\u0000LM\u0005\t\u0000\u0000MN\u0005\u0003\u0000\u0000NO\u0003\u001e\u000f"+
		"\u0000OP\u0005\u0005\u0000\u0000PQ\u0005\u0006\u0000\u0000Q\t\u0001\u0000"+
		"\u0000\u0000RS\u0005\n\u0000\u0000ST\u0003\u001c\u000e\u0000TU\u0005\u000b"+
		"\u0000\u0000UW\u0005\u0019\u0000\u0000VX\u0003\u0018\f\u0000WV\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0005"+
		"\u0006\u0000\u0000Z\u000b\u0001\u0000\u0000\u0000[\\\u0005\f\u0000\u0000"+
		"\\]\u0005\u000b\u0000\u0000]^\u0005\u0019\u0000\u0000^_\u0003\u0018\f"+
		"\u0000_`\u0005\u0006\u0000\u0000`\r\u0001\u0000\u0000\u0000ab\u0005\r"+
		"\u0000\u0000bc\u0005\u0019\u0000\u0000cd\u0005\u000e\u0000\u0000de\u0005"+
		"\u0019\u0000\u0000ef\u0005\u000f\u0000\u0000fg\u0005\u001a\u0000\u0000"+
		"gh\u0003\u0018\f\u0000hi\u0005\u0006\u0000\u0000i\u000f\u0001\u0000\u0000"+
		"\u0000jk\u0005\u0010\u0000\u0000kl\u0005\u0019\u0000\u0000lm\u0005\u0011"+
		"\u0000\u0000mn\u0005\u001a\u0000\u0000no\u0005\u0006\u0000\u0000o\u0011"+
		"\u0001\u0000\u0000\u0000pq\u0005\u0012\u0000\u0000qr\u0005\u0002\u0000"+
		"\u0000rs\u0005\u0019\u0000\u0000st\u0005\u0006\u0000\u0000t\u0013\u0001"+
		"\u0000\u0000\u0000uv\u0005\u0013\u0000\u0000vw\u0005\u0014\u0000\u0000"+
		"wx\u0005\u0011\u0000\u0000xy\u0005\u001a\u0000\u0000yz\u0005\u0006\u0000"+
		"\u0000z\u0015\u0001\u0000\u0000\u0000{|\u0005\u0015\u0000\u0000|}\u0005"+
		"\u0014\u0000\u0000}~\u0005\u000b\u0000\u0000~\u007f\u0005\u001a\u0000"+
		"\u0000\u007f\u0080\u0005\u0006\u0000\u0000\u0080\u0017\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005\u0016\u0000\u0000\u0082\u0087\u0003\u001a\r\u0000"+
		"\u0083\u0084\u0007\u0000\u0000\u0000\u0084\u0086\u0003\u001a\r\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0019\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005\u0019\u0000\u0000\u008b\u008c\u0005\u000f\u0000\u0000\u008c"+
		"\u008d\u0005\u001a\u0000\u0000\u008d\u001b\u0001\u0000\u0000\u0000\u008e"+
		"\u0093\u0005\u0019\u0000\u0000\u008f\u0090\u0005\u0004\u0000\u0000\u0090"+
		"\u0092\u0005\u0019\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092"+
		"\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u001d\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0096\u009b\u0005\u001a\u0000\u0000\u0097"+
		"\u0098\u0005\u0004\u0000\u0000\u0098\u009a\u0005\u001a\u0000\u0000\u0099"+
		"\u0097\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u001f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0007\u0001\u0000\u0000\u009f!\u0001\u0000\u0000\u0000\u0007%2"+
		"=W\u0087\u0093\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}