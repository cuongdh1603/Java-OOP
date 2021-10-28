/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07017;

/**
 *
 * @author Cuong
 */
public class Pair <T,S>{
    T first;
    S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }
    public boolean isPrime(){
        return checkPrime((Integer)first) && checkPrime((Integer)second);
    }
    static boolean checkPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0) return false;
        return true;
    }

    @Override
    public String toString() {
        return first + " " + second;
    }
    
}
