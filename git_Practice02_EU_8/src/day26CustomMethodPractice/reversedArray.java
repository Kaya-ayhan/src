package day26CustomMethodPractice;

import java.util.Arrays;

public class reversedArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 7};
        int[] result = reversedArray(arr);
        System.out.println(Arrays.toString(result));


    }

    // reversing the one array returns to the new array
    public static int[] reversedArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }
}
