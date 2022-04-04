package day29arrayListMethodsContinueCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,3,3,4,4,4,5,6,6,6));
        System.out.println(list);
        System.out.println("--------------");
        list.removeAll(Arrays.asList(3,4,5));
        System.out.println(list);
        System.out.println("----------");

        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50,50,40,30,60,80,100,200,300));
        System.out.println(list1);
        list1.retainAll(Arrays.asList(100,200,300));
        System.out.println(list1);

        System.out.println("-------------");
        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,5,6,8,7,4,9,5,2,0));
        boolean r1 =nums.contains(5);
        boolean r2 =nums.contains(5)&& nums.contains(3) && nums.contains(4);

        boolean r3 =nums.containsAll(Arrays.asList(5,3,4));
        System.out.println("r3 = " + r3);
        System.out.println("r2 = " + r2);
        System.out.println("r1 = " + r1);
        System.out.println("--------------");
        String[] names={"ayhan", "mehmet", "ali"};
        ArrayList<String> name=new ArrayList<>(Arrays.asList(names));
        System.out.println(name);

        int[] arr2={1,2,3,4,5,6};
        ArrayList<Integer> numss= new ArrayList<>(convertArraytoArrayList(arr2));
        System.out.println("numss = " + numss);
    }

    public  static ArrayList<Integer> convertArraytoArrayList(int[] array){
        ArrayList<Integer> list3= new ArrayList<>();
        for (Integer each : array) {
            list3.add(each);
        }
        return list3;
    }
}
