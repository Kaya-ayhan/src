package day34GarbageCollectionAccessModifiers;

public class AccessModifiers {

    public static int publicData=100;
    static int defaultData=200;  // default modifier
    private static int privateData1=20;

    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData1);
    }
}
