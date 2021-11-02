/*
DÃY CON TĂNG DẦN

Cho dãy số a[] có n phần tử là các số nguyên dương khác nhau từng đôi một. Hãy liệt kê tất cả các dãy con có từ 2 phần tử trở lên của dãy a[] thỏa mãn tính chất tăng dần.
Dãy con tạo được bằng cách lấy ra các phần tử trong dãy a[] nhưng vẫn giữ nguyên thứ tự ban đầu.
Coi mỗi dãy con như một xâu ký tự với các phần tử cách nhau một khoảng trống, hãy liệt kê theo thứ tự tử điển.
Input - file DAYSO.in
Dòng đầu ghi số n (không quá 20)
Dòng thứ 2 ghi n số của dãy a[]. Các số khác nhau từng đôi một và có giá trị không quá 100.
Output
Ghi ra lần lượt các dãy con tăng dần theo thứ tự từ điển.
*/
package Basic;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Cuong
 */
class MyArray implements Comparable<MyArray>{
    ArrayList<Integer> arr = new ArrayList<>();
    String arrString;
    public MyArray() {
    }
    public void addNew(int n){
        this.arr.add(n);
    }
    @Override
    public int compareTo(MyArray o) {
        for (Integer integer : arr) 
            arrString += String.valueOf(integer) + " ";
        for (Integer integer : o.arr) 
            o.arrString += String.valueOf(integer) + " ";
        return -this.arrString.compareTo(o.arrString);
    }

}
public class J07008 {
    public static void main(String[] args) throws FileNotFoundException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("DAYSO.in"));
        
    }
}
