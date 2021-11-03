/* SỐ ƯU THẾ
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xau_ki_tu;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J03024 {
    static boolean isValid(String s){
        if(s.charAt(0)=='0') return false;
        else{
            for(int i=0;i<s.length();i++)
                if(s.charAt(i)<'0'||s.charAt(i)>'9') return false;
            return true;
        }
    }
    static boolean isDominantNum(String s){
        int countOdd = 0,countEven = 0,len = s.length();
        for(int i=0;i<len;i++)
            if(Integer.valueOf(s.charAt(i))%2==0) countEven++;
            else countOdd++;
        return (len%2==0&&countEven>countOdd)||(len%2!=0&&countEven<countOdd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.next();
            if(!isValid(s)) System.out.println("INVALID");
            else System.out.println(isDominantNum(s)?"YES":"NO");
        }
    }
}
