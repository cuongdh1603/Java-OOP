/* QUẢN LÝ BÀI TẬP NHÓM – 1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06003;
/**
 *
 * @author Cuong
 */
public class Student {
    String ID;
    String name;
    String phoneNumber;
    int team;
    public Student(String iD, String name, String phoneNumber, int team) {
        ID = iD;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.team = team;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ID + " " + name + " " + phoneNumber;
    }
}
