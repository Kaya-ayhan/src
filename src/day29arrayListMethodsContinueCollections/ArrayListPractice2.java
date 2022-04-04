package day29arrayListMethodsContinueCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        java.util.ArrayList<String> employees=new java.util.ArrayList<>();
        employees.addAll(Arrays.asList("Ahmet", "Ali", "David", "Meryem","Mali"));
        employees.retainAll(Arrays.asList("Ali", "Meryem"));
        System.out.println(employees);
        System.out.println("------------");

        String[] names={"Ahmet", "Ali", "David", "Meryem","Mali", "Aliah", "Ayse","Altug"};
        java.util.ArrayList<String> list=new ArrayList<>(Arrays.asList(names));
        list.removeIf(p->p.charAt(0)=='A');
        System.out.println(list);
        names=list.toArray( new String[0]);
        System.out.println(Arrays.toString(names));

    }
}
