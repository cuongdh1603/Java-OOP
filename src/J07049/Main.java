/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07049;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        Map<String,Hang> h = new HashMap<>();
        List<Khach> kh = new ArrayList<>();
        int t = Integer.valueOf(sc.nextLine());
        while(t-->0){
            h.put(sc.nextLine(), new Hang(sc.nextLine(),Long.valueOf(sc.nextLine()),Integer.valueOf(sc.nextLine())));
        }
        t = Integer.valueOf(sc.nextLine());
        while(t-->0){
            String ten = sc.nextLine();
            String dc = sc.nextLine();
            String maSP = sc.nextLine();
            kh.add(new Khach(ten,dc,maSP,h.get(maSP),Long.valueOf(sc.nextLine()),sc.nextLine()));
        }
        Collections.sort(kh);
        kh.forEach(System.out::println);
    }
}
