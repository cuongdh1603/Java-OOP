/*
HÓA ĐƠN - 2

Khai báo lớp Khách hàng với các thuộc tính:
Mã khách hàng: tự động tăng, tính từ KH001
Tên khách hàng: xâu ký tự độ dài không quá 50
Giới tính: Nam hoặc Nu
Ngày sinh: Theo đúng chuẩn dd/mm/yyyy
Địa chỉ: xâu ký tự độ dài không quá 100
Khai báo lớp Mặt hàng với các thuộc tính:

Mã mặt hàng: tự động tăng, tính từ MH001
Tên mặt hàng: xâu ký tự độ dài không quá 100
Đơn vị tính: xâu ký tự độ dài không quá 10
Giá mua: số nguyên dương không quá 7 chữ số
Giá bán: số nguyên dương không quá 7 chữ số
Khai báo lớp Hóa đơn trong đó có các thông tin:

Mã hóa đơn
Khách hàng
Mặt hàng
Số lượng (không quá 1000)
Viết chương trình nhập danh sách hóa đơn và in danh sách ra màn hình.
Input - có 3 file văn bản

File KH.in
Dòng đầu ghi số N là số khách hàng (không quá 20).
Tiếp theo là thông tin của N khách hàng, mỗi khách hàng ghi trên 4 dòng theo đúng thứ tự đã mô tả (không có mã)

File MH.in
Dòng đầu ghi số M là số mặt hàng (không quá 40).
Tiếp theo là thông tin của M mặt hàng, mỗi mặt hàng ghi trên 4 dòng theo đúng thứ tự đã mô tả (không có mã)
File HD.in
Dòng đầu theo ghi số K là số hóa đơn (không quá 100)
Mỗi hóa đơn ghi trên 1 dòng gồm 3 thông tin theo đúng thứ tự đã mô tả (không có mã).

Output
Ghi ra danh sách hóa đơn theo đúng thứ tự nhập, trong đó gồm các thông tin sau, mỗi thông tin cách nhau đúng một khoảng trống.
Mã hóa đơn
Tên khách hàng
Địa chỉ
Tên mặt hàng
Đơn vị tính
Giá mua
Giá bán
Số lượng
Thành tiền
 */
package J07020;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("KH.in"));
        Scanner sc2 = new Scanner(new File("MH.in"));
        Scanner sc3 = new Scanner(new File("HD.in"));
        ArrayList<Customer> cus = new ArrayList<>();
        ArrayList<Product> pro = new ArrayList<>();
        ArrayList<Bill> bil = new ArrayList<>();
        int t = Integer.valueOf(sc1.nextLine()),gen_id = 1;
        while (t-->0) {            
            cus.add(new Customer(gen_id++,sc1.nextLine(),sc1.nextLine(),sc1.nextLine(),sc1.nextLine()));
        }
        gen_id = 1;
        t = Integer.valueOf(sc2.nextLine());
        while (t-->0) {            
            pro.add(new Product(gen_id++,sc2.nextLine(),sc2.nextLine(),Long.valueOf(sc2.nextLine()),Long.valueOf(sc2.nextLine())));
        }
        gen_id = 1;
        t = Integer.valueOf(sc3.nextLine());
        while (t-->0) {            
            String s[] = sc3.nextLine().split(" ");
            boolean exit = false;
            for (Customer cu : cus) {
                for (Product product : pro) {
                    if(s[0].equals(cu.ID)&&s[1].equals(product.ID)){
                        bil.add(new Bill(gen_id++,cu,product,Long.valueOf(s[2])));
                        exit = true;
                        break;
                    }
                }
                if(exit) break;
            }
        }
        for (Bill bill : bil) {
            System.out.println(bill);
        }
    }
}
