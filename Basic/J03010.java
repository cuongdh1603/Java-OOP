/* ĐỊA CHỈ EMAIL
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String,Integer> mp = new HashMap<String, Integer>();
        while(t-->0){
            String s = sc.nextLine();
            String postfix = "@ptit.edu.vn";
            String[] w = s.toLowerCase().split(" ");
            ArrayList<String> list = new ArrayList<>();
            for (String s1 : w) 
                if(s1.length()>0) list.add(s1);
            int ln = list.size();
            String email = list.get(ln-1);
            for(int i=0;i<ln-1;i++) email += list.get(i).charAt(0);
            mp.put(email, mp.containsKey(email) ? mp.get(email) + 1 : 1);
            if(mp.get(email)>1) email += String.valueOf(mp.get(email));
            System.out.println(email+postfix);
        }
    }
}
