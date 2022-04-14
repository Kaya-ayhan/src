package day19LoopAndString;

public class freqDuplicate {
    public static void main(String[] args) {
        String s = "aassefdefde";
        String r = "";

        for (int j = 0; j < s.length(); j++) {


            char a = s.charAt(j);
            int c = 0;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (a == ch) {
                    c++;
                }


            }
            if (s.contains("" + a)) {
                continue;
            }
            r += a;
            r += c;


        }
        System.out.println(r);

    }
}
