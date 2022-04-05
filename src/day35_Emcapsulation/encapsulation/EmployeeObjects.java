package day35_Emcapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tatiana", 'F',
                28,123000);
        System.out.println(employee1);

        Employee employee2 = new Employee("", 'B',
                2,   12300);
        System.out.println(employee2);
    }
}
