/*
TÍNH TỔNG

Cho file dữ liệu dạng văn bản DATA.in có thể chứa cả số và ký tự.
Hãy lọc ra các số nguyên int trong file và tính tổng các số đó.
Chú ý: file dữ liệu có rất nhiều dòng với rất nhiều số và ký tự xen kẽ nhau. Chỉ tính tổng các số thỏa mãn điều kiện là số kiểu int.

Input
File văn bản DATA.in có không quá 1000 dòng.

Output
Ghi ra giá trị tổng các số tính được.
 */
package vao_ra_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J07002 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNextLine()){
            String ele[] = sc.nextLine().split(" ");
            for (String string : ele) {
                if(string.length()<11&&string.matches("[0-9]+"))
                    sum += Long.valueOf(string);
            }
        }
        System.out.println(sum);
    }
}
