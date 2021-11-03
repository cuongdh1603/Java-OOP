/*
PHẦN TỬ BÊN PHẢI ĐẦU TIÊN LỚN HƠN

Cho dãy số A[] gồm N phần tử. Với mỗi A[i], bạn cần tìm phần tử bên phải đầu tiên lớn hơn nó. Nếu không tồn tại, in ra -1.

Input:
Dòng đầu tiên là số lượng bộ test T (T ≤ 20).
Mỗi test bắt đầu bởi số nguyên N (1 ≤ N ≤ 100000).
Dòng tiếp theo gồm N số nguyên A[i] (0 ≤ A[i] ≤ 109).

Output: 
Với mỗi test, in ra trên một dòng N số R[i], với R[i] là giá trị phần tử đầu tiên lớn hơn A[i].
 */
package ung_dung_java_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Cuong
 */
public class J08022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Long> a = new ArrayList<>();
            for(int i=0;i<n;i++) a.add(sc.nextLong());
            Collections.reverse(a);
            ArrayList<Long> ans = new ArrayList<>();
            Stack<Long> stk = new Stack<>();
            for(int i=0;i<n;i++){
                while(!stk.empty()&&a.get(i)>=stk.peek())
                    stk.pop();
                if(!stk.empty()) ans.add(stk.peek());
                else ans.add(Long.valueOf(-1));
                stk.push(a.get(i));
            }
            Collections.reverse(ans);
            for (Long long1 : ans) 
                System.out.print(long1+ " ");
            System.out.println();
        }
    }
}
/*
3
4
4 5 2 25
3
2 2 2
4
4 4 5 5
*/