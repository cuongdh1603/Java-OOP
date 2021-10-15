/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04004;
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger x1 = sc.nextBigInteger();
        BigInteger y1 = sc.nextBigInteger();
        BigInteger x2 = sc.nextBigInteger();
        BigInteger y2 = sc.nextBigInteger();
        BigInteger p = x1.multiply(y2).add(x2.multiply(y1));
        BigInteger q = y1.multiply(y2);
        BigInteger u = p.gcd(q);
        p = p.divide(u);
        q = q.divide(u);
        System.out.println(p+"/"+q);
    }
}
/*
123 456 12 34
*/