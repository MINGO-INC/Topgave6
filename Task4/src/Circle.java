import java.awt.*;

public class Circle implements Shape {
    double radius;
    double længde;
    public Circle(double radius,double længde){
        this.radius=radius;
        this.længde=længde;
    }

    /*public double getArea(double radius,double længde){
        double area=Math.PI*(radius*radius)*længde;
        return area;

    }*/

    public double getArea() {
        double area=Math.PI*(radius*radius)*længde;
        return area;
    }
}
