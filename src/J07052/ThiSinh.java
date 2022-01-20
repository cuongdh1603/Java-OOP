/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07052;

import java.util.StringTokenizer;

/**
 *
 * @author Cuong
 */
public class ThiSinh implements Comparable<ThiSinh>{
    String ma,ten;
    double toan,ly,hoa,uuTien,xt;

    public ThiSinh(String ma, String ten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.ten = getFormatName(ten);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        String kv = ma.substring(0, 3);
        if(kv.equals("KV1")) uuTien = 0.5;
        else if(kv.equals("KV2")) uuTien = 1;
        else uuTien = 2.5;
        this.xt = this.toan*2+this.ly+this.hoa+uuTien;
        if(isRound(xt)) xt = (int)xt;
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
    static boolean isRound(double x){
        int n = (int)x;
        return n-x==0;
    }

    @Override
    public String toString() {
        String x = isRound(uuTien)?String.format("%.0f", uuTien):String.format("%.1f", uuTien);
        String y = isRound(xt)?String.format("%.0f", xt):String.format("%.1f", xt);
        return ma + " " + ten + " " + x + " " + y;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.xt<o.xt) return 1;
        else if(this.xt>o.xt) return -1;
        else return this.ma.compareTo(o.ma);
    }
    
}
