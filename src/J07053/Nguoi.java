/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07053;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

/**
 *
 * @author Cuong
 */
public class Nguoi {
    String ma,ten,ngaySinh,xepLoai;
    int tuoi;
    double lyThuyet,thucHanh,thuong = 0,tb;

    public Nguoi(int ma, String ten, String ngaySinh,double lyThuyet,double thucHanh) {
        this.ma = String.format("PH%02d", ma);
        this.ten = getFormatName(ten);
        this.ngaySinh = ngaySinh;
        tuoi = Calendar.getInstance().get(Calendar.YEAR) - getFormatDate(ngaySinh).getYear()-1900;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
        if(lyThuyet >= 8 && thucHanh >= 8) thuong = 1;
        else if(lyThuyet >= 7.5 && thucHanh >= 7.5) thuong = 0.5;
        tb = getRound((lyThuyet + thucHanh)/2 + thuong);
        if(tb>10) tb = 10;
        if(tb>=9) xepLoai = "Xuat sac";
        else if(tb>=8) xepLoai = "Gioi";
        else if(tb>=7) xepLoai = "Kha";
        else if(tb>=5) xepLoai = "Trung binh";
        else xepLoai = "Truot";
    }
    static String getFormatName(String name){
        String rs = "";
        StringTokenizer tok = new StringTokenizer(name.toLowerCase());
        while(tok.hasMoreTokens()){
            String s = tok.nextToken();
            rs += s.substring(0,1).toUpperCase() + s.substring(1) + " ";
        }
        return rs.substring(0,rs.length()-1);
    }
    static Date getFormatDate(String date){
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        try {
            Date d = format.parse(date);
            return d;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    static int getRound(double x){
        int n = (int)x;
        if(x-n>=0.5) return n+1;
        else return n;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tuoi + " " + String.format("%.0f", tb) + " " + xepLoai;
    }
    
}
