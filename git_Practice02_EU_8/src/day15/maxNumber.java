package day15;

import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int max=-2147483640;
        for (int i = 1; i < 6; i++) {
            System.out.println("Enter a number");
            int num=scan.nextInt();
            if(num>max){
                max=num;
            }

        }
        System.out.println("max = " + max);
        scan.close();
    }
}
