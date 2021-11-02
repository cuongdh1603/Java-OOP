/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07020;

/**
 *
 * @author Cuong
 */
public class Product {
    String ID,name,unit;
    long buyPrice,sellPrice;

    public Product(int ID, String name, String unit, long buyPrice, long sellPrice) {
        this.ID = String.format("MH%03d", ID);
        this.name = name;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
    
}
