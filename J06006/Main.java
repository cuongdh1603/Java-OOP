/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06006;
import java.util.ArrayList;
import java.util.Collections;
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
        while (t-- > 0) 
            lt1.add(new Customer(gen_id++, sc.nextLine(), sc.nextLine(),sc.nextLine(), sc.nextLine()));
        t = Integer.parseInt(sc.nextLine());
        gen_id = 1;
        while (t-- > 0)
            lt2.add(new Product(gen_id++, sc.nextLine(), sc.nextLine(),Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        t = Integer.parseInt(sc.nextLine());
        gen_id = 1;
        Customer customer = new Customer();
        Product product = new Product();
        while (t-- > 0) {
            String customerID = sc.next();
            String productID = sc.next();
            long amount = Long.parseLong(sc.next());
            for (Customer c : lt1) {
                if (c.ID.equalsIgnoreCase(customerID)) {
                    customer = c;
                    break;
                }
            }
            for (Product p : lt2) 
                if (p.ID.equalsIgnoreCase(productID)) {
                    product = p;
                    break;
                }
            lt3.add(new Bill(gen_id++, customer, product, amount));
        }
        Collections.sort(lt3, new compareByProfit());
        for (Bill bill : lt3) 
            System.out.println(bill);
    }
}
/*
2
Nguyen Van Nam
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
Tran Van Binh
Nam
11/14/1995
Phung Khoang-Nam Tu Liem-Ha Noi
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
3
KH001 
MH001 
2
KH001 
MH002 
3
KH002 
MH002 
4
*/