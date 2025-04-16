package com.example;
import com.example.java.DB;
import org.junit.Test;

public class AppTest {

    @Test
    public void testCreateInsertSelect() throws Exception {
        String query = """
            CREATE TABLE students (id INT, name VARCHAR);
            INSERT INTO students (id, name) VALUES ('1', 'Alice');
            INSERT INTO students (id, name) VALUES ('2', 'Bob');
            SELECT id, name FROM students;
            """;

        DB.execute(query);
    }
}