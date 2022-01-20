/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07054;

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
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.valueOf(sc.nextLine()),id = 1;
        List<SinhVien> sv = new ArrayList<>();
        while(t-->0){
            sv.add(new SinhVien(id++,sc.nextLine(),Double.valueOf(sc.nextLine()),Double.valueOf(sc.nextLine()),Double.valueOf(sc.nextLine())));
        }
        Collections.sort(sv);
        int xh = 1;
        for(int i=0;i<sv.size();i++){
            if(i==0||sv.get(i).tb!=sv.get(i-1).tb)
                xh = i+1;
            System.out.println(sv.get(i)+" "+xh);
        }
    }
}
