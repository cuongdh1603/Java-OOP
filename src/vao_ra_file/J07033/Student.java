/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vao_ra_file.J07033;

import java.util.StringTokenizer;

/**
 *
 * @author Cuong
 */
public class Student implements Comparable<Student>{
    String ID,name,room,email;

    public Student(String ID, String name, String room, String email) {
        this.ID = ID;
        this.name = convertName(name);
        this.room = room;
        this.email = email;
    }
    static String convertName(String s){
        String rs = "";
        StringTokenizer tok = new StringTokenizer(s.toLowerCase());
        while(tok.hasMoreTokens()){
            String s1 = tok.nextToken();
            rs += s1.substring(0,1).toUpperCase() + s1.substring(1,s1.length()) + " ";
        }
        int l = rs.length();
        return rs.substring(0, l-1);
    }
    @Override
    public int compareTo(Student o) {
        return this.ID.compareTo(o.ID);
    }

    @Override
    public String toString() {
        return ID + " " + name + " " +room+" "+email;
    }
    
}
