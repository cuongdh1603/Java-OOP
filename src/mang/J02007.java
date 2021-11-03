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
public class J02007 {
    static final int mxn = 10003;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(),dem = 1;
        int[] check = new int[mxn];
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                check[a[i]]++;
            }
            System.out.println("Test "+(dem++)+": ");
            for(int i=0;i<n;i++){
                if(check[a[i]]>0){
                    System.out.println(a[i]+" xuat hien "+check[a[i]]+" lan");
                    check[a[i]] = 0;
                }
            }  
        }
    }
}
/*
1
10
1 7 2 8 3 3 2 1 3 2
*/