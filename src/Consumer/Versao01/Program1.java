/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consumer.Versao01;

import Consumer.util.PriceUpdate;
import entities.Product;
import Predicate.Versao03.ProductPredicate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author demi
 */
public class Program1 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList();
        
        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.0));
        
        // Intânciando 'PriceUpdate()' que está configurado para 
        // aumentar o valor do atributo 'price' em 10%
        list.forEach(new PriceUpdate());
        
        list.forEach(System.out::println);
    }
}
