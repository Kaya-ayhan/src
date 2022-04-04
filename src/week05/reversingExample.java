package week05;

import java.util.Scanner;

public class reversingExample {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        Scanner input=new Scanner(System.in);
        String word= input.next();
        input.close();

        String reverseWord="";
        reverseWord+=word.charAt(4);
        reverseWord+=word.charAt(3);
        reverseWord+=word.charAt(2);
        reverseWord+=word.charAt(1);
        reverseWord+=word.charAt(0);
        if(word.equals(reverseWord)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Palindrom");
        }
    }
}
