package day17;

public class removeDuplicate {
    public static void main(String[] args) {
        String s="AAABBSSDDD";
        String result="";
        for (int i = 0; i <s.length() ; i++) {
            String ch=""+s.charAt(i);
            if(result.contains(ch)){
                continue;

            }
            result+=ch;

        }
        System.out.println(result);
        System.out.println("------------");
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            if(result.contains(""+c)){
                continue;
            }
            result+=c;

        }
        System.out.println(result);
    }
}
