package day29arrayListMethodsContinueCollections;

import java.util.ArrayList;

public class maxMinAverage {
    public static void main(String[] args) {
        ArrayList<Integer> num= new ArrayList<>();
    num.add(10);
        num.add(20);
        num.add(10);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(80);
        System.out.println(num);

        System.out.println("----------------");
        int max=num.get(0);
        int min=num.get(0);
        int sum=0;
        for (Integer each : num) {
            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
            }
            sum+=each;

        }
        double average=sum/num.size();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average);
    }
}
