/* TÍNH LŨY THỪA
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap_trinh_java_co_ban;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J01021 {
    static final long mod = 1000000007;
    public static long solve(long x,long y){
        if(y==0) return 1;
        long a = solve(x,y/2);
        if(y%2==0) return a*a%mod;
        else return x*(a*a%mod)%mod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a==0&&b==0) break;
            System.out.println(solve(a,b));
        }
    }
}
