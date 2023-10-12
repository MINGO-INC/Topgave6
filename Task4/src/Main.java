public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(20,30);
        Square square = new Square(2,3.5);
        Square square1 =new Square(23,1);


        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(circle);
        shapeBuilder.addShape(square);
        shapeBuilder.addShape(square1);
        System.out.println(shapeBuilder.getTotalArea());

    }
}