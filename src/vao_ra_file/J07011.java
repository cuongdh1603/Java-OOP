/*
THỐNG KÊ TỪ KHÁC NHAU TRONG FILE VĂN BẢN

Cho file văn bản VANBAN.in có N dòng trong đó có thể có các dấu câu như dẩy phẩy (,) dấu chấm (.) dấu chấm hỏi (?) dấu chấm cảm (!) dấu hai chấm (:) dấu chấm phẩy (;) dấu ngoặc đơn, dấu gạch ngang (-), dấu gạch chéo (/).  
Hãy liệt kê các từ khác nhau xuất hiện trong đoạn văn bản theo thứ tự số lần xuất hiện giảm dần.
Chú ý:
Khi thống kê thì không phân biệt chữ hoa, chữ thường.
Bỏ qua các dấu câu đã liệt kê ở trên khi tách từ
Input - file văn bản VANBAN.in
Dòng đầu ghi số N không quá 1000.
Tiếp theo là N dòng mô tả văn bản. Mỗi dòng không quá 500 ký tự.
Output
Ghi ra danh sách các từ (ở dạng in thường) theo thứ tự số lần xuất hiện giảm dần.
Trong trường hợp số lần xuất hiện bằng nhau thì liệt kê theo thứ tự từ điển tăng dần.
*/
package vao_ra_file;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Word {
    String word;
    int freq;
    public Word(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }
    @Override
    public String toString() {
        return word + " " + freq;
    }
}
class SortByFreq implements Comparator<Word>{
    @Override
    public int compare(Word o1, Word o2) {
        if (o1.freq > o2.freq) return -1;
        else if (o1.freq == o2.freq && o1.word.compareTo(o2.word) < 0) return -1;
        return 1;
    }
}
public class J07011 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Map<String, Integer> mp = new HashMap<>();
        ArrayList<Word> words = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s[] = sc.nextLine().toLowerCase().split("\\W+");
            for (String x : s)
                mp.put(x, mp.containsKey(x)?mp.get(x)+1:1);
        }
        for (String x : mp.keySet())
            if (!x.equals(""))
                words.add(new Word(x, mp.get(x)));
        Collections.sort(words, new SortByFreq());
        for (Word w : words) System.out.println(w);
        sc.close();
    }
}

