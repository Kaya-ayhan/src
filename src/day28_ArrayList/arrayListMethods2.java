package day28_ArrayList;

import java.util.ArrayList;
import java.util.Enumeration;

public class arrayListMethods2 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);
       /* int num=1;
                list.remove(num);  */


         Integer num=200;
         boolean r2= list.remove(num);
        list.remove(num);
        System.out.println(list);
        System.out.println("r2 = " + r2);

        System.out.println(list.size());
        System.out.println("------------");
        list.clear();
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("--------------");

        ArrayList<Character>  characters= new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a= characters.indexOf('A');  //0
        int b= characters.lastIndexOf('A');
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        System.out.println("------------");
        boolean r= characters.contains('A');

        boolean r3= characters.contains('Z');
        System.out.println("r = " + r);
        System.out.println("r3 = " + r3);

        System.out.println("------");


    }
}
