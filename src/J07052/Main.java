/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07052;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.valueOf(sc.nextLine());
        List<ThiSinh> ts = new ArrayList<>();
        while (t-->0) {            
            ts.add(new ThiSinh(sc.nextLine(),sc.nextLine(),Double.valueOf(sc.nextLine()),Double.valueOf(sc.nextLine()),Double.valueOf(sc.nextLine())));
        }
        Collections.sort(ts);
        int ct = Integer.valueOf(sc.nextLine());
        double lowest_p = ts.get(ct-1).xt;
        for(int i=ct;i<ts.size();i++){
            if(ts.get(i).xt==lowest_p) ct++;
            else break;
        }
        System.out.println(String.format("%.1f", lowest_p));
        for (int i=0;i<ts.size();i++) {
            if(i<ct) System.out.println(ts.get(i)+" "+"TRUNG TUYEN");
            else System.out.println(ts.get(i)+" "+"TRUOT");
        }
    }
}
