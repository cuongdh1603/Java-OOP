/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05070;

import java.util.StringTokenizer;

/**
 *
 * @author Cuong
 */
public class Match implements Comparable<Match>{
    String ma;
    Club club;
    long cdv,thu;

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Match(int stt, String ma,Club club, long cdv) {
        this.ma = ma;
        this.cdv = cdv;
        this.club = club;
        this.thu = cdv * club.giave;
    }
    public void setThu(){
        this.thu = cdv * club.giave;
    }

    @Override
    public int compareTo(Match o) {
        if(this.thu < o.thu) return 1;
        else if(this.thu > o.thu) return -1;
        else return this.club.ten.compareTo(o.club.ten);
    }

    @Override
    public String toString() {
        return ma + " " + club.ten + " " + thu;
    }
    
}
