/* RÚT GỌN XÂU KÝ TỰ
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xau_ki_tu;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Cuong
 */
public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(!st.empty()&&st.peek()==s.charAt(i)) st.pop();
            else st.push(s.charAt(i));
        }
        if(st.empty()) System.out.print("Empty String");
        else{
            Iterator<Character> it = st.iterator();
            while (it.hasNext()) System.out.print(it.next());
        }
        System.out.println();
    }
}
