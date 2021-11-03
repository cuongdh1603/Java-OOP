/* HỢP CỦA HAI DÃY SỐ
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author Cuong
 */
public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> st = new TreeSet<>();
        while(n-->0) st.add(sc.nextInt());
        while(m-->0) st.add(sc.nextInt());
        for (Integer i : st) 
            System.out.print(i+" ");
    }
}
