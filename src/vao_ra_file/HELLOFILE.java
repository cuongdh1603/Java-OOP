/*
HELLO FILE

Dữ liệu văn bản chứa trong file Hello.txt
Yêu cầu đọc nội dung từ file văn bản Hello.txt và in kết quả ra màn hình.

Input:
Không có dữ liệu vào

Output:
Nội dung trong file văn bản Hello.txt
 */
package vao_ra_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class HELLOFILE {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Hello.txt"));
        while (sc.hasNextLine()) {            
            System.out.println(sc.nextLine());
        }
    }
}
