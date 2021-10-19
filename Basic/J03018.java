/* TÌM SỐ DƯ
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J03018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {            
            String s = sc.next();
            int len = s.length();
            if(len>2) s = s.substring(len-2,len);
            int num = Integer.valueOf(s);
            System.out.println(num%4==0?"4":"0");
        }
    }
}
