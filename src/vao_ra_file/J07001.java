/* ĐỌC FILE VĂN BẢN
    Cho file văn bản DATA.in
    Hãy đọc toàn bộ nội dung của file và in ra màn hình theo đúng định dạng ban đầu. 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vao_ra_file;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J07001 {
    public static void main(String[] args) throws IOException {
        File file = new File("DATA.in");
        if(!file.exists()) file.createNewFile();
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
