package com.example.java;

import java.io.*;
import java.util.*;

public class Table implements Serializable {
    private String name;
    private List<String> columns;
    private List<String> columnTypes;
    private List<List<String>> rows;

    public Table(String name, List<String> columns, List<String> columnTypes) {
        this.name = name;
        this.columns = new ArrayList<>(columns);
        this.columnTypes = new ArrayList<>(columnTypes);
        this.rows = new ArrayList<>();
    }

    public void insert(List<String> values) {
        if (values.size() != columns.size()) {
            throw new IllegalArgumentException("Value count doesn't match column count.");
        }
        for (int i = 0; i < values.size(); i++) {
            String type = columnTypes.get(i);
            String value = values.get(i);
            if (type.equalsIgnoreCase("INT")) {
                try {
                    Integer.parseInt(value);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Invalid INT value for column '" + columns.get(i) + "': " + value);
                }
            }
        }
        rows.add(new ArrayList<>(values));
    }

    public void delete(String column, String value) {
        int idx = columns.indexOf(column);
        if (idx == -1) throw new IllegalArgumentException("Column not found: " + column);
        rows.removeIf(row -> row.get(idx).equals(value));
    }

    public void update(String column, String oldValue, String newValue) {
        int idx = columns.indexOf(column);
        if (idx == -1) throw new IllegalArgumentException("Column not found: " + column);
        for (List<String> row : rows) {
            if (row.get(idx).equals(oldValue)) {
                row.set(idx, newValue);
            }
        }
    }

    public void printTable() {
        System.out.println("Table: " + name);
        System.out.println(String.join(" | ", columns));
        System.out.println(String.join(" | ", columnTypes));
        for (List<String> row : rows) {
            System.out.println(String.join(" | ", row));
        }
    }

    public void exportToCSV(String filePath) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(String.join(",", columns) + "\n");
            for (List<String> row : rows) {
                writer.write(String.join(",", row) + "\n");
            }
        }
    }

    public List<String> getColumns() { return columns; }
    public List<String> getColTypes() { return columnTypes; }
    public List<List<String>> getRows() { return rows; }
}