/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04015;

/**
 *
 * @author Cuong
 */
public class Teacher {
    private String id;
    private String name;
    private int level;
    private long salary;
    private long allowance;
    private long sumSalary;

    public Teacher(String id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.level = Integer.valueOf(id.substring(2,4));
        String rs = id.substring(0, 2);
        if(rs.equals("HT")) this.allowance = 2000000;
        else if(rs.equals("HP")) this.allowance = 900000;
        else this.allowance = 500000;
        this.sumSalary = this.salary*this.level + this.allowance;
    }

    @Override
    public String toString() {
        return this.id+" "+this.name+" "+this.level+" "+this.allowance+" "+this.sumSalary;
    }
    
}
