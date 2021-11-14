/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap_trinh_java_co_ban;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J01025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1[] = sc.nextLine().split(" ");
        String n2[] = sc.nextLine().split(" ");
        int a1[] = new int[4];
        int a2[] = new int[4];
        for(int i=0;i<4;i++){
            a1[i] = Integer.valueOf(n1[i]);
            a2[i] = Integer.valueOf(n2[i]);
        } 
        int min_x = Math.min(Math.min(a1[0], a1[2]), Math.min(a2[0], a2[2]));
        int max_x = Math.max(Math.max(a1[0], a1[2]), Math.max(a2[0], a2[2]));
        int min_y = Math.min(Math.min(a1[1], a1[3]), Math.min(a2[1], a2[3]));
        int max_y = Math.max(Math.max(a1[1], a1[3]), Math.max(a2[1], a2[3]));
        int max = Math.max(max_x-min_x, max_y-min_y);
        System.out.println(max*max);
    }
}
/*
6 6 8 8
1 8 4 9
*/