/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author demi
 */
public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    
    public Product(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100.0;
    }
    
    public boolean nonStaticProductPredicate(){
        return price >= 100.0;
    }

    public static void staticPriceUpdate(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }
    
    public void nonStaticPriceUpdate(){
        price = price * 1.1;
    }
    
    @Override
    public String toString() {
        return "Product [name="+name+", price="+price+"]";
    }
}
