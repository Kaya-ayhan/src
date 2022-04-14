package day37_Inheritance.animalTask.animal.PhoneTask;

public class Nokia extends Phone {

    public Nokia(String brand, String model, String size, String color, double prize) {
        super("Nokia", model, size, color, prize);
    }

    public void  selfDefense(){
        System.out.println("You can use "+brand+ " " +model+" is for self defense");
    }
}
