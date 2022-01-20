/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07049;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cuong
 */
public class Khach implements Comparable<Khach>{
    String ma,ten,diaChi,maSP,ngayMua,hanSD;
    long soLuong,soTien;
    Hang hang;
    Date hetHan;
    static int i = 1;

    public Khach(String ten, String diaChi, String maSP, Hang hang, long soLuong, String ngayMua) {
        this.ma = String.format("KH%02d", i++);
        this.ten = ten;
        this.diaChi = diaChi;
        this.maSP = maSP;
        this.hang = hang;
        this.ngayMua = ngayMua;
        this.soLuong = soLuong;
        this.hanSD = getHan(ngayMua, this.hang.thoiHan);
        this.soTien = this.hang.gia * soLuong;
    }
    static String getHan(String ngayMua,int han){
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat form = new SimpleDateFormat(pattern);
        try {
            Date d = form.parse(ngayMua);
            Calendar c = Calendar.getInstance();
            c.setTime(d);
            c.add(Calendar.MONTH, han);
            Date d1 = c.getTime();
            return form.format(d1);
        } catch (ParseException ex) {
            Logger.getLogger(Khach.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ngayMua;
    }
    static Date getDate(String time){
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat form = new SimpleDateFormat(pattern);
        try {
            Date d = form.parse(time);
            return d;
        } catch (ParseException ex) {
            Logger.getLogger(Khach.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Override
    public int compareTo(Khach o) {
        if(getDate(this.hanSD).after(getDate(o.hanSD))) return 1;
        else if(getDate(this.hanSD).before(getDate(o.hanSD))) return -1;
        else return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + diaChi + " " + maSP + " " + soTien + " " + hanSD; //To change body of generated methods, choose Tools | Templates.
    }
    
}
