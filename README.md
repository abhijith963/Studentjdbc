# Student Management System (Java + MySQL JDBC)

## About this project

This is a simple Student Management System I built while learning how Java connects with databases using JDBC.

The goal of this project was to understand the complete flow:

* Writing Java code
* Connecting to a MySQL database
* Performing basic database operations
* Structuring code in a clean and maintainable way

---

## What this project does

Currently, the application supports:

* Adding a student to the database
* Viewing all stored students

It’s a basic console-based application, but it helped me understand how backend systems work at a fundamental level.

---

## Tech stack

* Core Java
* MySQL
* JDBC (MySQL Connector/J)
* VS Code

---

## Project structure

I organized the project using a layered approach to keep responsibilities clear:

```
StudentJDBCProject/
│
├── dto/        -> Data transfer objects (StudentDTO)
├── dao/        -> Interface defining operations
├── daoimpl/    -> Implementation of database logic
├── service/    -> Business logic layer
├── util/       -> Database connection handling
├── lib/        -> JDBC driver
└── Main.java   -> Entry point of the application
```

---

## Database setup

Run the following SQL queries in MySQL before running the project:

```sql
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    age INT,
    course VARCHAR(50)
);
```

---

## Configuration

Update your MySQL credentials in `DBConnection.java`:

```java
DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/studentdb",
    "root",
    "your_password"
);
```

---

## How to run the project

### Compile

```
javac -cp "lib/mysql-connector-j-9.6.0.jar;." Main.java
```

### Run

```
java -cp "lib/mysql-connector-j-9.6.0.jar;." Main
```

---

## Sample output

```
Student added successfully
1 Akhil 22 CSE
```

---

## What I learned

* How JDBC works in Java
* How to connect Java applications to MySQL
* Using PreparedStatement for safer queries
* Organizing code using DAO and Service layers

---

## Possible improvements

* Add update and delete functionality
* Create a menu-driven interface
* Add input validation
* Convert this into a web application using Spring Boot

---

## Author

Abhijith

---

This project is part of my learning journey in backend development using Java.
