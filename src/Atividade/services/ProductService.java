/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade.services;

import entities.Product;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author demi
 */
public class ProductService {
    public double filteredSum(List<Product> list, Predicate<Product> criteria 
    ){
        double sum = 0;
        for(Product p : list){
            if(criteria.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
