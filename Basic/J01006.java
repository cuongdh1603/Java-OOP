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
public class J01006 {
    static long[] check = new long[93];
    public static void seive(){
        check[0] = 0;check[1] = 1;
        for(int i=2;i<93;i++) check[i] = check[i-1]+check[i-2];    
    }
    public static void main(String[] args) {
        seive();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) System.out.println(check[sc.nextInt()]);
    }
}
