/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07059;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cuong
 */
public class CaThi implements Comparable<CaThi>{
    String ma,ngayThi,gioThi,phongThi;
    Date tg;

    public CaThi(int ma, String ngayThi, String gioThi, String phongThi) {
        this.ma = String.format("C%03d", ma);
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.phongThi = phongThi;
        this.tg = convertDate(ngayThi, gioThi);
    }
    static Date convertDate(String date,String hour){
        String pattern1 = "dd/MM/yyyy";
        String pattern2 = "hh:mm";
        SimpleDateFormat form1 = new SimpleDateFormat(pattern1);
        SimpleDateFormat form2 = new SimpleDateFormat(pattern2);
        Date d = new Date();
        try {
            Date d1 = form1.parse(date);
            Date d2 = form2.parse(hour);
            d.setYear(d1.getYear());
            d.setMonth(d1.getMonth());
            d.setDate(d1.getDate());
            d.setHours(d2.getHours());
            d.setMinutes(d2.getMinutes());
            return d;
        } catch (ParseException ex) {
            Logger.getLogger(CaThi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }

    @Override
    public int compareTo(CaThi o) {
        if(this.tg.after(o.tg)) return 1;
        else if(this.tg.before(o.tg)) return -1;
        else return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ngayThi + " " + gioThi + " " + phongThi;
    }
    
}
