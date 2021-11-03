/* TỔNG ƯỚC SỐ - 1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap_trinh_java_co_ban;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J01013 {
    static final int mxn = 2000003;
    public static int[] check = new int[mxn];
    public static void seive(){
        check[0] = check[1] = 1;
        for(int i=2;i*i<=mxn;i++){
            if(check[i]==0)
                for(int j=i*i;j<=mxn;j+=i){
                    check[j] = 1;
                }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        seive();
        long sum = 0;
        while(t-->0){
            int n = sc.nextInt();
            if(check[n]==0){
                sum += n;
                continue;
            }
            if(n%2==0)
                while(n%2==0){
                    n /= 2;
                    sum += 2;
                }
            if(check[n]==0){
                sum += n;
                continue;
            }
            else{
                int u = 3,c = 0;
                while(n>=u){
                    if(n%u==0)
                        while(n%u==0){
                            n/=u;
                            sum += u;
                        }
                    else u += 2;
                    if(check[n]==0){
                            sum += n;
                            n = 1;
                            c = 1;
                            break;
                     }
                }
                if(n>1&&c==0) sum += n;
            }
        }
        System.out.println(sum);
    }
}
