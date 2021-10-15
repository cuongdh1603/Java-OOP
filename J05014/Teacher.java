/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05014;
import java.util.Comparator;
/**
 *
 * @author Cuong
 */
public class Teacher {
    String ID;
    String name;
    String admissionID;
    String major;
    double computerScienceGrade,anotherGrade,totalGrade,priorityGrade = 0;
    String type;
    String result;
    public Teacher(int num_id, String name, String admissionID, 
            double computerScienceGrade, double anotherGrade) {
        String str_id = String.valueOf(num_id);
        if(str_id.length()<2) str_id = '0'+str_id;
        this.ID = "GV" + str_id;
        this.name = name;
        this.admissionID = admissionID;
        this.computerScienceGrade = computerScienceGrade;
        this.anotherGrade = anotherGrade;
        char c1 = admissionID.charAt(0),c2 = admissionID.charAt(1);
        if(c1 == 'A') this.major = "TOAN";
        else if(c1 == 'B') this.major = "LY";
        else if(c1 == 'C') this.major = "HOA";
        if(c2 == '1') this.priorityGrade = 2.0;
        else if(c2 == '2') this.priorityGrade = 1.5;
        else if(c2 == '3') this.priorityGrade = 1.0;
        this.totalGrade = computerScienceGrade*2 + anotherGrade + this.priorityGrade;
        if(this.totalGrade>=18) this.type = "TRUNG TUYEN";
        else this.type = "LOAI";
    }   

    @Override
    public String toString() {
        return this.ID+" "+this.name+" "+this.major+" "+String.format("%.1f",this.totalGrade)
                +" "+this.type;
    }
}
class compareByTotalPoint implements Comparator<Teacher>{
    @Override
    public int compare(Teacher o1, Teacher o2) {
        if(o1.totalGrade<=o2.totalGrade) return 1;
        else return -1;
    }
    
}