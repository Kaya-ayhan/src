package day17;

import java.util.Scanner;

public class userPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = scan.next();


        System.out.println("Enter your password:");
        String p = scan.next();
        if (u.equals("Cydeo") && p.equals("Cydeo1230")) {
            System.out.println("Logged in");
        } else {
            int attempts = 3;

            while (!(u.equals("Cydeo") && p.equals("Cydeo1230")) && attempts > 0) {

                System.out.println("Your username/password is incorrect. Re enter username and password");
                System.out.println("Enter your username:");
                u = scan.next();

                System.out.println("Enter your password:");
                p = scan.next();
                attempts--;
            }

                if (u.equals("Cydeo") && p.equals("Cydeo1230")) {
                    System.out.println("Logged in");
                } else {
                    System.out.println("Your account locked");

            }
                scan.close();

        }
    }
}
