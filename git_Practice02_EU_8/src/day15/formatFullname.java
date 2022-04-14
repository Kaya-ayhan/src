package day15;

import java.util.Locale;

public class formatFullname {
    public static void main(String[] args) {
        String firstName="cyDeO";
        String secName="SCHOOL";
        String w1,w2;
        //w1=firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
       // System.out.println(w1+" "+w2);
        System.out.println("------------------");
        firstName=(""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
        secName=(""+secName.charAt(0)).toUpperCase()+ secName.substring(1).toLowerCase();
        System.out.println(firstName+" "+secName);

    }
}
