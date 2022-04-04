package day29arrayListMethodsContinueCollections;

import java.util.ArrayList;

public class TasksExe {

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        for (Integer each : list) {

        int freq=0;
        for(Integer element: list){
            if(element==each){
                freq++;
            }
        }
        if(freq==1){
            System.out.println(each);
            break;
        }
        }

    }
}
