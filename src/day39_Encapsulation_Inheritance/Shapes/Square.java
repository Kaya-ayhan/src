package day39_Encapsulation_Inheritance.Shapes;

public class Square extends Shape {
    private double side;

    public Square( double side) {
        super("Square");
       setSide(side);

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            System.err.println("ınvalid side "+side);
            System.exit(1);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }
}
