package day20array;

public class averageSum {
    public static void main(String[] args) {
        int[] num={10,20,30,40,50};
        double sum=0;
        for (int i = 0; i <num.length ; i++) {
            sum+=num[i];
        }
        double average=sum/num.length;
        System.out.println("average = " + average);
    }
}
