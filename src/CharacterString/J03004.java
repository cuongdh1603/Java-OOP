/* CHUẨN HÓA XÂU HỌ TÊN - 1
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterString;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            String[] w = s.toLowerCase().split(" ");
            for(int i=0;i<w.length;i++)
                if(w[i].length()>0){
                    String word = w[i];
                    word = Character.toUpperCase(word.charAt(0))+word.substring(1);
                    System.out.print(word+" ");
                }
            System.out.println();
        }
    }
}
