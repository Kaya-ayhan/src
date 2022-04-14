package week09reviewOscar;

import java.util.Arrays;

public class TwoBiggestarray {
    public static void main(String[] args) {





    int [][] arr = { {3,12,3,34,12}, {13,7,456,34,3}, {-5, -24, -2, -10, -4} };

        System.out.println(Arrays.deepToString(arr));

        int[] biggestNumbers=new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            int max=arr[i][0];
            for (int each:arr[i]) {

                if(each>max){
                    max=each;
                }
            }
            biggestNumbers[i]=max;

        }
        System.out.println(Arrays.toString(biggestNumbers));
}
}