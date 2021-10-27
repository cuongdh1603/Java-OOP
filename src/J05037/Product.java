/*
TÍNH GIÁ BÁN - 2

Cửa hàng tạp hóa cần tính toán các chi phí liên quan để quyết định giá bán. Mỗi mặt hàng có tên hàng, đơn vị tính, đơn giá nhập và số lượng. Các chi phí khác tính như sau:
Phí vận chuyển = (đơn giá nhập * số lượng) *5%. Cần làm tròn (round) đến hàng đơn vị.
Thành tiền = đơn giá nhập * số lượng + phí vận chuyển. Cần làm tròn (round) đến hàng đơn vị.
Giá bán = (Thành tiền + 2% Thành tiền)/số lượng. (ở đây giá bán được hiểu là giá bán lẻ từng sản phẩm, làm tròn lên đến đơn vị hàng trăm).
Hãy lập bảng tính toán giá bán lẻ cho cửa hàng.

Input
Dòng đầu ghi số mặt hàng (không quá 50)
Mỗi mặt hàng ghi trên 4 dòng lần lượt là: tên hàng, đơn vị tính, đơn giá nhập, số lượng.
Output
Ghi ra danh sách mặt hàng đã được sắp xếp theo giá bán lẻ giảm dần gồm các thông tin:
Mã hàng (tự động tăng theo thứ tự nhập, tính từ MH01)
Tên hàng
Đơn vị tính
Phí vận chuyển
Thành tiền
Giá bán lẻ
 */
package J05037;

import java.util.Comparator;

/**
 *
 * @author Cuong
 */
public class Product implements Comparable<Product>{
    String ID,name,unit;
    double shippingFee,money,price;
    public Product(int ID,String name,String unit,double priceInput,double quantity){
        this.ID = "MH" + String.format("%02d", ID);
        this.name = name;
        this.unit = unit;
        this.shippingFee = makeRound(priceInput*quantity*0.05);
        this.money = makeRound(priceInput*quantity + this.shippingFee);
        this.price = Math.ceil((priceInput*quantity + priceInput*quantity*0.05)*1.02/quantity/100)*100;
//        System.out.println(this.price);
    }
    static double makeRound(double n){
        long tmp = (long)n;
        if(Math.abs(tmp-n)<0.5) return tmp;
        else return tmp+1;
    }
    @Override
    public String toString() {
        return ID + " " + name + " " + unit + " " + String.format("%.0f %.0f %.0f",shippingFee,money,price);
    }

    @Override
    public int compareTo(Product o) {
        if(this.price < o.price) return 1;
        else return -1;
    }
    
}

