package com.example.java;

import java.io.*;
import java.util.*;

public class Database {
    private Map<String, Table> tables = new HashMap<>();

    public void createTable(String name, List<String> columns, List<String> types) {
        if (tables.containsKey(name)) {
            throw new IllegalArgumentException("Table already exists.");
        }
        tables.put(name, new Table(name, columns, types));
        System.out.println("Table '" + name + "' created with columns " + columns + " and types " + types);
    }

    public void insertInto(String tableName, List<String> values) {
        getTable(tableName).insert(values);
        System.out.println("Inserted into '" + tableName + "': " + values);
    }

    public void selectFrom(String tableName, List<String> columns) {
        getTable(tableName).printTable();
    }

    public void deleteFrom(String tableName, String column, String value) {
        getTable(tableName).delete(column, value);
        System.out.println("Deleted rows in '" + tableName + "' where " + column + " = " + value);
    }

    public void update(String tableName, String column, String oldValue, String newValue) {
        getTable(tableName).update(column, oldValue, newValue);
        System.out.println("Updated '" + column + "' from '" + oldValue + "' to '" + newValue + "' in table '" + tableName + "'.");
    }

    public void exportTable(String tableName, String filePath) throws IOException {
        getTable(tableName).exportToCSV(filePath);
        System.out.println("Exported table '" + tableName + "' to " + filePath);
    }

    public void dropTable(String tableName) {
        if (!tables.containsKey(tableName)) {
            throw new IllegalArgumentException("Table not found: " + tableName);
        }
        tables.remove(tableName);
    }

    public void saveDatabase(String filePath) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(tables);
        }
    }

    public void loadDatabase(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Object obj = ois.readObject();
            if (obj instanceof Map<?, ?> loadedTables) {
                this.tables = (Map<String, Table>) loadedTables;
            }
        }
    }

    private Table getTable(String tableName) {
        Table table = tables.get(tableName);
        if (table == null) throw new IllegalArgumentException("Table not found: " + tableName);
        return table;
    }
}