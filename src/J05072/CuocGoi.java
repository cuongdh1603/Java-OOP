/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05072;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cuong
 */
public class CuocGoi implements Comparable<CuocGoi>{
    String thueBao,bd,kt;
    long soPhut;
    long gia;
    ThanhPho thanhPho = null;
    static Map<Integer, ThanhPho> tp = new HashMap<>();

    public CuocGoi(String thueBao, String bd, String kt) {
        this.thueBao = thueBao;
        this.bd = bd;
        this.kt = kt;
        String s[] = bd.split(":");
        long bd_n = Long.valueOf(s[0])*60 + Long.valueOf(s[1]);
        s = kt.split(":");
        long kt_n = Long.valueOf(s[0])*60 + Long.valueOf(s[1]);
        soPhut = kt_n - bd_n;
        if(thueBao.contains("-")){
            int ma = Integer.valueOf(thueBao.substring(1,3));
            thanhPho = tp.get(ma);
            gia = thanhPho.giaCuoc * soPhut;
        }
        else{
            soPhut = (soPhut%3==0?soPhut/3:soPhut/3+1);
            gia = 800 * soPhut;
        }
    }
    long getTime(String bd,String kt){
        String pt = "hh:mm";
        SimpleDateFormat form = new SimpleDateFormat(pt);
        try {
            Date d1 = form.parse(bd);
            Date d2 = form.parse(kt);
            return (d2.getTime()-d1.getTime())/60000;
        } catch (ParseException ex) {
            Logger.getLogger(CuocGoi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public String toString() {
        return thueBao+" "+(thanhPho==null?"Noi mang":thanhPho.ten)+" "+soPhut+" "+gia; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(CuocGoi o) {
        if(this.gia<o.gia) return 1;
        else return -1;
    }
    
}
