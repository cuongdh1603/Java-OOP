/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05070;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Club> clubs = new ArrayList<>();
        List<Match> matchs = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine()), stt = 1;
        while(t-->0){
            clubs.add(new Club(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine())));
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String w[] = sc.nextLine().split(" ");
            String ma = w[0];
            long cdv = Long.parseLong(w[1]);
            for (Club club : clubs) {
                if(ma.subSequence(1, 3).equals(club.ma)){
                    matchs.add(new Match(stt++,ma,club,cdv));
                    break;
                }
            }
        }
        Collections.sort(matchs);
        for (Match match : matchs) {
            System.out.println(match);
        }
    }
}
/*
2
AC
AC Milan
12
MU
Manchester United
10
2
IAC1 80000
EMU2 60000
*/