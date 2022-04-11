package week13.inheritance;

public class Ebook extends Book{

    int size;
    int page;

    public Ebook(String title, String type, String author, double price) {
        super(title, type, author, price);
    }

    public void readBook(){
        System.out.println("Reading the e-book.");
        System.out.println("title = " + title);
        System.out.println("type = " + type);
        System.out.println("price = " + price);
        System.out.println("author = " + author);
        System.out.println("size = " + size);
        System.out.println("page = " + page);
    }
}
