/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function.Versao03;

import Function.util.UpperCaseName;
import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author demi
 */
public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList();
        
        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.0));
        
        List<String> listaStrings = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        
        listaStrings.forEach(System.out::println);
    }
}
