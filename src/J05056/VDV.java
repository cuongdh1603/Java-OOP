/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05056;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Cuong
 */
public class VDV {
    String ma,ten,ngaySinh,xuatPhat,denDich,thanhTichThucTe,thanhTichXepHang,tGianUuTien;
    long tGianThucTe,tGianXepHang;
    int uuTien = 0,xepLoai;
    public VDV(int ma, String ten, String ngaySinh, String xuatPhat, String denDich) {
        this.ma = String.format("VDV%02d", ma);
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.xuatPhat = xuatPhat;
        this.denDich = denDich;
        int age = getAge(ngaySinh);
        if(age>=32) uuTien = 3;
        else if(age>=25) uuTien = 2;
        else if(age>=18) uuTien = 1;
        tGianThucTe = (convertTime(denDich).getTime() - convertTime(xuatPhat).getTime())/1000;
        tGianXepHang = tGianThucTe - uuTien;
        tGianUuTien = String.format("%02d:%02d:%02d",uuTien/3600,(uuTien%3600)/60,uuTien%60);
        thanhTichThucTe = String.format("%02d:%02d:%02d",tGianThucTe/3600,(tGianThucTe%3600)/60,tGianThucTe%60);
        thanhTichXepHang = String.format("%02d:%02d:%02d",tGianXepHang/3600,(tGianXepHang%3600)/60,tGianXepHang%60);
    }
    public Date convertTime(String time){
        String pattern = "hh:mm:ss";
        SimpleDateFormat form = new SimpleDateFormat(pattern);
        try {
            Date d = form.parse(time);
            return d;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public int getAge(String date){
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat form = new SimpleDateFormat(pattern);
        try {
            Date d = form.parse(date);
            return 2021 - d.getYear() - 1900;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + thanhTichThucTe + " " + tGianUuTien + " " + thanhTichXepHang + " " + xepLoai; //To change body of generated methods, choose Tools | Templates.
    }
}
class sortByXepHang implements Comparator<VDV>{

    @Override
    public int compare(VDV o1, VDV o2) {
        if(o1.xepLoai>o2.xepLoai) return 1; //To change body of generated methods, choose Tools | Templates.
        else return -1;
    }
    
}
class sortByThanhTich implements Comparator<VDV>{

    @Override
    public int compare(VDV o1, VDV o2) {
        if(o1.tGianXepHang>o2.tGianXepHang) return 1;
        else return -1;
    }
    
}