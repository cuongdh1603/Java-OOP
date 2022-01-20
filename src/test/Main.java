/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;//J07041

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Cuong
 */
public class Main {
    static int gcd(int x,int y){
        if(y==0) return x;
        else return gcd(y,x%y);
    }
    static boolean check(int x,int y){
        return gcd(x,y)==1;
    }
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Pair> arr = (ArrayList<Pair>) ois.readObject();
        Collections.sort(arr);
        Set<Pair> st = new HashSet<>();
        for (Pair p : arr) {
            if(p.getFirst() < p.getSecond()){
                if(!st.contains(p)&&check(p.getFirst(), p.getSecond())){
                    System.out.println(p);
                    st.add(p);
                } 
            }
        }
    }
}
