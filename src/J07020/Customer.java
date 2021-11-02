/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07020;

/**
 *
 * @author Cuong
 */
public class Customer {
    String ID;
    String name,gender;
    String DOB;
    String address;

    public Customer(int ID, String name, String gender, String DOB, String address) {
        this.ID = String.format("KH%03d", ID);
        this.name = name;
        this.gender = gender;
        this.DOB = DOB;
        this.address = address;
    }
    
}
