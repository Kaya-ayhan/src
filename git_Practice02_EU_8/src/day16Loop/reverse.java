package day16Loop;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your ...:");
        String str=scan.nextLine();
        String result=" ";
        for (int i = str.length()-1; i>=0; i--) {
            result+=str.charAt(i);
        }
        System.out.println(result);

    }
}
