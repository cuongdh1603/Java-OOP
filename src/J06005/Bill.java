/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06005;

/**
 *
 * @author Cuong
 */
public class Bill {
    String ID;
    Customer cm;
    Product pd;
    int amount;
    static int i = 1;
    public Bill(Customer cm, Product pd, int amount) {
        this.ID = String.format("HD%03d", i++);
        this.cm = cm;
        this.pd = pd;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return this.ID + " " + this.cm.name + " " + this.cm.address + " " + this.pd.name + " " + this.pd.unit + " " + this.pd.buyPrice + " " + this.pd.sellPrice + " " + this.amount + " " + (this.pd.sellPrice * this.amount);
    }
}
