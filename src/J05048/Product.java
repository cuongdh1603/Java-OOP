/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05048;

/**
 *
 * @author Cuong
 */
public class Product {
    String ID;
    long luongNhap,luongXuat,donGia,tien,thue;

    public Product(String ID, double luongNhap) {
        this.ID = ID;
        this.luongNhap = (long)luongNhap;
        double lx = 0;
        if(ID.charAt(0)=='A') lx = luongNhap * 0.6;
        else if(ID.charAt(0)=='B') lx = luongNhap * 0.7;
        this.luongXuat = (long)Math.round(lx);
        if(ID.charAt(4)=='Y') donGia = 110000;
        else if(ID.charAt(4)=='N') donGia = 135000;
        tien = luongXuat * donGia;
        if(ID.charAt(0)=='A'&&ID.charAt(4)=='Y') thue = 8 * tien / 100;
        else if(ID.charAt(0)=='A'&&ID.charAt(4)=='N') thue = 11 * tien / 100;
        else if(ID.charAt(0)=='B'&&ID.charAt(4)=='Y') thue = 17 * tien / 100;
        else if(ID.charAt(0)=='B'&&ID.charAt(4)=='N') thue = 22 * tien / 100;
    }

    @Override
    public String toString() {
        return ID + " " + luongNhap + " " + luongXuat + " " + donGia + " " + tien + " " + thue;
    }
    
}
