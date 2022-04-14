package day34GarbageCollectionAccessModifiers;

import java.util.ArrayList;

public class CircleStaticExe {
    public double radius;
    public static double pi;
    public static String name;
    public static ArrayList<Integer> numbers;

    public CircleStaticExe(double radius){
        this.radius=radius;
        pi=3.14;
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

    }
    static {
      //  radius=5; static e instance variable çağrılmaz.
        pi=3.14;
        name="Circle";
    }

    public static void main(String[] args) {

        pi=3.14;
        name="Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }


}
