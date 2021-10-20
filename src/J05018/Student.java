/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05018;

import java.util.Comparator;

/**
 *
 * @author Cuong
 */
public class Student {
    String ID;
    String name;
    Float math,literature,foreignLanguage,physics,chemistry,biography,history,
            geography,civicEducation,technology,average;
    String grade;

    public Student(int num_id, String name, Float math, Float literature, 
            Float foreignLanguage, Float physics, Float chemistry, Float biography, 
            Float history, Float geography, Float civicEducation, Float technology) {
        String str_num = String.valueOf(num_id);
        while (str_num.length()<2) {            
            str_num = '0' + str_num;
        }
        this.ID = "HS"+str_num;
        this.name = name;
        this.math = math;
        this.literature = literature;
        this.foreignLanguage = foreignLanguage;
        this.physics = physics;
        this.chemistry = chemistry;
        this.biography = biography;
        this.history = history;
        this.geography = geography;
        this.civicEducation = civicEducation;
        this.technology = technology;
        this.average = (math*2+literature*2+foreignLanguage+physics+chemistry+
                biography+history+geography+civicEducation+technology)/12;
        this.average = (float)Math.round(this.average*10f)/10;
        if(this.average>=9.f)
            this.grade = "XUAT SAC";
        else if(this.average>=8.f)
            this.grade = "GIOI";
        else if(this.average>=7.f)
            this.grade = "KHA";
        else if(this.average>=5.f)
            this.grade = "TB";
        else this.grade = "YEU";
    }

    @Override
    public String toString() {
        return this.ID+" "+this.name+" "+String.format("%.1f",this.average)+" "+this.grade;
    }
}
class compareByAverage implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.average<o2.average) return 1;
        else if(o1.average>o2.average) return -1;
        else return o1.ID.compareTo(o2.ID);
    }
    
}