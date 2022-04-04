package day34GarbageCollectionAccessModifiers;

public class StaticBlocks {
    public static void main(String[] args) {
        System.out.println("main method");
    }
    static {
        System.out.println("Static1");// önce static blok çalışır
    }
    static {
        System.out.println("Static2");// önce static blok çalışır
    }
    static {
        System.out.println("Static3");// önce static blok çalışır
    }

}
