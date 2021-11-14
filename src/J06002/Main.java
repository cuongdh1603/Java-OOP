/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06002;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> pro = new ArrayList<>();
        ArrayList<Bill> bl = new ArrayList<>();
        int t = Integer.valueOf(sc.nextLine()),gen_id = 1;
        while(t-->0){
            pro.add(new Product(sc.nextLine(),sc.nextLine(),Long.valueOf(sc.nextLine()),Long.valueOf(sc.nextLine())));
        }
        t = Integer.valueOf(sc.nextLine());
        while(t-->0){
            String w[] = sc.nextLine().split(" ");
            for (Product p : pro) {
                if(p.ID.equals(w[0].substring(0,2))){
                    bl.add(new Bill(w[0],gen_id++,p,Integer.valueOf(w[1])));
                }
            }
        }
        Collections.sort(bl);
        for (Bill bill : bl) {
            System.out.println(bill);
        }
    }
}
/*
2
AT
Ao thun
80000
45000
QJ
Quan Jean
220000
125000
2
AT1 95
QJ2 105
*/