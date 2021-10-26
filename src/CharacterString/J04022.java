/*
WORDSET

Trong lập trình cơ bản, một từ được hiểu là một dãy ký tự liên tiếp không chứa khoảng trống, dấu tab hoặc dấu xuống dòng.
Xây dựng lớp WordSet để quản lý tập hợp các từ khác nhau trong một xâu ký tự, sau khi đã chuyển hết về dạng chữ thường. Khi liệt kê thì tập từ thì sẽ luôn theo thứ tự từ điển tăng dần.
Viết chương trình nhập hai dòng ký tự và hiển thị hợp và giao của hai tập từ tương ứng.

Input
Chỉ có 2 dòng, mỗi dòng có độ dài không quá 1000 ký tự.

Output
Dòng 1 ghi hợp của 2 tập từ theo thứ tự từ điển
Dòng 2 ghi giao của 2 tập từ theo thứ tự từ điển.
 */
package CharacterString;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Cuong
 */
class WordSet{
    TreeSet<String> st = new TreeSet<>();

    public WordSet() {
    }

    public WordSet(String s) {
        StringTokenizer token = new StringTokenizer(s.toLowerCase());
        while(token.hasMoreTokens())
            st.add(token.nextToken());
    }
    public WordSet union(WordSet o){
        WordSet ws = new WordSet();
        for (String str1 : this.st) 
            for (String str2 : o.st) {
                ws.st.add(str1);
                ws.st.add(str2);
            }
            //if(st2.contains(str1)) st4.add(str1);
        return ws;
    }
    public WordSet intersection(WordSet o){
        WordSet ws = new WordSet();
        for (String str : this.st) 
            if(o.st.contains(str)) ws.st.add(str);
        return ws;
    }

    @Override
    public String toString() {
        String s = "";
        for (String string : st) s += string + " ";
        return s;
    }
    
}
/*
Bài tập này yêu cầu sử dụng hàm main cho sẵn như sau:
Java
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
*/
public class J04022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordSet s1 = new WordSet(sc.nextLine());
        WordSet s2 = new WordSet(sc.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
/*
Lap trinh huong doi tuong
Ngon ngu lap trinh C++
*/