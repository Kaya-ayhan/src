package day37_Inheritance.animalTask.animal;

public class AnimalObjects {
    public static void main(String[] args) {


        Dog dog1 = new Dog("Max", "Husky", "small", "yellow", 'M', 2);
        System.out.println(dog1);
        dog1.bark();

        Cat cat1=new Cat("Maya", "British", "Medium", "White", 'F', 3);
        System.out.println(cat1);
        cat1.scratch();

        Parrot parrot1 = new Parrot("King", "Macav","Medium","White",'M',3);
        System.out.println(parrot1);
        parrot1.sing();
    }
}
