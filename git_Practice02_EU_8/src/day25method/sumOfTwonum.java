package day25method;

public class sumOfTwonum {
    public static void main(String[] args) {
        int sumOf=sum(20,10);
        System.out.println(sumOf);
        System.out.println("-------------");
        System.out.println(sumOfThreeNum(10,20,30));
        System.out.println("------------");
        System.out.println(sumDoubleTwo(10.2,32.5));

    }

    public static int sum(int n1,int n2){
        int result= n1+n2;
        return result;
    }
    public static int sumOfThreeNum(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public static double sumDoubleTwo(double n1, double n2){
        return n1+n2;
    }
}
