/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05049;

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
        int t = Integer.valueOf(sc.nextLine());
        List<Product> pro = new ArrayList<>();
        while(t-->0){
            pro.add(new Product(sc.nextLine(),Long.valueOf(sc.nextLine())));
        }
        Collections.sort(pro);
        String s = sc.nextLine();
        for (Product p : pro) {
            if(p.ID.substring(0,1).equals(s))
                System.out.println(p);
        }
    }
}
/*
3
A001Y
1000
B012N
2500
B003Y
4582
B
*/