/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xau_ki_tu;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Cuong
 */
public class J03032 {
    static String reverse(String s){
        String rs = "";
        StringTokenizer tok = new StringTokenizer(s);
        while(tok.hasMoreTokens()){
            StringBuilder sb = new StringBuilder(tok.nextToken());
            sb.reverse();
            rs += sb + " ";
        }
        return rs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while(t-->0)
            System.out.println(reverse(sc.nextLine()));
    }
}
/*
2
ABC DEF
123 456
*/