package day17;

import java.util.Scanner;

public class marriageWhileloop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s= scan.next().toLowerCase();
        while(!(s.equals("yes")||s.equals("no"))){
            System.out.println("Invalid answer.Re enter:");

            s=scan.next().toLowerCase();
        }
        if(s.equals("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
        }
    }
}
