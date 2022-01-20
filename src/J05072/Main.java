/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05072;

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
        int t = Integer.valueOf(sc.nextLine());
        while(t-->0)
            CuocGoi.tp.put(Integer.valueOf(sc.nextLine()), new ThanhPho(sc.nextLine(),Long.valueOf(sc.nextLine())));
        t = Integer.valueOf(sc.nextLine());
        List<CuocGoi> cg = new ArrayList<>();
        while(t-->0){
            String w[] = sc.nextLine().split(" ");
            cg.add(new CuocGoi(w[0],w[1],w[2]));
        }
        Collections.sort(cg);
        cg.forEach(System.out::println);
    }
}
/*
2
53
Da Nang
3000
64
Vung Tau
1000
3
064-824531 11:20 11:22
8293567 09:07 09:15
053-823532 12:00 12:05
*/
