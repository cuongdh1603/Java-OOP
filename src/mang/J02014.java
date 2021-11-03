/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            int lsum = 0, rsum = 0, check = 0;
            for (int i = 1; i < n; i++) {
                rsum += a[i];
            }
            for (int i = 1; i < n - 1; i++) {
                lsum += a[i - 1];
                rsum -= a[i];
                if (lsum == rsum) {
                    check = 1;
                    System.out.println(i + 1);
                    break;
                }
            }
            if (check == 0) System.out.println(-1);
        }
    }
}
