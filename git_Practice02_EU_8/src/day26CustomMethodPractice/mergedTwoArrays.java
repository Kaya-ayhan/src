package day26CustomMethodPractice;

import utilities.ArraysUtilities;

import java.util.Arrays;


public class mergedTwoArrays {
    public static void main(String[]args){
        int[] arr1={1,2,3,5,6,7};
        int[] arr2={1,2,3,5,6,8,9};
        int[] arr3=merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

    }


    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};

        for (int each : arr1) {
            result = ArraysUtilities.addElement(result, each);

        }

        for (int each : arr2) {
            result = ArraysUtilities.addElement(result, each);

        }
        return result;

    }
     /*  public static int[] merge(int[] arr1, int[] arr2) {
       int[] result = new int[arr1.length+arr2.length];
       int i=0;

       for (int each : arr1){
       result[i++]=each;
       }
       for (int each : arr2){
           result[i++]=each;
       }
       return result;
   }  */

}
