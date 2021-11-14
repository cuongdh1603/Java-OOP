/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap_trinh_java_co_ban;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J01026 {
    static boolean check(long n){
        long x = (long)Math.sqrt(n);
        return x*x == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
            System.out.println(check(sc.nextLong())?"YES":"NO");
    }
}
/*
3
11
121
361
*/