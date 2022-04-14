package day17;

import java.util.Scanner;

public class whileLoopCalculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=scan.nextInt();
        System.out.println("Enter second number:");
        int num2=scan.nextInt();
        System.out.println("Enter a math operator:");
        char a=scan.next().charAt(0);
        while(!(a=='+'|| a=='-')){
            System.out.println("Invalid math operator.Re-enter:");
            a=scan.next().charAt(0);
        }
        System.out.println((a=='+')? num1+num2 : num1-num2);

    }
}
