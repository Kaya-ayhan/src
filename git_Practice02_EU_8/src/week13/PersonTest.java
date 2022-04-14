package week13;

public class PersonTest {

    public static void main(String[] args) {
        PersonReadonly tester= new PersonReadonly("mike","smith",30);
        System.out.println(tester);

        //  tester.setFirstname="Osacar"; read only oldugu için değiştiremiyoruz
    }

}
