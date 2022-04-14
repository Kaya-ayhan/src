package day29arrayListMethodsContinueCollections;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class removeIfMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> list3=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list);
        list.removeIf(p-> p<5);  // Lambda expression
        System.out.println(list);

        System.out.println("---------------");
        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list1.removeIf(each-> each%2==0);
        System.out.println(list1);

        System.out.println("---------------");
        ArrayList<String> word=new ArrayList<>();
        word.addAll(Arrays.asList("Java", "Phyton", "C#", "C++", "JavaScript"));
        System.out.println(word);

        word.removeIf(p-> p.startsWith("J"));
        System.out.println(word);

        System.out.println("---------------");
        ArrayList<String> palindrome=new ArrayList<>();
        palindrome.addAll(Arrays.asList("Anna", "Neira", "Omo", "listen"));
        palindrome.removeIf(name-> StringUtility.palindrom(name));
        System.out.println(palindrome);




    }
}
