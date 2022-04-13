package utilities;

import day40_FinalKeyword.ProtectedAccesModifier;

public class AccessModifiers_test4 extends ProtectedAccesModifier {

    public static void main(String[] args) {

       // System.out.println(AccessModifiers_test4.name1); default is is not visible
        System.out.println(AccessModifiers_test4.name2);  //protected is visible subclass
        //AccessModifiers_test4.method1(); defauld method is not visible sub class
        AccessModifiers_test4.method2();  // protected method can be visible in subclass
    }
}
