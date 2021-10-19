/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05027;
import java.util.ArrayList;
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
        int gen_id = 1;
        List<Lecturer> gv = new ArrayList<>();
        while (t-- > 0) {
            String name = sc.nextLine();
            String major = sc.nextLine();
            gv.add(new Lecturer(gen_id++, name, major));
        }
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String search = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + search + ":");
            for (Lecturer giangVien : gv) 
                if (giangVien.name.toLowerCase().contains(search.toLowerCase())) 
                    System.out.println(giangVien);
        }
    }
}
