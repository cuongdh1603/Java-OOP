/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05060;

import java.util.ArrayList;
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
        List<PhuHo> ph = new ArrayList<>();
        while(t-->0)
            ph.add(new PhuHo(sc.nextLine(),sc.nextLine(),Double.valueOf(sc.nextLine()),Double.valueOf(sc.nextLine())));
        ph.forEach(System.out::println);
    }
}
/*
3
Doan Thi Kim
13/03/1982
8
9.5
Dinh Thi Ngoc Ha
03/09/1996
6.5
8
Tran Thanh Mai
12/09/2004
8
9
*/