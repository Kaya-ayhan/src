package day23customVoitMethod;

public class voitExe {
    public static void greeting() {
        System.out.println("Hello Cydeo");

    }

   public static void main(String[] args) {
        System.out.println("Test Started");
        greeting();  // iki kere alt alta yazsak iki kere yazardı
        System.out.println("Test Completed");

       System.out.println("*-------------------------------");
       evenNumbers();
    }
    public static void evenNumbers(){
        for (int i = 2; i <11 ; i+=2) {
            System.out.println(i);

        }
    }

}
