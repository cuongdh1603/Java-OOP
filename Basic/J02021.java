/* LIỆT KÊ TỔ HỢP - 2
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J02021 {
    static int arr[],n,k;
    static List<String> ans;
    static void solve(int step){
        for(int i=arr[step-1]+1;i<=n-k+step;i++){
            arr[step] = i;
            if(step==k) in();
            else solve(step+1);
        }
    }
    static void in(){
        String rs = "";
        for(int i=1;i<=k;i++) rs += String.valueOf(arr[i]);
        ans.add(rs);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ans = new ArrayList<>();
        n = sc.nextInt();
        k = sc.nextInt();
        arr = new int[k+1];
        arr[0] = 0;
        solve(1);
        for (String s : ans) System.out.print(s+" ");
        System.out.println();
        System.out.println("Tong cong co "+ans.size()+" to hop");
    }
}
