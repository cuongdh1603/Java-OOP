/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05081;

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
        int t = Integer.valueOf(sc.nextLine()),gen_id = 1;
        ArrayList<Product> pro = new ArrayList<>();
        while(t-->0){
            pro.add(new Product(gen_id++,sc.nextLine(),sc.nextLine(),Long.valueOf(sc.nextLine()),Long.valueOf(sc.nextLine())));
        }
        Collections.sort(pro);
        for (Product product : pro) {
            System.out.println(product);
        }
    }
}
/*
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
*/