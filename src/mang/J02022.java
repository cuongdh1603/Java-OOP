/* SỐ XA CÁCH
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J02022 {
    static int n;
    static int arr[];
    static boolean visited[];
    static void in(){
        for(int i=0;i<arr.length;i++) 
            System.out.print(arr[i]);
        System.out.println();
    }
    static void solve(int i,int k){
        arr[k] = i;
        if(k == arr.length-1) in();
        visited[i] = true;
        for(int j=1;j<visited.length;j++)
            if(!visited[j]&&Math.abs(i-j)!=1) solve(j,k+1);
        visited[i] = false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            arr = new int[n];
            visited = new boolean[n+1];
            for(int i=1;i<=n;i++){
                Arrays.fill(visited,false);
                solve(i,0);
            }
        }
    }
}
