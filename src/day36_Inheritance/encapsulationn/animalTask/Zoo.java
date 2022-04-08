package day36_Inheritance.encapsulationn.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", "small", "yellow", 'M', 2);
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        System.out.println(dog);


        Cat cat = new Cat();
        cat.setInfo("Maya", "British", "Medium", "White", 'F', 3);
        cat.eat();
        cat.drink();
        cat.move();
        cat.sleep();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger = new Tiger();

        tiger.setInfo("Sher", "Bengal", "Large", "Red", 'M', 3);
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.roar();
        tiger.hunt();
        System.out.println(tiger);
    }
}
