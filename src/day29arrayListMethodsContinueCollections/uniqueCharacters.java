package day29arrayListMethodsContinueCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class uniqueCharacters {
    public static void main(String[] args) {
        String str="aabbbccdefggrsw";
        String[] array=str.split("");
       ArrayList<String> unique=new ArrayList<>(Arrays.asList(array));

       // ArrayList<String> unique=new ArrayList<>(Arrays.asList(str.split("")));
       // System.out.println(unique);

        System.out.println("unique = " + unique);
        String un="";
        for (String each : unique) {
            int freq= Collections.frequency(unique,each);
            if(freq==1){
                un+=each;
            }
        }
        System.out.println("un = " + un);
    }
}
