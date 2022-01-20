/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07025;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cuong
 */
public class Khach implements Comparable<Khach>{
    static int i = 1;
    String ma,ten,gt,ngSinh,diaChi;
    Date dob;

    public Khach(String ten, String gt, String ngSinh, String diaChi) {
        this.ma = String.format("KH%03d", i++);
        this.ten = formatName(ten);
        this.gt = gt;
        this.ngSinh = formatDOB(ngSinh);
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gt + " " + diaChi + " " + ngSinh; //To change body of generated methods, choose Tools | Templates.
    }
    String formatDOB(String ten){
        String pt = "dd/MM/yyyy";
        SimpleDateFormat form = new SimpleDateFormat(pt);
        try {
            dob = form.parse(ten);
            return form.format(dob);
        } catch (ParseException ex) {
            Logger.getLogger(Khach.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    String formatName(String ten){
        String rs = "";
        StringTokenizer tok = new StringTokenizer(ten.toLowerCase());
        while(tok.hasMoreTokens()){
            String s = tok.nextToken();
            rs += s.substring(0,1).toUpperCase() + s.substring(1) + " ";
        }
        return rs.substring(0,rs.length()-1);
    }

    @Override
    public int compareTo(Khach o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(this.dob.after(o.dob)) return 1;
        else return -1;
    }
}
