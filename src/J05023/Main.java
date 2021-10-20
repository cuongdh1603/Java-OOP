/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05023;
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
	List<Student> sv = new ArrayList<>();
	while(t-->0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String classroom = sc.nextLine();
            String email = sc.nextLine();
            sv.add(new Student(id, name, classroom, email));
	}
	int q = Integer.parseInt(sc.nextLine());
	while(q-->0) {
            String course = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA "+course+":");
            course = course.substring(2);
            for (Student sinhVien : sv) 
		if(sinhVien.classroom.subSequence(1,3).equals(course))
                    System.out.println(sinhVien);
	}
    }
}

/*
4
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
2015
*/