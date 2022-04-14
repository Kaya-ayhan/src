package day31CustomSlassConstructors;

public class Student {

    public  String name;
    public  char gender;
    public int age;
    public long ID;
    public char grade;

    public Student(String name, char gender, int age, long ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }
}
