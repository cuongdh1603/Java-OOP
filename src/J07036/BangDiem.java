/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07036;

/**
 *
 * @author Cuong
 */
public class BangDiem implements Comparable<BangDiem>{
    public SinhVien sinhVien;
    public MonHoc monHoc;
    String maSV,maMH;
    double diem;

    public BangDiem(String maSV, String maMH, double diem) {
        this.maSV = maSV;
        this.maMH = maMH;
        this.diem = diem;
    }

    @Override
    public int compareTo(BangDiem o) {
        if(this.maMH.compareTo(o.maMH) > 0) return 1;
        else if(this.maMH.compareTo(o.maMH) < 0) return -1;
        else return this.maSV.compareTo(o.maSV);
    }

    @Override
    public String toString() {
        int n = (int)diem;
        if(n-diem==0)
            return maSV+ " " + sinhVien.ten + " " + maMH + " " + monHoc.ten + " " + n; //To change body of generated methods, choose Tools | Templates.
        else
            return maSV+ " " + sinhVien.ten + " " + maMH + " " + monHoc.ten + " " + diem;
    }
    
}
