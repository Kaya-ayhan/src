package day20array;

import java.util.Arrays;

public class arrayExe1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 50, 70}; //if numbers is given use this
        System.out.println(Arrays.toString(numbers));
        System.out.println("------------------");
        int[] scores = new int[5];
        System.out.println(Arrays.toString(scores)); // primitives default value is 0
        System.out.println("----------------");
        int[] s= new int[5]; //but you dont know the int variables use this method
        s[1]=85;
        s[s.length-1]=95;
                s[3]=75;
                s[0]=65;
                s[2]=55;
        System.out.println(Arrays.toString(s));
        System.out.println(s[3]);
    }
}
