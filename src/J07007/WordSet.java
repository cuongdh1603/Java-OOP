/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07007;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Cuong
 */
public class WordSet {
    TreeSet<String> ts = new TreeSet<>();
    
    public WordSet(String file) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(file));
        while(sc.hasNextLine()){
            String s = sc.nextLine().toLowerCase();
            StringTokenizer tok = new StringTokenizer(s);
            while(tok.hasMoreTokens()){
                
                ts.add(tok.nextToken());
            }
        }
    }


    @Override
    public String toString() {
        String str = "";
        for (String t : ts) {
            str += t+"\n";
        }
        return str; //To change body of generated methods, choose Tools | Templates.
    }
    
}
