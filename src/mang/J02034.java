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
public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[203];
        int n = sc.nextInt(),x = 0,check = 0;
        for(int i=0;i<n;i++){
            x = sc.nextInt();
            a[x]++;
        }
        for (int i = 1; i < x; i++) {
            if(a[i]==0){
                System.out.println(i);
                check = 1;
            }  
        }
        if(check == 0) System.out.println("Excellent!");
    }
}
/*
5
1 2 3
4
5
*/