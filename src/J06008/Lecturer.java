/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06008;

import java.util.ArrayList;

/**
 *
 * @author Cuong
 */
public class Lecturer {
    String ID,name;
    ArrayList<Subject> sbj = new ArrayList<>();
    double time = 0;
    public Lecturer(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    public void addTime(double t){
        time += t;
    }
    public void addSubject(Subject sub){
        this.sbj.add(sub);
    }
//    @Override
//    public String toString() {
//        String listSubject = "";
//        for (Subject subject : sbj) {
//            listSubject += subject.name + " " + subject.time + "\n";
//        }
//        return "Giang vien: " + name +'\n'+
//                listSubject+
//                "Tong: " + String.format("%.2f", time);
//    }
    
}
