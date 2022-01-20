/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07057;

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
        int t = Integer.valueOf(sc.nextLine()),id = 1;
        List<ThiSinh> ts = new ArrayList<>();
        while(t-->0){
            ts.add(new ThiSinh(id++,sc.nextLine(),Double.valueOf(sc.nextLine()),sc.nextLine(),Integer.valueOf(sc.nextLine())));
        }
        Collections.sort(ts);
        for (ThiSinh t1 : ts) {
            System.out.println(t1);
        }
    }
}
