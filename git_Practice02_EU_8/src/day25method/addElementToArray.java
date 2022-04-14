package day25method;

import java.util.Arrays;

public class addElementToArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        arr=addInteger(arr,5);
        System.out.println(Arrays.toString(arr));
        System.out.println("------------");
        double[] arr1={3.1,5.4,6.8};
        arr1=addDouble(arr1,5.8);
        System.out.println(Arrays.toString(arr1));
        System.out.println("-----------------------");
        char[] array2={'A','B', 'C', 'D'};
        char element2='E';
        array2=addChar(array2,'E');

        System.out.println(Arrays.toString(array2));
        System.out.println("---------------");
        String[] array3={"Ayhan", "Ayşe", "Joshua"};
        String element="Fatma";
        array3=addString(array3,"Fatma");
        System.out.println(Arrays.toString(array3));





    }

    public static int[] addInteger(int[] array, int element){
        int[] result= new int[array.length+1];
        int i=0;

        for(int each:array){
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }

    public static char[] addChar(char[] array2, char element2){
        char[] result= new char[array2.length+1];
        int j=0;

        for(char each:array2){
            result[j++]=each;
        }
        result[j]=element2;
        return result;
    }
    public static double[] addDouble(double[] array1, double element1){
        double[] result= new double[array1.length+1];
        int j=0;

        for(double each:array1){
            result[j++]=each;
        }
        result[j]=element1;
        return result;
    }
    public static String[] addString(String[] array3, String element){
        String[] result= new String[array3.length+1];
        int i=0;
        for (String each:array3) {
            result[i++]=each;

        }
        result[i]=element;
        return result;
    }

}
