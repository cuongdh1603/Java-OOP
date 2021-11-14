/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vao_ra_file.J07034;

/**
 *
 * @author Cuong
 */
public class Subject implements Comparable<Subject>{
    String ID,name;
    int credit;

    public Subject(String ID, String name, int credit) {
        this.ID = ID;
        this.name = name;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return ID+" "+name+" "+credit; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Subject o) {
        return this.name.compareTo(o.name); //To change body of generated methods, choose Tools | Templates.
    }
    
}
