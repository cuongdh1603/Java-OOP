/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04018;

/**
 *
 * @author Cuong
 */
public class Complex {
    int r = 0,v = 0;

    public Complex() {
    }

    public Complex(int r, int v) {
        this.r = r;
        this.v = v;
    }
    
    public Complex add(Complex o){
        Complex c = new Complex();
        c.r = r + o.r;
        c.v = v + o.v;
        return c;
    }
    public Complex multi(Complex o){
        Complex c = new Complex();
        c.r = r*o.r - v*o.v;
        c.v = r*o.v + v*o.r;
        return c;
    }

    @Override
    public String toString() {
        if(v>0) return r + " + " + v + "i";
        else if(v<0) return r + " - " + Math.abs(v) + "i";
        else return r+"";
    }
    
}
