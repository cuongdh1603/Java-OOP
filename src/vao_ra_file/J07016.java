/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vao_ra_file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
/**
 *
 * @author Cuong
 */
public class J07016 {
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0) return false;
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oip1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream oip2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>)oip1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>)oip2.readObject();
        int a1[] = new int[10003];
        int a2[] = new int[10003];
        for (Integer i : arr1) {
            a1[i]++;
        }
        for (Integer i : arr2) {
            a2[i]++;
        }
        for(int i=2;i<a1.length;i++)
            if(isPrime(i)&&a1[i]>0&&a2[i]>0)
                System.out.println(i+" "+a1[i]+" "+a2[i]);
    }
}
