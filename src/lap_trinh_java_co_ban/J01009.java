/* TỔNG GIAI THỪA
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap_trinh_java_co_ban;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = 0,k = 1;
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
            s += (k *= i);
        System.out.println(s);
    }
}
