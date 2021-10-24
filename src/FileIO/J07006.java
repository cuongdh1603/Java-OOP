/*
SỐ KHÁC NHAU TRONG FILE - 3

Cho file nhị phân DATA.in có một ArrayList<Integer>, giá trị các số đều lớn hơn hoặc bằng 0 và nhỏ hơn 1000. Có không quá 106 số trong danh sách. 
Hãy liệt kê các số khác nhau xuất hiện trong file và số lần xuất hiện của từng số đó.

Input
File DATA.in lưu một ArrayList<Integer> theo kiểu Object.

Output
Ghi ra các số khác nhau và số lần xuất hiện theo thứ tự tăng dần
 */
package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Cuong
 */
public class J07006 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream inp = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>)inp.readObject();
        int freq[] = new int[1003];
        for (Integer i : arr) freq[i] += 1;
        for (int i = 0;i < freq.length;i ++) 
            if(freq[i]>0)
                System.out.println(i+" "+freq[i]);
    }
}
