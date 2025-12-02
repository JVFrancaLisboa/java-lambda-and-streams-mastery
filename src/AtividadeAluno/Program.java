/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadeAluno;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author demi
 */
public class Program {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Clara", 3.75));
        alunos.add(new Aluno("Jorel", 4.78));
        alunos.add(new Aluno("Thiago", 5.80));
        alunos.add(new Aluno("honiel", 7.90));
         
        AlunoService as = new AlunoService();
        
        List<String> nomeAlunosAprovados = as.statusDosAlunos(alunos, a -> a.getNotaMedia() > 5);
        
        nomeAlunosAprovados.forEach(System.out::println);
    }
}
