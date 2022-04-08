package day37_Inheritance.animalTask.animal.PhoneTask;

public class Phone {

    public String brand,model,size,color;
    public double prize;
    public  static boolean hasBattery = true;

    public Phone(String brand, String model, String size, String color, double prize) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.prize = prize;
    }
    /* static { static variable constructor içinde bulunmmalı çünkü her obje için tekrar tekrar create edilecek  ama hepsinde aynı olduğundan gerek yok memoryden yiyor.

        hasBattery=true;
    }  */

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", prize= $" + prize +
                ", hasBattery=" + hasBattery +
                '}';
    }

    public void call(long phoneNumber){
        System.out.println(brand+" "+model+" is calling"+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand+" "+model+" is texting"+phoneNumber);
    }




}
