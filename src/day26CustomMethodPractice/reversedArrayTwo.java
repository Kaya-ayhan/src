package day26CustomMethodPractice;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class reversedArrayTwo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 7};
        int[] result=reversedArrayTwo(arr);
        System.out.println(Arrays.toString(result));

    }
    public static int[] reversedArrayTwo(int[] array){
        int[] result={};
        for (int i = array.length - 1; i >= 0; i--) {
            result=ArraysUtilities.addElement(result,array[i]);

        }
        return result;
    }
}
