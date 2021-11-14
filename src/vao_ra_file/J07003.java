/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vao_ra_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.nextLine();
        while(s.length()>1){
            int l = s.length();
            BigInteger b1 = new BigInteger(s.substring(0,l/2));
            BigInteger b2 = new BigInteger(s.substring(l/2));
            b1 = b1.add(b2);
            s = String.valueOf(b1);
            System.out.println(s);
        }
    }
}
