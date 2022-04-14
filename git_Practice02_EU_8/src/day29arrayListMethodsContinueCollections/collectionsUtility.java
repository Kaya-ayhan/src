package day29arrayListMethodsContinueCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class collectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(5,8,9,7,3,2,4,1));
        Collections.sort(list);  // collection sort method: it sorted the collections to ascending order
        System.out.println(list);
        System.out.println("----------------");
        ArrayList<String> word=new ArrayList<>();
        word.addAll(Arrays.asList("Java", "Phyton", "C#", "C++", "JavaScript"));
        System.out.println(word);
        Collections.reverse(word);  // reverse method reverses collections
        System.out.println(word);
        System.out.println("----------------");
        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(5,8,9,7,3,2,4,1));
        Collections.swap(list1,3,6);
        System.out.println("---------------");
        int max=Collections.max(list1);
        int min=Collections.min(list1);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("------------------" );
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(10,20,30,50,50,50,70,80,80,100));
        Collections.replaceAll(list2,10,200);
        Collections.replaceAll(list2,50,1000);
        System.out.println(list2);
        System.out.println("------------");
        int freq=Collections.frequency(list2,50);
        System.out.println("freq = " + freq);
        System.out.println("----------------");
        ArrayList<String> word1=new ArrayList<>();
        word1.addAll(Arrays.asList("Java", "Phyton", "C#","Java" ,"C++","C++", "JavaScript"));
        System.out.println(word1);
        int freJ= Collections.frequency(word1,"Java");
        int freqC= Collections.frequency(word1,"C++");
        System.out.println("freqC = " + freqC);
        System.out.println("freJ = " + freJ);
        System.out.println("---------------");





    }
}
