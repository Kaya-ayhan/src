package day37_Inheritance.animalTask.animal;
class  A{
public A(){  // A(int a)
    System.out.println("A");
        }
}
class B extends A{
    public B(){
         //super(9);
        System.out.println("B");
    }
}

public class ConstructorExe {
    public static void main(String[] args) {
        B b1=new B();
        System.out.println(b1);
    }


}
