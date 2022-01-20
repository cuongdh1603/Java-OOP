/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07051;

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
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.valueOf(sc.nextLine()),id = 1;
        List<Khach> kh = new ArrayList<>();
        while(t-->0){
            kh.add(new Khach(id++,sc.nextLine(),Integer.valueOf(sc.nextLine()),sc.nextLine(),sc.nextLine(),Long.valueOf(sc.nextLine())));
        }
        Collections.sort(kh);
        for (Khach khach : kh) {
            System.out.println(khach);
        }
    }
}
