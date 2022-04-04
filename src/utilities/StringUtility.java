package utilities;

import java.util.Arrays;

public class StringUtility {
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {


            System.out.println(str.charAt(i));
        }
    }

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean palindrom(String str) {
        return reverse(str).equalsIgnoreCase(str);
    }

    public static boolean anagram(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

    public static  String RemoveTheDuplicate(String str1){
        String result="";
        for (int i = 0; i < str1.length(); i++) {
            char each=str1.charAt(i);
            if(!result.contains(""+each)){
                result+=each;

            }
        }
        return result;
    }
}

