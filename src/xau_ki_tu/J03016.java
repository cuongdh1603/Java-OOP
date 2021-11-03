/* CHIA HẾT CHO 11
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
public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        BigInteger b11 = new BigInteger("11");
        while(t-->0){
            String s = sc.next();
            BigInteger bn = new BigInteger(s);
            if(bn.mod(b11).compareTo(BigInteger.valueOf(0))==0)
                System.out.println("1");
            else System.out.println("0");
        }
    }
}
