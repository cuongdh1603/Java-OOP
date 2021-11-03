/*
BIỂN SỐ ĐẸP

Biển số xe máy được quy định gồm các thành phần:

Hai chữ số đầu là mã quản lý theo tỉnh – thành phố (ví dụ mã của Hà Nội là 29 đến 31)
Sau đó là một chữ cái in hoa (từ A đến Z) và một chữ số. Cặp chữ cái và chữ số này được cấp theo khu vực quận – huyện.
Tiếp theo là dấu gạch ngang, rồi đến một dãy 5 số gồm 2 cụm: 3 chữ số đầu và hai chữ số sau, phân tách bởi dấu chấm.
Thông thường, người ta chỉ quan tâm đến 5 chữ số cuối. Giả sử các trường hợp sau được coi là đẹp:

Cả 5 chữ số được sắp theo thứ tự tăng chặt từ trái qua phải.
Cả 5 chữ số đều bằng nhau
Ba chữ số đầu bằng nhau và hai chữ số cuối bằng nhau
Cả 5 chữ số đều là 6 và/hoặc 8 (số lộc phát).
Theo quy tắc trên, các biển số sau được coi là đẹp:

29T1-123.79
29T1-555.55
29T1-222.33
29T1-686.88
Và các biển số sau không đẹp:
29T1-123.33
29T1-555.54
29T1-606.88
Viết chương trình kiểm tra xem các biển số xe có đẹp hay không.

Dữ liệu vào
Dòng đầu ghi số bộ test, không quá 50
Mỗi bộ test là một biển số. Dữ liệu vào đảm bảo biển số được viết đúng quy định. 
Kết quả
In ra kết quả kiểm tra với từng bộ test
 */
package xau_ki_tu;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J03040 {
    static boolean check1(char c[]){
        return ((c[0]<c[1]&&c[1]<c[2]&&c[2]<c[3]&&c[3]<c[4])||(c[1]==c[0]&&c[2]==c[0]&&c[3]==c[0]&&c[4]==c[0])||(c[0]==c[1]&&c[2]==c[0]&&c[3]==c[4]));
    }
    static boolean check2(char c[]){
        for(int i=0;i<5;i++)
            if(c[i]!='6'&&c[i]!='8') return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine().substring(5).replace(".", "");
            char c[] = s.toCharArray();
            System.out.println(check1(c)||check2(c)?"YES":"NO");
        }
    }
}
/*
7
29T1–123.45
29T1–555.55
29T1–222.33
29T1–686.88
29T1–123.33
29T1–555.54
29T1–606.88
*/