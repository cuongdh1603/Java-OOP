/* CHUẨN HÓA XÂU HỌ TÊN - 2
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xau_ki_tu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            String[] w = s.toLowerCase().split(" ");
            List<String> lt = new ArrayList<String>();
            for(int i=0;i<w.length;i++){
                if(w[i].length()>0)
                    lt.add(w[i]);
            }
            String str = lt.get(0);
            lt.set(0, str.toUpperCase());
            for(int i=1;i<lt.size();i++){
                str = lt.get(i);
                str = Character.toUpperCase(str.charAt(0))+str.substring(1);
                if(i<lt.size()-1) System.out.print(str+" ");             
                else System.out.print(str+",");
            }
            System.out.println(" "+lt.get(0));
        }
    }
}
