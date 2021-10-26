/*
XỬ LÝ VĂN BẢN

Cho dữ liệu vào là luồng văn bản bất kỳ, gồm các ký tự viết hoa, viết thường, các ký tự số và các dấu câu, không có các ký tự đặc biệt khác. Người ta muốn tách văn bản thành các câu. Mỗi câu in trên một dòng.
Một câu được định nghĩa là dãy ký tự có ít nhất 1 ký tự chữ cái hoặc chữ số, không chứa các dấu ngắt câu gồm: dấu chấm (.), dấu chấm hỏi (?) và dấu chấm cảm (!).
Dấu phẩy (,) và dấu hai chấm (:) không được coi là dấu ngắt câu.
Nhiệm vụ của bạn là in ra mỗi câu trên một dòng, ký tự đầu câu viết hoa, các ký tự khác viết thường, các từ cách nhau đúng một khoảng trống. Không có khoảng trống ở đầu và cuối câu, và không in ra các dấu ngắt câu.

Input
Gồm một luồng văn bản không quá 100 dòng, mỗi dòng không quá 200 ký tự.

Output
In ra các câu, mỗi câu trên một dòng theo quy tắc đã cho.
*/
package CharacterString;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Cuong
 */
public class J03022 {
    static boolean isLastWord(String s){
        return s.endsWith(".") || s.endsWith("?") || s.endsWith("!");
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(new File("Test.txt"));
        List<String> arr = new ArrayList<>();
        String sentence = "";
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            StringTokenizer token = new StringTokenizer(s);
            while(token.hasMoreTokens()){
                String rs = token.nextToken().toLowerCase();
                if(isLastWord(rs)){
                    if(rs.length()>1)
                        sentence += rs.substring(0, rs.length()-1);
                    arr.add(sentence.substring(0,1).toUpperCase()+sentence.substring(1));
                    sentence = "";
                }
                else sentence += rs + " ";         
            }
        }
        for (String string : arr)  System.out.println(string);
    }
}
/*

ky thi LAP TRINH ICPC PTIT  bat dau to chuc     tu     nam 2010. nhu 
vay, nam nay la          tron 10 nam!
    vay CO PHAI NAM NAY LA KY THI LAN THU 10?        khong phai! nam nay
la KY THI LAN THU 11.
*/