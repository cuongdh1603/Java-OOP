/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;


import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J01017 {
    public static boolean check(String s){
        for(int i=0;i<s.length()-1;i++){
            if(abs(Integer.valueOf(s.charAt(i))-Integer.valueOf(s.charAt(i+1)))!=1)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            System.out.println(check(String.valueOf(sc.nextLong()))?"YES":"NO");       
        }
    }
}
/*
3
123212
5654345676
10233211123
*/