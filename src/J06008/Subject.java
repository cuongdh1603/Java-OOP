/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06008;

/**
 *
 * @author Cuong
 */
public class Subject {
    String ID;
    String name;
    double time = 0;

    public Subject(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    
    public Subject(String ID, String name, double time) {
        this.ID = ID;
        this.name = name;
        this.time = time;
    }

    @Override
    public String toString() {
        return name + " " + time;
    }
    
}
