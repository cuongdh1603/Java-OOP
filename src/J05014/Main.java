/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int gen_id = 1;
        List<Teacher> tc = new ArrayList<>();
        while(t-->0){
            String name = sc.nextLine();
            String type = sc.nextLine();
            double csp = sc.nextDouble();
            double ap = sc.nextDouble();
            sc.nextLine();
            tc.add(new Teacher(gen_id,name,type,csp,ap));
            gen_id++;
        }
        Collections.sort(tc,new compareByTotalPoint());
        for (Teacher teacher : tc) System.out.println(teacher);
    }
}
/*
3
Le Van Binh
A1
7.0
3.0
Tran Van Toan
B3
4.0
7.0
Hoang Thi Tam
C2
7.0
6.0
*/