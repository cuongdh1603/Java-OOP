/* QUẢN LÝ BÀI TẬP NHÓM – 1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06003;
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
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        List<Student> l1 = new ArrayList<Student>();
        List<Project> l2 = new ArrayList<Project>();
        while (n-- > 0)
            l1.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(),Integer.parseInt(sc.nextLine())));
        int gen_id = 1;
        while (m-- > 0) 
            l2.add(new Project(gen_id++, sc.nextLine()));
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            int k = sc.nextInt();
            System.out.println("DANH SACH NHOM " + k + ":");
            for (Student st : l1) 
                if (st.team == k) 
                    System.out.println(st);
            System.out.println(l2.get(k - 1));
        }
    }
}
