package day29arrayListMethodsContinueCollections;

import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args) {
        String[] countries={"Japan", "Turkey","USA", "Germany", "Russia"};
        // how should ı convert the array to the array
        java.util.ArrayList<String> list=new java.util.ArrayList<>(Arrays.asList(countries));

        // remove greater then 5 characters in the country name;

        list.removeIf(p-> p.length()>5);
        System.out.println(list);


        //converting arraylist to array
        countries=list.toArray( new String[0]);
        System.out.println(Arrays.toString(countries));


    }
}
