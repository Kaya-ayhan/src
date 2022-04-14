package day27Wrappers;

import java.util.Arrays;

public class ReplaceMethods {

    public static void main(String[] args) {
        int[] arr={1,2,3,5,4};
        arr=replace(arr,2,30);
        System.out.println(Arrays.toString(arr));

        System.out.println("--------------------");
        String[] arr2={"A", "B", "C", "D"};
        replace(arr2,3,"Z");
        System.out.println(Arrays.toString(arr2));
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
}
