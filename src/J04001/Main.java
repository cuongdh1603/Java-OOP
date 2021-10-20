package J04001;
import java.util.Scanner;
/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double x1,x2,y1,y2;
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            Point p1 = new Point(x1,y1);
            Point p2 = new Point(x2,y2);
            System.out.println(String.format("%.4f",Point.distance(p1, p2)));
        }
    }
}
