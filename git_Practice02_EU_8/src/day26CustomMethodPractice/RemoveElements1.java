package day26CustomMethodPractice;

import java.util.Arrays;

public class RemoveElements1 {
    public static void main(String[] args) {
        int[] arr1={100,200,300,400,500};
        arr1=removeElementIndex(arr1,1);
        System.out.println(Arrays.toString(arr1));



    }
    
    //// removes the index from the array returns a new array without index element
    public  static int[] removeElementIndex(int[] array,int index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid index");

            System.exit(0);
        }
        int[] result=new int[array.length-1];
        int j=0;
        for(int i=0; i< array.length; i++){ //if index of array is matching
            if(i==index){
                continue;  //skip
            }
            result[j++]=array[i];
        }
        return result;
    }
    
    // removes the index from the array returns a new array without index element
    public  static double[] removeElementIndex(double[] array,int index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid index");

            System.exit(0);
        }
        double[] result=new double[array.length-1];
        int j=0;
        for(int i=0; i< array.length; i++){ //if index of array is matching
            if(i==index){
                continue;  //skip
            }
            result[j++]=array[i];
        }
        return result;
    }

    // removes the index from the array returns a new array without index element
    public  static char[] removeElementIndex(char[] array,int index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid index");

            System.exit(0);
        }
        char[] result=new char[array.length-1];
        int j=0;
        for(int i=0; i< array.length; i++){ //if index of array is matching
            if(i==index){
                continue;  //skip
            }
            result[j++]=array[i];
        }
        return result;
    }

    // removes the index from the array returns a new array without index element
    public  static String[] removeElementIndex(String[] array,int index){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid index");

            System.exit(0);
        }
        String[] result=new String[array.length-1];
        int j=0;
        for(int i=0; i< array.length; i++){ //if index of array is matching
            if(i==index){
                continue;  //skip
            }
            result[j++]=array[i];
        }
        return result;
    }




}
