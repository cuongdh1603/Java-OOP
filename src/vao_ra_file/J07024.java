/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vao_ra_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Cuong
 */
class WordSet2{
    TreeSet<String> set = new TreeSet<>();

    public WordSet2() {
    }
    
    public WordSet2(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNextLine()){
            String s = sc.nextLine().toLowerCase();
            StringTokenizer tok = new StringTokenizer(s);
            while(tok.hasMoreTokens())
                set.add(tok.nextToken());
        }
    }
    public WordSet2 difference(WordSet2 o){
        WordSet2 s = new WordSet2();
        for (String str : set) {
            if(!o.set.contains(str))
                s.set.add(str);
        }
        return s;
    }
    @Override
    public String toString() {
        String rs = "";
        for (String s : set) {
            rs += s + " ";
        }
        return rs; //To change body of generated methods, choose Tools | Templates.
    }
    
}
public class J07024 {
    public static void main(String[] args) throws IOException{
        WordSet2 s1 = new WordSet2("DATA1.in");
        WordSet2 s2 = new WordSet2("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
