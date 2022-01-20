/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07057;

import java.util.StringTokenizer;

/**
 *
 * @author Cuong
 */
public class ThiSinh implements Comparable<ThiSinh>{
    String ma,ten,dToc,tt;
    int kv;
    double diem;

    public ThiSinh(int ma, String ten, double diem, String dToc,int kv) {
        this.ma = String.format("TS%02d", ma);
        this.ten = getFormatName(ten);
        this.dToc = dToc;
        this.diem = diem;
        this.kv = kv;
        if(kv==1) this.diem += 1.5;
        else if(kv==2) this.diem += 1;
        if(!dToc.equalsIgnoreCase("KINH")) this.diem += 1.5;
        if(this.diem>=20.5) tt = "Do";
        else tt = "Truot";
    }
    static String getFormatName(String name){
        String rs = "";
        StringTokenizer tok = new StringTokenizer(name.toLowerCase());
        while(tok.hasMoreTokens()){
            String s = tok.nextToken();
            rs += s.substring(0,1).toUpperCase() + s.substring(1) + " ";
        }
        return rs.substring(0,rs.length()-1);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + diem + " " + tt;
    }    

    @Override
    public int compareTo(ThiSinh o) {
        if(this.diem<o.diem) return 1;
        else if(this.diem>o.diem) return -1;
        else return this.ma.compareTo(o.ma);
    }
}
