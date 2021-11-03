/* SỐ ĐẸP 2
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xau_ki_tu;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J03007 {
    public static boolean divisibleTo10(String s){      
        int sum = 0,l = s.length();
        for(int i=0;i<l;i++)
            sum += Character.getNumericValue(s.charAt(i));
        return (sum%10==0)&&s.charAt(0)=='8'&&s.charAt(l-1)=='8';
    }
    public static boolean symmetric(String s){
        int l = s.length();
        for(int i=0;i<l/2-1;i++)
            if(s.charAt(i)!=s.charAt(l-i-1)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            System.out.println(divisibleTo10(s)&&symmetric(s)?"YES":"NO");
        }
    }
}
