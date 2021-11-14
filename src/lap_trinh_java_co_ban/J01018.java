/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap_trinh_java_co_ban;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J01018 {
    static boolean check(String s){
        int sum = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if(Math.abs((int)(s.charAt(i)-'0')-(int)(s.charAt(i+1)-'0'))!=2){
                return false;
            }
            sum += (int)(s.charAt(i)-'0');
        }
        sum += (int)(s.charAt(s.length()-1)-'0');
        return sum%10 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while(t-->0)
            System.out.println(check(sc.nextLine())?"YES":"NO");
    }
}
/*
3
1353
246864
123435
*/