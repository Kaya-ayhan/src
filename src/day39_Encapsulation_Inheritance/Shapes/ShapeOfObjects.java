package day39_Encapsulation_Inheritance.Shapes;

public class ShapeOfObjects {
    public static void main(String[] args) {
        Square square= new Square(10);
        Rectangle rectangle= new Rectangle(10,15);
        Circle circle= new Circle(12);
        square.setSide(15);

        System.out.println(square);
        circle.setRadius(18);
        System.out.println(square.getName());
        System.out.println(circle);
        System.out.println(circle.getName());
        rectangle.setWidth(17);
        rectangle.setWidth(20);
        System.out.println(rectangle);
        System.out.println(rectangle.getName());
    }
}
