/*  BỘ BA SỐ PYTAGO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Cuong
 */
public class J02016 {
    static boolean checkTriplet(List<Long> arr, int n) {
        long maximum = Collections.max(arr);
        Map<Long, Integer> hash = new HashMap<>();
        for (Long i : arr)
            hash.put(i, hash.containsKey(i) ? hash.get(i) + 1 : 1);
        Set<Long> set = hash.keySet();
        for (Long i : set)
            for (Long j : arr) {
                if ((i == j && hash.get(i) == 1))
                    continue;
                Long val = (long) Math.sqrt(i * i + j * j);
                if ((val * val) != (i * i + j * j))
                    continue;
                if (val > maximum)
                    continue;
                if (hash.containsKey(val)) 
                    return true;
            }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while(t-->0){
            int n = sc.nextInt();
            List<Long> a = new ArrayList<>();
            for (int j = 0; j < n; j++) 
                a.add(sc.nextLong());
            System.out.println(checkTriplet(a, n)?"YES":"NO");
        }
    }
}
