/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07020;

/**
 *
 * @author Cuong
 */
public class Bill {
    String ID;
    Customer customer;
    Product product;
    long quantity;

    public Bill(int ID, Customer customer, Product product, long quantity) {
        this.ID = String.format("HD%03d", ID);
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return ID +" "+ customer.name +" "+ customer.address +" "+product.name + " " + product.unit+" " + product.buyPrice + " " + product.sellPrice + " " +quantity + " " + product.sellPrice*quantity;
    }
    
}
