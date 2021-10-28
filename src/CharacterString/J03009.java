/* TẬP TỪ RIÊNG CỦA HAI XÂU
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterString;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] l1 = s1.split(" ");
            String[] l2 = s2.split(" ");
            LinkedList<String> list1 = new LinkedList<String>();
            LinkedList<String> list2 = new LinkedList<String>();
            for (String str : l1) if(str.length()>0&&!list1.contains(str)) list1.add(str);
            for (String str : l2)
                if(str.length()>0) list2.add(str);
            Collections.sort(list1, new Comparator<String>(){
                @Override
                public int compare(String o1, String o2) {
                    int result = o1.compareTo(o2);
                    return result;
                }                
            });
            for (String str : list1) 
                if(!list2.contains(str)) 
                    System.out.print(str+" ");
            System.out.println();
        }
    }
}
