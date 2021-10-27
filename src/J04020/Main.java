/*
LỚP PAIR

Khai báo lớp Pair mô tả các thao tác với cặp số nguyên. Sử dụng lớp Pair để giải quyết bài toán sau (chú ý viết hàm main đúng theo mẫu).
Nhập số tự nhiên N, hãy tìm cặp số nguyên tố đầu tiên có tổng là N.
Nếu không tồn tại cặp số nguyên tố có tổng bằng N, hãy đưa ra -1.

Input:
Dòng đầu tiên đưa vào số lượng bộ test T.
Những dòng kế tiếp đưa vào các bộ test. Mỗi bộ test gồm là một số N được ghi trên một dòng.
T, N thỏa mãn ràng buộc: 1≤T≤100; 1≤ N ≤106
Output:
Đưa ra kết quả mỗi test theo từng dòng.
 */
package J04020;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
