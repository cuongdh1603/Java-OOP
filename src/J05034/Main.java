/* DANH SÁCH THỰC TẬP - 1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05034;
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
        int t = Integer.parseInt(sc.nextLine()), gen_id = 1;
        List<Student> sv = new ArrayList<Student>();
        while (t-- > 0) 
            sv.add(new Student(gen_id++, sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine(), sc.nextLine()));
        Collections.sort(sv, new compareByName());
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String name = sc.nextLine();
            for (Student sinhVien : sv)
                if (sinhVien.getDoanhNghiep().equals(name))
                    System.out.println(sinhVien);
        }
    }
}
