/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05043;

/**
 *
 * @author Cuong
 */
public class Employee {
    String ID;
    String name;
    String position;
    double basicSal,salary,allow,advance,remain,workDay;

    public Employee(int ID, String name, String position, double basic, double days) {
        this.ID = String.format("NV%02d",ID);
        this.name = name;
        this.position = position;
        this.salary = basic*days;
        if(position.equals("GD")) this.allow = 500;
        else if(position.equals("PGD")) this.allow = 400;
        else if(position.equals("TP")) this.allow = 300;
        else if(position.equals("KT")) this.allow = 250;
        else this.allow = 100;
        if((this.allow + this.salary)*2/3 < 25000) this.advance = makeRound((this.allow + this.salary)*2/3);
        else this.advance = 25000;
        this.remain = this.salary - this.advance + this.allow;
    }
    static long makeRound(double n){
        return (long)Math.round((n)/1000)*1000;
    }
    @Override
    public String toString() {
        return ID + " " + name + " " + String.format("%.0f %.0f %.0f %.0f",this.allow,this.salary,this.advance,this.remain);
    }
    
}
