/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05051;

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
        int t = Integer.valueOf(sc.nextLine()),gen_id = 1;
        List<Customer> cus = new ArrayList<>();
        while(t-->0){
            cus.add(new Customer(gen_id++,sc.nextLine(),Long.valueOf(sc.nextLine()),Long.valueOf(sc.nextLine())));
        }
        Collections.sort(cus);
        for (Customer cu : cus) {
            System.out.println(cu);
        }
    }
}
/*
3
KD
400
555
NN
58
400
CN
150
700
*/