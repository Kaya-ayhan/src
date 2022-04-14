package day37_Inheritance.animalTask.animal.PhoneTask;

public class Iphone extends Phone{

    public Iphone(String brand, String model, String size, String color, double prize) {
        super("Apple", model, size, color, prize);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+ model+" is having  facetime with phone number"+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand+" "+model +" is having facetime with email"+email);
    }

}
