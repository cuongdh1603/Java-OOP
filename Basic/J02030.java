/* SẮP XẾP CHÈN - LIỆT KÊ NGƯỢC
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
public class J02030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l1 = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            l1.add(x);
            Collections.sort(l1);
            List<Integer> l2 = new ArrayList<>(l1);
            ans.add(l2);
        }
        for(int i=ans.size()-1;i>=0;i--){
            System.out.print("Buoc "+i+": ");
            for(int j:ans.get(i))
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
