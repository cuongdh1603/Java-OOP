/*
SỐ 0 VÀ SỐ 9

Cho số tự nhiên N. Hãy tìm số nguyên dương X nhỏ nhất được tạo bởi số 9 và số 0 chia hết cho N. Ví dụ với N = 5 ta sẽ tìm ra  X = 90.

Input:
Dòng đầu tiên ghi lại số lượng test T (T≤100).
Những dòng kế tiếp mỗi dòng ghi lại một test. Mỗi test là một số tự nhiên N được ghi trên một dòng (N≤100).
Output:
Đưa ra theo từng dòng số X nhỏ nhất chia hết cho N tìm được .
 */
package ung_dung_java_collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class J08024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Deque<Integer> dq = new ArrayDeque<>();
            dq.add(9);
            while(true){
                Integer a = dq.getFirst();
                dq.remove(a);
                if(a%n==0){
                    System.out.println(a);
                    break;
                }
                else{
                    dq.add(a*10);
                    dq.add(a*10+9);
                }
            }
        }
    }
}
