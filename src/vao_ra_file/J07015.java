/*
SỐ NGUYÊN TỐ TRONG FILE NHỊ PHÂN

Cho file nhị phân SONGUYEN.in trong đó ghi một ArrayList<Integer> theo kiểu object. Các giá trị đều nguyên dương và nhỏ hơn 10000.
Hãy viết chương trình trình liệt kê các số nguyên tố khác nhau xuất hiện trong file theo thứ tự tăng dần và số lần xuất hiện của các số đó.

Input
File nhị phân SONGUYEN.in

Output
Ghi ra các số nguyên tố khác nhau theo thứ tự tăng dần và số lần xuất hiện.
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
public class J07015 {
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0) return false;
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream inp = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>)inp.readObject();
        int ds[] = new int[10003];
        for (Integer integer : arr)
            ds[integer] ++;
        for (int i=0;i<ds.length;i++) 
            if(ds[i]>0&&isPrime(i)) System.out.println(i+" "+ds[i]);
    }
}
