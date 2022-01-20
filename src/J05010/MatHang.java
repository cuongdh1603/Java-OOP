/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05010;

/**
 *
 * @author Cuong
 */
public class MatHang implements Comparable<MatHang>{
    static int i = 1;
    int ma;
    String ten,nhom;
    double mua,ban,lai;

    public MatHang(String ten, String nhom, double mua, double ban) {
        ma = i++;
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
        lai = ban - mua;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", lai); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(MatHang o) {
        if(this.lai<o.lai) return 1;
        else return -1;
    }
    
}
