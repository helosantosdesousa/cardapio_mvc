# Cardápio Digital 🍽️
Projeto de um Cardápio Digital completo, com backend em Java Spring Boot e frontend em HTML, CSS e JavaScript com Bootstrap, consumindo a API para exibir os itens do cardápio de forma dinâmica.

## 📝 Funcionalidades
* Backend com Spring Boot e H2 Database para armazenar os itens do cardápio.
* API REST para listar e adicionar alimentos.
* Frontend responsivo usando Bootstrap.

## Tecnologias usadas
* Java 17+
* Spring Boot
* H2 Database
* Maven
* HTML/CSS
* Bootstrap
* JS

## ⚙️ Como rodar o projeto 
  1. Copie o repositório <br>
   ``` git clone https://github.com/helosantosdesousa/cardapio_mvc ```  
  2. Abra o projeto da pasta **```backend```** na sua IDE java
  3. Abra o projeto da pasta **```frontend```** no seu editor de código
  4. Build e rode o projeto backend (classe ```CardapioApplication.java```
     ### A API estará disponível em:
     ```http://localhost:8080/food ```
     ### O banco de dados estará disponível em:
     ```http://localhost:8080/h2-console ```
     #### Login do banco de dados:
     * username: sa
     * password: (vazia)
  5. Abra o arquivo ```index.html``` no seu navegador ou use o LiveServer do VS Code
     > Certifique-se de que o backend esteja rodando, caso contrário os alimentos não serão carregados.

## 🎥 Vídeo de referência  
Esse projeto foi feito com apoio de:
[Criando Aplicação Fullstack do Zero com Java Spring e React - Parte 1: Desenvolvimento do Backend](https://youtu.be/lUVureR5GqI?si=FxvFIAHM6mgS3_Yu)
