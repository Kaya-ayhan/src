package day16Loop;

import java.util.Locale;
import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your....:");
        String s1=scan.next();
        String s2="";
        for (int i = s1.length()-1; i >=0 ; i--) {
            s2 += s1.charAt(i);

        }
        //System.out.println(s2.toLowerCase().equals(s1.toLowerCase()));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
