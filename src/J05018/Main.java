/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05018;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Student> st = new LinkedList<>();
        int gen_id = 1;
        while(t-->0){
            String name = sc.nextLine();
            Float math = sc.nextFloat();
            Float literature = sc.nextFloat();
            Float foreignLanguage = sc.nextFloat();
            Float physics = sc.nextFloat();
            Float chemistry = sc.nextFloat();
            Float biography = sc.nextFloat();
            Float history = sc.nextFloat();
            Float geography = sc.nextFloat();
            Float civicEducation = sc.nextFloat();
            Float technology = sc.nextFloat();
            sc.nextLine();
            st.add(new Student(gen_id,name,math,literature,foreignLanguage,physics
            ,chemistry,biography,history,geography,civicEducation,technology));
            gen_id++;
        }
        Collections.sort(st,new compareByAverage());
        for (Student student1 : st) System.out.println(student1);
    }
}
/*
3
Luu Thuy Nhi
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
Le Van Tam
8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
Nguyen Thai Binh
9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
*/