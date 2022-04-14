package day20array;

import java.util.Arrays;
import java.util.Scanner;

public class ENTERnUMBERS {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("how many numbers would you like to enter?");
        int numbers= scan.nextInt();
        if(numbers<=0){
            System.err.println("Invalid ");
            System.exit(0);
        }
        int[] lenght= new int[numbers];
        for (int i = 0; i <numbers ; i++) {
            System.out.println("Enter a number:");
            lenght[i]= scan.nextInt();

        }
        System.out.println(Arrays.toString(lenght));

    }
}
