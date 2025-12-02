/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consumer.Versao03;

import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author demi
 */
public class Program3 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList();
        
        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.0));
        
        double factor = 1.1; // 10%
        
        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * factor);
        };
        
        // rodando o consumer na lista de produtos
        list.forEach(cons);
        
        list.forEach(System.out::println);
    }
}
