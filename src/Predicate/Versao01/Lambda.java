/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Predicate.Versao01;

import entities.Product;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author demi
 */
public class Lambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Product> list = new ArrayList();
        
        list.add(new Product("TV", 900.0));
        list.add(new Product("Notbook", 1200.0));
        list.add(new Product("Tablet", 450.0));
                
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        
        for(Product p : list){
            System.out.println(p);
        }
    } 
}
