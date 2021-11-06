/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05081;

/**
 *
 * @author Cuong
 */
public class Product implements Comparable<Product>{
    String ID,name,unit;
    long buyPrice,sellPrice,profit;

    public Product(int ID, String name, String unit, long buyPrice, long sellPrice) {
        this.ID = String.format("MH%03d", ID);
        this.name = name;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.profit = sellPrice - buyPrice;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + unit + " "+ buyPrice + " " + sellPrice+" "+profit;
    }

    @Override
    public int compareTo(Product o) {
        if(this.profit<o.profit) return 1;
        else if (this.profit>o.profit) return -1;
        else return this.ID.compareTo(o.ID);
    }
    
}
