/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.escola.app;
import br.com.escola.model.Aluno;
import br.com.escola.dao.AlunoDAO;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author ERICARODRIGUESBARBOS
 */
//responsabilidade; uasar o dao e receber dados do usuario 
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    AlunoDAO dao = new AlunoDAO();

    System.out.print("Quantos alunos deseja cadastrar? ");
    int quantidade = scanner.nextInt();
    scanner.nextLine(); // consome o ENTER

    for (int i = 1; i <= quantidade; i++) {
        System.out.print("Digite o nome do aluno " + i + ": ");
        String nome = scanner.nextLine();

        dao.cadastrar(new Aluno(nome));
    }

    System.out.println("\n=== ALUNOS CADASTRADOS ===");
    dao.listar().forEach(aluno ->
            System.out.println(aluno.getId() + " - " + aluno.getNome())
    );

    scanner.close();
}}