package day39_Encapsulation_Inheritance.CydeoTask;

public class Employee extends Person {

    private int employeeID;
    private String jobTitle;
    private double salary;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        if (employeeID <= 0) {
            System.err.println("Invalid ID " + employeeID);
            System.exit(1);

        }
        this.employeeID = employeeID;
    }

    public String getJobTitle() {

        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isEmpty()) {
            System.err.println("Invalid Jobtitle " + jobTitle);
            System.exit(1);

        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.err.println("Invalid salary " + salary);
            System.exit(1);
            System.exit(1);

        }
        this.salary = salary;
    }

    public Employee(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }
    public void work(){
        System.out.println(getName()+ " is working");
    }


    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +'\'' +
                ", gender=" +getGender() +'\'' +
                "employeeID=" + employeeID +'\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +'\'' +
                '}';
    }
}
