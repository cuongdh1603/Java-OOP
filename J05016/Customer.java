/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05016;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Cuong
 */
public class Customer {
    String ID;
    String name;
    String room;
    String checkinDate;
    String checkoutDate;
    long time;
    long cost = 0;
    long incurredCost;
    long totalCost;
    public Customer(int num_id, String name, String room, String checkinDate, 
            String checkoutDate, long incurredCost) {
        String str_id = String.valueOf(num_id);
        if(str_id.length()<2) str_id = '0' + str_id;
        this.ID = "KH"+str_id;
        this.name = name;
        this.room = room;
        char floor = room.charAt(0);
        if(floor=='1') this.cost = 25;
        else if(floor=='2') this.cost = 34;
        else if(floor=='3') this.cost = 50;
        else if(floor=='4') this.cost = 80; 
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        Date date1;
        try {
            date1 = dateFormat.parse(checkinDate);
            Date date2 = dateFormat.parse(checkoutDate);
            this.time = (date2.getTime() - date1.getTime())/(3600000*24)+1;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        this.incurredCost = incurredCost;
        this.totalCost = this.time*this.cost + this.incurredCost;
    }
    @Override
    public String toString() {
        return this.ID+" "+this.name+" "+this.room+" "+this.time+" "+this.totalCost;
    }   
}
class compareByTotalCost implements Comparator<Customer>{
    @Override
    public int compare(Customer o1, Customer o2) {
        if(o1.totalCost<o2.totalCost) return 1;
        else return -1;
    }
}