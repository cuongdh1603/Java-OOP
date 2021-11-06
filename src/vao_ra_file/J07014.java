/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vao_ra_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Cuong
 */
class WordSet1{
    TreeSet<String> set = new TreeSet<>();

    public WordSet1() {
    }
    
    public WordSet1(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNextLine()){
            String s = sc.nextLine().toLowerCase();
            StringTokenizer tok = new StringTokenizer(s);
            while(tok.hasMoreTokens()){
                set.add(tok.nextToken());
            }
        }
    }
    public WordSet1 union(WordSet1 o){
        WordSet1 w = new WordSet1();
        for (String str1 : set) {
            for (String str2 : o.set) {
                w.set.add(str1);
                w.set.add(str2);
            }
        }
        return w;
    }
    public WordSet1 intersection(WordSet1 o){
        WordSet1 w = new WordSet1();
        for (String str : set) {
            if(o.set.contains(str))
                w.set.add(str);
        }
        return w;
    }
    @Override
    public String toString() {
        String rs = "";
        for (String string : set) {
            rs += string + " ";
        }
        return rs; //To change body of generated methods, choose Tools | Templates.
    }
    
}
public class J07014 {
    public static void main(String[] args) throws FileNotFoundException {
        WordSet1 s1 = new WordSet1("DATA1.in");
        WordSet1 s2 = new WordSet1("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
