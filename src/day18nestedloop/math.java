package day18nestedloop;

import org.w3c.dom.ls.LSOutput;

public class math {
    public static void main(String[] args) {
        int a=20;
        int b=7;
        int r=0;
        while(a>=b) {
            a -= b;
            r++;
        }
        System.out.println("Division: "+r);
        System.out.println("Remainder: "+a);
    }

}
