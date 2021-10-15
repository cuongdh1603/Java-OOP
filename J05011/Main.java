package J05011;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Gamer> g = new LinkedList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String playerCode = sc.nextLine();
            String name = sc.nextLine();
            String timeIn = sc.nextLine();
            String timeOut = sc.nextLine();
            g.add(new Gamer(playerCode,name,timeIn,timeOut));
            
        }
        Collections.sort(g,new compareByTime());
        for (Gamer gamer : g) {
            System.out.println(gamer);
        }
    }
}
/*
3
01T
Nguyen Van An
09:00
10:30
06T
Hoang Van Nam
15:30
18:00
02I
Tran Hoa Binh
09:05
10:00
*/