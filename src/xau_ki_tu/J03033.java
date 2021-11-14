/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xau_ki_tu;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J03033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while(t-->0){
            BigInteger X = sc.nextBigInteger();
            BigInteger Y = sc.nextBigInteger();
            System.out.println((X.multiply(Y)).divide(X.gcd(Y)));
        }
    }
}
/*
3
12
100
1212
8888
121212121212121212
45678978
*/