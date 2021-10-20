package J05006;

import java.util.LinkedList;
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
        List<NhanVien> nv = new LinkedList<>();
        int gen_id = 1;
        while(t-->0){
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String DOB = sc.nextLine();
            String address = sc.nextLine();
            String taxCode = sc.nextLine();
            String contrastDate = sc.nextLine();
            NhanVien sv = new NhanVien(gen_id,name,gender,DOB,address,taxCode,contrastDate);
            nv.add(sv);
            gen_id++;
        }
        for (NhanVien nhanVien : nv) System.out.println(nhanVien);
    }
}
/*
3
Nguyen Van A
Nam
22/10/1982
Mo Lao-Ha Dong-Ha Noi
8333012345
31/12/2013
Ly Thi B
Nu
15/10/1988
Mo Lao-Ha Dong-Ha Noi
8333012346
22/08/2011
Hoang Thi C
Nu
04/02/1981
Mo Lao-Ha Dong-Ha Noi
8333012347
22/08/2011
*/