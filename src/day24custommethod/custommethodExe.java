package day24custommethod;

import java.util.Locale;
import java.util.Scanner;

public class custommethodExe {
    public static void main(String[] args) {


        initials("Cydeo","Spoon");
        System.out.println("--------------------");

        domain("ayhan.kaya1230@gmail.com");
        System.out.println("----------------------");
        String[] emails={"ay@gmail.com", "q@yahoo.com","ase@cydeo.com"};
         //domain(emails[0]);  bu sadece arraydeki ilk emaili verir bize bunu hepsinde tekrar etmek için for each loop

        for (String email : emails) {
            domain(email);
        }
        System.out.println("-----------------");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter month number:");
        int number= scan.nextInt();
        month(number);
    }




    public static void initials(String firstName, String lastName){
        String initials= firstName.charAt(0)+"."+lastName.charAt(0);
        initials=initials.toUpperCase();
        System.out.println("initials = " + initials);
    }
    public static void month(int num){
        String str="";
        if(num>=1 && num<=12){
            str=(num==1)?"Jan" :(num==2)?"Feb" :(num==3)?"Mar" :(num==4)?"Apr" :(num==5)?"May" :(num==6)?"Jun" :(num==7)?"Jul"
                    :(num==8)?"Aug" :(num==9)?"Sep"  :(num==10)?"Oct" :(num==11)?"Nov" :"Dec";

        }else{
            str="Invalid number";
        }
        System.out.println("Month name: "+str);
    }

    public static void domain(String email){
        String domain= email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

    public static void nameOfDay(int n){
        
    }

}
