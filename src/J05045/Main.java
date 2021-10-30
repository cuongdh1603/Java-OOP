/*
SẮP XẾP NHÂN VIÊN THEO THU NHẬP

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
Viết chương trình nhập danh sách nhân viên sắp xếp theo thu nhập giảm dần.

Input
Dòng đầu ghi số nhân viên (không quá 50)
Mỗi nhân viên ghi trên 4 dòng gồm:
Họ và tên (không quá 50 chữ cái)
Chức vụ
Lương cơ bản
Số ngày công
Mã nhân viên cần được tự điền tăng dần, bắt đầu từ NV01
 
Output
Ghi ra danh sách nhân viên theo thứ tự thu nhập giảm dần. Nếu 2 nhân viên có thu nhập bằng nhau thì nhân viên nào có mã nhỏ hơn sẽ liệt kê trước. . Mỗi nhân viên bao gồm các thông tin:
Mã nhân viên
Họ và tên
Phụ cấp chức vụ
Lương chính
Tạm ứng
Còn lại
Các thông tin viết cách nhau một khoảng trống
 */
package J05045;

import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(emp,new SortByIncome());
        for (Employee employee : emp) {
            System.out.println(employee);
        }
    }
}
