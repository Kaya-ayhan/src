package day23customVoitMethod;

public class customMethodsWithParameters {
    /// create a code to identify even or odd number
    public static void evenOrOdd(int number){
        if(number%2==0){
            System.out.println(number+" is Even Number");
        }else{
            System.out.println(number + " is odd number");
        }



    }

    public static void main(String[] args) {
        evenOrOdd(10);


        System.out.println("----------------");
        ageOfPerson(1986);
    }
    public static void ageOfPerson(int birthYear){
        System.out.println("your age is:" + (2022-birthYear));
    }
}
