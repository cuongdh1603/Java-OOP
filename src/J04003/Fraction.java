/* PHÂN SỐ
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04003;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Fraction {
    private long x;
    private long y;
    public Fraction(long x,long y){
        this.x = x;
        this.y = y;
    }
    public long gcd(long x,long y){
        if(y==0) return x;
        return gcd(y,x%y);
    }
    public void setX(long x) {
        this.x = x;
    }

    public void setY(long y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return String.format("%d/%d",this.x,this.y);
    }
        public void nhap(){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        this.setX(x);
        this.setY(y);
    }
    public void rutGon(){
        long z = this.gcd(this.x,this.y);
        this.setX(this.x/z);
        this.setY(this.y/z);
    }
}
