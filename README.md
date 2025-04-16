# 🗄 MyDB — A Tiny SQL-Like In-Memory Database Engine (ANTLR + Java)

Welcome to *MyDB*, a lightweight, custom-built in-memory database system written in Java.  
It supports basic SQL operations like CREATE, INSERT, SELECT, UPDATE, DELETE, EXPORT, and more!

This project is built using *ANTLR4, **Java 17, and **Maven*.

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

```plaintext
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
