/*  TÌM TỪ THUẬN NGHỊCH DÀI NHẤT
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/**
 *
 * @author Cuong
 */
public class J03020 {
    static boolean check(String s){
        int len = s.length();
        for(int i=0;i<len/2;i++)
            if(s.charAt(i)!=s.charAt(len-i-1)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        Map<String,Integer> mp = new TreeMap<>();
        int max_len = 0;
        while(sc.hasNext()){
            String str = sc.next();
            if(check(str))
                if(mp.containsKey(str)) mp.put(str, mp.get(str)+1);
                else{
                    max_len = Math.max(max_len,str.length());
                    mp.put(str,1);
                    l.add(str);
                }
        }
        for (String i : l)
            if(i.length()==max_len) System.out.println(i+" "+mp.get(i));
    }
}
