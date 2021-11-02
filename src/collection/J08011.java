/* LIỆT KÊ VÀ ĐẾM
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/**
 *
 * @author Cuong
 */
public class J08011 {
    static boolean check(String s){
        for(int i=0;i<s.length()-1;i++)
            if(s.charAt(i)>s.charAt(i+1)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        Map<String,Integer> mp = new TreeMap<>();
        while(sc.hasNext()){
            String str = sc.next();
            if(check(str))
                if(mp.containsKey(str)) mp.put(str,mp.get(str)+1);
                else{
                    mp.put(str, 1);
                    l.add(str);
                }
        }
        Collections.sort(l,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return -1*mp.get(o1).compareTo(mp.get(o2)); //To change body of generated methods, choose Tools | Templates.
            }
        });
        for (String str : l) System.out.println(str+" "+mp.get(str));
    }
}
