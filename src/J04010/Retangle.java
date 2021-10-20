package J04010;
/**
 *
 * @author Cuong
 */
public class Retangle {
    double x,y;
    public Retangle() {
    }
    public Retangle(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Retangle(Retangle another) {
        this.x = another.x;
        this.y = another.y;
    }
}
