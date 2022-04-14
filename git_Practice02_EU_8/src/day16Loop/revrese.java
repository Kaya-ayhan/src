package day16Loop;

public class revrese {
    public static void main(String[] args) {
        String str="I like coding";
        String res=" ";
        for (int i =str.length()-1; i>=0 ; i--) {

            res +=str.charAt(i);
        }
        System.out.println(res);
    }

        }


