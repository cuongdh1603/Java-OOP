/* ƯỚC SỐ CHUNG LỚN NHẤT CỦA SỐ NGUYÊN LỚN
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
public class J03011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            String s1 = String.valueOf(n);
            String s2 = sc.next();
            BigInteger b1 = new BigInteger(s1);
            BigInteger b2 = new BigInteger(s2);
            System.out.println(b1.gcd(b2));
        }
    }
}
