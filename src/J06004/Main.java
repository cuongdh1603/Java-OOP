/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06004;

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
        int t = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();
        List<Student> st = new ArrayList<>();
        List<String> pro = new ArrayList<>();
        while(t-->0)
            st.add(new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        while(q-->0)
            pro.add(sc.nextLine());
        Collections.sort(st, new compareByID());
        for (Student s : st) {
            System.out.print(s);
            System.out.println(" "+pro.get(s.getTeam()-1));
        }
    }
}
/*
5 2
B17DTCN001
Nguyen Chi  Linh
0987345543
1
B17DTCN011
Vu Viet Thang
0981234567
1
B17DTCN023
Pham Trong Thang
0992123456
1
B17DTCN022
Nguyen Van  Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
*/