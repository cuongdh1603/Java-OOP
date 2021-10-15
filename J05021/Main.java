package J05021;
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
        List<SinhVien> sv = new ArrayList<>();
        while(sc.hasNextLine()){
            String Id = sc.nextLine();
            String name = sc.nextLine();
            String classroom = sc.nextLine();
            String email = sc.nextLine();
            sv.add(new SinhVien(Id,name,classroom,email));
        }
        Collections.sort(sv,new CompareByID());
        for (SinhVien sinhVien : sv) System.out.println(sinhVien);
    }
}
/*
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
D15CQKT03-B
sv4@stu.ptit.edu.vn
*/