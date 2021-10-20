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
public class J02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),dem = 0;
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        System.out.println("Buoc "+dem+++": "+a[0]);
        b[0] = a[0];
        for(int i=1;i<n;i++){
            int key = a[i],k = i-1;
            while(k>=0&&b[k]>a[i]){
                b[k+1] = b[k];
                k--;
            }
            b[k+1] = a[i];
            System.out.print("Buoc "+dem+++": ");
            for(int j=0;j<=i;j++)
                System.out.print(b[j]+" ");
            System.out.println();
        }
    }
}
/*
4
5 7 3 2
 */