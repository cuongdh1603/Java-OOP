/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05009;

/**
 *
 * @author Cuong
 */
public class ThiSinh implements Comparable<ThiSinh>{
    static int i = 1;
    int ma;
    String ten,ngSinh;
    double m1,m2,m3,tong;

    public ThiSinh(String ten, String ngSinh, double m1, double m2, double m3) {
        ma = i++;
        this.ten = ten;
        this.ngSinh = ngSinh;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        tong = m1+m2+m3;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + ngSinh + " " + tong; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.tong<o.tong) return 1;
        else if(this.tong>o.tong) return -1;
        else{
            if(this.ma>o.ma) return 1;
            else return -1;
        }
    }
    
}
