/*J01011 - BỘI SỐ CHUNG - ƯỚC SỐ CHUNG
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J01011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long a1 = a,b1 = b;
            while(b!=0){
                long tmp = b;
                b = a%b;
                a = tmp;
            }
            System.out.println(a1*b1/a + " " +a);
        }
    }
}
