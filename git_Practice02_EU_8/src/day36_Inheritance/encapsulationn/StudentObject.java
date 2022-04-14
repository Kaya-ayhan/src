package day36_Inheritance.encapsulationn;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("Daniel",29, 'M','B', "Cydeo");
        System.out.println(student1);
        student1.setAge(39);
        System.out.println(student1);
    }
}
