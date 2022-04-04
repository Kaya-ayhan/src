package unit1Assesment;


import java.util.Scanner;

public class unit1AssesQuiz {
    public static void main(String[] args) {

       Scanner scn=new Scanner(System.in);
       String first= scn.nextLine();
       String last= scn.nextLine();
       int num=scn.nextInt();
       String fullName="";
       if(num % 2==0){
           fullName = first +" " + last;
       }else {
           fullName="not valid";
       }
        System.out.println(fullName);
        }
    }

