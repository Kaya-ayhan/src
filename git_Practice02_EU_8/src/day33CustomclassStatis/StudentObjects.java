package day33CustomclassStatis;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {
        Student student1=new Student("Ali");
        Student student2=new Student("AHMET",15);
        Student student3=new Student("AliS", 16,47);
        Student student4=new Student("Alia",16,52,'M');
        Student student5=new Student("Alit",16,53,'F','A');
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);

        Student[] students= {student1,student2,student3,student4,student5};
        System.out.println(Arrays.toString(students));


    }
}
