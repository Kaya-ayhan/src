package unit1Assesment;

import utilities.ArraysUtilities;
import utilities.StringUtility;

public class test {
    public static void main(String[] args) {
        String str="Java is good learning";
       String reverse= StringUtility.reverse(str);
        System.out.println(reverse);
        System.out.println("------------------");
        String s2="Anna";
        boolean palindrome= StringUtility.palindrom(s2);
        System.out.println("palindrome = " + palindrome);
        System.out.println("-------------");
        String[] arr1={"Anna","mom", "Racecar","Josh"};
         int count=0;
         for(String each:arr1){
             if(StringUtility.palindrom(each)){
                 count++;
             }
         }
        System.out.println(count);
        System.out.println("--------------");

        String str01="aaaabbbbddccfgrttyyyy";
        String nonDup=StringUtility.RemoveTheDuplicate(str01);
        System.out.println(nonDup);

        System.out.println("------------");
        int[] ar1={1,6,8,7,9};
        int max1=ArraysUtilities.maxNumber(ar1);
        System.out.println(max1);
        System.out.println("------------");
        double[] ar2={2.5, 5.6, 8.6};
        double max2=ArraysUtilities.mmaxNumber(ar2);
        System.out.println(max2);


        System.out.println("-------------");
        int[] ar5={1,6,8,7,9};
        int num2=7;
        boolean r1=ArraysUtilities.contain(ar5,7);
        System.out.println("r1 = " + r1);
        System.out.println("-------------");
        double[] ar6={2.5, 5.6, 8.6};
        boolean r2= ArraysUtilities.contain(ar6,7.5);
        System.out.println("r2 = " + r2);
        System.out.println("-------------------");
        char[] ch5={'A', 'B','C'};
        boolean r3=ArraysUtilities.contain(ch5,'B');
        System.out.println("r3 = " + r3);



    }
}
