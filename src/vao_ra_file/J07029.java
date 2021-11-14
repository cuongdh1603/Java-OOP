/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vao_ra_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Cuong
 */
public class J07029 {
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0) return false;
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>)ois.readObject();
        ArrayList<Integer> arr1 = new ArrayList<>();
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        Collections.sort(arr);
        Collections.reverse(arr);
        for (int i=0;i<arr.size();i++) {
            if(mp.size()<10){
                if(isPrime(arr.get(i))){
                    mp.put(arr.get(i), mp.containsKey(arr.get(i))?mp.get(arr.get(i))+1:1);
                }
            }
            else if(mp.size()>=10){
                if(!isPrime(arr.get(i))) break;
            };
        }
        for (Map.Entry<Integer,Integer> entry : mp.entrySet()) {
            arr1.add(entry.getKey());
        }
        Collections.reverse(arr1);
        for (Integer i : arr1) {
            System.out.println(i+" "+mp.get(i));
        }
    }
}
