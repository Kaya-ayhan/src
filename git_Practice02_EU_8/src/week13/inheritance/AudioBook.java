package week13.inheritance;

public class AudioBook extends Book{

    int lenght;
    String narrator;

    public AudioBook(String title, String type, String author, double price) {
        super(title, type, author, price);
    }

    public void Listen(){
        System.out.println("listening");
        System.out.println("lenght = " + lenght);
        System.out.println("narrator = " + narrator);
        System.out.println("title = " + title);
        System.out.println("type = " + type);
        System.out.println("price = " + price);
        System.out.println("author = " + author);
    }
}
