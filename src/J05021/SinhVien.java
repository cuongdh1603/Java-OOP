/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05021;

import java.util.Comparator;

/**
 *
 * @author Cuong
 */
public class SinhVien {
    String ID;
    String name;
    String classroom;
    String email;
    public SinhVien(String ID, String name, String classroom, String email) {
        this.ID = ID;
        this.name = name;
        this.classroom = classroom;
        this.email = email;
    }
    @Override
    public String toString() {
        return this.ID+" "+this.name+" "+this.classroom+" "+this.email;
    } 
}
class CompareByID implements Comparator<SinhVien>{
    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        return o1.ID.compareTo(o2.ID);
    }
}