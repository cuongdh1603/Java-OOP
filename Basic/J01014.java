/* ƯỚC SỐ NGUYÊN TỐ LỚN NHẤT
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J01014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long ans = 1;
            while (n%2==0) {                
                n/=2;
                ans = 2;
            }
            long u = 3;
            while(n>=u*u)
                if(n%u==0)
                    while(n%u==0){
                        n/=u;
                        ans = u;
                    }
                else u++;
            if(n>u) ans = n;
            System.out.println(ans);
        }
    }
}
