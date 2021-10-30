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
public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int d4 = 0,d7 = 0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)=='4') d4++;
            else if(s.charAt(i)=='7') d7++;
        System.out.println(d4+d7==4||d4+d7==7?"YES":"NO");
    }
}
