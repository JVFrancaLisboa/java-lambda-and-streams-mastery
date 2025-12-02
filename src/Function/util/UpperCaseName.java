/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function.util;

import entities.Product;
import java.util.function.Function;

/**
 *
 * @author demi
 */
public class UpperCaseName implements Function<Product, String>{

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
    
}
