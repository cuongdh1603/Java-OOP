/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06007;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        ArrayList<Lecturer> lec = new ArrayList<>();
        while(t-->0){
            String s = sc.nextLine();
        }
        t = Integer.valueOf(sc.nextLine());
        while(t-->0){
            String w[] = sc.nextLine().split(" ");
            String name = "";
            for(int i=1;i<w.length;i++){
                if(i==w.length-1) name += w[i];
                else name += w[i] + " ";
            }
            lec.add(new Lecturer(w[0],name));
        }
        t = Integer.valueOf(sc.nextLine());
        while(t-->0){
            String w[] = sc.nextLine().split(" ");
            for (Lecturer l : lec) {
                if(w[0].equals(l.ID))
                    l.addTime(Double.valueOf(w[2]));
            }
        }
        for (Lecturer l : lec) {
            System.out.println(l);
        }
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
*/