/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consumer.Versao04;

import entities.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author demi
 */
public class Program4 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList();
        
        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.0));
        
        // Fazendo o expressão lambda direto no for each 'inline'
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
        
        list.forEach(System.out::println);
    }
}
