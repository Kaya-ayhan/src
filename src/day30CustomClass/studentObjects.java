package day30CustomClass;

import java.util.ArrayList;

public class studentObjects {
    public static void main(String[] args) {
        student Student1 = new student();
        Student1.setInfo("Ali", 'M', 15,1574,'A');
        student Student2 = new student();
        Student2.setInfo("Ayşe",'F',13,1452,'C');
        student Student3 = new student();
        Student3.setInfo("Ahmet",'M',14,1425,'B');
        student Student4 = new student();
        Student4.setInfo("Aslı",'F',12,1236,'B');
        student Student5 = new student();
        Student5.setInfo("Art",'M',13,1256,'A');
        student[] students= {Student1, Student2, Student3, Student4, Student5};
        for(student each:students){
            System.out.println(each);
        }
        System.out.println("----------------");

        ArrayList<student> earlyBirds = new ArrayList<>();  //   grade : A
        ArrayList<student> angryBirds = new ArrayList<>();  //grade the others

        for(student each:students){
            if(each.grade=='A'){
                earlyBirds.add(each);
            }else{
                angryBirds.add(each);
            }
        }
        System.out.println("angryBirds = " + angryBirds);
        System.out.println("earlyBirds = " + earlyBirds);
    }
}
