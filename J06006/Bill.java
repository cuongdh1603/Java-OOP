/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06006;
import java.util.Comparator;
/**
 *
 * @author Cuong
 */
public class Bill {

    String ID;
    Customer cm;
    Product pd;
    long amount;
    long profit;

    public Bill(int num_id, Customer cm, Product pd, long amount) {
        String str_id = String.valueOf(num_id);
        while (str_id.length() < 3) {
            str_id = '0' + str_id;
        }
        this.ID = "HD" + str_id;
        this.cm = cm;
        this.pd = pd;
        this.amount = amount;
        this.profit = (this.pd.sellPrice - this.pd.buyPrice) * amount;
    }

    @Override
    public String toString() {
        return this.ID + " " + this.cm.name + " " + this.cm.address + " " + this.pd.name + " "
                + this.amount + " " + (this.pd.sellPrice * this.amount) + " " + this.profit;
    }
}

class compareByProfit implements Comparator<Bill> {
    @Override
    public int compare(Bill o1, Bill o2) {
        if (o1.profit <= o2.profit) return 1;
        else return -1;
    }
}
