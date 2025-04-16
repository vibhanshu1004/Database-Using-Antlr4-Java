// Generated from com/example/java/parser/MyDB.g4 by ANTLR 4.13.1
package com.example.java.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyDBParser}.
 */
public interface MyDBListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyDBParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(MyDBParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDBParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(MyDBParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDBParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyDBParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDBParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyDBParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDBParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateStatement(MyDBParser.CreateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDBParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateStatement(MyDBParser.CreateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDBParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void enterColumnDef(MyDBParser.ColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDBParser#columnDef}.
	 * @param ctx the parse tree
	 */
	void exitColumnDef(MyDBParser.ColumnDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDBParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(MyDBParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDBParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(MyDBParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDBParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(MyDBParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDBParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(MyDBParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDBParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(MyDBParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDBParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(MyDBParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDBParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(MyDBParser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDBParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(MyDBParser.UpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDBParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(MyDBParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDBParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(MyDBParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDBParser#dropStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropStatement(MyDBParser.DropStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDBParser#dropStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropStatement(MyDBParser.DropStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDBParser#saveStatement}.
	 * @param ctx the parse tree
	 */
	void enterSaveStatement(MyDBParser.SaveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDBParser#saveStatement}.
	 * @param ctx the parse tree
	 */
	void exitSaveStatement(MyDBParser.SaveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDBParser#loadStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadStatement(MyDBParser.LoadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDBParser#loadStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadStatement(MyDBParser.LoadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDBParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(MyDBParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDBParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(MyDBParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDBParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MyDBParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDBParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MyDBParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDBParser#columnNameList}.
	 * @param ctx the parse tree
	 */
	void enterColumnNameList(MyDBParser.ColumnNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDBParser#columnNameList}.
	 * @param ctx the parse tree
	 */
	void exitColumnNameList(MyDBParser.ColumnNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDBParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(MyDBParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDBParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(MyDBParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDBParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(MyDBParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDBParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(MyDBParser.TypeNameContext ctx);
}