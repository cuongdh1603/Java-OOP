/* HIỆU SỐ NGUYÊN LỚN - 1
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
public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s1 = sc.next();
            String s2 = sc.next();
            int max_len = Math.max(s1.length(), s2.length());
            BigInteger a = new BigInteger(s1,10);
            BigInteger b = new BigInteger(s2,10);
            BigInteger larger = a.max(b);
            if(b==larger){
                BigInteger tmp = a;
                a = b;
                b = tmp;
            }
            BigInteger c = a.subtract(b);
            String str_c = String.valueOf(c);
            while(str_c.length()<max_len) str_c = "0" + str_c;
            System.out.println(str_c);
        }
    }
}
