/* SỐ ĐẸP 1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J03006 {
    public static boolean containEvenNumber(String s){      
        if(s.contains("1")||s.contains("3")||s.contains("5")||s.contains("7")||s.contains("9"))
             return false;
        else return true;
    }
    public static boolean symmetric(String s){
        int l = s.length();
        for(int i=0;i<l/2-1;i++){
            if(s.charAt(i)!=s.charAt(l-i-1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            if(containEvenNumber(s)&&symmetric(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
