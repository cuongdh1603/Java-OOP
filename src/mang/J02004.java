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
public class J02004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i=0;i<n;i++) 
                a[i] = sc.nextLong();
            boolean check = true;
            for(int i=0;i<n/2;i++)
                if(a[i]!=a[n-1-i]){
                    check = false;
                    break;
                }
            System.out.println(check?"YES":"NO");
        }
    }
}
