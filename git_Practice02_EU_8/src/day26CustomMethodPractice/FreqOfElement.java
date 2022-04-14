package day26CustomMethodPractice;

import org.w3c.dom.ls.LSOutput;

public class FreqOfElement {
    public static void main(String[] args) {


        int[] array={1,1,1,2,2,2,5,5,5,8,8,};
        int n=freqOfElement(array,2);

        System.out.println(n);
    }




// find the specific element freq in the array
    public static int freqOfElement(int[] array,int element){
        int count=0;
        for(int each:array){
            if(each==element){
                count++;
            }
        }
        return count;
    }

    // find the specific element freq in the array
    public static int freqOfElement(double[] array,double element){
        int count=0;
        for(double each:array){
            if(each==element){
                count++;
            }
        }
        return count;
    }

    // find the specific element freq in the array
    public static int freqOfElement(char[] array,char element){
        int count=0;
        for(char each:array){
            if(each==element){
                count++;
            }
        }
        return count;
    }

    // find the specific element freq in the array
    public static int freqOfElement(String[] array,String element){
        int count=0;
        for(String each:array){
            if(each==element){
                count++;
            }
        }
        return count;
    }


}
