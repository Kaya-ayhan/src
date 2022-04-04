package day30CustomClass;

public class Employee {

    public String name;
    public int ID;
    public char gender;
    public double salary;
    public String jobTitle;
    public boolean isFullTime;

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", salary=$" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void setInfo(String name, int ID, char gender, double salary, String jobTitle, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.isFullTime = isFullTime;

    }

    public void work(){
        System.out.println(jobTitle+"  "+name+" is working");
    }


}
