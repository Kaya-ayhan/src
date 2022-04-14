package day31CustomSlassConstructors.scrumTask;

public class Developer {

    public String name;
    public int employeeID;
    public double salary;
    public String jobTitle;

    public Developer(String name, int employeeID, double salary, String jobTitle) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", salary= $" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }

    public void smokeTesting() {
        System.out.println(name + " is smoke testing");
    }

    public void unitTesting() {
        System.out.println(name + " is Unit testing");
    }

    public void fixingBugs() {
        System.out.println(name + " isfixing bugs");
    }
}
