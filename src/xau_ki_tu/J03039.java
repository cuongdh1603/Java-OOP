/*
CHIA HẾT

Cho hai số nguyên dương a và b không quá 500 chữ số. Hãy kiểm tra xem a chia hết cho b hoặc b chia hết cho a hay không.

Input
Dòng đầu ghi số bộ test
Mỗi bộ test viết trên 1 dòng hai số nguyên dương, cách nhau một khoảng trống. Mỗi số có không quá 500 chữ số.

Output
Với mỗi test, ghi ra YES hoặc NO theo kết quả kiểm tra.
 */
package xau_ki_tu;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s[] = sc.nextLine().split(" ");
            BigInteger a = new BigInteger(s[0]);
            BigInteger b = new BigInteger(s[1]);
            if(b.mod(a).equals(BigInteger.valueOf(0))||a.mod(b).equals(BigInteger.valueOf(0)))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
