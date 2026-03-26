# 🍔 Sistema de Lanchonete (Java + MySQL)

Este projeto é um sistema de gerenciamento de estoque para lanchonetes, focado na prática de **Orientação a Objetos** e **Persistência de Dados** utilizando Java SE e o banco de dados MySQL via JDBC.

### 🚀 O que este projeto faz:
* **Cadastro de Produtos:** Salva nome, valor e quantidade diretamente no banco de dados.
* **Listagem em Tempo Real:** Busca todos os itens cadastrados no MySQL.
* **Atualização de Estoque:** Permite alterar a quantidade de itens de forma dinâmica.
* **Exclusão:** Remove produtos do sistema através do ID.

### 🛠️ Tecnologias e Padrões utilizados:
* **Linguagem:** Java (JDK 21)
* **Banco de Dados:** MySQL 8.0
* **Conectividade:** JDBC (Java Database Connectivity)
* **Padrão de Projeto:** DAO (Data Access Object) para separação de lógica e banco.
* **Arquitetura:** Organização em pacotes (Dominio, Persistencia, Main).

### 📋 Como rodar o projeto:
1. Clone este repositório.
2. Certifique-se de ter o driver `mysql-connector-j` adicionado às bibliotecas do seu projeto.
3. Execute o script contido no arquivo `script_banco.sql` no seu MySQL Workbench para criar a estrutura necessária.
4. Ajuste as credenciais (USER e PASS) na classe `FabricaConexao.java`.

---
*Projeto em evolução constante, acompanhando as aulas da Maratona Java (DevDojo) e Curso em Vídeo.*
