package day26CustomMethodPractice;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 1, 2, 5, 6};
        int[] unique=uniqueElement(n);
        System.out.println(Arrays.toString(unique));
        System.out.println("---------------");
        double[] n1 = {1.1, 2.2, 3.3, 1.3, 2.2, 5.5, 6.8};
      double[] unique1=uniqueElement(n1);
        System.out.println(Arrays.toString(unique1));



    }
// returns the unique element to the new array
    public static int[] uniqueElement(int[] array) {
        int[] result = {};
        for (int each : array) {
            if (ArraysUtilities.freqOfElement(array, each)==1) {
                result = ArraysUtilities.addElement(result, each);
            }

        }
        return result;
    }

    // returns the unique element to the new array
    public static double[] uniqueElement(double[] array) {
        double[] result = {};
        for (double each : array) {
            if (ArraysUtilities.freqOfElement(array, each)==1) {
                result = ArraysUtilities.addElement(result, each);
            }

        }
        return result;
    }

    // returns the unique element to the new array
    public static char[] uniqueElement(char[] array) {
        char[] result = {};
        for (char each : array) {
            if (ArraysUtilities.freqOfElement(array, each)==1) {
                result = ArraysUtilities.addElement(result, each);
            }

        }
        return result;
    }

    // returns the unique element to the new array
    public static String[] uniqueElement(String[] array) {
        String[] result = {};
        for (String each : array) {
            if (ArraysUtilities.freqOfElement(array, each)==1) {
                result = ArraysUtilities.addElement(result, each);
            }

        }
        return result;
    }
   

}
