package day37_Inheritance.animalTask.animal.PhoneTask;

public class Samsung extends Phone{

    public Samsung(String brand, String model, String size, String color, double prize) {
        super("Samsung", model, size, color, prize);
    }
    public void freeze(){
        System.out.println(brand+" "+ model+" is have freeze ");
    }


}
