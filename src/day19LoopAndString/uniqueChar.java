package day19LoopAndString;

public class uniqueChar {
    public static void main(String[] args) {
        String s1="aassddccffggg";
        String result1="";

        for (int j = 0; j <s1.length() ; j++) {

        char c=s1.charAt(j);
        int count=0;

        for (int i = 0; i < s1.length(); i++) {
            char each = s1.charAt(i);
            if (each == c) {
                count++;
            }

        }
            if(result1.contains("" + c)){
                continue;
            }


        result1 += c;
        result1 += count;
        }
        System.out.println(result1);

    }
}
