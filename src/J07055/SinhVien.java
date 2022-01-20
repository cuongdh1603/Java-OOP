/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07055;

import java.util.StringTokenizer;

/**
 *
 * @author Cuong
 */
public class SinhVien implements Comparable<SinhVien>{
    String ma,ten,loai;
    double m1,m2,m3,tb;
    public SinhVien(int ma, String ten, double m1, double m2, double m3) {
        this.ma = String.format("SV%02d", ma);
        this.ten = formatName(ten);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        tb = m1*0.25 + m2*0.35 + m3*0.4;
        if(tb>=8) loai="GIOI";
        else if(tb>=6.5) loai="KHA";
        else if(tb>=5) loai="TRUNG BINH";
        else loai="KEM";
    }
    static String formatName(String name){
        String rs = "";
        StringTokenizer tok = new StringTokenizer(name.toLowerCase());
        while(tok.hasMoreTokens()){
            String s = tok.nextToken();
            rs += s.substring(0,1).toUpperCase() + s.substring(1) + " ";
        }
        return rs.substring(0,rs.length()-1);
    } 

    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.2f", tb) + " " + loai;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.tb<o.tb) return 1;
        else return -1;
    }
    
}
