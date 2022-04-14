package week06rev;

public class odd {
    public static void main(String[] args) {
        int c=0;
        for (int i = 3; i <130 ; i+=2) {
            System.out.print(i+" ");

        }
        for (int i = 5; i <51 ; i++) {
            if(i%2==0){
               c+=1;
            }
        }
        System.out.println(c);

        }
    }

