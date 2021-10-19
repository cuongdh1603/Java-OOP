/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06003;
/**
 *
 * @author Cuong
 */
public class Project {
    int ID;
    String name;
    public Project(int iD, String name) {
        super();
        ID = iD;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Bai tap dang ky: " + name;
    }
}
