/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07028;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
        List<MonHoc> mh = new ArrayList<>();
        Map<String,String> gv = new HashMap<>();
        List<GioChuan> gc = new ArrayList<>();
        int t = Integer.valueOf(sc1.nextLine());
        while(t-->0){
            String w[] = sc1.nextLine().split(" ");
            mh.add(new MonHoc(w[0],""));
        }
        t = Integer.valueOf(sc2.nextLine());
        while(t-->0){
            String w[] = sc2.nextLine().split(" ");
            String s = "";
            for(int i=1;i < w.length;i++)
                s += w[i] + " ";
            s = s.substring(0, s.length()-1);
            gv.put(w[0], s);
        }
        t = Integer.valueOf(sc3.nextLine());
        while(t-->0){
            String w[] = sc3.nextLine().split(" ");
            gc.add(new GioChuan(w[0],w[1],Double.valueOf(w[2])));
        }
        Set<String> st = new HashSet<>();
        for(int i=0;i<gc.size();i++){
            String ma = gc.get(i).maGv;
            if(!st.contains(ma)){
                st.add(ma);
                double tongGio = gc.get(i).gio;
                for(int j=i+1;j<gc.size();j++)
                    if(gc.get(j).maGv.equals(ma))
                        tongGio += gc.get(j).gio;
                System.out.println(gv.get(ma)+" "+String.format("%.02f", tongGio));
            }    
        }
    }
}
