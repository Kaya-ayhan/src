package day29arrayListMethodsContinueCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InterviewQuestionlargestNumber {
    public static void main(String[] args) {
         // return  the nth largest number
        /* input:5  int[] array={1,2,3,4,5,6,7.7,8,8,9};
        output:4
         */

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,5,6,7,8,9,9,8));

        int n=3;
        for (int i = 0; i <n ; i++) {
            list.removeIf(p->Collections.max(list)==p);}

        int max=Collections.max(list);
        System.out.println(max);
        }



    }

