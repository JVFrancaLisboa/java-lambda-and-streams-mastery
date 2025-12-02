/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadeAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author demi
 */
public class AlunoService {
    public List<String> statusDosAlunos(List<Aluno> list, Predicate<Aluno> criterio){
        List<String> aprovados = new ArrayList<>();
        for(Aluno a : list){
            if(criterio.test(a)){
                aprovados.add(a.getNome());
            }
        }
        return aprovados;
    }
}
