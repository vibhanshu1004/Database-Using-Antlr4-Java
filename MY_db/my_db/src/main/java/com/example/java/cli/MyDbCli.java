package com.example.java.cli;

import com.example.java.DB;

import java.util.Scanner;

public class MyDbCli {
    public static void start() {
        System.out.println("Welcome to MyDB CLI!");
        System.out.println("Type SQL statements, end with a semicolon (;)");
        System.out.println("Type 'exit;' to quit.");

        Scanner scanner = new Scanner(System.in);
        StringBuilder buffer = new StringBuilder();

        while (true) {
            System.out.print("mydb> ");
            String line = scanner.nextLine();

            buffer.append(line).append("\n");

            // Only parse when a semicolon (end of statement) is found
            if (line.trim().endsWith(";")) {
                String input = buffer.toString().trim();
                buffer.setLength(0);  // clear buffer

                if (input.equalsIgnoreCase("exit;")) {
                    System.out.println("Goodbye!");
                    break;
                }

                try {
                    DB.execute(input);  // call your parser
                } catch (Exception e) {
                    System.out.println("❌ Error: " + e.getMessage());
                }
            }
        }

        scanner.close();
    }
}