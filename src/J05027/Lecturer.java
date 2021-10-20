/* TÌM KIẾM GIẢNG VIÊN
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05027;
import java.util.StringTokenizer;
/**
 *
 * @author Cuong
 */
public class Lecturer {
    String ID;
    String name;
    String major;
    public Lecturer(int num_id, String name, String major) {
        String str_id = String.valueOf(num_id);
        while (str_id.length() < 2) {
            str_id = '0' + str_id;
        }
        this.ID = "GV" + str_id;
        this.name = name;
        this.major = abbreMajor(major);
    }
    public static String abbreMajor(String str) {
        StringTokenizer token = new StringTokenizer(str.toUpperCase());
        String rs = "";
        while (token.hasMoreTokens()) {
            rs += token.nextToken().charAt(0);
        }
        return rs;
    }
    @Override
    public String toString() {
        return this.ID + " " + this.name + " " + this.major;
    }
}
/*
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
1
aN
*/