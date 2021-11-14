package vao_ra_file;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cuong
 */
class Data implements Comparable<Data>{
    String str;
    int q;

    public Data(String str, int q) {
        this.str = str;
        this.q = q;
    }
    
    @Override
    public int compareTo(Data o) {
        if(this.q < o.q) return 1;
        else if(this.q > o.q) return -1;
        else return this.str.compareTo(o.str);
    }

    @Override
    public String toString() {
        return str+" "+q; //To change body of generated methods, choose Tools | Templates.
    }
    
}
public class J07012 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arr = (ArrayList<String>)ois.readObject();
        HashMap<String,Integer> hmap = new HashMap<>();
        ArrayList<Data> dt = new ArrayList<>();
        for (String s : arr) {
            String w[] = s.toLowerCase().split("\\W+");
            for (String s1 : w) {
                if(!s1.equals(""))
                hmap.put(s1, hmap.containsKey(s1)?hmap.get(s1)+1:1);
            }
        }
        for (Map.Entry<String,Integer> entry: hmap.entrySet()) {
            dt.add(new Data(entry.getKey(),entry.getValue()));
        }
        Collections.sort(dt);
        for (Data data : dt) {
            System.out.println(data);
        }
    }
}
