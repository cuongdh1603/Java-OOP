/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05038;

/**
 *
 * @author Cuong
 */
public class Employee {
    String ID,name,role;
    long day,salDay,salMonth,allow,bonus = 0,salary;

    public Employee(int ID, String name, long salDay, long day, String role) {
        this.ID = String.format("NV%02d", ID);
        this.name = name;
        this.role = role;
        this.day = day;
        this.salDay = salDay;
        if(role.equals("GD")) allow = 250000;
        else if(role.equals("PGD")) allow = 200000;
        else if(role.equals("TP")) allow = 180000;
        else allow = 150000;
        salMonth = day*salDay;
        if(day>=25) bonus = salMonth/5;
        else if(day>=22) bonus = salMonth/10;
        salary = salMonth + allow + bonus;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + salMonth + " " + bonus + " " + allow + " " + salary;
    }
    
}
