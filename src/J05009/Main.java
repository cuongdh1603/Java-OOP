/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05009;

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
        List<ThiSinh> ts = new ArrayList<>();
        int t = Integer.valueOf(sc.nextLine());
        while(t-->0){
            ts.add(new ThiSinh(sc.nextLine(),sc.nextLine(),Double.valueOf(sc.nextLine()),Double.valueOf(sc.nextLine()),Double.valueOf(sc.nextLine())));
        }
        Collections.sort(ts);
        for (ThiSinh t1 : ts) {
            if(t1.tong==ts.get(0).tong)
                System.out.println(t1);
            else break;
        }
    }
}
/*
3
Nguyen Van A
12/12/1994
3.5
7.0
5.5
Nguyen Van B
1/9/1994
7.5
9.5
9.5
Nguyen Van C
6/7/1994
8.5
9.5
8.5
*/