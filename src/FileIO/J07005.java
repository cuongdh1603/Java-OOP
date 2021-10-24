/*
SỐ KHÁC NHAU TRONG FILE - 2

Cho file nhị phân DATA.IN có đúng 100000 số nguyên dương, giá trị các số nhỏ hơn 1000.
Hãy liệt kê các số khác nhau xuất hiện trong file và số lần xuất hiện của từng số đó.

Input
File DATA.IN có 100000 số nguyên dương.

Output
Ghi ra các số khác nhau và số lần xuất hiện theo thứ tự tăng dần
 */
package FileIO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Cuong
 */
public class J07005 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream inp = new DataInputStream(new FileInputStream("DATA.IN"));
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int t = 100000;
        while(t-->0){
            int val = inp.readInt();
            map.put(val, map.containsKey(val)?map.get(val)+1:1);
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
//Reference: https://www.tutorialspoint.com/java/java_datainputstream.htm