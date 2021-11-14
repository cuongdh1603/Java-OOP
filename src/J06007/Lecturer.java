/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06007;

/**
 *
 * @author Cuong
 */
public class Lecturer {
    String ID;
    String name;
    double time = 0;

    public Lecturer(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    public void addTime(double t){
        time += t;
    }

    @Override
    public String toString() {
        return name + " " + String.format("%.2f", time);
    }
    
}
