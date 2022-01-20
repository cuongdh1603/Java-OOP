/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06005;
/**
 *
 * @author Cuong
 */
public class Customer {
    String ID;
    String name;
    String gender;
    String dateOfBirth;
    String address;
    static int i = 1;
    public Customer() {
    }
    
    public Customer(String name, String gender, String dateOfBirth, String address) {
        this.ID = String.format("KH%03d", i++);
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.address = address;
    }
}
