package week05;

public class subStringExe {
    public static void main(String[] args) {
        String word1="Cydeo School";
        String word2="Java Programming School";
        String str1=word1.substring(0);
        System.out.println(str1);
        String str2= word1.substring(0,6);
        System.out.println(str2);
        String str3=word2.substring(0,word2.indexOf(" "));
        System.out.println(str3);
        String str4=word2.substring(5);
        System.out.println(str4);
        String str5=word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));
        System.out.println(str5);
        String s1=word2.substring(0,word2.indexOf(" "));
        String s2=word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf("S"));
        String s3=word2.substring(word2.lastIndexOf(" ")+1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
