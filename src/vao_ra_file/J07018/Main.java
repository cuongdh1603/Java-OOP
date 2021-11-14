/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vao_ra_file.J07018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.valueOf(sc.nextLine()),gen_id = 1;
        ArrayList<Student> stu = new ArrayList<>();
        while(t-->0)
            stu.add(new Student(gen_id++,sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.valueOf(sc.nextLine())));
        for (Student student : stu){
            System.out.println(student);
        }
    }
}
