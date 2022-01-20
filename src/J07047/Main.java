/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07047;

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
        Scanner sc = new Scanner(new File("DATA.in"));
        List<Phong> phs = new ArrayList<>();
        List<Khach> khs = new ArrayList<>();
        int t = Integer.valueOf(sc.nextLine());
        while(t-->0){
            String w[] = sc.nextLine().split(" ");
            phs.add(new Phong(w[0],w[1],Long.valueOf(w[2]),Double.valueOf(w[3])));
        }
        t = Integer.valueOf(sc.nextLine());
        while(t-->0){
            Khach khach = new Khach(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            String loai = khach.maPhong.substring(2,3);
            Phong phong = null;
            for (Phong ph : phs) {
                if(ph.kiHieu.equals(loai)){
                    phong = ph;
                    break;
                }
            }
            double tong = (khach.soNgay==0?khach.soNgay+1:khach.soNgay) * (phong.donGia * (1 + phong.phi));
            if(khach.soNgay >= 30) tong *= 0.94;
            else if(khach.soNgay >= 20) tong *= 0.96;
            else if(khach.soNgay >= 10) tong *= 0.98;
            tong = Math.round(tong*100.)/100.;
            khach.tienTra = tong;
            khs.add(khach);
        }   
        Collections.sort(khs);
        khs.forEach(System.out::println);
    }
}
