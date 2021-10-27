/*
TÍNH TOÁN HÓA ĐƠN BÁN QUẦN ÁO

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
Nếu số lượng >= 150 thì Giảm giá = 50% * Thành tiền                                    
Nếu số lượng >= 100 thì Giảm giá = 30% * Thành tiền                                    
Nếu số lượng >= 50 thì Giảm giá = 15% * Thành tiền
Input
Dòng đầu ghi số loại sản phẩm. Thông tin về loại sản phẩm ghi trên 4 dòng gồm: mã, tên, giá loại 1, giá loại 2.
Tiếp theo là một dòng ghi số lượng hóa đơn. Mỗi hóa đơn chỉ có 1 dòng ghi mã hóa đơn ban đầu (3 ký tự) và số lượng mua.

Output
Ghi ra danh sách hóa đơn theo đúng thứ tự nhập gồm các thông tin:
Mã hóa đơn (đầy đủ)
Tên sản phẩm
Số tiền giảm giá
Số tiền phải trả
 */
package J06001;

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
        ArrayList<Product> pro = new ArrayList<>();
        ArrayList<Bill> bill = new ArrayList<>();
        while(t-->0)
            pro.add(new Product(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        int q = Integer.parseInt(sc.nextLine()),gen_id = 1;
        while(q-->0){
            String dt[] = sc.nextLine().split(" ");
            String ID = dt[0];
            int quanti = Integer.valueOf(dt[1]);
            for (Product p : pro) 
                if(p.ID.equals(ID.substring(0, 2))){
                    bill.add(new Bill(ID,gen_id++,p,quanti));
                    break;
                }
        }
        for (Bill b : bill) System.out.println(b);
    }
}
/*
2
AT
Ao thun
80000
45000
QJ
Quan Jean
220000
125000
2
AT1 95
QJ2 105
*/