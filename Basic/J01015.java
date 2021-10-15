/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J01015 {
    public static boolean check(String s){
        for(int i=3;i<10;i++){
            if(s.contains(String.valueOf(i)))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //sc.next();
        while(t-->0){
            System.out.println(check(sc.next())?"YES":"NO");
        }
    }
}
/*
3
1214
10210221
22222222
*/