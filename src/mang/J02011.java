/*SẮP XẾP CHỌN
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J02011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int dem = 1;
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        for(int i=0;i<n-1;i++){
            int p = i;
            for(int j=i;j<n;j++)
                if(a[p]>a[j])
                    p = j;
            int tmp = a[p];
            a[p] = a[i];
            a[i] = tmp;
            System.out.print("Buoc "+dem+++": ");
            for(int j=0;j<n;j++)
                System.out.print(a[j]+" ");
            System.out.println("");
        }
    }
}
