package day20array;

import java.util.Scanner;

public class arrayWithLoop {
    public static void main(String[] args) {
        String[] months={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
 /*Scanner scan=new Scanner(System.in);
        System.out.println("Enter a valid num between 1-12");
        int n=scan.nextInt();
        if(n<1 || n>12){
            System.err.println("Invalid number");
            System.exit(0); */


        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        System.out.println("----------------");
        for (int j = months.length-1; j >=0 ; j--) {
            System.out.println(months[j]);
        }

    }
}
