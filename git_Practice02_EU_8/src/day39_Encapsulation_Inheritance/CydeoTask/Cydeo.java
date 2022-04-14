package day39_Encapsulation_Inheritance.CydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        Developer developer= new Developer("Oscar",25,'M',123,"Developer",125000);

        Employee employee = new Employee("Farhad",26,'M',145,"Cleaner",100000);

        Student student = new Student("Ayhan",36,'M',125,"SDET");

        Teacher teacher=new Teacher("Ayse",35,'F',147,"Math teacher",145000);

        Tester tester=new Tester("Harun",35,'M',156,"Backhand Tester",130000);

        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(student);

        System.out.println("-------------------");
        developer.setAge(39);
        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("----------------------");
        developer.work();
        teacher.work();
        tester.work();
        //student.work()

        System.out.println("----------------");

        developer.eat();
        developer.drink();
        developer.sleep();
        developer.fixingBugs();


        System.out.println("------------");
        tester.eat();
        tester.drink();
        tester.sleep();
        tester.createTicket();

        System.out.println("-----------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        System.out.println("----------------");
        employee.eat();
        employee.drink();
        employee.sleep();
        System.out.println("---------------");
        student.eat();
        student.drink();
        student.sleep();
        student.study();


    }
}
