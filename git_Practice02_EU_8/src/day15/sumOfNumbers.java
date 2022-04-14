package day15;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {
        double num=0;
        for (int i = 1; i < 101; i++) {
            num+=i;

        }
        System.out.println(num);
        System.out.println("---------------------");
        int sum=0;
        Scanner scan= new Scanner(System.in);
        /* System.out.println("Enter a number:");
        sum+=scan.nextInt();

        System.out.println("Enter a number:");
        sum+=scan.nextInt();


        System.out.println("Enter a number:");
        sum+=scan.nextInt();

        System.out.println("Enter a number:");
        sum+=scan.nextInt();

        System.out.println("Enter a number:");
        sum+=scan.nextInt(); */

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            sum+=scan.nextInt();


        }
        System.out.println("sum = " + sum);
        scan.close();


    }
}
