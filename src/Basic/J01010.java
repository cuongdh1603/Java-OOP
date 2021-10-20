/* CẮT ĐÔI
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J01010 {
    static String ans ;
    static boolean check(String s){
        ans = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'||s.charAt(i)=='8'||s.charAt(i)=='9') ans += '0';
            else if(s.charAt(i)=='1') ans += '1';
            else return false;
        }
        StringBuilder sb = new StringBuilder(ans);
        while (sb.length()>0&&sb.charAt(0)=='0')  sb.deleteCharAt(0);
        ans = String.valueOf(sb);
        if(ans.equals("")) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long s = sc.nextLong();
            if(check(String.valueOf(s))) System.out.println(ans);
            else System.out.println("INVALID");
        }
    }
}
