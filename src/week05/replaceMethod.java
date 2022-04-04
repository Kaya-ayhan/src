package week05;

public class replaceMethod {
    public static void main(String[] args) {
        String result="Java Java Java";
        result= result.replace("Java","Phyton");

        System.out.println(result);
        result=result.replaceAll("Phyton", "C++");
        System.out.println( result);
        result=result.replaceFirst("C++","125");
        System.out.println(result);
    }
}
