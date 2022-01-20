/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07035;

/**
 *
 * @author Cuong
 */
public class BangDiem implements Comparable<BangDiem>{
    String maMH,maSV;
    double diem;
    public SinhVien sinhVien;

    public BangDiem(String maSV, String maMH, double diem) {
        this.maMH = maMH;
        this.maSV = maSV;
        this.diem = diem;
    }

    @Override
    public int compareTo(BangDiem o) {
        if(this.diem < o.diem) return 1;
        else if(this.diem > o.diem) return -1;
        else return this.maSV.compareTo(o.maSV);
    }

    @Override
    public String toString() {
        int n = (int)diem;
        if(n-diem==0)
            return maSV + " " + sinhVien.ten + " " + sinhVien.lop + " " + n; //To change body of generated methods, choose Tools | Templates.
        else
            return maSV + " " + sinhVien.ten + " " + sinhVien.lop + " " + diem;
    }
    
}
