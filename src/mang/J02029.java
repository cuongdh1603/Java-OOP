/* SẮP XẾP ĐỔI CHỖ TRỰC TIẾP - LIỆT KÊ NGƯỢC
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J02029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            List<Integer> l1 = new ArrayList<>();
            List<List<Integer>> ans = new ArrayList<>();
            int n = sc.nextInt();
            for(int i=0;i<n;i++) l1.add(sc.nextInt());
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++)
                    if(l1.get(i)>l1.get(j))
                        Collections.swap(l1, i, j);
                List<Integer> l2 = new ArrayList<>(l1);
                ans.add(l2);
            }
            for(int i=ans.size()-1;i>=0;i--){
                System.out.print("Buoc "+(i+1)+": ");
                for(int j:ans.get(i))
                    System.out.print(j+" ");
                System.out.println();
            }
        }
    }
}
