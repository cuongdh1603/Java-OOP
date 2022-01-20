/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07060;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cuong
 */
public class LichThi implements Comparable<LichThi>{
    String maCT,maMH,nhom,soSV;
    MonThi monThi;
    CaThi caThi;
    Date tg;

    public LichThi(String maCT, String maMH, CaThi caThi, MonThi monThi,String nhom, String soSV) {
        this.maCT = maCT;
        this.maMH = maMH;
        this.monThi = monThi;
        this.caThi = caThi;
        this.nhom = nhom;
        this.soSV = soSV;
        tg = getDate(caThi.ngay, caThi.gio);
    }
    static Date getDate(String ngay,String gio){
        String pt1 = "dd/MM/yyyy";
        String pt2 = "hh:mm";
        SimpleDateFormat form1 = new SimpleDateFormat(pt1);
        SimpleDateFormat form2 = new SimpleDateFormat(pt2);
        Date d = new Date();
        try {
            Date d1 = form1.parse(ngay);
            Date d2 = form2.parse(gio);
            d.setDate(d1.getDate());
            d.setMonth(d1.getMonth());
            d.setYear(d1.getYear());
            d.setHours(d2.getHours());
            d.setMinutes(d2.getMinutes());
            return d;
        } catch (ParseException ex) {
            Logger.getLogger(LichThi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }

    @Override
    public String toString() {
        return caThi.ngay + " " + caThi.gio + " " + caThi.phong + " " + monThi.ten + " " + nhom + " " + soSV; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(LichThi o) {
        if(this.tg.after(o.tg)) return 1;
        else if(this.tg.before(o.tg)) return -1;
        else return this.maCT.compareTo(o.maCT);
    }
    
}
