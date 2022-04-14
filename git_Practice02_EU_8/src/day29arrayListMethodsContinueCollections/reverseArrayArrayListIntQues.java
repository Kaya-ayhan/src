package day29arrayListMethodsContinueCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class reverseArrayArrayListIntQues {
    public static void main(String[] args) {
        int[] array={2,3,5,6,4,8,9};
        int[] reverse=new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            int j=0;
            reverse[j++]=array[i];

        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("-------------");
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(5,8,9,2,2,7,7,3,3,3,2,4,1));
        ArrayList<Integer> reversedlist=new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            int each=list.get(i);
            reversedlist.add(each);
        }
        System.out.println(reversedlist);
    }
}
