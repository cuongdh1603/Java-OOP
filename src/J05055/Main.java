/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05055;

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
        int t = Integer.valueOf(sc.nextLine()),id = 1;
        List<VDV> v = new ArrayList<>();
        while(t-->0)
            v.add(new VDV(id++,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        Collections.sort(v,new sortByThanhTich());
        int xh = 1;
        for(int i=0;i<v.size();i++){
            if(i==0||v.get(i).tGianXepHang!=v.get(i-1).tGianXepHang)
                xh = i+1;
            v.get(i).xepLoai = xh;
        }
        Collections.sort(v,new sortByMa());
        for (VDV vdv : v) 
            System.out.println(vdv);
    }
}
/*
3
Nguyen Van Thanh
20/03/1990
07:00:00
07:10:01
Nguyen Hoa Binh
01/10/1993
07:02:00
07:11:20
Le Thanh Van
15/03/1998
07:05:00
07:15:30
*/