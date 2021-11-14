/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07027;

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
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("BAITAP.in"));
        Scanner sc3 = new Scanner(new File("NHOM.in"));
        ArrayList<Student> stu = new ArrayList<>();
        ArrayList<Homework> hw = new ArrayList<>();
        int t = Integer.valueOf(sc1.nextLine());
        while(t-->0){
            stu.add(new Student(sc1.nextLine(),sc1.nextLine(),sc1.nextLine()));
        }
        t = Integer.valueOf(sc2.nextLine());
        int id = 1;
        while(t-->0){
            hw.add(new Homework(id++,sc2.nextLine()));
        }
        while(sc3.hasNextLine()){
            String w[] = sc3.nextLine().split(" ");
            for (Student s : stu) {
                if(s.ID.equalsIgnoreCase(w[0])){
                    s.homework = hw.get(Integer.valueOf(w[1])-1);
                }
            }
        }
        Collections.sort(stu);
        for (Student student : stu) {
            System.out.println(student);
        }
    }
}
