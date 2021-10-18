/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J02013 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int check = 0,c = 1;
        for(int i=0;i<n-1;i++){
            check = 0;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    check = 1;
                }
            }
            if(check==1){
                System.out.print("Buoc "+c+++": ");
                for(int j=0;j<n;j++)
                    System.out.print(a[j]+" ");
                System.out.println();
            }
            else break;
        }
    }
}
