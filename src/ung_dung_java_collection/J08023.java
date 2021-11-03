/*
HÌNH CHỮ NHẬT LỚN NHẤT

Cho N cột, mỗi cột có chiều cao bằng H[i]. Bạn hãy tìm hình chữ nhật lớn nhất bị che phủ bởi các cột?

Input:
Dòng đầu tiên là số lượng bộ test T (T ≤ 20).
Mỗi test bắt đầu bởi số nguyên N (N ≤ 100 000).
Dòng tiếp theo gồm N số nguyên H[i] (1 ≤ H[i] ≤ 109).

Output: 
Với mỗi test, in ra diện tích hình chữ nhật lớn nhất tìm được.
 */
package ung_dung_java_collection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Cuong
 */
public class J08023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Long> h = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();     
        while(t-->0){
            int n = sc.nextInt();
            long ans = 0;
            h.clear();
            l.clear();
            r.clear();
            Stack<Integer> stk = new Stack<>();
            h.add(Long.valueOf(0));
            for(int i=1;i<=n;i++) h.add(sc.nextLong());
            for(int i=0;i<=n;i++){
                l.add(0);
                r.add(0);
            }
            for(int i=1;i<=n;i++){
                while(!stk.isEmpty()&&h.get(stk.peek())>=h.get(i))
                    stk.pop();
                l.set(i, stk.empty()?0:stk.peek());
                stk.add(i);
                
            }
            while(!stk.empty()) stk.pop();
            for(int i=n;i>0;i--){
                while(!stk.isEmpty()&&h.get(stk.peek())>=h.get(i))
                    stk.pop();
                if(i==1) r.set(i,stk.empty()?n:stk.peek());
                else r.set(i,stk.empty()?n+1:stk.peek());
                stk.add(i);
            }
            for(int i=1;i<=n;i++) ans = Math.max(ans,(r.get(i)-l.get(i)-1)*h.get(i));
            System.out.println(ans);
        }
    }
}
/*
2
7
6 2 5 4 5 1 6
3
2 2 2
*/