/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vao_ra_file.J07033;

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
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.valueOf(sc.nextLine());
        //sc.nextLine();
        ArrayList<Student> arr = new ArrayList<>();
        while(t-->0){
            arr.add(new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(arr);

                for (Student student : arr) 
                System.out.println(student);

        
    }
}
/*
2
B15DCKT150
NGUYEN NGOC SON
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
NguyeN   TrONg Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
*/