/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05020;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> lt = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ID = sc.nextLine();
            String name = sc.nextLine();
            String classroom = sc.nextLine();
            String email = sc.nextLine();
            lt.add(new Student(ID,name,classroom,email));
        }
        Collections.sort(lt, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.classroom.compareTo(o2.classroom)>0) return 1;
                else if(o1.classroom.compareTo(o2.classroom)<0) return -1;
                else return o1.ID.compareTo(o2.ID);
            }
            
        });
        for(Student stu : lt) System.out.println(stu);
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
D15CQKT02-B
*/