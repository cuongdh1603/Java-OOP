/* LIỆT KÊ TỔ HỢP - 1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J02020 {
    static int arr[],count = 0,n,k;
    static void solve(int step){
        for(int i=arr[step-1]+1;i<=n-k+step;i++){
            arr[step] = i;
            if(step==k) in();
            else solve(step+1);
        }
    }
    static void in(){
        for(int i=1;i<=k;i++) System.out.print(arr[i]+" ");
        count++;
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        arr = new int[k+1];
        arr[0] = 0;
        solve(1);
        System.out.println("Tong cong co "+count+" to hop");
    }
}
