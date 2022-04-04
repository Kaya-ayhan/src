package day30CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Wamrmups {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,7,8,9,6,5));
        Collections.swap(list,0,list.size()-1);
        System.out.println(list);
        System.out.println("-------------");
        /* bir arraylistteki farklı indexlerdeki 0 ları en sona almak  */


        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,0,3,2,0,4,0,5,8,0,7));
        System.out.println(list1);

        int size=list1.size();
        list1.removeAll(Arrays.asList(0));
        int newsize=list1.size();
        int total0Number=size-newsize;
        for (int i = 0; i < total0Number; i++) {
            list1.add(0);

        }
        System.out.println(list1);

        System.out.println("-----------------");   // 2. approach

        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,3,2,0,4,0,5,8,0,7));
        System.out.println(list2);
        ArrayList<Integer> result=new ArrayList<>();
        for (Integer each : list2) {
            if(each!=0){
                result.add(each);
            }


        }
        for (Integer each : list2) {
            if(each==0){
                result.add(each);
            }
        }
        System.out.println(result);


        System.out.println("-------------");

        String str="ABCDFG#${[]}123546,.#$";
        ArrayList<Character> chars= new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));}
            System.out.println(chars);

            ArrayList<Character> letters= new ArrayList<>(chars);
            letters.removeIf(p-> !(Character.isLetter(p)));
            System.out.println(letters);

            ArrayList<Character> digits= new ArrayList<>(chars);
            digits.removeIf(p-> !(Character.isDigit(p)));
            System.out.println(digits);

            ArrayList<Character> special= new ArrayList<>(chars);
           // special.removeAll(letters);
           // special.removeAll(digits);
        special.removeIf(p-> Character.isLetterOrDigit(p));
            System.out.println(special);





        }


    }
