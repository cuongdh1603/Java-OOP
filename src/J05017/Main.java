/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05017;

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
        int t = Integer.parseInt(sc.nextLine()),gen_id = 1;
        List<Customer> ct = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            double pn = sc.nextFloat();
            double nn = sc.nextFloat();
            sc.nextLine();
            ct.add(new Customer(gen_id,name,pn,nn));
            gen_id++;
        }
        Collections.sort(ct,new compareByTotalCost());
        for (Customer customer : ct) System.out.println(customer);
    }
}
/*
3
Le Thi Thanh
468
500
Le Duc Cong
160
230
Ha Hue Anh
410
612
*/