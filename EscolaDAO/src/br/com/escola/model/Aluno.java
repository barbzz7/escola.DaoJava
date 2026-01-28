/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.escola.model;

/**
 *
 * @author ERICARODRIGUESBARBOS
 */
//Responsabilidade; representar os dados da tabela alunos
public class Aluno {

    private int id;
    private String nome;

    // Construtor vazio
    public Aluno() {
    }

    // Novo aluno (sem id)
    public Aluno(String nome) {
        this.nome = nome;
    }

    // Aluno vindo do banco (com id)
    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}