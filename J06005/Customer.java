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

    public Customer() {
    }
    
    public Customer(int num_id, String name, String gender, String dateOfBirth, String address) {
        String str_id = String.valueOf(num_id);
        while (str_id.length() < 3) str_id = '0' + str_id;
        this.ID = "KH" + str_id;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.address = address;
    }
}
