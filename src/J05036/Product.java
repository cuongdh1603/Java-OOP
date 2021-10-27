/*
 TÍNH GIÁ BÁN - 1

Cửa hàng tạp hóa cần tính toán các chi phí liên quan để quyết định giá bán. Mỗi mặt hàng có tên hàng, đơn vị tính, đơn giá nhập và số lượng. Các chi phí khác tính như sau:
Phí vận chuyển = (đơn giá nhập * số lượng) *5%. Cần làm tròn (round) đến hàng đơn vị.
Thành tiền = đơn giá nhập * số lượng + phí vận chuyển. Cần làm tròn (round) đến hàng đơn vị.
Giá bán = Thành tiền + 2% Thành tiền. (ở đây giá bán được hiểu là tổng số tiền muốn thu về với cả lô hàng hóa đó, không phải giá bán lẻ từng sản phẩm).
Hãy lập bảng tính toán giá bán cho cửa hàng nhé.

Input
Dòng đầu ghi số mặt hàng (không quá 50)
Mỗi mặt hàng ghi trên 4 dòng lần lượt là: tên hàng, đơn vị tính, đơn giá nhập, số lượng.
Output
Ghi ra danh sách mặt hàng gồm các thông tin:
Mã hàng (tự động tăng theo thứ tự nhập, tính từ MH01)
Tên hàng
Đơn vị tính
Phí vận chuyển
Thành tiền
Giá bán
 */
package J05036;

/**
 *
 * @author Cuong
 */
public class Product {
    String ID,name,unit;
    double shippingFee,money,price;

    public Product(int numID, String name, String unit, double priceInput, double quantity) {
        ID = "MH" + String.format("%02d", numID);
        this.name = name;
        this.unit = unit;
        this.shippingFee = makeRound(priceInput*quantity*5/100);
        this.money = makeRound(priceInput*quantity + this.shippingFee);
        this.price = this.money*102/100;
    }
    static double makeRound(double n){
        long tmp = (long)n;
        if(Math.abs(tmp-n)>=0.5) return tmp+1;
        else return tmp;
    }
    @Override
    public String toString() {
        return ID + " " + name + " " + unit + " " + String.format("%.0f %.0f %.0f", shippingFee,money,price);
    }
    
}
