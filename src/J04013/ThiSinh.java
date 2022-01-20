/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04013;

/**
 *
 * @author Cuong
 */
public class ThiSinh {
    String ma,ten,kq;
    double m1,m2,m3,ut,tong;

    public ThiSinh(String ma, String ten, double m1, double m2, double m3) {
        this.ma = ma;
        this.ten = ten;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        if(ma.charAt(2)=='1') ut = 0.5;
        else if(ma.charAt(2)=='2') ut = 1;
        else if(ma.charAt(2)=='3') ut = 2.5;
        tong = m1*2+m2+m3+ut;
        if(tong < 24) kq = "TRUOT";
        else kq = "TRUNG TUYEN";
    }

    @Override
    public String toString() {
        return ma + " " + ten+ " " + (isRound(ut)?String.format("%.0f", ut):ut) + " " + (isRound(tong-ut)?String.format("%.0f", tong-ut):tong-ut) + " " + kq; //To change body of generated methods, choose Tools | Templates.
    }
    boolean isRound(double x){
        return (int)x - x == 0;
    }
    
}
