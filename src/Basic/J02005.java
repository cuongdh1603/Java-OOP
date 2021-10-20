/* GIAO CỦA HAI DÃY SỐ
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        List<Integer> a = new ArrayList<>(),b = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(!a.contains(x)) a.add(x);
        }
        for(int i=0;i<m;i++){
            int x = sc.nextInt();
            if(!b.contains(x)) b.add(x);
        }
        Collections.sort(a);
        Collections.sort(b);
        for (Integer i : a) 
            if(b.contains(i)) System.out.print(i+" ");
    }
}
