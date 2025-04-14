# Baseline de Projeto Java Spring Boot

## ✨ Introdução

Este trabalho tem como objetivo criar uma **baseline** para um projeto Java com **Spring Boot**. Foi desenvolvida uma aplicação básica com funcionalidades de **CRUD para as entidades Cliente, Produto e Pedido**.

---

## ✅ Requisitos do Projeto Atendidos

- Utilização do **Spring Boot** como backend.
- CRUD completo para **Cliente**, **Produto** e **Pedido** (relacionando cliente e produtos).
- Backend funcional com **JSON de entrada/saída**.
- Configuração pronta para **MySQL**.
- Documentação via **Swagger UI**.

Obs: Para fins didáticos e foco na baseline da API, a parte JSF não foi implementada, mas a estrutura suporta a adição de módulo web com JSF/PrimeFaces.

---

## 🔢 Itens de Configuração

- **Código-fonte** Java no padrão `src/main/java`.
- **Recursos**: `application.properties` com configuração para MySQL.
- **Dependências** definidas no `pom.xml` (Spring Boot, Swagger, MySQL).
- **Banco de Dados**: script para criar o schema do banco (opcionalmente via Hibernate).
- **Documentação** da API gerada automaticamente pelo Swagger.

---

## 📁 Estrutura do Projeto

```plaintext
src/
 ├── main/
 │   ├── java/
 │   │   ├── com.exemplo.demo/     <- Pacote principal
 │   └── resources/
 │       └── application.properties     <- Configuração do banco
 └── pom.xml                          <- Gerenciador de dependências
```

---

## 🚀 Controle de Versão (Git)

- Utilizado **Git** com a estrutura:
  - `main`: branch principal
  - `feature/*`: para novas funcionalidades (ex: `feature/crud-cliente`)

---

## 📂 Configuração do Banco de Dados (MySQL)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/demo_db?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=123456
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

> Banco: `demo_db`
> Usuário/Senha: conforme seu MySQL local

---

## ⚙️ Dependências no `pom.xml`

```xml
<dependencies>
    <!-- Spring Boot -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- MySQL -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
    </dependency>

    <!-- Swagger (Springdoc OpenAPI) -->
    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
        <version>2.2.0</version>
    </dependency>
</dependencies>
```

---

## 📚 Apresentação da Baseline

### Arquitetura da Aplicação

- Camada **Controller** com endpoints REST (`/clientes`, `/produtos`, `/pedidos`)
- Camada **Service** para regras de negócio
- Camada **Repository** para persistência com Spring Data JPA
- Entidades JPA anotadas com `@Entity`
- Relacionamento entre `Cliente` e `Pedido` (pedido pode ter vários produtos)

### Ferramentas Utilizadas

- **Spring Boot 3.x**
- **Maven**
- **MySQL**
- **Swagger UI (OpenAPI)**
- **IDE IntelliJ IDEA / Eclipse**
- **Git / GitHub**

### Demonstração da API

- Documentação da API: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
- Testes via Swagger, Postman ou Insomnia com exemplos de JSON enviados.

---

Se quiser o arquivo `.zip` com esse projeto e a documentação pronta pra entregar, é só pedir!

