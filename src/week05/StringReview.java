package week05;

public class StringReview {
    public static void main(String[] args) {
        String word="I love coding [Java] verywell!";
        word=word.substring(word.indexOf("[")+1, word.indexOf("]"));
        System.out.println("word = " + word);
    }
}
