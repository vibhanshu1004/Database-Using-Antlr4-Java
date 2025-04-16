package com.example.java;

import com.example.java.parser.MyDBLexer;
import com.example.java.parser.MyDBParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class DB {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to MyDB CLI!\nType SQL statements, end with a semicolon (;)");
        System.out.println("Type 'exit;' to quit or 'run <filename>.sql;' to execute SQL from file.\n");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("mydb> ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit;")) break;

            if (input.startsWith("run ")) {
                String fileName = input.substring(4, input.length() - 1).trim();
                String content = Files.readString(Paths.get(fileName));
                execute(content);
            } else {
                execute(input);
            }
        }
    }

    public static void execute(String input) throws Exception {
        CharStream charStream = CharStreams.fromString(input);
        MyDBLexer lexer = new MyDBLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyDBParser parser = new MyDBParser(tokens);
        ParseTree tree = parser.parse();
        ParseTreeWalker walker = new ParseTreeWalker();
        MyDBListenerImpl listener = new MyDBListenerImpl();
        walker.walk(listener, tree);
        System.out.println("? Executed.");
    }
}