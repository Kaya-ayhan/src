package week07ReviewLoop;

public class freqOfChar {
    public static void main(String[] args) {
        String s="aaabbccdd";
        String result="";

        for (int i = 0; i <s.length() ; i++) {
            int count=0;
            String c=""+s.charAt(i);
            for (int j = 0; j <i ; j++) {
                if(c==""+s.charAt(j)){
                    count++;


                }

        }
            System.out.println(count);


        }

    }
}
