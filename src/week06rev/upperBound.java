package week06rev;

import java.util.Scanner;

public class upperBound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scan.nextInt();
        int top=0;
        for (int i = 0; i <=num; i++) {
            top+=i;

        }
        System.out.println(top);

    }
}
