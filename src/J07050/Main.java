/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07050;

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
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = Integer.valueOf(sc.nextLine()),id = 1;
        List<MatHang> mh = new ArrayList<>();
        while(t-->0)
            mh.add(new MatHang(id++,sc.nextLine(),sc.nextLine(),Double.valueOf(sc.nextLine()),Double.valueOf(sc.nextLine())));
        Collections.sort(mh);
        for (MatHang matHang : mh) 
            System.out.println(matHang);
    }
}
