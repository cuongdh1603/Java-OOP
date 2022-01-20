/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07036;

import java.util.StringTokenizer;

/**
 *
 * @author Cuong
 */
public class SinhVien {
    String ma,ten,lop,email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = formatName(ten);
        this.lop = lop;
        this.email = email;
    }
    static String formatName(String name){
        String rs = "";
        StringTokenizer tok = new StringTokenizer(name.toLowerCase());
        while(tok.hasMoreTokens()){
            String s = tok.nextToken();
            rs += s.substring(0,1).toUpperCase() + s.substring(1) + " ";
        }
        return rs.substring(0,rs.length()-1);
    }
}
