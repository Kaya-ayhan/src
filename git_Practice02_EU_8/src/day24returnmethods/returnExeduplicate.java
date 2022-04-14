package day24returnmethods;

public class returnExeduplicate {
    public static void main(String[] args) {



        /*
        1. create a method that can remove duplciated characters from a string and returns the new value
        "aaabbcccc" ===> "abc"  */
        String str = "aaahhhhdddvvvgggg";
        str = duplicate(str);
        System.out.println(str);


    }

    public static String duplicate(String str) {   // "aabbccdd"==="abcd"
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains("" + each)) {   // each i tek yazarsak compile error verir. contain method string gerektirir. ancak each ise shar o yüzden onu stringe cevirdij

                result += each;
            }

        }
        return result;


    }

}
