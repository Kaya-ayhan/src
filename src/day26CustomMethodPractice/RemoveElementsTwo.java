package day26CustomMethodPractice;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class RemoveElementsTwo {
    public static void main(String[] args) {
        int[] arr1={100,200,300,400,500};
        arr1=removeElementTwo(arr1,1);
        System.out.println(Arrays.toString(arr1));


    }
// removes the index from the array returns a new array without index element
    public static int[] removeElementTwo(int[] array, int index) {
        if(index<0 || index> array.length-1){
            System.err.println("Invalid index");

            System.exit(0);
        }
        int[] result = {};
        for (int i = 0; i < array.length ; i++) {
            if(i!=index){
                result= ArraysUtilities.addElement(result,array[i]);
            }
            
        }
        return result;


    }
}
