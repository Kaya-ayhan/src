package day20array;

import java.util.Scanner;

public class maxNumbers {
    public static void main(String[] args) {
       /* int[] number = {10, 20, 25, 5, 9};
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }

        }
        System.out.println(max); */
        Scanner scan = new Scanner(System.in);
        System.out.println("how many number do u enter?");
        int n = scan.nextInt();
        int[] num=new int[n];
        int max1=0;
        if (n > 0) {
            for (int i = 0; i < n; i++) {


                System.out.println("enter number:");
             num[i]= scan.nextInt();
             if(max1<num[i]){
                 max1=num[i];
             }



                }

            }
        System.out.println(max1);

        }
    }
