/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05007;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<NhanVien> nv = new LinkedList<>();
        int gen_id = 1;
        while(t-->0){
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String DOB = sc.nextLine();
            String address = sc.nextLine();
            String taxCode = sc.nextLine();
            String contrastDate = sc.nextLine();
            NhanVien sv = new NhanVien(gen_id,name,gender,DOB,address,taxCode,contrastDate);
            sv.getInforOfDOB();
            nv.add(sv);
            gen_id++;
        }
        Collections.sort(nv,new compareByAge());
        for (NhanVien nhanVien : nv) System.out.println(nhanVien);
    }
}
