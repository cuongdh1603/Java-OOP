/*ƯỚC SỐ CHIA HẾT CHO 2
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap_trinh_java_co_ban;
import static java.lang.Math.sqrt;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J01012 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long dem = 0;
            for(long i=1;i<=sqrt(n);i++)
                if(n%i==0){
                    if(i%2==0) dem++;
                    if(n/i%2==0&&n/i!=i) dem++;
                }
            System.out.println(dem);
        }
    }
}
