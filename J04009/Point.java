/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04009;

/**
 *
 * @author Cuong
 */
public class Point {
    double x,y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point another) {
        this.x = another.x;
        this.y = another.y;
    }
}
