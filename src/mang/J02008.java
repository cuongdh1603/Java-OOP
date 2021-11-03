/* BỘI SỐ NHỎ NHẤT CỦA N SỐ NGUYÊN DƯƠNG ĐẦU TIÊN
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J02008 {
    public static long gcd(long x,long y){
        long tmp;
        while(y!=0){
            tmp = y;
            y = x%y;
            x = tmp;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long x = 1,y = 1;
            for(long i=2;i<=n;i++){
                x = gcd(y,i);
                y *= i/x;
            }
            System.out.println(y);
        }
    }
}
