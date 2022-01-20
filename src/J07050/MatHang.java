/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07050;

/**
 *
 * @author Cuong
 */
public class MatHang implements Comparable<MatHang>{
    String ma,ten,nhom;
    double mua,ban,lai;

    public MatHang(int ma, String ten, String nhom, double mua, double ban) {
        this.ma = String.format("MH%02d", ma);
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
        this.lai = ban-mua;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", lai);
    }

    @Override
    public int compareTo(MatHang o) {
        if(this.lai < o.lai) return 1;
        else return -1;
    }
    
}
