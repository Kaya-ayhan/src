package day29arrayListMethodsContinueCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class uniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(5,8,9,2,2,7,7,3,3,3,2,4,1));

        ArrayList<Integer> unique=new ArrayList<>();
        for (Integer each : list1) {
            int element= Collections.frequency(list1,each);
             if(element==1) {
                 unique.add(each);
             }

        }
        System.out.println(list1);
        System.out.println(unique);

        System.out.println("-------------------");
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(5,8,9,2,2,7,7,3,3,3,2,4,1));
        list2.removeIf(p-> Collections.frequency(list2,p)>1);
        System.out.println(list2);
        System.out.println("----------------");

    }
}
