# Hibernate Demo Project

This is a simple Hibernate project that demonstrates basic CRUD operations using Hibernate ORM with MySQL.

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
├── pom.xml └── README.md

```

## Prerequisites

- **Java 17**
- **Maven**
- **MySQL Server**
- **MySQL Workbench or any other MySQL client tool**
- **IDE (IntelliJ IDEA, Eclipse, etc.)**

## Database Setup

1. Start your MySQL server.
2. Open MySQL Workbench or any MySQL client.
3. Create a database called `demo`:
```sql
   CREATE DATABASE demo;
```
## Hibernate Configuration (hibernate.cfg.xml)

In this project, the hibernate.cfg.xml file is located in src/main/resources/.

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
