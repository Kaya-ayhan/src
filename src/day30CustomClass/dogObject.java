package day30CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class dogObject {
    public static void main(String[] args) {


        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed="Husky";
        dog1.age=5;
        dog1.gender='M';
        dog1.size="Medium";
        dog1.color="Blue";

        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.name = "Clara";
        dog2.breed="Husky";
        dog2.age=5;
        dog2.gender='F';
        dog2.size="Small";
        dog2.color="White";

        System.out.println(dog2);

        Dog dog3 =new Dog();
        Dog dog4 =new Dog();
        Dog dog5 =new Dog();

        dog3.setInfo("Barbie", "Ash",6,'F', "Large","White&Black");
        System.out.println(dog3);
        dog1.eat();
        dog2.bark();
        dog3.eat();
        dog4.setInfo("GermanShephard", "Aydın", 7,'M', "Small","Pink");
        dog5.setInfo("RussianWolf", "Husky", 3,'F', "Medium", "Yellow");

      //  ArrayList<Dog> dogsList = new ArrayList<>();
       // dogsList.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));

        Dog[] dogs={dog1,dog2,dog3, dog4,dog5};
        System.out.println(Arrays.toString(dogs));
        ArrayList<Dog> maleDogs = new ArrayList<>();
        ArrayList<Dog> femaleDogs = new ArrayList<>();
        for(Dog each: dogs){
           if( each.gender=='F'){
               femaleDogs.add(each);
           }else{
               maleDogs.add(each);
           }
        }
        System.out.println(femaleDogs);
        System.out.println(maleDogs);

    }

}