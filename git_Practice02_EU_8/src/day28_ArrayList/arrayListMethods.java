package day28_ArrayList;

import java.util.ArrayList;

public class arrayListMethods {
    public static void main(String[] args) {


        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);  // add method arraya sırayla herşeyi ekler.
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        numbers.add(70);

        System.out.println("numbers = " + numbers);

        numbers.add(2,300); // önce index number yazıp sonra ekleneecek eleman yazılır sa o indexteki elemanı bir sağa kaydırıp yeni elemanı o indexe atar
        System.out.println(numbers);


    }
}
