/*
DANH SÁCH SINH VIÊN TRONG FILE VĂN BẢN

Khai báo lớp Sinh Viên gồm các thông tin: Mã SV, Họ tên, Ngày sinh, Lớp và Điểm GPA (dạng số thực). 
Đọc thông tin N sinh viên từ file văn bản SV.in (không có mã sinh viên) và in ra lần lượt màn hình mỗi dòng 1 sinh viên theo đúng thứ tự ban đầu. Trong đó Mã SV được tự tạo ra theo quy tắc thêm mã B20DCCN sau đó là giá trị nguyên tự động tăng tính từ 001 (tối đa là 099). Ngày sinh được chuẩn hóa về dạng dd/mm/yyyy
Input (file SV.in)
Dòng đầu tiên ghi số sinh viên N (0 < N < 50).
Mỗi sinh viên ghi trên 4 dòng lần lượt là Họ tên, Lớp, Ngày sinh và Điểm GPA.
Trong đó:
Họ tên không quá 30 chữ cái.
Lớp theo đúng định dạng thường dùng ở PTIT
Ngày sinh có đủ 3 phần ngày tháng năm nhưng có thể chưa đúng chuẩn dd/mm/yyyy.
Điểm GPA đảm bảo trong thang điểm 4 với 2 nhiều nhất 2 số sau dấu phẩy.  
Output
Ghi ra màn hình danh sách lần lượt các sinh viên có đầy đủ Mã sinh viên, Họ tên, Lớp, Ngày sinh (đã chuẩn hóa về dạng dd/mm/yyyy), Điểm GPA (với đúng 2 số sau dấu phẩy).
Mỗi sinh viên ghi trên 1 dòng, mỗi thông tin cách nhau 1 khoảng trống.
*/
package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cuong
 */
class Student{
    String ID,name,classroom,DOB;
    double gpa;

    public Student(int numID, String name, String classroom, String DOB, double gpa) {
        String strID = String.valueOf(numID);
        while (strID.length()<3) strID = '0' + strID;
        this.ID = "B20DCCN" + strID;
        this.name = name;
        this.classroom = classroom;
        this.DOB = convertToFormatDate(DOB);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + classroom + " " + DOB + " " + String.format("%.2f", gpa);
    }
    static String convertToFormatDate(String s){
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Date date = dateFormat.parse(s);
            return dateFormat.format(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
public class J07010 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(sc.nextLine()),gen_id = 1;
        ArrayList<Student> arr = new ArrayList<>();
        while(t-->0) 
            System.out.println((new Student(gen_id++,sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()))));
    }
    
}
