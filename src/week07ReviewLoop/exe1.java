package week07ReviewLoop;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println( "Enter a string");
        String s= scan.nextLine().toLowerCase();
        System.out.println( "Enter a char");
        String c=scan.next().toLowerCase();
        int n=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)==c.charAt(0)){
                n++;

            }

        }
        System.out.println(n);
    }
}
