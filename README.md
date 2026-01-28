# Projeto Escola utilizando DAO - java + JDBC

Este projeto foi desenvolvido para demonstrar na prática como funciona a **arquitetura em camadas** utilizando **Java**, **mySql**, aplicando o padrao **DAO(Data Acess Object)**.

O sistema permite cadastrar alunos e listar alunos armazenando em um banco de dados.

---

## Objetivos do projeto

- Separtar responsabilidades no código
- Demonstrar a comunicação entre Java de Dados
- Aplicar boas praticas como:
- DAO
- Model
- Factory de conexão
- Evitar SQL injection
- Facilitar a manutenção e evolução do sistema
---

## Estrutura do projeto

<img width="264" height="233" alt="image" src="https://github.com/user-attachments/assets/78af72aa-8c6a-4e6f-aa21-9d17548ff32e" />

---

## Descrição das camadas 🖥️

- Main (app)

- Responsavel por:

  interagir com o usuário via console

  Receber dados

  Chamar o DAO para salvar e listar alunos

  Não contém SQL, apenas regras de fluxo da aplicação

  Aluno (Model)

  Representa a tabela alunos do banco de dados.

Contém:

Atríbutos(id,nome)

Construtores

Getter e Setter
