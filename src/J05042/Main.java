/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05042;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        List<SinhVien> sv = new ArrayList<>();
        while(t-->0){
            String ten = sc.nextLine();
            String w[] = sc.nextLine().split(" ");
            sv.add(new SinhVien(ten,Long.valueOf(w[0]),Long.valueOf(w[1])));
        }
        Collections.sort(sv);
        sv.forEach(System.out::println);
    }
}
/*
2
Nguyen Van Nam
168 600
Tran Thi Ngoc
168 600
*/