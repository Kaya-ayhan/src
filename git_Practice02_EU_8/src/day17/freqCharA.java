package day17;

public class freqCharA {
    public static void main(String[] args) {
        String str="AAABBCCDDD";
        int freq=0;
        char ch='A';
        String a="";
        for (int i = 0; i <=str.length()-1 ; i++) {
            char eachChar=str.charAt(i);


            if(ch==eachChar){
                freq++;

            }
            if(str.contains(""+eachChar)){
continue;
            }
            a+=eachChar;
        }
        System.out.println(freq);
        System.out.println(a);
    }
}
