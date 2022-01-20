/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07060;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONTHI.in"));
        Scanner sc2 = new Scanner(new File("CATHI.in"));
        Scanner sc3 = new Scanner(new File("LICHTHI.in"));
        Map<String,MonThi> mt = new HashMap<>();
        Map<String,CaThi> ct = new HashMap<>();
        List<LichThi> lt = new ArrayList<>();
        int t = Integer.valueOf(sc1.nextLine());
        while(t-->0){
           mt.put(sc1.nextLine(), new MonThi(sc1.nextLine(),sc1.nextLine()));
            
        }
        t = Integer.valueOf(sc2.nextLine());
        int i = 1;
        while(t-->0){
            ct.put(String.format("C%03d", i++), new CaThi(sc2.nextLine(),sc2.nextLine(),sc2.nextLine()));
        }
        t = Integer.valueOf(sc3.nextLine());
        while(t-->0){
            String w[] = sc3.nextLine().split(" ");
            lt.add(new LichThi(w[0],w[1],ct.get(w[0]),mt.get(w[1]),w[2],w[3]));
        }
        Collections.sort(lt);
        lt.forEach(System.out::println);
    }
}
