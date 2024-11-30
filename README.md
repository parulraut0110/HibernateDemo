# Hibernate Demo Project

---

## Table of Contents

1. [Introduction](#introduction)
2. [Project Structure](#project-structure)
3. [Prerequisites](#prerequisites)
4. [Database Setup](#database-setup)
5. [Hibernate Configuration (hibernate.cfg.xml)](#hibernate-configuration-hibernatecfgxml)
6. [Running the Project](#running-the-project)
   - [In IDE](#in-ide)
   - [From Command Line](#from-command-line)
7. [Observing Output](#observing-output)
   - [SHOW TABLES](#show-tables)
   - [DESC student](#desc-student)
   - [SELECT * FROM student](#select--from-student)
8. [Troubleshooting](#troubleshooting)
9. [Help](#help)
10. [License](#license)

---

## Introduction

This project demonstrates how to integrate Hibernate ORM with a MySQL database using Java. It includes a simple application for managing Student records, allowing you to create, read, update, and delete student information.

---

## Project Structure

```bash

hibernate-demo/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── parul/
│ │ │ ├── App.java
│ │ │ └── Student.java
│ │ └── resources/
│ │ └── hibernate.cfg.xml
├── pom.xml
└── README.md

```
---

## Prerequisites

- **Java 17**
- **Maven**
- **MySQL Server**
- **MySQL Workbench or any other MySQL client tool**
- **IDE (IntelliJ IDEA, Eclipse, etc.)**
---
## Database Setup

1. Start your MySQL server.
2. Open MySQL Workbench or any MySQL client.
3. Create a database called `demo`:
```sql
   CREATE DATABASE demo;
```
---
## Hibernate Configuration (hibernate.cfg.xml)

In this project, the hibernate.cfg.xml file is located in src/main/resources/.

The external DTD file for Hibernate configuration was downloaded from [hibernate.org](https://hibernate.org/dtd/).

Make sure the connection properties (username and password) are correct:

```xml

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration SYSTEM "file:///C:/Users/parul/Downloads/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
    <session-factory>
        <!-- JDBC Database connection settings -->
        <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/demo</property>
        <property name="hibernate.connection.username">root</property>
        <property name="hibernate.connection.password">Raut#0110</property>

        <!-- JDBC connection pool settings -->
        <property name="hibernate.dialect">org.hibernate.dialect.MySQL8Dialect</property>

        <!-- Enable Hibernate's automatic session context management -->
        <property name="hibernate.current_session_context_class">thread</property>

        <!-- Drop and re-create the database schema on startup -->
        <property name="hibernate.hbm2ddl.auto">update</property>

        <!-- Echo all executed SQL to stdout -->
        <property name="hibernate.show_sql">true</property>

        <!-- Reference to the mapped class -->
        <mapping class="com.parul.Student"/>
    </session-factory>
</hibernate-configuration>

```
---

## Running the Project
In IDE:

Open the project in your IDE (IntelliJ IDEA, Eclipse).
Make sure your project is set up correctly.
Right-click on App.java and select Run 'App.main()'.
From Command Line:

Navigate to the root of your project in the terminal.

Run the following Maven command:

```bash
mvn clean compile exec:java -Dexec.mainClass="com.parul.App"
```
or

1. Right-click on pom.xml and select Run As then  Maven clean
2. Right-click on pom.xml and select Run As then Maven install
3. Right-click on App.java and select Run As then Run on Server.

This will compile the project and execute the main class App.java.

---

## Observing Output
If the configuration and database are set correctly, you will see Hibernate-generated SQL queries in the console, and the output of CRUD operations like fetching or updating student records.

Here's what the output should look like based on your Hibernate configuration and the Student entity:

1. SHOW TABLES;
Since the Hibernate configuration is set to hbm2ddl.auto=update, a table named student should be automatically created based on your Student class. So, the output would be:

```sql
+----------------+
| Tables_in_demo |
+----------------+
| student        |
+----------------+

```
![image](https://github.com/user-attachments/assets/2ca4d2fc-4cc8-4495-8937-6caf4f599ced)


2. DESC student;
The desc (describe) command will show the structure of the student table, reflecting the fields from your Student class:
```sql
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| id    | int         | NO   | PRI | NULL    |       |
| name  | varchar(255)| YES  |     | NULL    |       |
| email | varchar(255)| YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+

```

![image](https://github.com/user-attachments/assets/e7e2dd5e-fc7b-41cb-b329-27f808d0c760)


3. SELECT * FROM student;
This will display all the records in the student table. The output will depend on the records you insert into the database. For example, if you inserted a student with id = 3 named "Paul" and email "p@gmail.com", the output would be:
```sql
+----+-------+-------------+
| id | name  | email       |
+----+-------+-------------+
|  3 | Paul  | p@gmail.com |
+----+-------+-------------+

```
![image](https://github.com/user-attachments/assets/2c5655cc-d8b9-47e4-b779-d78005bed8e9)



   If no records were inserted, the output would be an empty set:

```sql
Empty set (0.00 sec)
```

---

## Troubleshooting
Database Connection Errors: Double-check your MySQL connection URL, username, and password in hibernate.cfg.xml.
Dependency Errors: Ensure all Maven dependencies are properly added and refreshed.
Session Management: Always remember to close sessions after completing transactions.

---

## LICENSE

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT) - see the [LICENSE.md](https://github.com/parulraut0110/HibernateDemo/blob/main/LICENSE.md) file for details.

---

## Help
If you need help with using the extension or troubleshooting issues, feel free to reach out to the developer. email: parulraut0110@gmail.com.

---
