package day38_Inheritance_overriding.WarmupInheritance;

public class Car {
    public String brand,model,color;
    public double price;
    public int year,miles;

    public Car(String brand, String model, String color, double price, int year, int miles) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
        this.miles = miles;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price= $" + price +
                ", year=" + year +
                ", miles=" + miles +
                '}';
    }

    public void start(){
        System.out.println(brand+" "+ model + " is starting");
    }

    public void drive(){
        System.out.println(brand+" "+ model + " is driving");
    }
}
