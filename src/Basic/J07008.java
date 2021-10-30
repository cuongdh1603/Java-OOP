/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Cuong
 */
class MyArray implements Comparable<MyArray>{
    ArrayList<Integer> arr = new ArrayList<>();
    
    @Override
    public int compareTo(MyArray o) {
        for(int i=0;i<this.arr.size();i++){
            if(i<o.arr.size()){
                if(this.arr.get(i)<o.arr.get(i)) return -1;
                else if(this.arr.get(i)>o.arr.get(i)) return 1;
            }
        }
        if(this.arr.size()>o.arr.size()) return 1;
        else return -1;
    }

}
public class J07008 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>(a);
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(1,2,3,4));
        arr.add(a1);
        arr.add(a2);
        for (ArrayList<Integer> arrayList : arr) {
            System.out.println(arrayList);
        }
        //a1.add(1);
        
    }
}
