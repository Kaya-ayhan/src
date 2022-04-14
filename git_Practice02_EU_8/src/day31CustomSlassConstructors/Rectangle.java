package day31CustomSlassConstructors;

public class Rectangle {

    public double width, lenght;

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                ", Area Of Rectangle=" + calArea() +
                ", Perimeter of Rectangle=" + calcPerimeter() +
                '}';
    }
  public  double calArea(){
        return lenght*width;
    }

    public  double calcPerimeter(){
        return (lenght+width)*2;
    }
}
