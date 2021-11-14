/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vao_ra_file.J07037;

/**
 *
 * @author Cuong
 */
public class Company implements Comparable<Company>{
    String ID,name;
    int numSv;

    public Company(String ID, String name, int numSv) {
        this.ID = ID;
        this.name = name;
        this.numSv = numSv;
    }

    @Override
    public int compareTo(Company o) {
        return this.ID.compareTo(o.ID); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return ID+" "+name+" "+numSv;
    }
    
}
