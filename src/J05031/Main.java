/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05031;
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
        int t = Integer.parseInt(sc.nextLine());
        List<Student> sv = new ArrayList<Student>();
        while (t-- > 0) 
            sv.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(),Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        Collections.sort(sv, new compareByMaSV());
        int i = 1;
        for (Student sinhVien : sv) System.out.println((i++) + " " + sinhVien);
    }
}
