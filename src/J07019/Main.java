/*
HÓA ĐƠN - 1


Cửa hàng quần áo bán một số loại sản phẩm, mỗi loại được chia thành hai loại: loại 1 và loại 2 với giá bán khác nhau.

Loại sản phẩm được mô tả gồm:

Mã loại: 2 chữ cái
Tên sản phẩm
Đơn giá loại 1
Đơn giá loại 2
Mỗi hóa đơn mua hàng sẽ có 2 thông tin:

Mã hóa đơn, ban đầu chỉ có 3 ký tự
Hai ký tự đầu tương ứng với mã loại
Tiếp theo là chữ số 1 hoặc 2 cho biết loại sản phẩm
Khi nhập dữ liệu, mã hóa đơn được bổ sung dấu gạch ngang và thứ tự hóa đơn, tính từ 001.  

Số lượng mua
Hãy lập bảng tính tiền phải trả cho mỗi hóa đơn, biết rằng hóa đơn có thể có giảm giá tính theo quy tắc sau:

- Nếu số lượng >= 150 thì Giảm giá = 50% * Thành tiền                                    

- Nếu số lượng >= 100 thì Giảm giá = 30% * Thành tiền                                    

- Nếu số lượng >= 50 thì Giảm giá = 15% * Thành tiền

Input: Có 2 file dữ liệu đều ở dạng file văn bản. 

File DATA1.in

Dòng đầu ghi số loại sản phẩm. Thông tin về loại sản phẩm ghi trên 4 dòng gồm: mã, tên, giá loại 1, giá loại 2.
File DATA2.in
Dòng đầu ghi số lượng hóa đơn. Mỗi hóa đơn chỉ có 1 dòng ghi mã hóa đơn ban đầu (3 ký tự) và số lượng mua.

Output
Ghi ra danh sách hóa đơn theo đúng thứ tự nhập gồm các thông tin:
Mã hóa đơn (đầy đủ)
Tên sản phẩm
Số tiền giảm giá
Số tiền phải trả
 */
package J07019;

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
        Scanner sc1 = new Scanner(new File("DATA1.in"));
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        ArrayList<Product> pro = new ArrayList<>();
        ArrayList<Bill> bl = new ArrayList<>();
        int t = Integer.parseInt(sc1.nextLine()),genId = 1;
        while(t-->0){
            pro.add(new Product(sc1.nextLine(),sc1.nextLine(),Long.parseLong(sc1.nextLine()),Long.parseLong(sc1.nextLine()))); 
        }
        t = Integer.parseInt(sc2.nextLine());
        while(t-->0){
            String s[] = sc2.nextLine().split(" ");
            for (Product pr : pro) {
                if(pr.ID.equals(s[0].substring(0,2))){
                    bl.add(new Bill(s[0],genId++,pr,Long.valueOf(s[1])));
                    break;
                }
            }
        }
        for (Bill bill : bl) {
            System.out.println(bill);
        }
    }
}
