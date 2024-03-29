/*
LIỆT KÊ NHÂN VIÊN THEO CHỨC VỤ

Thu nhập của cán bộ công nhân viên trong công ty X được tính bao gồm lương chính (bằng lương cơ bản nhân số ngày công) cộng với phụ cấp chức vụ (được tính riêng theo từng chức vụ cụ thể).
Phụ cấp chức vụ được quy định như sau (đơn vị nghìn đồng):
GD: 500
PGD: 400
TP: 300
KT: 250
Các trường hợp khác: 100.
Mỗi tháng sẽ có tạm ứng. Quy tắc tính tạm ứng như sau:
Nếu (Phụ cấp chức vụ + Lương)*2/3 < 25000 thì  Tạm ứng = (Phụ cấp chức vụ + Lương)*2/3 (làm tròn - round - đến hàng ngàn)
Ngược lại:  Tạm ứng = 25000
Viết chương trình nhập danh sách nhân viên và lập bảng kê thu nhập trong tháng theo chức vụ.

Input
Dòng đầu ghi số nhân viên (không quá 50)
Mỗi nhân viên ghi trên 4 dòng gồm:
Họ và tên (không quá 50 chữ cái)
Chức vụ
Lương cơ bản
Số ngày công
Mã nhân viên cần được tự điền tăng dần, bắt đầu từ NV01
Dòng cuối cùng ghi chức vụ cần liệt kê
 

Output
Ghi ra danh sách nhân viên có chức vụ phù hợp với từ khóa cần tìm (theo đúng thứ tự ban đầu). Mỗi nhân viên bao gồm các thông tin:
Mã nhân viên
Họ và tên
Phụ cấp chức vụ
Lương chính
Tạm ứng
Còn lại
Các thông tin viết cách nhau một khoảng trống
 */
package J05044;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()),gen_id = 1;
        ArrayList<Employee> emp = new ArrayList<>();
        while(t-->0){
            emp.add(new Employee(gen_id++,sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Double.parseDouble(sc.nextLine())));
            
        }
        String s = sc.nextLine();
        for (Employee employee : emp) {
            if(employee.lev.equals(s))
                System.out.println(employee);
        }
    }
    
}
/*
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
TP
*/