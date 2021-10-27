/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06001;
/**
 *
 * @author Cuong
 */
public class Bill {
    String ID;
    int quantity,type;
    Product product;
    double price,salePrice,expense;
    public Bill(String ID, int numID,Product product,int quantity) {
        this.ID = ID + String.format("-%03d", numID);
        this.type = Integer.valueOf(ID.substring(2,3));
        this.product = product;
        this.quantity = quantity;
        if(quantity >= 150){
            if(type==1){
                salePrice = 0.5*this.product.price1*quantity;
                expense = quantity*this.product.price1*0.5;
            }
            else {
                salePrice = 0.5*this.product.price2*quantity;
                expense = quantity*this.product.price2*0.5;
            }
        }
        else if(quantity >= 100){
            if(type==1){
                salePrice = 0.3*this.product.price1*quantity;
                expense = quantity*this.product.price1*0.7;
            }
            else {
                salePrice = 0.3*this.product.price2*quantity;
                expense = quantity*this.product.price2*0.7;
            }
        }
        else if(quantity>=50){
            if(type==1){
                salePrice = 0.15*this.product.price1*quantity;
                expense = quantity*this.product.price1*0.85;
            }
            else{
                salePrice = 0.15*this.product.price2*quantity;
                expense = quantity*this.product.price2*0.85;
            }
        }
        else{
            if(type==1) expense = quantity*this.product.price1;
            else expense = quantity*this.product.price2;
            salePrice = 0;
        }
    }

    @Override
    public String toString() {
        return ID +" "+product.name+" "+String.format("%.0f %.0f",salePrice,expense);
    }
    
}
