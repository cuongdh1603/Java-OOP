/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ung_dung_java_collection;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Cuong
 */
public class J08021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            int n = s.length(),res = 0;
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='(') st.push(i);
                else{
                    st.pop();
                    if(!st.empty()) res = Math.max(res,i-st.peek());
                    if(st.empty()) st.push(i);
                }
            }
            System.out.println(res);
        }
    }
}
/*
3
((()
)()())
()(()))))
*/