/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Predicate.Versao02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author demi
 */
public class Expressividade {
    
    public static void main(String[] args) {
        // =======================================================
        // Para somar números de uma lista: 
        List<Integer> numeros = new ArrayList<>();
        numeros.add(12);
        numeros.add(34);
        numeros.add(48);
        Integer soma = 0;
        //Agora somar os números
        for(Integer i : numeros){
            soma += i;
        }
        System.out.println("Soma: "+soma);
        // =======================================================
        
        // Vs.
        
        Integer sum = numeros.stream().reduce(0, Integer::sum);
        System.out.println("Sum: "+sum);
        
        // =======================================================
    }
}
