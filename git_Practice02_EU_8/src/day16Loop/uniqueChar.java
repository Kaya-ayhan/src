package day16Loop;

public class uniqueChar {
    public static void main(String[] args) {
        String s= "aaabccccd";
        String v="";
        for (int i = 0; i < s.length() ; i++) {
            char ch=s.charAt(i);
            if(s.indexOf(ch) ==s.lastIndexOf(ch)){
                v +=ch;
            }

        }
        System.out.println(v);
    }
}
