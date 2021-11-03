/* CHIA TAM GIÁC
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap_trinh_java_co_ban;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int h = sc.nextInt();
            for(int i=1;i<n;i++)
                System.out.print(String.format("%.6f",Math.sqrt((double)i/n)*h)+" ");
            System.out.println();
        }
    }
}
