<h4> Projeto POO (Gestão de Animais) </h4>

<hr>

<h3 align="center">
    Projeto POO
    <br>
    Como criar uma API RESTful com Spring Boot
    <br><br>
    <p align="center">
      <a href="#-sobre">Sobre</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
      <a href="#-professor-responsável">Professor responsável</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
      <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
      <a href="#-instruções-de-utilização">Instruções de utilização</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
</h3>

<hr>

## 🔖 Sobre

Criação de Crud em Java Trabalho Interdisciplinar Aplicações para Processos de Negócios do 3º período de Sistema de Informação, Faculdade Metropolitana de Manaus (Fametro) 2024/3.

---

## 👨‍💻 Estudantes

* Danilo Marques
* Sofia Nascimento
* Jorge Henrique
* Moises Batista
* Alan Delon
* Ana Crystine
* José Fernando

---

## 👩‍🏫 Professor responsável

* Arlindo Neto

---

## 🚀 Tecnologias
 - [Bootstrap 5](https://getbootstrap.com/)
 - [Java 17](http://www.oracle.com/java/technologies/javase-downloads.html)
- Database:
  - [MySQL Server](https://dev.mysql.com/downloads/mysql/)
- Ferramenta
  - [IntelliJ](https://www.jetbrains.com/pt-br/ides/)
  - [Postman](http://www.postman.com/downloads/)
  - [Git](https://git-scm.com/downloads)

---

## ⤵ Instruções de utilização

Essas instruções vão te levar a uma cópia do projeto rodando em sua máquina local para propósitos de testes, desenvolvimento e aprendizagem.

Pré-requisitos:
- Ter instalado todas as ferramentas e dependências ensinadas no vídeo [Aula 02 - Instalação de todas as ferramentas e configuração de ambiente](https://youtu.be/WHJvBUADvCE)
  - Java
  - Maven
  - MySQL

<br>

- Passo 1: Clonar o repositório:
  ```bash
  $ git clone https://github.com/DanMarqss/Gestao-de-Animais
  ```

<br>

- Passo 2: Configurar e iniciar a API Spring Boot (backend)

  - Passo 2.1: Entrar no arquivo application.properties:
  ```bash
  $ vi ProjetoPOO\gestaodeanimais\src\main\resources\application-dev.properties
  ```

  - Passo 2.2: Configurar as credenciais de banco de dados de acordo com sua instalação do MySQL Server:
  ```proprieties
  # Database config
  spring.datasource.url=jdbc:mysql://localhost:3306/todosimple?createDatabaseIfNotExist=true
  spring.datasource.username=root
  spring.datasource.password=root
  ```

  - Passo 2.3: Voltar para a pasta raíz do projeto:
  ```bash
  $ cd ProjetoPOO\gestaodeanimais
  ```

  - Passo 2.4: Iniciar a aplicação Spring Boot:
  ```bash
  $ mvn clean install
  ```
  
    - Passo 2.4.1: Iniciar a aplicação Spring Boot utilizando o Maven:
  ```bash
  $ mvn spring-boot:run
  ```

  - API estará rodando em http://localhost:8080/

---

## 🔗 Links do projeto

- [Playlist do Youtube com vídeos do curso](https://www.youtube.com/watch?v=YcO-Q6yozmU&list=PLiXotHlANc8ptwP6wajo73OZo9Nh5i597)
- [Documento de ferramentas e configuração de ambiente](docs/Ferramentas%20e%20configura%C3%A7%C3%A3o%20do%20ambiente.pdf)

---
