/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05071;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cuong
 */
public class CuocGoi {
    String thueBao;
    String bd,kt;
    long gia,tg;
    ThanhPho thanhPho = null;
    static Map<Integer,ThanhPho> tp = new HashMap<>();
    public CuocGoi(String thueBao, String bd, String kt) {
        this.thueBao = thueBao;
        this.bd = bd;
        this.kt = kt;
        String s[] = bd.split(":");
        long tbd = Long.valueOf(s[0])*60 + Long.valueOf(s[1]);
        s = kt.split(":");
        long tkt = Long.valueOf(s[0])*60 + Long.valueOf(s[1]);
        tg = tkt - tbd;
        if(thueBao.contains("-")){
            thanhPho = tp.get(Integer.valueOf(thueBao.substring(1,3)));
            gia = thanhPho.gia * tg;
        }
        else{
            tg = (tg%3==0)?tg/3:tg/3+1;
            gia = 800 * tg;
        }
    }

    @Override
    public String toString() {
        if(thanhPho==null){
            return thueBao + " " + "Noi mang" + " " + tg + " " + gia;
        }
        else
            return thueBao + " " + thanhPho.ten + " " + tg + " " + gia;
    }
}
