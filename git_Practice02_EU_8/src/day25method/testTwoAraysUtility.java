package day25method;

import utilities.ArraysUtilities;

public class testTwoAraysUtility {
    public static void main(String[] args) {

        int[] arr1={1,3,5,8,9};
        ArraysUtilities.printEach(arr1);
        System.out.println("--------------");
        double[] arr2={2.5,3.4,8.7};
        ArraysUtilities.printEach(arr2);
        System.out.println("---------");
        char[] ch1={'A', 'B', 'C'};
        ArraysUtilities.printEach(ch1);
        System.out.println("------------");
        String[] str1={"Ayhan", "Ayşe", "Ferda"};
        ArraysUtilities.printEach(str1);


    }
}
