package day15;

import java.util.Scanner;

public class minNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int min=2147483640;

        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a  number:");
            int num1=scan.nextInt();
            if(num1<min){
                min=num1;
            }
        }
        System.out.println("min = " + min);
    }
}
