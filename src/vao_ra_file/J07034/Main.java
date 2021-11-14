/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vao_ra_file.J07034;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.valueOf(sc.nextLine());
        ArrayList<Subject> sub = new ArrayList<>();
        while(t-->0){
            sub.add(new Subject(sc.nextLine(),sc.nextLine(),Integer.valueOf(sc.nextLine())));
        }
        Collections.sort(sub);
        for (Subject subject : sub) {
            System.out.println(subject);
        }
    }
}
