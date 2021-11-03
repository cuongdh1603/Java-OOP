/* CẶP SỐ CÓ TỔNG BẰNG K
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ung_dung_java_collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class J08015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong(),ans = 0;
            List<Long> l = new ArrayList<>();
            Map<Long,Long> mp = new HashMap<>();
            for(int i=0;i<n;i++){
                long x = sc.nextLong();
                l.add(x);
                mp.put(x,mp.containsKey(x)?mp.get(x)+1:1);
            }
            for(int i=0;i<n;i++){
                long res = k - l.get(i);
                if(mp.containsKey(res)){
                    if(res==l.get(i))
                        ans += mp.get(res)-1;
                    else ans += mp.get(res);
                }
            }
            System.out.println(ans/2);
        }
    }
}
