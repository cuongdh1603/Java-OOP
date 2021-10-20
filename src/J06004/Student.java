/* QUẢN LÝ BÀI TẬP NHÓM – 2
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06004;

import java.util.Comparator;

/**
 *
 * @author Cuong
 */
public class Student {
    private String id;
    private String name;
    private String phoneNumber;
    private int team;

    public Student(String id, String name, String phoneNumber, int team) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.team = team;
    }

    public String getId() {
        return id;
    }

    public int getTeam() {
        return team;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + phoneNumber + " " + team;
              
    }
    
    
}

class compareByID implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId().compareTo(o2.getId());
    }
    
}