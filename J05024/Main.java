/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05024;
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
            String major = sc.nextLine(),major_ID = null;
            if(major.equalsIgnoreCase("Ke toan")) major_ID = "DCKT";
            else if(major.equalsIgnoreCase("Cong nghe thong tin")) major_ID = "DCCN";
            else if(major.equalsIgnoreCase("An toan thong tin")) major_ID = "DCAT";
            else if(major.equalsIgnoreCase("Vien thong")) major_ID = "DCVT";
            else if(major.equalsIgnoreCase("Dien tu")) major_ID = "DCDT";
            System.out.println("DANH SACH SINH VIEN NGANH "+major.toUpperCase()+":");
            if(major_ID.equals("DCCN")||major_ID.equals("DCAT")) {
                for (Student sinhVien : sv) {
                    if(sinhVien.ID.contains(major_ID)&&sinhVien.classroom.charAt(0)!='E')
			System.out.println(sinhVien);
		}
            }
            else {
		for (Student sinhVien : sv) {
                    if(sinhVien.ID.contains(major_ID))
			System.out.println(sinhVien);
		}
            }
	}
    }
}
