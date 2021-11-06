/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vao_ra_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Cuong
 */
public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if(s.trim().equals("END")) break;
            StringTokenizer tok = new StringTokenizer(s.toLowerCase());
            String rs = "";
            while(tok.hasMoreTokens()){
                String w = tok.nextToken();
                rs += w.substring(0,1).toUpperCase()+w.substring(1)+" ";
            }
            System.out.println(rs);
        }
    }
}
