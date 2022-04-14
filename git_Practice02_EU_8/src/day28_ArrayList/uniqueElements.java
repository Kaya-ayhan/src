package day28_ArrayList;

import java.util.ArrayList;

public class uniqueElements {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Phyton");
        list.add("Phyton");
        list.add("Phyton");
        list.add("c#");
        list.add("c#");
        list.add("C#");
        list.add("Ruby");
        list.add("Java");
        System.out.println(list);
        ArrayList<String> unique=new ArrayList<>();
        for (String each : list) {
            if(list.indexOf(each)==list.lastIndexOf(each)){
                unique.add(each);
            }
        }
        System.out.println(unique);

        System.out.println("----------------------");

    }
}
