/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04009;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class Main {
    public static double distance(Point fi, Point se) {
        return Math.sqrt(Math.pow(fi.x - se.x, 2) + Math.pow(fi.y - se.y, 2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double x1, y1, x2, y2, x3, y3;
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            x3 = sc.nextDouble();
            y3 = sc.nextDouble();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);
            double xy1 = distance(p1, p2);
            double xy2 = distance(p2, p3);
            double xy3 = distance(p1, p3);
            if(xy1+xy2<=xy3||xy2+xy3<=xy1||xy1+xy3<=xy2)
                System.out.println("INVALID");
            else
                System.out.println(String.format("%.2f",
                Math.sqrt((xy1+xy2+xy3)*(xy1+xy2-xy3)*(xy1-xy2+xy3)*(xy2-xy1+xy3))/4));
        }
    }
}
/*
3
0 0 0 5 0 199
1 1 1 1 1 1
0 0 0 5 5 0
*/