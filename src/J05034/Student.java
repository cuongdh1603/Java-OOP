/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05034;
import java.util.Comparator;
/**
 *
 * @author Cuong
 */
public class Student {

    private int stt;
    private String maSV;
    private String hoTen;
    private String lop;
    private String email;
    private String doanhNghiep;

    public Student(int stt, String maSV, String hoTen, String lop, String email, String doanhNghiep) {
        this.stt = stt;
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDoanhNghiep() {
        return doanhNghiep;
    }

    public void setDoanhNghiep(String doanhNghiep) {
        this.doanhNghiep = doanhNghiep;
    }

    @Override
    public String toString() {
        return stt + " " + maSV + " " + hoTen + " " + lop + " " + email + " " + doanhNghiep;
    }
}

class compareByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getHoTen().compareTo(o2.getHoTen());
    }

}
/*
6
B17DCCN016 
Le Khac Tuan Anh 
D17HTTT2   
test1@stu.ptit.edu.vn
VIETTEL
B17DCCN107 
Dao Thanh Dat    
D17CNPM5   
test2@stu.ptit.edu.vn
FPT
B17DCAT092 
Cao Danh Huy     
D17CQAT04-B
test3@stu.ptit.edu.vn
FPT
B17DCCN388 
Cao Sy Hai Long  
D17CNPM2   
test4@stu.ptit.edu.vn
VNPT
B17DCCN461 
Dinh Quang Nghia 
D17CNPM2   
test5@stu.ptit.edu.vn
FPT
B17DCCN554 
Bui Xuan Thai    
D17CNPM1   
test6@stu.ptit.edu.vn
GAMELOFT
1
FPT
*/