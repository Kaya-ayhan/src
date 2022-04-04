package week06rev;

public class encryptPass {
    public static void main(String[] args) {



        String pass="cydeo";
        char enc='x';
        String enpass="";
        for (int i = 0; i <=pass.length()-1 ; i++) {
            enpass+=""+pass.charAt(i)+enc;

        }
        System.out.println(enpass);
    }
}
