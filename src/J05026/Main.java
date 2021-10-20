/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05026;
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
	while(t-->0) {
            String name = sc.nextLine();
            String major = sc.nextLine();
            gv.add(new Lecturer(gen_id++, name, major));
	}
	t = Integer.parseInt(sc.nextLine());
	while (t-->0) {
            String majorSearch = sc.nextLine();
            String search = Lecturer.abbreMajor(majorSearch);
            System.out.println("DANH SACH GIANG VIEN BO MON "+search+":");
            for (Lecturer giangVien : gv) 
		if(giangVien.major.equals(search))
                    System.out.println(giangVien);
        }
    }
}
/*
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
1
Cong nghe phan mem
*/