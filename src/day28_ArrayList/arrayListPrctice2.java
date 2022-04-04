package day28_ArrayList;

import java.util.ArrayList;

public class arrayListPrctice2 {
    public static void main(String[] args) {

        ArrayList<Integer> List=new ArrayList<>();
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        System.out.println(List);
        for (int i = 0; i < List.size(); i++) {
            List.set(i,List.get(i)*2);
            
        }
        System.out.println(List);
        System.out.println("-------------------------------------");
        ArrayList<String> employees=new ArrayList<>();
        employees.add("ayhan");
        employees.add("ayse");
        employees.add("aali");
        employees.add("akar");
        employees.add("ferda");
        employees.add("murat");
        System.out.println(employees);
        employees.remove(1);
        System.out.println(employees);
        employees.remove(employees.size()-1);  // last element will be removed from the arraylis
        System.out.println(employees);

        employees.remove("murat");
        System.out.println(employees);
        System.out.println("------------------");
        boolean r1=employees.remove("murat");
        System.out.println("r1 = " + r1);


        System.out.println("---------------------");





    }
}
