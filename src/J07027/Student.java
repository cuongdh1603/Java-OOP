/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07027;

/**
 *
 * @author Cuong
 */
public class Student implements Comparable<Student>{
    String ID,name,phoneNum;
    Homework homework;

    public Student(String ID, String name, String phoneNum) {
        this.ID = ID;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + phoneNum + " " + homework.ID + " " + homework.name;
    }

    @Override
    public int compareTo(Student o) {
        return this.ID.compareTo(o.ID);
    }
    
    
}
