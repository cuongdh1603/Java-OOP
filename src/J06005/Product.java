/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06005;
/**
 *
 * @author Cuong
 */
public class Product {
    String ID;
    String name;
    String unit;
    long buyPrice;
    long sellPrice;
    static int i = 1;

    public Product() {
    }
    
    public Product(String name, String unit, long buyPrice, long sellPrice) {
        this.ID = String.format("MH%03d", i++);
        this.name = name;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
}
