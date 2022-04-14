package day27Wrappers;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class removeDuplicates {

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 5, 5, 66, 9, 8, 77, 4,};
        array = removeDuplicates(array);
        System.out.println(Arrays.toString(array));

        System.out.println("-----------------");

        String[] arr={"ayhan", "ayhan", "ayhan","ayse", "ferda"};
        arr=removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));


    }
// remove the duplicates from the array and return a new array
    public static int[] removeDuplicates(int[] array) {
        int[] result = {};
        for (int each : array) {
            if (!ArraysUtilities.contain(result, each)) {
                result = ArraysUtilities.addElement(result, each);
            }

        }
        return result;

    }

    // remove the duplicates from the array and return a new array
    public static double[] removeDuplicates(double[] array) {
        double[] result = {};
        for (double each : array) {
            if (!ArraysUtilities.contain(result, each)) {
                result = ArraysUtilities.addElement(result, each);
            }

        }
        return result;

    }

    // remove the duplicates from the array and return a new array
    public static char[] removeDuplicates(char[] array) {
        char[] result = {};
        for (char each : array) {
            if (!ArraysUtilities.contain(result, each)) {
                result = ArraysUtilities.addElement(result, each);
            }

        }
        return result;

    }

    // remove the duplicates from the array and return a new array
    public static String[] removeDuplicates(String[] array) {
        String[] result = {};
        for (String each : array) {
            if (!ArraysUtilities.contain(result, each)) {
                result = ArraysUtilities.addElement(result, each);
            }

        }
        return result;

    }
}
