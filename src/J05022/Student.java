/* LIỆT KÊ SINH VIÊN THEO LỚP
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05022;
/**
 *
 * @author Cuong
 */
public class Student {
    String ID;
    String name;
    String classroom;
    String email;
    public Student(String ID, String name, String classroom, String email) {
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
