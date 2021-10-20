/*  XÂU KHÁC NHAU DÀI NHẤT
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;
import java.util.Scanner;
/**
 * @author Cuong
 */
public class J03026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(s1.equals(s2)?-1:Math.max(s1.length(),s2.length()));
        }
    }
}
