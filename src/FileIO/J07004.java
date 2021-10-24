/*
    SỐ KHÁC NHAU TRONG FILE - 1
    Cho file văn bản DATA.in có không quá 100000 số nguyên dương, giá trị các số nhỏ hơn 1000.
    Hãy liệt kê các số khác nhau xuất hiện trong file và số lần xuất hiện của từng số đó.
    Input
    File DATA.in có không quá 100000 số nguyên dương.
    Output
    Ghi ra các số khác nhau và số lần xuất hiện theo thứ tự tăng dần
 */
package FileIO;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/**
 *
 * @author Cuong
 */
public class J07004 {
    public static void main(String[] args) throws IOException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        TreeMap<Integer,Integer> map = new TreeMap<>();
        while (sc.hasNextInt()) {            
            int v = sc.nextInt();
            map.put(v, map.containsKey(v)?map.get(v)+1:1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue());
    }
}
