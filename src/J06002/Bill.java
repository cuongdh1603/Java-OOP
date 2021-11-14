/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06002;

/**
 *
 * @author Cuong
 */
public class Bill implements Comparable<Bill>{
    String ID;
    Product product;
    int quantity,type;
    long price,fPrice,salePrice = 0,lPrice;

    public Bill(String ID, int numID, Product product, int quantity) {
        this.ID = ID + String.format("-%03d",numID);
        this.product = product;
        type = Integer.valueOf(ID.substring(2,3));
        this.quantity = quantity;
        if(type==1) price = product.pr1;
        else price = product.pr2;
        fPrice = quantity * price;
        if(quantity >= 150) salePrice = fPrice/2;
        else if(quantity >= 100) salePrice = fPrice*3/10;
        else if(quantity >= 50) salePrice = fPrice*15/100;
        lPrice = fPrice - salePrice;
    }

    @Override
    public String toString() {
        return ID + " " + product.name + " " + salePrice +" "+ lPrice; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Bill o) {
        if(this.lPrice < o.lPrice) return 1;
        else return -1;
    }
    
}
