/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Predicate.Versao02;

import java.util.ArrayList;
import java.util.List;
import entities.Product;

/**
 *
 * @author demi
 */
public class Program {
    
    public static int compareProducts(Product p1, Product p2){
        return p1.getPrice().compareTo(p2.getPrice());
    }
    
    public static void main(String[] args) {
        List<Product> list = new ArrayList();
        
        list.add(new Product("TV", 900.0));
        list.add(new Product("Notbook", 1200.0));
        list.add(new Product("Tablet", 450.0));
        // No método sort recebemos no parâmetro o nome da classe mais o método statico
        list.sort(Program::compareProducts);
    }
}
