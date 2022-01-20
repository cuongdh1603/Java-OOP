/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07035;

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
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("MONHOC.in"));
        Scanner sc3 = new Scanner(new File("BANGDIEM.in"));
        List<SinhVien> sv = new ArrayList<>();
        Map<String,String> mh = new HashMap<>();
        List<BangDiem> bd = new ArrayList<>();
        int t = Integer.valueOf(sc1.nextLine());
        while(t-->0){
            sv.add(new SinhVien(sc1.nextLine(),sc1.nextLine(),sc1.nextLine(),sc1.nextLine()));
        }
        t = Integer.valueOf(sc2.nextLine());
        while(t-->0){
            mh.put(sc2.nextLine(), sc2.nextLine());
            sc2.nextLine();
        }
        t = Integer.valueOf(sc3.nextLine());
        while(t-->0){
            String w[] = sc3.nextLine().split(" ");
            BangDiem bangDiem = new BangDiem(w[0],w[1],Double.valueOf(w[2]));
            for (SinhVien sinhVien : sv) {
                if(sinhVien.ma.equalsIgnoreCase(w[0])){
                    bangDiem.sinhVien = sinhVien;
                    break;
                }
            }
            bd.add(bangDiem);
        }
        Collections.sort(bd);
        t = Integer.valueOf(sc3.nextLine());
        while(t-->0){
            String s = sc3.nextLine();
            System.out.println("BANG DIEM MON "+mh.get(s)+":");
            for (BangDiem bangDiem : bd) {
                if(bangDiem.maMH.equals(s))
                    System.out.println(bangDiem);
            }
        }
    }
}
