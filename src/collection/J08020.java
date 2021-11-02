/*
KIỂM TRA DÃY NGOẶC ĐÚNG

Cho một xâu chỉ gồm các kí tự ‘(‘, ‘)’, ‘[‘, ‘]’, ‘{‘, ‘}’. Một dãy ngoặc đúng được định nghĩa như sau:
-     Xâu rỗng là 1 dãy ngoặc đúng.
-     Nếu A là 1 dãy ngoặc đúng thì (A), [A], {A} là 1 dãy ngoặc đúng.
-     Nếu A và B là 2 dãy ngoặc đúng thì AB là 1 dãy ngoặc đúng.
Cho một xâu S. Nhiệm vụ của bạn là xác định xâu S có là dãy ngoặc đúng hay không?

Input:
Dòng đầu tiên là số lượng bộ test T (T ≤ 20).
Mỗi test gồm 1 xâu S có độ dài không vượt quá 100 000.

Output: 
Với mỗi test, in ra “YES” nếu như S là dãy ngoặc đúng, in ra “NO” trong trường hợp ngược lại.
*/
package collection;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Cuong
 */
public class J08020 {
    static boolean isClose(char c){
        return c == ')' || c == ']' ||c == '}';
    }
    static boolean isOpen(char c){
        return c == '(' || c == '[' ||c == '{';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            Stack<Character> st = new Stack<>();
            String s = sc.nextLine();
            for(int i=0;i<s.length();i++){
                if(isOpen(s.charAt(i))){
                    st.push(s.charAt(i));
                }
                else{
                    if(!st.empty()&&isOpen(st.peek())){
                        if((st.peek()=='('&&s.charAt(i)==')')||(st.peek()=='['&&s.charAt(i)==']')||(st.peek()=='{'&&s.charAt(i)=='}')){
                            st.pop();
                        }
                    }
                    else st.push(s.charAt(i));
                }
            }
            System.out.println(st.empty()?"YES":"NO");
        }
    }
}
/*
Input:
2
[()]{}{[()()]()}
[(])
Output:
YES
NO
*/