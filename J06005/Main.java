/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06005;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()), gen_id = 1;
        List<Customer> lt1 = new ArrayList<>();
        List<Product> lt2 = new ArrayList<>();
        List<Bill> lt3 = new ArrayList<>();
        while (t-- > 0) {
            lt1.add(new Customer(gen_id++, sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), sc.nextLine()));
        }
        t = Integer.parseInt(sc.nextLine());
        gen_id = 1;
        while (t-- > 0) {
            lt2.add(new Product(gen_id++, sc.nextLine(), sc.nextLine(),
                    Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        t = Integer.parseInt(sc.nextLine());
        gen_id = 1;
        Customer customer = new Customer();
        Product product = new Product();
        while (t-- > 0) {
            String customerID = sc.next();
            String productID = sc.next();
            int amount = Integer.parseInt(sc.next());
            for (Customer c : lt1)
                if (c.ID.equalsIgnoreCase(customerID)) {
                    customer = c;
                    break;
                }
            for (Product p : lt2)
                if (p.ID.equalsIgnoreCase(productID)) {
                    product = p;
                    break;
                }
            lt3.add(new Bill(gen_id++, customer, product, amount));
        }
        for (Bill bill : lt3) 
            System.out.println(bill);
    }
}
