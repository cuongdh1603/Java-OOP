/*
LIỆT KÊ TỪ KHÁC NHAU

Cho file văn bản VANBAN.in.
Một từ được định nghĩa là một dãy ký tự liên tiếp không có khoảng trống, dấu tab hay dấu xuống dòng. Tạm thời chưa xét đến các dấu câu trong bải toán này.
Hãy chuyển tất cả các từ về dạng chữ thường sau đó liệt kê các từ khác nhau xuất hiện trong file VANBAN.in theo thứ tự từ điển.

Input
File VANBAN.in có không quá 200 dòng.

Output
Ghi ra danh sách các từ khác nhau xuất hiện trong file. Mỗi từ trên một dòng theo thứ tự từ điển.
 */
package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Cuong
 */
class WordSet{
    TreeSet<String> st = new TreeSet<>();
    public WordSet(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNextLine()){
            String line = sc.nextLine().toLowerCase();
            StringTokenizer token = new StringTokenizer(line);
            while(token.hasMoreTokens())
                st.add(token.nextToken());
        }
    }
    @Override
    public String toString() {
        String str = "";
        for (String string : st) 
            str += string + "\n";
        return str;
    }
}
public class J07007 {
    public static void main(String[] args) throws IOException{
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
