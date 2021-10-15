package J05005;

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
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> sv = new ArrayList<>();
        int gen_id = 1;
        for(int i=0;i<t;i++){
            SinhVien tmp;
            String name = sc.nextLine();
            String className = sc.nextLine();
            String DOB = sc.nextLine();
            double GPA = Double.parseDouble(sc.nextLine());
            tmp = new SinhVien(gen_id,name,className,DOB,GPA);
            sv.add(tmp);
            gen_id++;
        }
        Collections.sort(sv,new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.GPA < o2.GPA) return 1;
                else return -1;
            }
            
        });
        for (SinhVien sinhVien3 : sv) System.out.println(sinhVien3);
    }
}
