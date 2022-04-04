package day28_ArrayList;

public class strongPassword2 {
    public static void main(String[] args) {

        String password="cLdeoa1990@";
        int countUpperCase=0;
        int countLowerCase=0;
        int specialChar=0;
        int countDigit=0;
        int countSpecialChar=0;

        for (int i = 0; i < password.length(); i++) {
            char each=password.charAt(i);
            if(Character.isUpperCase(each)){
                countUpperCase ++;
            }else if(Character.isLowerCase(each)){
                countLowerCase ++;
            }else if(Character.isDigit(each)){
                countDigit ++;
            }else{
                countSpecialChar ++;
            }
        }
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countDigit = " + countDigit);
        System.out.println("countSpecialChar = " + countSpecialChar);


        boolean hasUpperCase= countUpperCase>0;
        boolean hasLowerCase= countLowerCase>0;
        boolean hasUDigit= countDigit>0;
        boolean hasSpecialChar= countSpecialChar>0;

        boolean strongPassword=password.length()>=8 && !password.contains(" ") && hasUpperCase && hasLowerCase && hasUDigit && hasSpecialChar;

        System.out.println("strongPassword = " + strongPassword);
    }
}
