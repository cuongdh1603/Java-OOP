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
import java.util.TreeSet;

/**
 *
 * @author Cuong
 */
public class J07030 {
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0) return false;
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>)ois1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>)ois2.readObject();
        TreeSet<Integer> ts = new TreeSet<>(arr1);
        ArrayList<Integer> arr = new ArrayList<>();
        for (Integer i : ts) 
            if(i<500000)
                if(isPrime(i))
                    if(arr2.contains(1000000-i)&&isPrime(1000000-i))
                        arr.add(i);
        for (Integer i : arr) {
            System.out.println(i+" "+(1000000-i));
        }
    }
}
