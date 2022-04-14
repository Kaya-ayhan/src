package day33CustomclassStatis;

public class Student {

    public String name;
    public int age;
    public int studentID;
    public char gender,grade;

    public Student(String name) {
        this.name = name;

    }
    public Student(String name, int age) {
        this(name);
        this.age = age;

    }
    public Student(String name, int age, int studentID) {
        this(name,age);

        this.studentID = studentID;
    }
    public Student(String name, int age, int studentID, char gender) {
        this(name,age,studentID);
        this.gender = gender;
    }


    public Student(String name, int age, int studentID, char gender,char grade) {
        this(name,age,studentID,gender);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentID=" + studentID +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
