/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05044;

/**
 *
 * @author Cuong
 */
public class Employee {
    String ID;
    String name;
    String lev;
    long days;
    double advance,salary,basycSal,allow,remain;

    public Employee(int ID, String name, String lev, long days, double basycSal) {
        this.ID = String.format("NV%02d", ID);
        this.name = name;
        this.lev = lev;
        this.days = days;
        this.basycSal = basycSal;
        this.salary = basycSal*days;
        if(lev.equals("GD")) allow = 500;
        else if(lev.equals("PGD")) allow = 400;
        else if(lev.equals("TP")) allow = 300;
        else if(lev.equals("KT")) allow = 250;
        else allow = 100;
        if((allow+salary)*2/3<25000) this.advance = makeRound((this.allow + this.salary)*2/3);
        else this.advance = 25000;
        this.remain = this.salary - this.advance + this.allow;
    }
    static long makeRound(double n){
        return (long)Math.round((n)/1000)*1000;
    }
    @Override
    public String toString() {
        return ID + " " + name + " " + String.format("%.0f %.0f %.0f %.0f",allow,salary,advance,remain);
    }
    
}
