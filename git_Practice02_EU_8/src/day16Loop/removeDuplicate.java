package day16Loop;

public class removeDuplicate {
    public static void main(String[] args) {
        String s1="aaaabbbccacab";
        String s2="";
        for (int i = 0; i <s1.length() ; i++) {
         String s3 = ""+s1.charAt(i);
            if(!s2.contains(s3)){
                s2 +=s3;
            }

        }
        System.out.println(s2);
    }
}
