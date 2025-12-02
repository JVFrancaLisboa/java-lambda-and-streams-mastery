/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consumer.util;

import entities.Product;
import java.util.function.Consumer;

/**
 *
 * @author demi
 */
public class PriceUpdate implements Consumer<Product>{

    // Sobreescrevendo o método que aumenta o atributo 'price' em 10%
    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
