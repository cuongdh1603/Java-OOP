/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05033;

import java.util.Comparator;

/**
 *
 * @author Cuong
 */
public class Time {
    int hour;
    int minute;
    int sec;

    public Time(int hour, int minute, int sec) {
        this.hour = hour;
        this.minute = minute;
        this.sec = sec;
    }

    @Override
    public String toString() {
        return this.hour+" "+this.minute+" "+this.sec;
    }
}
class compare implements Comparator<Time>{
    @Override
    public int compare(Time o1, Time o2) {
        if(o1.hour > o2.hour) return 1;
        else if(o1.hour<o2.hour) return -1;
        else{
            if(o1.minute > o2.minute) return 1;
            else if(o1.minute<o2.minute) return -1;
            else{
                if(o1.sec > o2.sec) return 1;
                else return -1;
            }
        }
    }
}