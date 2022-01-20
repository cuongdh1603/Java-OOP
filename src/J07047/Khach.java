/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07047;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cuong
 */
public class Khach implements Comparable<Khach>{
    String ma,ten,maPhong,ngDen,ngDi;
    long soNgay;
    double tienTra;
    public Phong phong;
    static int i = 1;
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Khach(String ten, String maPhong, String ngDen, String ngDi) {
        this.ma = String.format("KH%02d", i++);
        this.ten = ten;
        this.maPhong = maPhong;
        this.ngDen = ngDen;
        this.ngDi = ngDi;
        this.soNgay = LocalDate.parse(ngDen,format).until(LocalDate.parse(ngDi, format), ChronoUnit.DAYS);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + maPhong + " " + soNgay + " " + String.format("%.2f", tienTra); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Khach o) {
        if(this.soNgay < o.soNgay) return 1;
        else return -1;
    }
    
}
