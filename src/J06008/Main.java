/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06008;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = Integer.valueOf(sc.nextLine());
        int t = t1;
        ArrayList<Subject> sub = new ArrayList<>();
        while(t1-->0){
            String s = sc.nextLine();
            sub.add(new Subject(s.substring(0,7),s.substring(7,s.length())));
        }
        int t2 = Integer.valueOf(sc.nextLine());
        HashMap<String,String> lec = new HashMap<>();
        while(t2-->0){
            String s = sc.nextLine();
            if(!lec.containsKey(s.substring(0,4)))
                lec.put(s.substring(0,4), s.substring(5));
        }
        int t3 = Integer.valueOf(sc.nextLine());
        LinkedHashMap<String, Double> mp = new LinkedHashMap<>();
        while(t3-->0){
            String s = sc.nextLine();
            String s2 = s.substring(0,13).trim();
            Double s3 = Double.valueOf(s.substring(13,s.length()));
            if(!mp.containsKey(s2))
                mp.put(s2, s3);
        }
        HashMap<String,Double> mp1 = new HashMap<>();
        for(Map.Entry<String, Double> entry: mp.entrySet()){
            String key = entry.getKey().substring(0,4);
            Double value = entry.getValue();
            mp1.put(key, mp1.containsKey(key)?mp1.get(key)+value:value);
        }
        String tk = sc.nextLine();
        System.out.println("Giang vien: "+lec.get(tk));
        for(Map.Entry<String,Double> entry : mp.entrySet()){
            String key = entry.getKey();
            String name = key.substring(5,12);
            Double value = entry.getValue();
            for(int i=0;i<t;i++){
                if(name.contains(sub.get(i).ID)){
                    name = sub.get(i).toString();
                    break;
                }
            }
            if(key.contains(tk))
                System.out.println(name+" "+value);
        }
        System.out.println(String.format("Tong: %.2f",mp1.get(tk)));
    }
}
/*
2
INT1155 Tin hoc co so 2
INT1306 Cau truc du lieu va giai thuat
2
GV01 Nguyen Van An
GV02 Hoang Binh Minh
2
GV01 INT1155 113.2
GV02 INT1306 126.72
GV01
*/