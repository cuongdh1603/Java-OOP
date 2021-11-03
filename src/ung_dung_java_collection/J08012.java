/* HÌNH SAO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ung_dung_java_collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
/**
 *
 * @author Cuong
 */
public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Set<Integer>> mp = new TreeMap<>();
        int n = sc.nextInt();
        for(int i=0;i<n-1;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            Set<Integer> st1 = mp.get(u);
            Set<Integer> st2 = mp.get(v);
            if(st1==null){
                st1 = new HashSet<Integer>();
                st1.add(v);
                mp.put(u, st1);
            }
            else mp.get(u).add(v);
            if(st2==null){
                st2 = new HashSet<Integer>();
                st2.add(u);
                mp.put(v, st2);
            }
            else mp.get(v).add(u);
        }
        int check1 = 0,checkN = 0;
        for (Map.Entry<Integer, Set<Integer>> entry : mp.entrySet())
            if(entry.getValue().size()==n-1) check1++;
            else if(entry.getValue().size()==1) checkN++;
        System.out.println(check1==1&&checkN==n-1?"Yes":"No");
    }
}
