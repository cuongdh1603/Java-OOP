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
public class J02010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),dem = 1;
        int[] a = new int[n];
        for (int i = 0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[j]<a[i]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            System.out.print("Buoc "+(dem++)+": ");
            for(int j=0;j<n;j++)
                System.out.print(a[j]+" ");
            System.out.println();
        }
    }
}
/*
4
5 7 3 2
*/