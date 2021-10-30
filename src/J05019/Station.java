/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05019;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Cuong
 */
public class Station {
    String ID;
    String name;
    ArrayList<Long> lengthTime = new ArrayList<>();
    ArrayList<Double> amount = new ArrayList<>();

    public Station(int ID,String name) {
        this.ID = String.format("T%02d", ID);
        this.name = name;
    }
    public void addNewTime(String s1,String s2){
        this.lengthTime.add((convertToTime(s2).getTime()-convertToTime(s1).getTime())/60000);
    }
    public void addNewAmount(double a){
        this.amount.add(a);
    }
    public static Date convertToTime(String time){
        String pattern = "hh:mm";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        try {
            Date date = format.parse(time);
            return date;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public String getAveAmount(){
        long sumTime = 0;
        double sumAmount = 0;
        for (Long l : lengthTime) {
            sumTime += l;
        }
        for (Double d : amount) {
            sumAmount += d;
        }
        return String.format("%.2f", sumAmount/sumTime*60);
    }
    @Override
    public String toString() {
        return ID + " " + name + " " + this.getAveAmount();
    }
    
}
