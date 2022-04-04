package day31CustomSlassConstructors.scrumTask;

public class Tester {

    public String name;
    public int employeeID;
    public double salary;
    public String jobTitle;

    /*  Attributes:
	            name, employeeID, JobTitle, Salary

	        Add A constructor that can set all the fileds

	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()

	create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fileds

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()  */


    public Tester(String name, int employeeID, double salary, String jobTitle) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return "Tester{" +
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