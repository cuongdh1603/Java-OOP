/* BẢNG ĐIỂM THÀNH PHẦN - 1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05030;
import java.util.Comparator;
/**
 *
 * @author Cuong
 */
public class Student {
    private String MaSV;
    private String hoTen;
    private String lop;
    private double d1, d2, d3;
    public Student(String maSV, String hoTen, String lop, double d1, double d2, double d3) {
        this.MaSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    @Override
    public String toString() {
        return MaSV + " " + hoTen + " " + lop + " " + String.format("%.1f", d1) + " "
                + String.format("%.1f", d2) + " " + String.format("%.1f", d3);
    }
    public String getMaSV() {
        return MaSV;
    }
}
class compareByMaSV implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMaSV().compareTo(o2.getMaSV());
    }
}
