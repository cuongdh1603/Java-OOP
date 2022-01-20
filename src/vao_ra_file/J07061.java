/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vao_ra_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 *
 * @author Cuong
 */
public class J07061 {
    static boolean check(int n){
        int k = n%10;
        n /= 10;
        while(n>0){
            if(k<n%10) return false;
            k = n%10;
            n /= 10;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> arr1 = (List<Integer>) ois1.readObject();
        List<Integer> arr2 = (List<Integer>) ois2.readObject();
        int d1[] = new int[10003];
        int d2[] = new int[10003];
        for (int i : arr1) {
            if(check(i)) d1[i]++;
        }
        for (Integer integer : arr2) {
            if(check(integer)) d2[integer]++;
        }
        for(int i=10;i<d1.length;i++){
            if(d1[i]>0&&d2[i]>0) System.out.println(i+" "+d1[i]+" "+d2[i]);
        }
    }
}
