package utilities;

import java.util.Arrays;

public class ArraysUtilities {
    // prints each element on separet line from the integer array
    public static void printEach(int[] array) {
        for (int each : array) {
            System.out.println(each);

        }
    }

    // prints each element on separet line from the double array
    public static void printEach(double[] array) {
        for (double each : array) {
            System.out.println(each);

        }

    }

    // prints each element on separet line from the char array
    public static void printEach(char[] array) {
        for (char each : array) {
            System.out.println(each);

        }

    }

    // prints each element on separet line from the String array
    public static void printEach(String[] array) {
        for (String each : array) {
            System.out.println(each);

        }

    }

    // prints the max number an integer array
    public static int maxNumber(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // prints the max number an double array
    public static double mmaxNumber(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // prints the min number an double array
    public static int minNumber(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static double minNumber(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    // if given integer contains in the given array return boolean

    public static boolean contain(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    // if given double contains in the given array return boolean contains method

    public static boolean contain(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    // if given a charcontains in the given  char array return boolean contains method

    public static boolean contain(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //chexks if given a string contains in the given string array return boolean contains method

    public static boolean contain(String[] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each.contains(element)) {
                result = true;
            }
        }
        return result;
    }

    // add element to the array return a new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;

        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    // add element to the array return a new array
    public static char[] addElement(char[] array2, char element2) {
        char[] result = new char[array2.length + 1];
        int j = 0;

        for (char each : array2) {
            result[j++] = each;
        }
        result[j] = element2;
        return result;
    }

    // add element to the array return a new array
    public static double[] addElement(double[] array1, double element1) {
        double[] result = new double[array1.length + 1];
        int j = 0;

        for (double each : array1) {
            result[j++] = each;
        }
        result[j] = element1;
        return result;
    }

    // add element to the array return a new array
    public static String[] addElement(String[] array3, String element) {
        String[] result = new String[array3.length + 1];
        int i = 0;
        for (String each : array3) {
            result[i++] = each;

        }
        result[i] = element;
        return result;
    }


    // find the specific element freq in the array
    public static int freqOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // find the specific element freq in the array
    public static int freqOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // find the specific element freq in the array
    public static int freqOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // find the specific element freq in the array
    public static int freqOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the unique element to the new array
    public static int[] uniqueElement(int[] array) {
        int[] result = {};
        for (int each : array) {
            if (ArraysUtilities.freqOfElement(array, each) == 1) {
                result = ArraysUtilities.addElement(result, each);
            }

        }
        return result;
    }

    // returns the unique element to the new array
    public static double[] uniqueElement(double[] array) {
        double[] result = {};
        for (double each : array) {
            if (ArraysUtilities.freqOfElement(array, each) == 1) {
                result = ArraysUtilities.addElement(result, each);
            }

        }
        return result;
    }

    // returns the unique element to the new array
    public static char[] uniqueElement(char[] array) {
        char[] result = {};
        for (char each : array) {
            if (ArraysUtilities.freqOfElement(array, each) == 1) {
                result = ArraysUtilities.addElement(result, each);
            }

        }
        return result;
    }

    // returns the unique element to the new array
    public static String[] uniqueElement(String[] array) {
        String[] result = {};
        for (String each : array) {
            if (ArraysUtilities.freqOfElement(array, each) == 1) {
                result = ArraysUtilities.addElement(result, each);
            }

        }
        return result;
    }


    //// removes the index from the array returns a new array without index element
    public static int[] removeElementIndex(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index");

            System.exit(0);
        }
        int[] result = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) { //if index of array is matching
            if (i == index) {
                continue;  //skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    // removes the index from the array returns a new array without index element
    public static double[] removeElementIndex(double[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index");

            System.exit(0);
        }
        double[] result = new double[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) { //if index of array is matching
            if (i == index) {
                continue;  //skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    // removes the index from the array returns a new array without index element
    public static char[] removeElementIndex(char[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index");

            System.exit(0);
        }
        char[] result = new char[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) { //if index of array is matching
            if (i == index) {
                continue;  //skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    // removes the index from the array returns a new array without index element
    public static String[] removeElementIndex(String[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index");

            System.exit(0);
        }
        String[] result = new String[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) { //if index of array is matching
            if (i == index) {
                continue;  //skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    // merge the given two array to one array
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};

        for (int each : arr1) {
            result = addElement(result, each);

        }

        for (int each : arr2) {
            result = addElement(result, each);

        }
        return result;

    }

    // merge the given two array to one array
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {};

        for (double each : arr1) {
            result = addElement(result, each);

        }

        for (double each : arr2) {
            result = addElement(result, each);

        }
        return result;

    }

    // merge the given two array to one array
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = {};

        for (String each : arr1) {
            result = addElement(result, each);

        }

        for (String each : arr2) {
            result = addElement(result, each);

        }
        return result;

    }

    // merge the given two array to one array
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = {};

        for (char each : arr1) {
            result = addElement(result, each);

        }

        for (char each : arr2) {
            result = addElement(result, each);

        }
        return result;

    }

    // reversing the one array returns to the new array
    public static int[] reversedArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    // reversing the one array returns to the new array
    public static double[] reversedArray(double[] array) {
       double[] result = new double[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }
    
    // reversing the one array returns to the new array
    public static char[] reversedArray(char[] array) {
        char[] result = new char[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    // reversing the one array returns to the new array
    public static String[] reversedArray(String[] array) {
        String[] result = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    // replace given index to the given element
    public static int[] replace(int[] array, int index, int newElement){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    // replace given index to the given element
    public static double[] replace(double[] array, int index, double newElement){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    // replace given index to the given element
    public static char[] replace(char[] array, int index, char newElement){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    // replace given index to the given element
    public static String[] replace(String[] array, int index, String newElement){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
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
            if (array[i].equals( oldValue)) {
                array[i] = newValue;
            }
        }
        return array;
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


}
