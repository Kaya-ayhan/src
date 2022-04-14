package day20array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayVariable {
    public static void main(String[] args) {
        String myGroup[] = new String[5]; //0-4 olmalı yoksa compile error
        System.out.println(Arrays.toString(myGroup));
        //non-primitive's default value s' is null
        // primitive's default value is=0

        myGroup[0] = "ayhan";
        myGroup[1] ="veli";
        myGroup[2] ="ali";
        myGroup[3] ="fatma";
        myGroup[4] = "mehmet";
        System.out.println(Arrays.toString(myGroup));

        System.out.println("-------------------");
        String[] days={"monday" , "Tuesday" , " Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(days));
        int num=5;
        if(num<1 || num>7){
            System.err.println( "Invalid Number");
            System.exit(0);
        }
        System.out.println(days[num-1]);
        System.out.println("--------------------------------");
        String[] months={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a valid num between 1-12");
        int n=scan.nextInt();
        if(n<1 || n>12){
            System.err.println("Invalid number");
            System.exit(0);

        }
        System.out.println(months[n-1]);

    }
}
