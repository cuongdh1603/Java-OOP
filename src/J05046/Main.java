/*
BẢNG KÊ NHẬP KHO

Một cửa hàng điện máy nhập các mặt hàng và muốn thống kê chi phí. Mỗi lô mặt hàng sẽ có tiền chiết khấu và được trừ vào tổng giá tiền của hóa đơn nhập lô hàng đó.
Tiền chiết khấu được tính như sau:
Tiền chiết khấu = Đơn giá * Số lượng * Phần trăm chiết khấu.
Với:
 Phần trăm chiết khấu là 5% nếu số lượng > 10,
 Phần trăm chiết khấu là 2% nếu 8 <= số lượng <= 10,
 Phần trăm chiết khấu là 1% nếu 5 <= số lượng <8,
 Phần trăm chiết khấu là 0 nếu số lượng < 5.
Ngoài ra, để dễ quản lý, nhân viên nhập kho sẽ gán mã mặt hàng cho từng lô hàng. Mã hàng sẽ được tạo ra bằng hai ký tự đầu tiên của tên hàng kèm theo số thứ tự tính từ 01 (giả sử không có nhiều hơn 9 lô hàng cùng loại trong đợt nhập này). Hãy tính thành tiền chi tiết cho các mặt hàng.

Input
Dòng đầu ghi số lượng lô hàng
Mỗi lô hàng ghi trên 3 dòng gồm:
Tên hàng
Số lượng
Đơn giá

Output
Ghi ra danh sách mặt hàng đã tính thành tiền. Thông tin về mỗi lô hàng gồm:
Mã hàng
Tên hàng
Tiền chiết khấu
Thành tiền
*/
package J05046;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Load> ld = new ArrayList<>();
        while(t-->0){
            String n = sc.nextLine();
            String abbre = Load.getID(n);
            int id = 1;
            for (Load load : ld) {
                if(load.ID.substring(0,2).equals(abbre)){
                    System.err.println("y");
                    id++;
                }
            }
            ld.add(new Load(id,n,Long.parseLong(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        for (Load load : ld) {
            System.out.println(load);
        }
    }
}
/*
3
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000
*/