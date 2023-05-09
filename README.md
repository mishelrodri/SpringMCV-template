# 📰 SpringMVC Template

## Estructura del proyecto
  
 ```
📁 Proyecto
└── 📁 src
     ├── 📁 main
     │     ├── 📁 java
     │     │     └── 📁 com.ues.springmvc
     │     │           ├── 📁 configurador
     │     │           ├── 📁 controllers
     │     │           ├── 📁 repositorios
     │     │           ├── 📁 entidades
     │     │           └── 📁 servicios
     │     ├── 📁 resources
     │     │    └──  📁 META-INF
     │     │          └── 📄 persistence.xml
     │     └── 📁 webapp
     │           ├── 📁 resources
     │           └── 📁 WEB-INF
     │               └── 📁 vistas
     ├── 📄 pom.xml
     └── 📄 README.md
 ```

##  🐾 Steps

- Completar la estructura del proyecto
- Modificar la dependencia de la base si es necesrio
- Modificar el archivo persistence.xml por tus datos
- Luego puedes seguir los siguientes pasos:
```
  ⚡ Crear La entidad
  ⚡ Actualizar la persistencia
  ⚡ Repository
  ⚡ Servicios
  ⚡ Controller 
``` 
## 🥞 Dependecias para Bases de datos

### 🦞 SQLSERVER
```xml
<!-- https://mvnrepository.com/artifact/com.microsoft.sqlserver/mssql-jdbc -->
    <dependency>
      <groupId>com.microsoft.sqlserver</groupId>
      <artifactId>mssql-jdbc</artifactId>
      <version>9.4.1.jre8</version>
    </dependency>
```
### 🐘PostgreSQL
```xml
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.5.4</version>
</dependency>
```
### 🐬 MySQL
```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.26</version>
</dependency>
```

## ⚙ Persistence.xml
Por defecto este archivo esta con la configuración necesaria para usarla con el gestor de base de datos SQLSERVER, puedes utilizar las siguientes configuraciones:

### 🦞 SQLSERVER

```xml
<persistence xmlns="http://java.sun.com/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://java.sun.com/xml/ns/persistence
 http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
             version="2.0">
    <persistence-unit name="categorias">
        <class>com.ues.springmvc.entidades.Clase</class>
        <properties>
            <property name="javax.persistence.jdbc.driver" value="com.microsoft.sqlserver.jdbc.SQLServerDriver"/>
            <property name="hibernate.show_sql" value="true"/>
            <property name="hibernate.dialect"
                      value="org.hibernate.dialect.MySQL57Dialect"/>
            <!--            SQLServer2012Dialect-->
            <property name="javax.persistence.jdbc.user" value="root"/>
            <property name="javax.persistence.jdbc.password" value="Root1234.$"/>
            <property name="javax.persistence.jdbc.url"
                      value="jdbc:sqlserver://localhost:1433;databaseName=spotify"/>
        </properties>
    </persistence-unit>
</persistence>
```

### 🐘PostgreSQL

```xml
<persistence xmlns="http://java.sun.com/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://java.sun.com/xml/ns/persistence
 http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
             version="2.0">
    <persistence-unit name="categorias">
        <class>com.ues.springmvc.entidades.Categoria</class>
        <properties>
            <property name="javax.persistence.jdbc.driver" value="org.postgresql.Driver"/>
            <property name="hibernate.show_sql" value="true"/>
            <property name="hibernate.dialect"
                      value="org.hibernate.dialect.PostgreSQLDialect"/>
            <property name="javax.persistence.jdbc.user" value="username"/>
            <property name="javax.persistence.jdbc.password" value="password"/>
            <property name="javax.persistence.jdbc.url"
                      value="jdbc:postgresql://localhost:5432/db_name"/>
        </properties>
    </persistence-unit>
</persistence>

```
### 🐬 MySQL

```xml
<persistence xmlns="http://java.sun.com/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://java.sun.com/xml/ns/persistence
 http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
             version="2.0">
    <persistence-unit name="categorias">
        <class>com.ues.springmvc.entidades.Categoria</class>
        <properties>
            <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
            <property name="hibernate.show_sql" value="true"/>
            <property name="hibernate.dialect"
                      value="org.hibernate.dialect.MySQL57Dialect"/>
            <property name="javax.persistence.jdbc.user" value="username"/>
            <property name="javax.persistence.jdbc.password" value="password"/>
            <property name="javax.persistence.jdbc.url"
                      value="jdbc:mysql://localhost:3306/db_name?useSSL=false&amp;serverTimezone=UTC"/>
        </properties>
    </persistence-unit>
</persistence>

```