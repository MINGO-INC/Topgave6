import java.awt.*;

public class Square implements Shape {

    double bredde;
    double længde;
    Square(double bredde, double længde){
        this.bredde=bredde;
        this.længde=længde;

    }

    /*public double getArea(double radius, double længde){
        double area = længde*(radius*radius);
        return area;
    }*/
    public double getArea() {
        double area=længde*bredde;
        return area;
    }

}
