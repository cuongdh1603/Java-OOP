package J04001;
/**
 *
 * @author Cuong
 */
public class Point {
    private double x,y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static double distance(Point fi,Point se){
        return Math.sqrt(Math.pow(fi.x-se.x,2)+Math.pow(fi.y-se.y,2));
    }
}
