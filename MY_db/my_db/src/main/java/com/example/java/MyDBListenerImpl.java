package com.example.java;

import com.example.java.parser.MyDBBaseListener;
import com.example.java.parser.MyDBParser;

import java.util.*;

public class MyDBListenerImpl extends MyDBBaseListener {
    private static final Database db = new Database();

    @Override
    public void exitCreateStatement(MyDBParser.CreateStatementContext ctx) {
        String tableName = ctx.tblName.getText();
        List<String> columns = new ArrayList<>();
        List<String> colTypes = new ArrayList<>();
        for (MyDBParser.ColumnDefContext colCtx : ctx.columnDef()) {
            columns.add(colCtx.colName.getText());
            colTypes.add(colCtx.colType.getText());
        }
        db.createTable(tableName, columns, colTypes);
    }

    @Override
    public void exitInsertStatement(MyDBParser.InsertStatementContext ctx) {
        String tableName = ctx.tblName.getText();
        List<String> values = new ArrayList<>();
        for (var str : ctx.valueList().STRING()) {
            String raw = str.getText();
            values.add(raw.substring(1, raw.length() - 1));
        }
        db.insertInto(tableName, values);
    }

    @Override
    public void exitSelectStatement(MyDBParser.SelectStatementContext ctx) {
        String tableName = ctx.tblName.getText();
        List<String> columns = new ArrayList<>();
        for (var id : ctx.columnNameList().IDENTIFIER()) {
            columns.add(id.getText());
        }
        db.selectFrom(tableName, columns); // Filtered select could be added later
    }

    @Override
    public void exitDeleteStatement(MyDBParser.DeleteStatementContext ctx) {
        String tableName = ctx.tblName.getText();
        var first = ctx.whereClause().condition(0);
        String column = first.column.getText();
        String value = first.value.getText().replace("'", "");
        db.deleteFrom(tableName, column, value); // Extend this for multiple conditions if needed
    }

    @Override
    public void exitUpdateStatement(MyDBParser.UpdateStatementContext ctx) {
        String tableName = ctx.tblName.getText();
        String column = ctx.column.getText();
        String newValue = ctx.newValue.getText().replace("'", "");
        String whereCol = ctx.whereClause().condition(0).column.getText();
        String oldValue = ctx.whereClause().condition(0).value.getText().replace("'", "");
        db.update(tableName, column, oldValue, newValue); // Single condition update
    }

    @Override
    public void exitExportStatement(MyDBParser.ExportStatementContext ctx) {
        String tableName = ctx.tblName.getText();
        String filePath = ctx.filePath.getText().replace("'", "");
        try {
            db.exportTable(tableName, filePath);
        } catch (Exception e) {
            System.err.println("Export failed: " + e.getMessage());
        }
    }

    @Override
    public void exitDropStatement(MyDBParser.DropStatementContext ctx) {
        String tableName = ctx.tblName.getText();
        db.dropTable(tableName);
        System.out.println("Dropped table '" + tableName + "'");
    }

    @Override
    public void exitSaveStatement(MyDBParser.SaveStatementContext ctx) {
        String filePath = ctx.filePath.getText().replace("'", "");
        try {
            db.saveDatabase(filePath);
            System.out.println("Database saved to: " + filePath);
        } catch (Exception e) {
            System.err.println("Save failed: " + e.getMessage());
        }
    }

    @Override
    public void exitLoadStatement(MyDBParser.LoadStatementContext ctx) {
        String filePath = ctx.filePath.getText().replace("'", "");
        try {
            db.loadDatabase(filePath);
            System.out.println("Database loaded from: " + filePath);
        } catch (Exception e) {
            System.err.println("Load failed: " + e.getMessage());
        }
    }
}