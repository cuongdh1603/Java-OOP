/* SỐ ĐẸP 3
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xau_ki_tu;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J03008 {
    public static boolean check(String s){
        int l = s.length();
        for(int i=0;i<l/2;i++)
            if(s.charAt(i)!=s.charAt(l-i-1)||s.contains("0")||s.contains("1")||s.contains("4")||s.contains("6")||s.contains("8")||s.contains("9"))
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {            
            String s = sc.nextLine();
            System.out.println(check(s)?"YES":"NO");
        }
    }
}
