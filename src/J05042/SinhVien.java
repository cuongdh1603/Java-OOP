/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05042;

/**
 *
 * @author Cuong
 */
public class SinhVien implements Comparable<SinhVien>{
    String ten;
    long lamDung,daNop;

    public SinhVien(String ten, long lamDung, long daNop) {
        this.ten = ten;
        this.lamDung = lamDung;
        this.daNop = daNop;
    }

    @Override
    public String toString() {
        return ten+" "+lamDung+" "+daNop; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int compareTo(SinhVien o) {
        if(this.lamDung<o.lamDung) return 1;
        else if(this.lamDung>o.lamDung) return -1;
        else{
            if(this.daNop>o.daNop) return 1;
            else if(this.daNop<o.daNop) return -1;
            else return this.ten.compareTo(o.ten);
        }
    }
    
}
