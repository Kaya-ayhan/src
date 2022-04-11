package day38_Inheritance_overriding.WarmupInheritance;

public class BMW extends Car{


    public BMW(String brand, String model, String color, double price, int year, int miles) {
        super("BMW", model, color, price, year, miles);
    }

    public void breaksDown(){
        System.out.println(brand + " " + model + " ");
    }
    public void racing(){
        System.out.println(brand + " " + model + " ");
    }
}
