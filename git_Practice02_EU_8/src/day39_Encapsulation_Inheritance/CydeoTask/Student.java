package day39_Encapsulation_Inheritance.CydeoTask;

public class Student extends Person{
    private int studentID;
    private String fieldsOfStudy;

    public Student(String name, int age, char gender, int studentID, String fieldsOfStudy) {
        super(name, age, gender);
        setStudentID(studentID);
       setFieldsOfStudy(fieldsOfStudy);
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFieldsOfStudy() {
        return fieldsOfStudy;
    }

    public void setFieldsOfStudy(String fieldsOfStudy) {
        this.fieldsOfStudy = fieldsOfStudy;
    }

    public void study(){
        System.out.println( getName()+" is studying lesson");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +'\'' +
                ", gender=" + getGender() +'\'' +
                "studentID=" + studentID +'\'' +
                ", fieldsOfStudy='" + fieldsOfStudy + '\'' +
                '}';
    }
}
