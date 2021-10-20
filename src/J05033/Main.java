/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05033;
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
        List<Time> tm = new ArrayList<>();
        while(t-->0){
            int h,m,s;
            h = sc.nextInt();
            m = sc.nextInt();
            s = sc.nextInt();
            tm.add(new Time(h,m,s));
        }
        Collections.sort(tm,new compare());
        for (Time time : tm) System.out.println(time);
    }
}
/*
3
11 20 20
14 20 14
11 15 12
*/