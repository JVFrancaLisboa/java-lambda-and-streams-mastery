/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consumer.Versao02;

import Consumer.util.PriceUpdate;
import entities.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author demi
 */
public class Program2 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList();
        
        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.0));
        
        // Fazendo referência de um método estático contido em 'Product'
        list.forEach(Product::staticPriceUpdate);
        
        // Fazendo referência ao método não estático contido em 'Product'
        list.forEach(Product::nonStaticPriceUpdate);
        
        // neste caso o preço (ou price) será de 10% sobre o preço mais 10%
        list.forEach(System.out::println);
    }
}
