/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07059;

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
        Scanner sc = new Scanner(new File("CATHI.in"));
        int t = Integer.valueOf(sc.nextLine()),id = 1;
        List<CaThi> ct = new ArrayList<>();
        while(t-->0){
            ct.add(new CaThi(id++,sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ct);
        for (CaThi caThi : ct) {
            System.out.println(caThi);
        }
    }
}
