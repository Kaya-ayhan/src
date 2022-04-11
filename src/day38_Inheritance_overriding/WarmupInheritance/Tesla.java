package day38_Inheritance_overriding.WarmupInheritance;

public class Tesla extends Car{


    public Tesla(String brand, String model, String color, double price, int year, int miles) {
        super("Tesla", model, color, price, year, miles);
    }

    public void autoPilot(){
        System.out.println(brand+ " " + model + " has auto pilot");
    }
}
