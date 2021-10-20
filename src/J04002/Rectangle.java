package J04002;
/**
 *
 * @author Cuong
 */
public class Rectangle {
    private double width,height;
    private String color;

    public Rectangle() {
    }
    
    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        String s = this.color.toLowerCase();
        s = s.substring(0,1).toUpperCase()+s.substring(1);
        return s;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double findArea(){
        return (this.height*this.width);
    }
    public double findPerimeter(){
        return (this.height+this.width)*2;
    }

    @Override
    public String toString() {
        if(this.height>0&&this.width>0)
            return (int)this.findPerimeter()+" "+(int)this.findArea()+" "+this.getColor();
        else
            return "INVALID";
    }
}
