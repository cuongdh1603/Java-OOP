/* KIỂM TRA SỐ FIBONACCI
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap_trinh_java_co_ban;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J01007 {
    static long[] f = new long[94];
    public static void init(){
        f[0] = 0; f[1] = 1;
        for(int i=2;i<94;i++)
            f[i] = f[i-1] + f[i-2];
    }
    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {            
            long n = sc.nextLong();
            int c = 0;
            for(int i=0;i<94;i++)
                if(f[i]==n){
                    System.out.println("YES");
                    c = 1;
                    break;
                }
            if(c==0) System.out.println("NO");
        }
    }
}
