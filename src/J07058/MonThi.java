/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07058;

/**
 *
 * @author Cuong
 */
public class MonThi implements Comparable<MonThi>{
    String ma,ten,hinhThuc;

    public MonThi(String ma, String ten, String hinhThuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + hinhThuc; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(MonThi o) {
        return this.ma.compareTo(o.ma);
    }
    
}
