package day17;

import java.util.Locale;
import java.util.Scanner;

public class eligibleToVote {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter age:");
        int age= scan.nextInt();  // valid age is: 0-120
        while(!(age>=0 && age<=120)){
            System.err.println("Invalid age.Re-enter age:");
            age= scan.nextInt();

        }
        System.out.println("US citizen yes/no:");
        String ans=scan.next();
        while(!(ans.equals("yes")||ans.equals("no"))){
            System.err.println("Invalid answer. Re-enter :");
            ans= scan.next().toLowerCase();
        }
        if(age>=18) {
            System.out.println("You are eligible");
        }else{
            System.err.println("You are not eligible");
        }

    }
}
