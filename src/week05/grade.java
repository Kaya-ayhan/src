package week05;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        String n1,n2,n3,n4,n5,Summary;
        double  d1,d2,d3,d4,d5,average;
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        Scanner input1=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        n1=input1.next();
        d1=input2.nextDouble();
        input1.close();
        input2.close();

        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 2 and score for this subject");
        Scanner input3=new Scanner(System.in);
        Scanner input4=new Scanner(System.in);
        n2=input3.next();
        d2=input4.nextDouble();
        input3.close();
        input4.close();

        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 3 and score for this subject");
        Scanner input5=new Scanner(System.in);
        Scanner input6=new Scanner(System.in);
        n3=input5.next();
        d3=input6.nextDouble();
        input5.close();
        input6.close();

        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 4 and score for this subject");
        Scanner input7=new Scanner(System.in);
        Scanner input8=new Scanner(System.in);
        n4=input7.next();
        d4=input8.nextDouble();
        input7.close();
        input8.close();

        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 5 and score for this subject");
        Scanner input9=new Scanner(System.in);
        Scanner input10=new Scanner(System.in);
        n5=input9.next();
        d5=input10.nextDouble();
        input9.close();
        input10.close();

        Summary=n1+" - "+d1+","+" "+n2+" - "+d2+","+" "+n3+" - "+d3+","+" "+n4+" - "+d4+","+" "+n5+" - "+d5;

        average=(d1+d2+d3+d4+d5)/5;
        System.out.println("Summary: "+Summary);
        System.out.println("Your average score is:"+average+"\nThank you for using Grdaer!\nGoodbye!");

    }
}
