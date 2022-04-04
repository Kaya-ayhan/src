package day20array;

import java.util.Arrays;

public class charArrayMethod {
    public static void main(String[] args) {
        String str="Java";
      char[] ch=str.toCharArray();
        System.out.println(Arrays.toString(ch));
        for (char c : ch) {
            System.out.println(c);
        }

        }
}
