/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05012;

import java.util.Comparator;

/**
 *
 * @author Cuong
 */
public class Bill {
    String ID;
    String name;
    int quantity;
    long price;
    long discount;
    long totalPrice;

    public Bill(String ID, String name, int quantity, long price, long discount) {
        this.ID = ID;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
        this.totalPrice = quantity*price-discount;
    }
    @Override
    public String toString() {
        return this.ID+" "+this.name+" "+this.quantity+" "+this.price+" "+
                this.discount+" "+this.totalPrice;
    }
}
class CompareByTotalPrice implements Comparator<Bill>{

    @Override
    public int compare(Bill o1, Bill o2) {
         if(o1.totalPrice<o2.totalPrice) return 1;
         else return -1;
    }
    
}
