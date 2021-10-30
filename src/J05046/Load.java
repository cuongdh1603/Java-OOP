/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05046;

import java.util.StringTokenizer;

/**
 *
 * @author Cuong
 */
public class Load {
    String ID,ten;
    long soLuong;
    double donGia,chietKhau,tien,tong;

    public Load(int stt, String ten, long soLuong, double donGia) {
        this.ID = getID(ten) + String.format("%02d", stt);
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.tong = soLuong*donGia;
        if(soLuong>10) chietKhau = tong * 0.05;
        else if(soLuong>=8) chietKhau = tong * 0.02;
        else if(soLuong>=5) chietKhau = tong * 0.01;
        else chietKhau = 0;
        this.tien = this.tong - chietKhau;
    }
    public static String getID(String s){
        String rs = "";
        StringTokenizer token = new StringTokenizer(s.toUpperCase());
        while(token.hasMoreTokens()){
            rs += token.nextToken().charAt(0);
        }
        return rs.substring(0,rs.length()-1);
    }

    @Override
    public String toString() {
        return ID+" "+ten+" "+String.format("%.0f %.0f", chietKhau,tien);
    }
    
}
