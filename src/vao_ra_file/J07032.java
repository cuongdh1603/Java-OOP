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
public class J07032 {
    static boolean check(int n){
        int tmp = n,m = 0,c = 0;
        while(n>0){
            int k = n%10;
            if(k%2==0) return false;
            c++;
            m = m*10 + k;
            n /= 10;
        }
        if(c%2 == 0 || c < 3) return false;
        return m == tmp;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>)ois1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>)ois2.readObject();
        TreeSet<Integer> ts = new TreeSet<>();
        int a[] = new int[1000003];
        for (Integer i : arr1) {
            if(arr2.contains(i)&&check(i)) ts.add(i);
            if(ts.size()>=10) break;
        }
        for (Integer i : arr1)
            if(ts.contains(i)) a[i]++;
        for (Integer i : arr2)
            if(ts.contains(i)) a[i]++;
        for (int i : ts) 
            System.out.println(i+" "+a[i]);
    }
}
