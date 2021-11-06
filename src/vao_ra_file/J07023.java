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

/**
 *
 * @author Cuong
 */
public class J07023 {
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static boolean isSymm(int n){
        int m = 0,tmp = n;
        while(n>0){
            m = m*10 + n%10;
            n /= 10;
        }
        return tmp == m;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream oinp1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream oinp2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>)oinp1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>)oinp2.readObject();
        int a1[] = new int[10003];
        int a2[] = new int[10003];
        for (Integer i1 : arr1) 
            a1[i1]++;
        for (Integer i2 : arr2)
            a2[i2]++;
        for (int i=0;i<a1.length;i++) {
            if(isPrime(i) && isSymm(i) && a1[i]>0 && a2[i]>0)
                System.out.println(i+" "+a1[i]+" "+a2[i]);
        }
    }
}
