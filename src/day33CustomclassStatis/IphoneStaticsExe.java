package day33CustomclassStatis;

public class IphoneStaticsExe {

    public static String brand="Apple";
    public String model;
    public double price;
    public static String OS="iOS";
    public String color;

    public static void Iphone1(){
     //  System.out.println(price+color); // static method intance variable çağıramaz

        System.out.println(brand);
    }
    public void method1(){
        System.out.println(OS+color);  // instance method hem static hemde instance variable çağırabilir.

    }  // neden biz instance methodda hem static hemde instance variable meya method çağırabiliyorken
    // static method kullanma ihtiyacı duyuyoruz?
    // because in instance method we should call the object and so we have to create an object and we have to call this object
    //so it consumes much memory
    // but in static method we call through the class name and no need to create an object so it consumes less memory

}

