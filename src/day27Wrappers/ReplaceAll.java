package day27Wrappers;

import java.util.Arrays;

public class ReplaceAll {


    public static void main(String[] args) {
        int[] array={1,2,3,4,3,5,3,9,3};
        array=replaceAll(array,3,100);
        System.out.println(Arrays.toString(array));
    }

    // replaces all  the matching old values at the index returns with the new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    // replaces all  the matching old values at the index returns with the new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }


    // replaces all  the matching old values at the index returns with the new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }


    // replaces all  the matching old values at the index returns with the new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)) {
                array[i] = newValue;
            }
        }
        return array;
    }
}
