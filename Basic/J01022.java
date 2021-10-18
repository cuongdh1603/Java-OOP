/* XÂU NHỊ PHÂN
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J01022 {
    static long f[] = new long[94];
    static void init(){
        f[1] = 1;f[2] = 1;
        for(int i=3;i<94;i++)
            f[i] = f[i-1] + f[i-2];
    }
    static int solve(int n,long k){
        if(n==1) return 0;
        else if(n==2) return 1;
        else
            if(k>f[n-2]) return solve(n-1,k-f[n-2]);
            else return solve(n-2,k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init();
        int t = sc.nextInt();
        while(t-->0) System.out.println(solve(sc.nextInt(),sc.nextLong()));
    }
}
