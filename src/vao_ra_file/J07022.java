/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vao_ra_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Cuong
 */
public class J07022 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> arr = new ArrayList<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            StringTokenizer tok = new StringTokenizer(s);
            while(tok.hasMoreTokens()){
                String rs = tok.nextToken();
                if(rs.length()>=11 || !rs.matches("[0-9]+"))
                    arr.add(rs);
            }
        }
        Collections.sort(arr,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        for (String string : arr) {
            System.out.print(string+" ");
        }
    }
}
