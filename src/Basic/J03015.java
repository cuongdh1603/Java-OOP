/* HIỆU SỐ NGUYÊN LỚN - 2
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J03015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);
        BigInteger c = a.subtract(b);
        System.out.println(c);
    }
}
