/* ĐIỆN THOẠI CỤC GẠCH
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterString;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J03021 {
    public static boolean symme(String s){
        int len = s.length();
        for(int i=0;i<len/2;i++)
            if(s.charAt(i)!=s.charAt(len-i-1)) return false;
        return true;
    }
    public static void main(String[] args) {
        Map<String,String> mp = new HashMap<>();
        mp.put("2","ABCabc");
        mp.put("3","DEFdef");
        mp.put("4","GHIghi");
        mp.put("5","JKLjkl");
        mp.put("6","MNOmno");
        mp.put("7","PQRSpqrs");
        mp.put("8","TUVtuv");
        mp.put("9","WXYZwxyz");
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine(),rs = "";
            for(int i=0;i<s.length();i++){
                for (String key: mp.keySet())
                    if(mp.get(key).contains(s.substring(i, i+1)))
                        rs += key;
            }
            System.out.println(symme(rs)?"YES":"NO");
        }
    }
}
