/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vao_ra_file.J07018;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

/**
 *
 * @author Cuong
 */
public class Student {
    String ID;
    String name;
    String classroom;
    String dob;
    double gpa;

    public Student(int ID, String name, String classroom, String dob, double gpa) {
        this.ID = String.format("B20DCCN%03d", ID);
        this.name = convertToFormatName(name);
        this.classroom = classroom;
        this.dob = convertToFormatDate(dob);
        this.gpa = gpa;
    }
    static String convertToFormatName(String s){
        String rs = "";
        StringTokenizer tok = new StringTokenizer(s);
        while(tok.hasMoreTokens()){
            String str = tok.nextToken().toLowerCase();
            rs += str.substring(0,1).toUpperCase() + str.substring(1) + " ";
        }
        return rs.substring(0,rs.length()-1);
    }
    static String convertToFormatDate(String s){
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Date date = dateFormat.parse(s);
            return dateFormat.format(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + classroom + " " + dob + " " + String.format("%.2f",gpa);
    }
    
}
