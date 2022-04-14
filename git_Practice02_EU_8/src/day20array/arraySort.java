package day20array;

import java.util.Arrays;

public class arraySort {
    public static void main(String[] args) {
        int[] nums={8, 6, 40, 54, 62, 3, 0, 47};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);   // array deki objeleri küçükten büyüğe sıralıyor. bunu kullanarak nums[0]: min number veya nums.lenght-1 max number olur.
        System.out.println(Arrays.toString(nums));
    }

}
