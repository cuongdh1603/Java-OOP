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
public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),ans = 0;
        short a[][] = new short[n][3];
        for(int i=0;i<n;i++){
            int d0 = 0,d1 = 1;
            for(int j=0;j<3;j++){
                a[i][j] = sc.nextShort();
                if(a[i][j] == 0) d0++;
                else d1++;
            }
            if(d1>d0) ans++;       
        }
        System.out.println(ans);    
    }
}
/*
3
1 1 0
1 1 1
1 0 0
2
1 0 0
0 1 1
*/