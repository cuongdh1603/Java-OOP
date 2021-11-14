/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05047;

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
            int gen_id = 1;
            String name = sc.nextLine();
            for (Product p : pro) {
                if(Product.getID(name).equals(p.ID.substring(0,2))) gen_id++;
            }
            pro.add(new Product(gen_id,name,Integer.valueOf(sc.nextLine()),Long.valueOf(sc.nextLine())));
        }
        Collections.sort(pro);
        for (Product p : pro) {
            System.out.println(p);
        }
    }
}
/*
3
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000
*/