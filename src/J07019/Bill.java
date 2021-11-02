/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07019;

/**
 *
 * @author Cuong
 */
public class Bill {
    String ID;
    Product product;
    long quantity,originPrice,salePrice = 0,price;

    public Bill(String ID, int numID, Product product, long quantity) {
        this.ID = ID + String.format("-%03d", numID);
        this.product = product;
        this.quantity = quantity;
        int type = Integer.valueOf(ID.substring(2));
        if(type==1) this.originPrice = quantity * product.price1;
        else this.originPrice = quantity * product.price2;
        if(quantity >= 150) salePrice = this.originPrice / 2;
        else if(quantity >= 100) salePrice = this.originPrice * 3 / 10;
        else if(quantity >= 50) salePrice = this.originPrice * 15 / 100;
        this.price = this.originPrice - salePrice;
    }

    @Override
    public String toString() {
        return ID + " " + product.name + " " + this.salePrice + " " + this.price;
    }
    
}
