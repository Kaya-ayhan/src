package week09reviewOscar;

public class customMethod {
    public static void main(String[] args) {

        int personOneage = 10;
        if(personOneage>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Person is not eligible to buy");
        }
        System.out.println("**************************");
        eligibleOrNot(19);
        eligibleOrNot(21);
        eligibleOrNot(25);




    }
    public static void eligibleOrNot(int age){
        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Person is not eligible to buy");
        }

    }
}
