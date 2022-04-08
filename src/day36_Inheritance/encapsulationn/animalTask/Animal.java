package day36_Inheritance.encapsulationn.animalTask;

public class Animal {
    public String name, breed, size, color;
    public char gender;
    public int age;

    public void setInfo(String name, String breed, String size, String color, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking");
    }

    public void move() {
        System.out.println(name + " is moveing");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

}
