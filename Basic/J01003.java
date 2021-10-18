/* GIẢI PHƯƠNG TRÌNH BẬC NHẤT
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J01003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a==0&&b==0) System.out.println("VSN");
        else if(a==0&&b!=0) System.out.println("VN");
        else System.out.println(String.format("%.2f",-b/a));
    }
}
