# 🗄 MyDB — SQL-Like In-Memory Database Engine (ANTLR + Java)

Welcome to *MyDB*, a lightweight, custom-built in-memory database system written in Java.  
It supports basic SQL operations like CREATE, INSERT, SELECT, UPDATE, DELETE, EXPORT, and more!

This project is built from scratch using *ANTLR4, **Java 17, and **Maven*.

---

## 🚀 Features

✅ SQL-like command line interface  
✅ Fully custom grammar using *ANTLR 4*  
✅ In-memory database tables with typed columns  
✅ Type enforcement (INT, VARCHAR, BOOLEAN)  
✅ Core SQL support:
- CREATE TABLE
- INSERT INTO
- SELECT
- UPDATE
- DELETE
- DROP TABLE

✅ Utility support:
- EXPORT table TO 'filename.csv';
- SAVE DATABASE TO 'backup.db';
- LOAD DATABASE FROM 'backup.db';
- RUN filename.sql; (batch SQL from file)

✅ Modular and extensible design  
✅ Clean CLI output and pretty table printing

---

## 🧱 Tech Stack

| Tool        | Purpose                                |
|-------------|----------------------------------------|
| Java 17     | Backend logic and runtime              |
| ANTLR 4     | Grammar definition and parsing         |
| Maven       | Build system and dependency manager    |
| CLI         | User input and interactive shell       |

---

## 📂 Project Structure

plaintext
my_db/
├── pom.xml                      # Maven config
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/java/
│   │   │       ├── DB.java                  # CLI runner
│   │   │       ├── Database.java            # DB engine
│   │   │       ├── Table.java               # Table model
│   │   │       └── MyDBListenerImpl.java    # ANTLR listener
│   │   └── antlr4/
│   │       └── com/example/java/parser/
│   │           └── MyDB.g4                  # SQL grammar


---

## 🛠 How to Build & Run

### 1. Clone the repository

bash
git clone https://github.com/your-username/my_db.git
cd my_db


### 2. Compile using Maven

bash
mvn clean compile -Pantlr-include


> Make sure Java 17 and Maven are properly installed.

### 3. Launch the CLI

bash
mvn exec:java


You'll see:

Welcome to MyDB CLI!
Type SQL statements, end with a semicolon (;)
Type 'exit;' to quit.


---

## 🧪 Sample SQL Queries

sql
-- Create table
CREATE TABLE students (id INT, name VARCHAR, age INT, passed BOOLEAN);

-- Insert records
INSERT INTO students (id, name, age, passed) VALUES ('1', 'Alice', '20', 'true');
INSERT INTO students (id, name, age, passed) VALUES ('2', 'Bob', '22', 'false');
INSERT INTO students (id, name, age, passed) VALUES ('3', 'Charlie', '21', 'true');
INSERT INTO students (id, name, age, passed) VALUES ('4', 'David', '23', 'false');
INSERT INTO students (id, name, age, passed) VALUES ('5', 'Eva', '20', 'true');

-- Select all records
SELECT id, name, age, passed FROM students;

-- Update a record
UPDATE students SET name = 'Robert' WHERE name = 'Bob';

-- Delete a record
DELETE FROM students WHERE name = 'David';

-- Export to CSV
EXPORT students TO 'students.csv';

-- Save the database
SAVE DATABASE TO 'backup.db';

-- Drop the table
DROP TABLE students;

-- Load the database from file
LOAD DATABASE FROM 'backup.db';

-- Select again to confirm restore
SELECT id, name, age, passed FROM students;


---

## 📦 Example .sql File

You can batch-execute multiple queries using:

sql
run test.sql;


Your test.sql file might contain:

sql
CREATE TABLE users (id INT, name VARCHAR);
INSERT INTO users (id, name) VALUES ('1', 'John');
SELECT id, name FROM users;


---

## 🧠 How ANTLR is Used

- Grammar is defined in MyDB.g4
- ANTLR auto-generates the parser and lexer
- MyDBListenerImpl.java hooks into grammar rules
- DB.java runs the CLI and feeds SQL input through the parser

---




