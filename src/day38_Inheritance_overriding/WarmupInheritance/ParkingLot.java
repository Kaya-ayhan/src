package day38_Inheritance_overriding.WarmupInheritance;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota","Camry","Blue",120000,2020,123456);
        Tesla tesla = new Tesla("Tesla","EU","Yellow",14000,2021,123452);
        BMW bmw =new BMW("BMW","xdrive","green",12000,2020,123000);
        System.out.println(toyota);
        System.out.println(bmw);
        System.out.println(tesla);
        System.out.println("-----------------");
        toyota.start();;
        tesla.start();
        bmw.start();

    }
}
