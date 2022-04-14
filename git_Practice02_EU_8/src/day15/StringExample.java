package day15;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word1=scan.next();
        String word;
        word=word1.substring(0,1);
        System.out.println("word1 = " + word);
        if (word1.charAt(0)== 'x') {
        word1=word1.replaceFirst("x","a");
            System.out.println(word1);
        }else{
            System.out.println("Enter your word beginning x!");
        }
        }

    }


/*1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex */