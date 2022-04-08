package day37_Inheritance.animalTask.animal.PhoneTask;

public class PhoneObjects {
    public static void main(String[] args) {
        Iphone phone1=new Iphone("Apple","12S","Medium","Gold",1000);
        Samsung phone2 =new Samsung("Samsung","j7Pro","Large","Gray",900);
        Nokia phone3 = new Nokia("Nokia","5110","XL","Gray",50);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        phone1.call(911);
        phone1.text(123456);
        phone1.faceTime("yshoo.com");
        phone1.faceTime(456321);
        System.out.println("*-----------------------------");
        phone2.call(112);
        phone2.text(456325);
        phone2.freeze();
        System.out.println("--------------------");
        phone3.text(12364);
        phone3.call(177);
        phone3.selfDefense();
        System.out.println("----------");
        System.out.println(Phone.hasBattery);
        System.out.println(phone1.hasBattery);
        System.out.println(phone2.hasBattery);
        System.out.println(phone3.hasBattery);
    }
}
