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
public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(),dem = 1;
        while(dem<=t){
            long n = sc.nextLong();
            System.out.print("Test "+dem+": ");
            int d = 0;
            if(n%2==0){
                while(n%2==0){
                    n/=2;
                    d++;
                }
                System.out.print(2+"("+d+") ");
            }
            d = 0;
            long u = 3;
            while(n>=u)
                if(n%u==0){
                    d = 0;
                    while(n%u==0){
                        n/=u;
                        d++;
                    }
                    System.out.print(u+"("+d+") ");
                }
                else u+=2;
            if(n>1) System.out.print(n+"(1) ");
            System.out.println();
            dem++;
        }
    }
}
