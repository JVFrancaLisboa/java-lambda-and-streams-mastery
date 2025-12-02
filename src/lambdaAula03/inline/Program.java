/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdaAula03.inline;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import entities.Product;

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
        
        list.removeIf(p -> p.getPrice() >= 100);
        
        list.forEach(System.out::println);
    }
}
