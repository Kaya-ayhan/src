package day30CustomClass;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1= new Employee();
        Employee employee2= new Employee();
        Employee employee3= new Employee();
        Employee employee4= new Employee();
        Employee employee5= new Employee();

        employee1.setInfo("Ash", 125,'M',12500, "Mechanic",true);
        employee2.setInfo("Ali",123,'M',12000,"Mudur",true);
        employee3.setInfo("Afg",1452,'F',123000,"senior", true);
        employee4.setInfo("Ayh",1452,'M',150000,"calısan", false);
        employee5.setInfo("ASd",1253,'F',145000,"senior",false);

        Employee[] employees={employee1,employee2,employee3,employee4, employee5};
         int countFulltime=0;
         int countParttime=0;
         double max= employees[0].salary;
         double min=employees[0].salary;
         for(Employee each: employees){
             if(each.isFullTime==true){
                 countFulltime++;

             }else countParttime++;
             if(each.salary>max){
                 max=each.salary;
             }
             if(each.salary<min){
                 min= each.salary;
             }
         }
        System.out.println("countParttime = " + countParttime);
        System.out.println("countFulltime = " + countFulltime);
        System.out.println("min  salary= " + min);
        System.out.println("max salary = " + max);






    }
}
