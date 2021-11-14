/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05047;

import java.util.StringTokenizer;

/**
 *
 * @author Cuong
 */
public class Product implements Comparable<Product>{
    String ID;
    String name;
    int soLuong;
    long donGia,chietKhau = 0,thanhTien;

    public Product(int ID, String name, int soLuong, long donGia) {
        this.ID = getID(name)+String.format("%02d", ID);
        this.name = name;
        this.soLuong = soLuong;
        this.donGia = donGia;
        if(soLuong>10) chietKhau = donGia*soLuong/20;
        else if(soLuong>=8) chietKhau = donGia*soLuong/50;
        else if(soLuong>=5) chietKhau = donGia*soLuong/100;
        thanhTien = donGia*soLuong - chietKhau;
    }
    static String getID(String name){
        StringTokenizer tok = new StringTokenizer(name.toUpperCase());
        String ID = "";
        while(ID.length()<2)
            ID += tok.nextToken().substring(0,1);
        return ID;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + chietKhau + " " + thanhTien;
    }

    @Override
    public int compareTo(Product o) {
        if(this.chietKhau<o.chietKhau) return 1;
        else return -1;
    }
    
}
