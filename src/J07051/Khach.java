/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07051;

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
    String ma,ten,ngayNhan,ngayTra;
    int soPhong;
    long soNgay,psinh,tien;

    public Khach(int ma, String ten,int soPhong, String ngayNhan, String ngayTra, long psinh) {
        this.ma = String.format("KH%02d", ma);
        this.ten = formatName(ten);
        this.soPhong = soPhong;
        this.ngayNhan = ngayNhan;
        this.ngayTra = ngayTra;
        this.soNgay = getLengthTime(getFormatDate(ngayNhan), getFormatDate(ngayTra));
        this.psinh = psinh;
        if(soPhong/100==1){
            tien = soNgay*25 + psinh;
        }
        else if(soPhong/100==2){
            tien = soNgay*34 + psinh;
        }
        else if(soPhong/100==3){
            tien = soNgay*50 + psinh;
        }
        else if(soPhong/100==4){
            tien = soNgay*80 + psinh;
        }
    }
    static String formatName(String name){
        String rs = "";
        StringTokenizer tok = new StringTokenizer(name.toLowerCase());
        while (tok.hasMoreTokens()) {            
            String s = tok.nextToken();
            rs += s.substring(0,1).toUpperCase() + s.substring(1)+" ";
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
            Logger.getLogger(Khach.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    static long getLengthTime(Date d1,Date d2){
        long lt1 = d1.getTime();
        long lt2 = d2.getTime();
        return (lt2-lt1)/86400000+1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soPhong + " "+ soNgay + " " + tien; 
    }

    @Override
    public int compareTo(Khach o) {
        if(this.tien<o.tien) return 1;
        else return -1;
    }
    
}
