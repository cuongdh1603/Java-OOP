/* XÂU ĐỐI XỨNG
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J03025 {
    public static boolean check(String s){
        int l = s.length(),c = 0;
        for(int i=0;i<l/2;i++)
            if(s.charAt(i)!=s.charAt(l-i-1))
                c++;
        if(c>2) return false;
        else if(l%2==1 && c==0) return true;
        else if(c==1) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) System.out.println(check(sc.nextLine())?"YES":"NO");
    }
}
