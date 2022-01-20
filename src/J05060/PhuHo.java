/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05060;

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
public class PhuHo {
    static int i = 1;
    String ma,ten,dob,kq;
    int tuoi;
    double lt,th,ut = 0,tong;

    public PhuHo(String ten, String dob, double lt, double th) {
        ma = String.format("PH%02d", i++);
        this.ten = ten;
        this.dob = dob;
        tuoi = getAge(dob);
        this.lt = lt;
        this.th = th;
        if(lt>=8&&th>=8) ut = 1;
        else if(lt>=7.5&&th>=7.5) ut = 0.5;
        tong = (lt+th)/2 + ut;
        if(tong>10) tong = 10;
        tong = Math.round(tong);
        if(tong>=9) kq = "Xuat sac";
        else if(tong>=8) kq = "Gioi";
        else if(tong>=7) kq = "Kha";
        else if(tong>=5) kq = "Trung binh";
        else kq = "Truot";
    }
    int getAge(String dob){
        String pt = "dd/MM/yyyy";
        SimpleDateFormat form = new SimpleDateFormat(pt);
        try {
            Date d = form.parse(dob);
            Date cur_d = new Date();
            return 2021 - d.getYear() - 1900;
        } catch (ParseException ex) {
            Logger.getLogger(PhuHo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tuoi + " " + String.format("%.0f", tong) + " " + kq; //To change body of generated methods, choose Tools | Templates.
    }
    
}
