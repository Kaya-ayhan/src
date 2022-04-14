package day32CustomClass;

public class Employee {

    String name, jobTitle;
    char gender;
    double salary;


    public Employee(String name) {
        this.name = name;

    }
    public Employee(String name, String jobTitle) {
        this(name);
        this.jobTitle = jobTitle;

    }
    public Employee(String name, String jobTitle, char gender) {
        this(name,jobTitle);

        this.gender = gender;

    }
    public Employee(String name, String jobTitle, char gender, double salary) {
        this(name, jobTitle,gender);
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
