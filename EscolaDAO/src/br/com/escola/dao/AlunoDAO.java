/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.escola.dao;

import br.com.escola.config.ConnectionFactory;
import br.com.escola.model.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ERICARODRIGUESBARBOS
 */
//responabilidades SQL+CRUD

public class AlunoDAO {
 // CREATE: inserir o aluno no baco
    public void cadastrar(Aluno aluno){
        // SQL com  ? (parâmetro) para evitar SQL injection
        String sql = "INSERT INTO alunos (nome) VALUES (?)";
        // tratamento de possíveis erros | no caso fecha automaticamente a conexão e  o statement
        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Troca o ? pelo nome do aluno
            stmt.setString(1, aluno.getNome());
            // Executa o INSERT (podemos utilizar o executeUpdate para INSRT/UPDATE/DELETE)
            stmt.executeUpdate();
            
        } catch (Exception e) {
            // Se der erro, mostramos uma mensagem clara
            throw new RuntimeException ("Erro ao cadastrar aluno", e);
        }
        
    }
    // READ: listar todos 
    public List<Aluno> listar(){
        // SQL para buscar todos
        String sql = "SELECT id, nome FROM alunos";
        
        // Lista que vamos devolver preenchida
        List<Aluno> alunos = new ArrayList<>();
        try(Connection conn = ConnectionFactory.getConnection();
           PreparedStatement stmt = conn.prepareStatement(sql);
           ResultSet rs = stmt.executeQuery()) {
            // Enquanto tiver linha no resultado
            while(rs.next()) {
                // Pega os dados da linha atual
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                
                // Monta um objeto Aluno com os dados
                Aluno aluno = new Aluno(id, nome);
                
                // Adiciona na lista
                alunos.add(aluno);
            }
            
        } catch (Exception e) {
            throw new RuntimeException( "Erro ao listar alunos", e);
             
        }
        // Devolve a lista pronta
        return alunos;
    }
    
}
