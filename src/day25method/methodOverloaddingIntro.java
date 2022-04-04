package day25method;

public class methodOverloaddingIntro {
    public static void main(String[] args) {


        int[] arr1={1,2,3,-4,5};
        double[] arr2={1.2 , 5.3 , -8.6};
        char[] arr3={'A', 'B', 'C'};

        int sum1=sumOfnumbers(20,10);
        int sum2=sumOfnumbers(85,45,65);
        double sum3=sumOfnumbers(10.1, 2.3, 5.0);
        double sum4=sumOfnumbers(10.1, 2.3, 5.0,4.5);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);

    }
    public static int sumOfnumbers(int num1, int num2){
        return num1+num2;
    }
    public static int sumOfnumbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static double sumOfnumbers(double num1, double num2, double num3){
        return num1+num2+num3;
    }
    public static double sumOfnumbers(double num1, double num2, double num3, double num4){
        return num1+num2+num3+num4;
    }
}
