/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xau_ki_tu;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++)
            set.add(s.charAt(i));
        System.out.println(set.size());
    }
}
