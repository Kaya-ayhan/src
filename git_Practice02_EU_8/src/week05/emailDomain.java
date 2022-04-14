package week05;

import java.util.Scanner;

public class emailDomain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = input.next();
        int begIndex= email.indexOf("@")+1;
        int endIndex= email.indexOf(".");
        String domain=email.substring(begIndex,endIndex);
        System.out.println(domain);
        System.out.println("--------------------");
        String s1="Java is cool, Java is right.";
        String str=s1.substring(s1.indexOf(" J"));
        System.out.println(str);


    }
}
