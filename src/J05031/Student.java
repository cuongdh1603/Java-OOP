/* BẢNG ĐIỂM THÀNH PHẦN - 2
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05031;

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
        // TODO Auto-generated method stub
        return MaSV + " " + hoTen + " " + lop + " " + String.format("%.1f", d1) + " " + String.format("%.1f", d2) + " " + String.format("%.1f", d3);
    }

    public String getMaSV() {
        return MaSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}

class compareByMaSV implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getHoTen().compareTo(o2.getHoTen());
    }

}
/*
3
B20DCCN999
Nguyen Van Nam
D20CQCN04-B
10.0
9.0
8.0
B20DCAT001
Le Van An
D20CQAT02-B
6.0
6.0
4.0
B20DCCN111
Nguyen Van Binh
D20CQCN01-B
9.0
5.0
6.0
*/
