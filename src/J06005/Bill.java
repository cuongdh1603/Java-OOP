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
    public Bill(int num_id, Customer cm, Product pd, int amount) {
        String str_id = String.valueOf(num_id);
        while (str_id.length() < 3) {
            str_id = '0' + str_id;
        }
        this.ID = "HD" + str_id;
        this.cm = cm;
        this.pd = pd;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return this.ID + " " + this.cm.name + " " + this.cm.address + " " + this.pd.name + " " + this.pd.unit + " " + this.pd.buyPrice + " " + this.pd.sellPrice + " " + this.amount + " " + (this.pd.sellPrice * this.amount);
    }
}
