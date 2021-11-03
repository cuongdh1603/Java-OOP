/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ung_dung_java_collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
class Pair<T,S>{
    T first;
    S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return first+" "+second; //To change body of generated methods, choose Tools | Templates.
    }
    static Pair<Integer, Integer> createPair(int s, int i){
        return new Pair<Integer, Integer>(s,i);
    }
}
public class J08026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        
        while(tt-->0){
            int s = sc.nextInt(),t = sc.nextInt();
            HashSet<Integer> visit = new HashSet<>();
            Deque<Pair<Integer,Integer>> dq = new ArrayDeque<>();
            Pair<Integer,Integer> a = Pair.createPair(s, 0);
            dq.add(a);
            visit.add(s);
            while(dq.size()>0){
                a = dq.getFirst();
                dq.remove(a);
                if(a.first == t){
                    System.out.println(a.second);
                    break;
                }
                if(a.first*2==t||a.first-1==t){
                    System.out.println(a.second+1);
                    break;
                }
                if(!visit.contains(a.first*2)&&a.second>=a.first-t){
                    dq.add(Pair.createPair(a.first*2, a.second+1));
                    visit.add(a.first*2);
                }
                if(!visit.contains(a.first-1)){
                    dq.add(Pair.createPair(a.first-1, a.second+1));
                    visit.add(a.first-1);
                }
            }
        }
    }
}
