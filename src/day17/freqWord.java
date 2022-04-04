package day17;

public class freqWord {
    public static void main(String[] args) {
        String str="JavaJavaJava";
        int N=0;
        for (int i = 0; i <str.length()-3 ; i++) {
            String eachWord= str.substring(i,i+4);

            if(eachWord.equalsIgnoreCase("jaVa")){
                N++;

            }



        }
        System.out.println(N);
    }
}

