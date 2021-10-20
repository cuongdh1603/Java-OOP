package J04010;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class Main {
    public static double distance(Retangle fi, Retangle se) {
        return Math.sqrt(Math.pow(fi.x - se.x, 2) + Math.pow(fi.y - se.y, 2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double x1, y1, x2, y2, x3, y3;
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            x3 = sc.nextDouble();
            y3 = sc.nextDouble();
            Retangle p1 = new Retangle(x1, y1);
            Retangle p2 = new Retangle(x2, y2);
            Retangle p3 = new Retangle(x3, y3);
            double xy1 = distance(p1, p2);
            double xy2 = distance(p2, p3);
            double xy3 = distance(p1, p3);
            if(xy1+xy2<=xy3||xy2+xy3<=xy1||xy1+xy3<=xy2) System.out.println("INVALID");
            else{
                double area = Math.sqrt((xy1+xy2+xy3)*(xy1+xy2-xy3)*(xy1-xy2+xy3)*(xy2-xy1+xy3))/4;
                double radius = (xy1*xy2*xy3)/(4*area);
                System.out.println(String.format("%.3f",Math.PI*radius*radius));
            }
        }
    }
}
/*
3
0 0 0 5 0 199
1 1 1 1 1 1
0 0 0 5 5 0
*/