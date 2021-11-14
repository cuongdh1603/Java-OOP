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
public class J07031 {
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
        ArrayList<Integer> arr = new ArrayList<>();
        TreeSet<Integer> ts1 = new TreeSet<>(arr1);
        TreeSet<Integer> ts2 = new TreeSet<>(arr2);
        for (Integer i : ts1) {
            if(!ts2.contains(i)&&!ts2.contains(1000000-i)){
                if(isPrime(i)&&i<500000){
                    if(ts1.contains(1000000-i)&&isPrime(1000000-i))
                        arr.add(i);
                }
            }
        }
        for (Integer i : arr) {
            System.out.println(i+" "+(1000000-i));
        }
    }
}
