package day38_Inheritance_overriding.WarmupInheritance;

public class Toyota extends Car{

    public Toyota(String brand, String model, String color, double price, int year, int miles) {
        super("Toyota", model, color, price, year, miles);
    }

    public void reliabile(){
        System.out.println(brand+" "+ model+ " is reliable");
    }

    public void start(){
        System.out.println("Twist the key to ignition. "+ brand+" "+model);


    }


}
