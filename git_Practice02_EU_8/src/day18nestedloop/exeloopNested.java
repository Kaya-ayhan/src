package day18nestedloop;

import java.util.Scanner;

public class exeloopNested {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while(true) {
            System.out.println("Enter Your Age:");
            int age = scan.nextInt();


            while (!(age >= 1 && age <= 120)) {
                System.err.println("Invalid entry, Please re-enter your age:");
                age = scan.nextInt();

            }
            System.out.println("would you like to continue?");
            String a=scan.next().toLowerCase();
            while(!(a.equals("yes")|| a.equals("no"))){
                System.err.println("Invalid entry.Re-enter:");
                a=scan.next();

            }
            if(a=="no"){
                break;
            }
        }
        scan.close();

    }
}
