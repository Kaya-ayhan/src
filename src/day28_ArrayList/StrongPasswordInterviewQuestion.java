package day28_ArrayList;

public class StrongPasswordInterviewQuestion {
    public static void main(String[] args) {

        String password="Cydeo1190@";
        boolean r1=password.length()>=8 && !password.contains(" ");
        boolean r2= false;  //has uppper case
        boolean r3= false;  // has lower case letter
        boolean r4= false;  //  has a number
        boolean r5= false;  //has a special char

        char[] chars= password.toCharArray();
        for (char each : chars) {
            if(Character.isUpperCase(each)){
                r2=true;
            }else if(Character.isLowerCase(each)){
                r3=true;
            }else if(Character.isDigit(each)){
                r4=true;
            }else{
                r5=true;
            }
             /* if(r1 && r2 && r3 && r4){
                break;
            }  */

        }
        boolean isStrogPass=r1 && r2 && r3 && r4 && r5;
        System.out.println("isStrogPass = " + isStrogPass);




    }

    public static boolean isStrongPassword(String password){
        boolean r1=password.length()>=8 && !password.contains("");
        boolean r2= false;  //has uppper case
        boolean r3= false;  // has lower case letter
        boolean r4= false;  //  has a number
        boolean r5= false;  //has a special char

        char[] chars= password.toCharArray();
        for (char each : chars) {
            if(Character.isUpperCase(each)){
                r2=true;
            }else if(Character.isLowerCase(each)){
                r3=true;
            }else if(Character.isDigit(each)){
                r4=true;
            }else{
                r5=true;
            }

        }
        boolean isStrogPass=r1 && r2 && r3 && r4 && r5;
        return isStrogPass;
    }
}
