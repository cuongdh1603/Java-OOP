/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07036;

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
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("MONHOC.in"));
        Scanner sc3 = new Scanner(new File("BANGDIEM.in"));
        List<SinhVien> sv = new ArrayList<>();
        List<MonHoc> mh = new ArrayList<>();
        List<BangDiem> bd = new ArrayList<>();
        int t = Integer.valueOf(sc1.nextLine());
        while(t-->0)
            sv.add(new SinhVien(sc1.nextLine(),sc1.nextLine(),sc1.nextLine(),sc1.nextLine()));
        t = Integer.valueOf(sc2.nextLine());
        while(t-->0){
            mh.add(new MonHoc(sc2.nextLine(), sc2.nextLine()));
            sc2.nextLine();
        }
        t = Integer.valueOf(sc3.nextLine());
        while(t-->0){
            String w[] = sc3.nextLine().split(" ");
            BangDiem bd1 = new BangDiem(w[0],w[1],Double.valueOf(w[2]));
            for (SinhVien sinhVien : sv) {
                if(sinhVien.ma.equalsIgnoreCase(w[0])){
                    bd1.sinhVien = sinhVien;
                    break;
                }
            }
            for (MonHoc monHoc : mh)
                if(monHoc.ma.equalsIgnoreCase(w[1])){
                    bd1.monHoc = monHoc;
                    break;
                }
            bd.add(bd1);
        }
        Collections.sort(bd);
        t = Integer.valueOf(sc3.nextLine());
        while(t-->0){
            String maLop = sc3.nextLine();
            System.out.println("BANG DIEM lop "+maLop+":");
            for (BangDiem bangDiem : bd)
                if(bangDiem.sinhVien.lop.equalsIgnoreCase(maLop))
                    System.out.println(bangDiem);
        }
    }
}
