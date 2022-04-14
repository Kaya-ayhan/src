package week05;

import java.util.Locale;
import java.util.Scanner;

public class emailExample {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a valid email:craig_federighi@apple.com");
        String email= input.next();
        int indexof_=email.indexOf("_");
        int indexofAtsign=email.indexOf("@");
        int indexOfDot= email.indexOf(".");
        String firstName=email.substring(0,indexof_);
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        System.out.println("firstName = " + firstName);
        String lastName=email.substring(indexof_+1, indexofAtsign);
        lastName=lastName.toUpperCase().charAt(0)+lastName.substring(1).toUpperCase();
        System.out.println("lastName = " + lastName);

        String domainName=email.substring(indexofAtsign+1,indexOfDot);
        System.out.println("domainName = " + domainName);


    }
}
