package day18nestedloop;

import java.util.Scanner;

public class nestedOdd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

while(true) {
    System.out.println("Enter a number:");
    int n = scan.nextInt();

    if (n % 2 == 0) {
        System.out.println(n + " is even number.");
    } else {
        System.out.println(n + " is odd number.");
    }
    System.out.println("Would you like to enter another number?");
    String s = scan.next().toLowerCase();

    while (!(s.equals("yes") || s.equals("no"))) {
        System.err.println("Re-enter. Would you like to enter another number?");
        s = scan.next().toLowerCase();
    }
    if (s.equals("no")) {
        break;
    }

}

    }
}
