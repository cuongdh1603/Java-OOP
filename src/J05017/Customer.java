/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05017;

import java.util.Comparator;

/**
 *
 * @author Cuong
 */
public class Customer {
    String ID;
    String name;
    double preAmount;
    double nextAmount;
    long totalCost;

    public Customer(int num_id, String name, double preAmount, double nextAmount) {
        String str_id = String.valueOf(num_id);
        if(str_id.length()<2) str_id = '0' + str_id;
        this.ID = "KH"+str_id;
        this.name = name;
        this.preAmount = preAmount;
        this.nextAmount = nextAmount;
        double diff = nextAmount - preAmount,cost = 0;
        if(diff<=50) cost = diff*100.*1.02;
        else if(diff<=100){
            cost = 50.*100.+(diff-50)*150.;
            cost += cost*0.03; 
        }
        else{
            cost = 50.*100.+ 50.*150.+(diff-100.)*200.;
            cost += cost*0.05;
        }
        if(cost - (long)cost < 0.5) this.totalCost = (long)cost;
        else this.totalCost = (long)cost + 1;
        
    }

    @Override
    public String toString() {
        return this.ID+" "+this.name+" "+this.totalCost;
    }
}
class compareByTotalCost implements Comparator<Customer>{

    @Override
    public int compare(Customer o1, Customer o2) {
        if(o1.totalCost<o2.totalCost) return 1;
        else return -1;
    }
    
}