package day17;

public class evenNumbersContinue {
    public static void main(String[] args) {

        for (int j = 0; j <=10 ; j++) {

            if(j%2==1){
                continue;
            }
            System.out.println(j);

        }
        System.out.println("-----------------");
        for (int i = 0; i < 11; i++) {
            if(i%2!=1){
                continue;
            }
            System.out.println(i);

        }

        }
    }

