/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vao_ra_file.J07037;

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
        Scanner sc = new Scanner(new File("DN.in"));
        ArrayList<Company> c = new ArrayList<>();
        int t = Integer.valueOf(sc.nextLine());
        while(t-->0){
            c.add(new Company(sc.nextLine(),sc.nextLine(),Integer.valueOf(sc.nextLine())));
        }
        Collections.sort(c);
        for (Company comp : c) {
            System.out.println(comp);
        }
    }
}
