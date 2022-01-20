/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07058;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.valueOf(sc.nextLine());
        List<MonThi> mt = new ArrayList<>();
        while(t-->0){
            mt.add(new MonThi(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(mt);
        mt.forEach(System.out::println);
    }
}
