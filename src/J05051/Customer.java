/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05051;

/**
 *
 * @author Cuong
 */
public class Customer implements Comparable<Customer>{
    String ID;
    String loai;
    long thanhTien,heSo,phuTroi = 0,tong;
    public Customer(int ID,String loai,long cu,long moi){
        this.ID = String.format("KH%02d", ID);
        this.loai = loai;
        if(loai.equals("KD")) heSo = 3;
        else if(loai.equals("NN")) heSo = 5;
        else if(loai.equals("TT")) heSo = 4;
        else heSo = 2;
        long cs = moi-cu;
        thanhTien = cs*heSo*550;
        double pt = 0;
        if(cs > 100) pt = (double)thanhTien;
        else if(cs >= 50) pt = (double)thanhTien*35/100;
        this.phuTroi = (long)Math.round(pt);
        this.tong = phuTroi + thanhTien;
    }

    @Override
    public String toString() {
        return ID + " " + heSo + " " + thanhTien + " " + phuTroi + " " + tong;
    }

    @Override
    public int compareTo(Customer o) {
        if(this.tong < o.tong) return 1;
        else return -1;
    }
}
